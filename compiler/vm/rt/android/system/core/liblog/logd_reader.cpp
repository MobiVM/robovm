/*
 * Copyright (C) 2007-2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

#include <endian.h>
#include <errno.h>
#include <fcntl.h>
#include <inttypes.h>
#include <poll.h>
#include <stdarg.h>
#include <stdatomic.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <sys/socket.h>
#include <sys/stat.h>
#include <sys/types.h>
#include <sys/un.h>
#include <time.h>
#include <unistd.h>

#include <cutils/sockets.h>
#include <private/android_filesystem_config.h>
#include <private/android_logger.h>

#include "config_read.h"
#include "log_portability.h"
#include "logd_reader.h"
#include "logger.h"

/* branchless on many architectures. */
#define min(x, y) ((y) ^ (((x) ^ (y)) & -((x) < (y))))

static int logdAvailable(log_id_t LogId);
static int logdVersion(struct android_log_logger* logger,
                       struct android_log_transport_context* transp);
static int logdRead(struct android_log_logger_list* logger_list,
                    struct android_log_transport_context* transp, struct log_msg* log_msg);
static int logdPoll(struct android_log_logger_list* logger_list,
                    struct android_log_transport_context* transp);
static void logdClose(struct android_log_logger_list* logger_list,
                      struct android_log_transport_context* transp);
static int logdClear(struct android_log_logger* logger,
                     struct android_log_transport_context* transp);
static ssize_t logdSetSize(struct android_log_logger* logger,
                           struct android_log_transport_context* transp, size_t size);
static ssize_t logdGetSize(struct android_log_logger* logger,
                           struct android_log_transport_context* transp);
static ssize_t logdGetReadableSize(struct android_log_logger* logger,
                                   struct android_log_transport_context* transp);
static ssize_t logdGetPrune(struct android_log_logger_list* logger,
                            struct android_log_transport_context* transp, char* buf, size_t len);
static ssize_t logdSetPrune(struct android_log_logger_list* logger,
                            struct android_log_transport_context* transp, char* buf, size_t len);
static ssize_t logdGetStats(struct android_log_logger_list* logger,
                            struct android_log_transport_context* transp, char* buf, size_t len);

struct android_log_transport_read logdLoggerRead = {
    .node = {&logdLoggerRead.node, &logdLoggerRead.node},
    .name = "logd",
    .available = logdAvailable,
    .version = logdVersion,
    .read = logdRead,
    .poll = logdPoll,
    .close = logdClose,
    .clear = logdClear,
    .getSize = logdGetSize,
    .setSize = logdSetSize,
    .getReadableSize = logdGetReadableSize,
    .getPrune = logdGetPrune,
    .setPrune = logdSetPrune,
    .getStats = logdGetStats,
};

static int logdAvailable(log_id_t logId) {
  if (logId >= LOG_ID_MAX) {
    return -EINVAL;
  }
  if (logId == LOG_ID_SECURITY) {
    uid_t uid = __android_log_uid();
    if (uid != AID_SYSTEM) {
      return -EPERM;
    }
  }
  if (access("/dev/socket/logdw", W_OK) == 0) {
    return 0;
  }
  return -EBADF;
}

// Connects to /dev/socket/<name> and returns the associated fd or returns -1 on error.
// O_CLOEXEC is always set.
static int socket_local_client(const std::string& name, int type) {
  sockaddr_un addr = {.sun_family = AF_LOCAL};

  std::string path = "/dev/socket/" + name;
  if (path.size() + 1 > sizeof(addr.sun_path)) {
    return -1;
  }
  strlcpy(addr.sun_path, path.c_str(), sizeof(addr.sun_path));

  int fd = socket(AF_LOCAL, type | SOCK_CLOEXEC, 0);
  if (fd == 0) {
    return -1;
  }

  if (connect(fd, reinterpret_cast<sockaddr*>(&addr), sizeof(addr)) == -1) {
    close(fd);
    return -1;
  }

  return fd;
}

/* worker for sending the command to the logger */
static ssize_t send_log_msg(struct android_log_logger* logger, const char* msg, char* buf,
                            size_t buf_size) {
  ssize_t ret;
  size_t len;
  char* cp;
  int errno_save = 0;
  int sock = socket_local_client("logd", SOCK_STREAM);
  if (sock < 0) {
    return sock;
  }

  if (msg) {
    snprintf(buf, buf_size, msg, logger ? logger->logId : (unsigned)-1);
  }

  len = strlen(buf) + 1;
  ret = TEMP_FAILURE_RETRY(write(sock, buf, len));
  if (ret <= 0) {
    goto done;
  }

  len = buf_size;
  cp = buf;
  while ((ret = TEMP_FAILURE_RETRY(read(sock, cp, len))) > 0) {
    struct pollfd p;

    if (((size_t)ret == len) || (buf_size < PAGE_SIZE)) {
      break;
    }

    len -= ret;
    cp += ret;

    memset(&p, 0, sizeof(p));
    p.fd = sock;
    p.events = POLLIN;

    /* Give other side 20ms to refill pipe */
    ret = TEMP_FAILURE_RETRY(poll(&p, 1, 20));

    if (ret <= 0) {
      break;
    }

    if (!(p.revents & POLLIN)) {
      ret = 0;
      break;
    }
  }

  if (ret >= 0) {
    ret += buf_size - len;
  }

done:
  if ((ret == -1) && errno) {
    errno_save = errno;
  }
  close(sock);
  if (errno_save) {
    errno = errno_save;
  }
  return ret;
}

ssize_t __send_log_msg(char* buf, size_t buf_size) {
  return send_log_msg(NULL, NULL, buf, buf_size);
}

static int check_log_success(char* buf, ssize_t ret) {
  if (ret < 0) {
    return ret;
  }

  if (strncmp(buf, "success", 7)) {
    errno = EINVAL;
    return -1;
  }

  return 0;
}

static int logdClear(struct android_log_logger* logger,
                     struct android_log_transport_context* transp __unused) {
  char buf[512];

  return check_log_success(buf, send_log_msg(logger, "clear %d", buf, sizeof(buf)));
}

/* returns the total size of the log's ring buffer */
static ssize_t logdGetSize(struct android_log_logger* logger,
                           struct android_log_transport_context* transp __unused) {
  char buf[512];

  ssize_t ret = send_log_msg(logger, "getLogSize %d", buf, sizeof(buf));
  if (ret < 0) {
    return ret;
  }

  if ((buf[0] < '0') || ('9' < buf[0])) {
    return -1;
  }

  return atol(buf);
}

static ssize_t logdSetSize(struct android_log_logger* logger,
                           struct android_log_transport_context* transp __unused, size_t size) {
  char buf[512];

  snprintf(buf, sizeof(buf), "setLogSize %d %zu", logger->logId, size);

  return check_log_success(buf, send_log_msg(NULL, NULL, buf, sizeof(buf)));
}

/*
 * returns the readable size of the log's ring buffer (that is, amount of the
 * log consumed)
 */
static ssize_t logdGetReadableSize(struct android_log_logger* logger,
                                   struct android_log_transport_context* transp __unused) {
  char buf[512];

  ssize_t ret = send_log_msg(logger, "getLogSizeUsed %d", buf, sizeof(buf));
  if (ret < 0) {
    return ret;
  }

  if ((buf[0] < '0') || ('9' < buf[0])) {
    return -1;
  }

  return atol(buf);
}

/*
 * returns the logger version
 */
static int logdVersion(struct android_log_logger* logger __unused,
                       struct android_log_transport_context* transp __unused) {
  uid_t uid = __android_log_uid();
  return ((uid != AID_ROOT) && (uid != AID_LOG) && (uid != AID_SYSTEM)) ? 3 : 4;
}

/*
 * returns statistics
 */
static ssize_t logdGetStats(struct android_log_logger_list* logger_list,
                            struct android_log_transport_context* transp __unused, char* buf,
                            size_t len) {
  struct android_log_logger* logger;
  char* cp = buf;
  size_t remaining = len;
  size_t n;

  n = snprintf(cp, remaining, "getStatistics");
  n = min(n, remaining);
  remaining -= n;
  cp += n;

  logger_for_each(logger, logger_list) {
    n = snprintf(cp, remaining, " %d", logger->logId);
    n = min(n, remaining);
    remaining -= n;
    cp += n;
  }

  if (logger_list->pid) {
    snprintf(cp, remaining, " pid=%u", logger_list->pid);
  }

  return send_log_msg(NULL, NULL, buf, len);
}

static ssize_t logdGetPrune(struct android_log_logger_list* logger_list __unused,
                            struct android_log_transport_context* transp __unused, char* buf,
                            size_t len) {
  return send_log_msg(NULL, "getPruneList", buf, len);
}

static ssize_t logdSetPrune(struct android_log_logger_list* logger_list __unused,
                            struct android_log_transport_context* transp __unused, char* buf,
                            size_t len) {
  const char cmd[] = "setPruneList ";
  const size_t cmdlen = sizeof(cmd) - 1;

  if (strlen(buf) > (len - cmdlen)) {
    return -ENOMEM; /* KISS */
  }
  memmove(buf + cmdlen, buf, len - cmdlen);
  buf[len - 1] = '\0';
  memcpy(buf, cmd, cmdlen);

  return check_log_success(buf, send_log_msg(NULL, NULL, buf, len));
}

static void caught_signal(int signum __unused) {}

static int logdOpen(struct android_log_logger_list* logger_list,
                    struct android_log_transport_context* transp) {
  struct android_log_logger* logger;
  struct sigaction ignore;
  struct sigaction old_sigaction;
  unsigned int old_alarm = 0;
  char buffer[256], *cp, c;
  int e, ret, remaining, sock;

  if (!logger_list) {
    return -EINVAL;
  }

  sock = atomic_load(&transp->context.sock);
  if (sock > 0) {
    return sock;
  }

  sock = socket_local_client("logdr", SOCK_SEQPACKET);
  if (sock == 0) {
    /* Guarantee not file descriptor zero */
    int newsock = socket_local_client("logdr", SOCK_SEQPACKET);
    close(sock);
    sock = newsock;
  }
  if (sock <= 0) {
    if ((sock == -1) && errno) {
      return -errno;
    }
    return sock;
  }

  strcpy(buffer, (logger_list->mode & ANDROID_LOG_NONBLOCK) ? "dumpAndClose" : "stream");
  cp = buffer + strlen(buffer);

  strcpy(cp, " lids");
  cp += 5;
  c = '=';
  remaining = sizeof(buffer) - (cp - buffer);
  logger_for_each(logger, logger_list) {
    ret = snprintf(cp, remaining, "%c%u", c, logger->logId);
    ret = min(ret, remaining);
    remaining -= ret;
    cp += ret;
    c = ',';
  }

  if (logger_list->tail) {
    ret = snprintf(cp, remaining, " tail=%u", logger_list->tail);
    ret = min(ret, remaining);
    remaining -= ret;
    cp += ret;
  }

  if (logger_list->start.tv_sec || logger_list->start.tv_nsec) {
    if (logger_list->mode & ANDROID_LOG_WRAP) {
      // ToDo: alternate API to allow timeout to be adjusted.
      ret = snprintf(cp, remaining, " timeout=%u", ANDROID_LOG_WRAP_DEFAULT_TIMEOUT);
      ret = min(ret, remaining);
      remaining -= ret;
      cp += ret;
    }
    ret = snprintf(cp, remaining, " start=%" PRIu32 ".%09" PRIu32, logger_list->start.tv_sec,
                   logger_list->start.tv_nsec);
    ret = min(ret, remaining);
    remaining -= ret;
    cp += ret;
  }

  if (logger_list->pid) {
    ret = snprintf(cp, remaining, " pid=%u", logger_list->pid);
    ret = min(ret, remaining);
    cp += ret;
  }

  if (logger_list->mode & ANDROID_LOG_NONBLOCK) {
    /* Deal with an unresponsive logd */
    memset(&ignore, 0, sizeof(ignore));
    ignore.sa_handler = caught_signal;
    sigemptyset(&ignore.sa_mask);
    /* particularily useful if tombstone is reporting for logd */
    sigaction(SIGALRM, &ignore, &old_sigaction);
    old_alarm = alarm(30);
  }
  ret = write(sock, buffer, cp - buffer);
  e = errno;
  if (logger_list->mode & ANDROID_LOG_NONBLOCK) {
    if (e == EINTR) {
      e = ETIMEDOUT;
    }
    alarm(old_alarm);
    sigaction(SIGALRM, &old_sigaction, NULL);
  }

  if (ret <= 0) {
    close(sock);
    if ((ret == -1) && e) {
      return -e;
    }
    if (ret == 0) {
      return -EIO;
    }
    return ret;
  }

  ret = atomic_exchange(&transp->context.sock, sock);
  if ((ret > 0) && (ret != sock)) {
    close(ret);
  }
  return sock;
}

/* Read from the selected logs */
static int logdRead(struct android_log_logger_list* logger_list,
                    struct android_log_transport_context* transp, struct log_msg* log_msg) {
  int ret, e;
  struct sigaction ignore;
  struct sigaction old_sigaction;
  unsigned int old_alarm = 0;

  ret = logdOpen(logger_list, transp);
  if (ret < 0) {
    return ret;
  }

  memset(log_msg, 0, sizeof(*log_msg));

  unsigned int new_alarm = 0;
  if (logger_list->mode & ANDROID_LOG_NONBLOCK) {
    if ((logger_list->mode & ANDROID_LOG_WRAP) &&
        (logger_list->start.tv_sec || logger_list->start.tv_nsec)) {
      /* b/64143705 */
      new_alarm = (ANDROID_LOG_WRAP_DEFAULT_TIMEOUT * 11) / 10 + 10;
      logger_list->mode &= ~ANDROID_LOG_WRAP;
    } else {
      new_alarm = 30;
    }

    memset(&ignore, 0, sizeof(ignore));
    ignore.sa_handler = caught_signal;
    sigemptyset(&ignore.sa_mask);
    /* particularily useful if tombstone is reporting for logd */
    sigaction(SIGALRM, &ignore, &old_sigaction);
    old_alarm = alarm(new_alarm);
  }

  /* NOTE: SOCK_SEQPACKET guarantees we read exactly one full entry */
  ret = recv(ret, log_msg, LOGGER_ENTRY_MAX_LEN, 0);
  e = errno;

  if (new_alarm) {
    if ((ret == 0) || (e == EINTR)) {
      e = EAGAIN;
      ret = -1;
    }
    alarm(old_alarm);
    sigaction(SIGALRM, &old_sigaction, NULL);
  }

  if ((ret == -1) && e) {
    return -e;
  }
  return ret;
}

static int logdPoll(struct android_log_logger_list* logger_list,
                    struct android_log_transport_context* transp) {
  struct pollfd p;

  int ret = logdOpen(logger_list, transp);
  if (ret < 0) {
    return ret;
  }

  memset(&p, 0, sizeof(p));
  p.fd = ret;
  p.events = POLLIN;
  ret = poll(&p, 1, 20);
  if ((ret > 0) && !(p.revents & POLLIN)) {
    ret = 0;
  }
  if ((ret == -1) && errno) {
    return -errno;
  }
  return ret;
}

/* Close all the logs */
static void logdClose(struct android_log_logger_list* logger_list __unused,
                      struct android_log_transport_context* transp) {
  int sock = atomic_exchange(&transp->context.sock, -1);
  if (sock > 0) {
    close(sock);
  }
}
