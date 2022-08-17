/*
 * Copyright (C) 2011 The Android Open Source Project
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

package android.system;

import static android.annotation.SystemApi.Client.MODULE_LIBRARIES;

import android.annotation.SystemApi;
import android.compat.annotation.UnsupportedAppUsage;

/**
 * Constants and helper functions for use with {@link Os}.
 */
public final class OsConstants {
    @UnsupportedAppUsage
    private OsConstants() {
    }

    /**
     * Returns the index of the element in the {@link StructCapUserData} (cap_user_data)
     * array that this capability is stored in.
     *
     * @param x capability
     * @return index of the element in the {@link StructCapUserData} array storing this capability
     *
     * @hide
     */
    @UnsupportedAppUsage
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static int CAP_TO_INDEX(int x) { return x >>> 5; }

    /**
     * Returns the mask for the given capability. This is relative to the capability's
     * {@link StructCapUserData} (cap_user_data) element, the index of which can be
     * retrieved with {@link CAP_TO_INDEX}.
     *
     * @param x capability
     * @return mask for given capability
     *
     * @hide
     */
    @UnsupportedAppUsage
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static int CAP_TO_MASK(int x) { return 1 << (x & 31); }

    /**
     * Tests whether the given mode is a block device.
     */
    public static boolean S_ISBLK(int mode) { return (mode & S_IFMT()) == S_IFBLK(); }

    /**
     * Tests whether the given mode is a character device.
     */
    public static boolean S_ISCHR(int mode) { return (mode & S_IFMT()) == S_IFCHR(); }

    /**
     * Tests whether the given mode is a directory.
     */
    public static boolean S_ISDIR(int mode) { return (mode & S_IFMT()) == S_IFDIR(); }

    /**
     * Tests whether the given mode is a FIFO.
     */
    public static boolean S_ISFIFO(int mode) { return (mode & S_IFMT()) == S_IFIFO(); }

    /**
     * Tests whether the given mode is a regular file.
     */
    public static boolean S_ISREG(int mode) { return (mode & S_IFMT()) == S_IFREG(); }

    /**
     * Tests whether the given mode is a symbolic link.
     */
    public static boolean S_ISLNK(int mode) { return (mode & S_IFMT()) == S_IFLNK(); }

    /**
     * Tests whether the given mode is a socket.
     */
    public static boolean S_ISSOCK(int mode) { return (mode & S_IFMT()) == S_IFSOCK(); }

    /**
     * Extracts the exit status of a child. Only valid if WIFEXITED returns true.
     */
    public static int WEXITSTATUS(int status) { return (status & 0xff00) >> 8; }

    /**
     * Tests whether the child dumped core. Only valid if WIFSIGNALED returns true.
     */
    public static boolean WCOREDUMP(int status) { return (status & 0x80) != 0; }

    /**
     * Returns the signal that caused the child to exit. Only valid if WIFSIGNALED returns true.
     */
    public static int WTERMSIG(int status) { return status & 0x7f; }

    /**
     * Returns the signal that cause the child to stop. Only valid if WIFSTOPPED returns true.
     */
    public static int WSTOPSIG(int status) { return WEXITSTATUS(status); }

    /**
     * Tests whether the child exited normally.
     */
    public static boolean WIFEXITED(int status) { return (WTERMSIG(status) == 0); }

    /**
     * Tests whether the child was stopped (not terminated) by a signal.
     */
    public static boolean WIFSTOPPED(int status) { return (WTERMSIG(status) == 0x7f); }

    /**
     * Tests whether the child was terminated by a signal.
     */
    public static boolean WIFSIGNALED(int status) { return (WTERMSIG(status + 1) >= 2); }

    public static native int AF_INET ();
    public static native int AF_INET6 ();
    public static native int AF_NETLINK ();
    public static native int AF_PACKET ();
    public static native int AF_UNIX ();

    /**
     * The virt-vsock address family, linux specific.
     * It is used with {@code struct sockaddr_vm} from uapi/linux/vm_sockets.h.
     *
     * @see <a href="https://man7.org/linux/man-pages/man7/vsock.7.html">vsock(7)</a>
     * @see VmSocketAddress
     */
    public static native int AF_VSOCK ();
    public static native int AF_UNSPEC ();
    public static native int AI_ADDRCONFIG();
    public static native int AI_ALL();
    public static native int AI_CANONNAME();
    public static native int AI_NUMERICHOST();
    public static native int AI_NUMERICSERV();
    public static native int AI_PASSIVE();
    public static native int AI_V4MAPPED();
    public static native int ARPHRD_ETHER();

    /**
      * The virtio-vsock {@code svmPort} value to bind for any available port.
      *
      * @see <a href="https://man7.org/linux/man-pages/man7/vsock.7.html">vsock(7)</a>
      * @see VmSocketAddress
      */
    public static native int VMADDR_PORT_ANY();

    /**
      * The virtio-vsock {@code svmCid} value to listens for all CIDs.
      *
      * @see <a href="https://man7.org/linux/man-pages/man7/vsock.7.html">vsock(7)</a>
      * @see VmSocketAddress
      */
    public static native int VMADDR_CID_ANY();

    /**
      * The virtio-vsock {@code svmCid} value for host communication.
      *
      * @see <a href="https://man7.org/linux/man-pages/man7/vsock.7.html">vsock(7)</a>
      * @see VmSocketAddress
      */
    public static native int VMADDR_CID_LOCAL();

    /**
      * The virtio-vsock {@code svmCid} value for loopback communication.
      *
      * @see <a href="https://man7.org/linux/man-pages/man7/vsock.7.html">vsock(7)</a>
      * @see VmSocketAddress
      */
    public static native int VMADDR_CID_HOST();

    /**
     * ARP protocol loopback device identifier.
     *
     * @hide
     */
    @UnsupportedAppUsage
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static native int ARPHRD_LOOPBACK();
    public static native int CAP_AUDIT_CONTROL();
    public static native int CAP_AUDIT_WRITE();
    public static native int CAP_BLOCK_SUSPEND();
    public static native int CAP_CHOWN();
    public static native int CAP_DAC_OVERRIDE();
    public static native int CAP_DAC_READ_SEARCH();
    public static native int CAP_FOWNER();
    public static native int CAP_FSETID();
    public static native int CAP_IPC_LOCK();
    public static native int CAP_IPC_OWNER();
    public static native int CAP_KILL();
    public static native int CAP_LAST_CAP();
    public static native int CAP_LEASE();
    public static native int CAP_LINUX_IMMUTABLE();
    public static native int CAP_MAC_ADMIN();
    public static native int CAP_MAC_OVERRIDE();
    public static native int CAP_MKNOD();
    public static native int CAP_NET_ADMIN();
    public static native int CAP_NET_BIND_SERVICE();
    public static native int CAP_NET_BROADCAST();
    public static native int CAP_NET_RAW();
    public static native int CAP_SETFCAP();
    public static native int CAP_SETGID();
    public static native int CAP_SETPCAP();
    public static native int CAP_SETUID();
    public static native int CAP_SYS_ADMIN();
    public static native int CAP_SYS_BOOT();
    public static native int CAP_SYS_CHROOT();
    public static native int CAP_SYSLOG();
    public static native int CAP_SYS_MODULE();
    public static native int CAP_SYS_NICE();
    public static native int CAP_SYS_PACCT();
    public static native int CAP_SYS_PTRACE();
    public static native int CAP_SYS_RAWIO();
    public static native int CAP_SYS_RESOURCE();
    public static native int CAP_SYS_TIME();
    public static native int CAP_SYS_TTY_CONFIG();
    public static native int CAP_WAKE_ALARM();
    public static native int E2BIG();
    public static native int EACCES();
    public static native int EADDRINUSE();
    public static native int EADDRNOTAVAIL();
    public static native int EAFNOSUPPORT();
    public static native int EAGAIN();
    public static native int EAI_AGAIN();
    public static native int EAI_BADFLAGS();
    public static native int EAI_FAIL();
    public static native int EAI_FAMILY();
    public static native int EAI_MEMORY();
    public static native int EAI_NODATA();
    public static native int EAI_NONAME();
    public static native int EAI_OVERFLOW();
    public static native int EAI_SERVICE();
    public static native int EAI_SOCKTYPE();
    public static native int EAI_SYSTEM();
    public static native int EALREADY();
    public static native int EBADF();
    public static native int EBADMSG();
    public static native int EBUSY();
    public static native int ECANCELED();
    public static native int ECHILD();
    public static native int ECONNABORTED();
    public static native int ECONNREFUSED();
    public static native int ECONNRESET();
    public static native int EDEADLK();
    public static native int EDESTADDRREQ();
    public static native int EDOM();
    public static native int EDQUOT();
    public static native int EEXIST();
    public static native int EFAULT();
    public static native int EFBIG();
    public static native int EHOSTUNREACH();
    public static native int EIDRM();
    public static native int EILSEQ();
    public static native int EINPROGRESS();
    public static native int EINTR();
    public static native int EINVAL();
    public static native int EIO();
    public static native int EISCONN();
    public static native int EISDIR();
    public static native int ELOOP();
    public static native int EMFILE();
    public static native int EMLINK();
    public static native int EMSGSIZE();
    public static native int EMULTIHOP();
    public static native int ENAMETOOLONG();
    public static native int ENETDOWN();
    public static native int ENETRESET();
    public static native int ENETUNREACH();
    public static native int ENFILE();
    public static native int ENOBUFS();
    public static native int ENODATA();
    public static native int ENODEV();
    public static native int ENOENT();
    public static native int ENOEXEC();
    public static native int ENOLCK();
    public static native int ENOLINK();
    public static native int ENOMEM();
    public static native int ENOMSG();
    public static native int ENONET();
    public static native int ENOPROTOOPT();
    public static native int ENOSPC();
    public static native int ENOSR();
    public static native int ENOSTR();
    public static native int ENOSYS();
    public static native int ENOTCONN();
    public static native int ENOTDIR();
    public static native int ENOTEMPTY();
    public static native int ENOTSOCK();
    public static native int ENOTSUP();
    public static native int ENOTTY();
    public static native int ENXIO();
    public static native int EOPNOTSUPP();
    public static native int EOVERFLOW();
    public static native int EPERM();
    public static native int EPIPE();
    public static native int EPROTO();
    public static native int EPROTONOSUPPORT();
    public static native int EPROTOTYPE();
    public static native int ERANGE();
    public static native int EROFS();
    public static native int ESPIPE();
    public static native int ESRCH();
    public static native int ESTALE();
    public static native int ETH_P_ALL();
    public static native int ETH_P_ARP();
    public static native int ETH_P_IP();
    public static native int ETH_P_IPV6();
    public static native int ETIME();
    public static native int ETIMEDOUT();
    public static native int ETXTBSY();
    /**
     * "Too many users" error.
     * See <a href="https://man7.org/linux/man-pages/man3/errno.3.html">errno(3)</a>.
     *
     * @hide
     */
    @UnsupportedAppUsage
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static native int EUSERS();
    // On Linux, EWOULDBLOCK == EAGAIN. Use EAGAIN instead, to reduce confusion.
    public static native int EXDEV();
    public static native int EXIT_FAILURE();
    public static native int EXIT_SUCCESS();
    public static native int FD_CLOEXEC();
    public static native int FIONREAD();
    public static native int F_DUPFD();
    public static native int F_DUPFD_CLOEXEC();
    public static native int F_GETFD();
    public static native int F_GETFL();
    public static native int F_GETLK();
    public static native int F_GETLK64();
    public static native int F_GETOWN();
    public static native int F_OK();
    public static native int F_RDLCK();
    public static native int F_SETFD();
    public static native int F_SETFL();
    public static native int F_SETLK();
    public static native int F_SETLK64();
    public static native int F_SETLKW();
    public static native int F_SETLKW64();
    public static native int F_SETOWN();
    public static native int F_UNLCK();
    public static native int F_WRLCK();
    public static native int ICMP_ECHO();
    public static native int ICMP_ECHOREPLY();
    public static native int ICMP6_ECHO_REQUEST();
    public static native int ICMP6_ECHO_REPLY();
    public static native int IFA_F_DADFAILED();
    public static native int IFA_F_DEPRECATED();
    public static native int IFA_F_HOMEADDRESS();
    public static native int IFA_F_NODAD();
    public static native int IFA_F_OPTIMISTIC();
    public static native int IFA_F_PERMANENT();
    public static native int IFA_F_SECONDARY();
    public static native int IFA_F_TEMPORARY();
    public static native int IFA_F_TENTATIVE();
    public static native int IFF_ALLMULTI();
    public static native int IFF_AUTOMEDIA();
    public static native int IFF_BROADCAST();
    public static native int IFF_DEBUG();
    public static native int IFF_DYNAMIC();
    public static native int IFF_LOOPBACK();
    public static native int IFF_MASTER();
    public static native int IFF_MULTICAST();
    public static native int IFF_NOARP();
    public static native int IFF_NOTRAILERS();
    public static native int IFF_POINTOPOINT();
    public static native int IFF_PORTSEL();
    public static native int IFF_PROMISC();
    public static native int IFF_RUNNING();
    public static native int IFF_SLAVE();
    public static native int IFF_UP();
    public static native int IPPROTO_ICMP();
    public static native int IPPROTO_ICMPV6();
    public static native int IPPROTO_IP();
    public static native int IPPROTO_IPV6();
    public static native int IPPROTO_RAW();
    public static native int IPPROTO_TCP();
    public static native int IPPROTO_UDP();
    public static native int IPV6_CHECKSUM();
    public static native int IPV6_MULTICAST_HOPS();
    public static native int IPV6_MULTICAST_IF();
    public static native int IPV6_MULTICAST_LOOP();
    public static native int IPV6_RECVDSTOPTS();
    public static native int IPV6_RECVHOPLIMIT();
    public static native int IPV6_RECVHOPOPTS();
    public static native int IPV6_RECVPKTINFO();
    public static native int IPV6_RECVRTHDR();
    public static native int IPV6_RECVTCLASS();
    public static native int IPV6_TCLASS();
    public static native int IPV6_UNICAST_HOPS();
    public static native int IPV6_V6ONLY();
    /** @hide */
    @UnsupportedAppUsage
    public static native int IP_MULTICAST_ALL();
    public static native int IP_MULTICAST_IF();
    public static native int IP_MULTICAST_LOOP();
    public static native int IP_MULTICAST_TTL();
    /** @hide */
    @UnsupportedAppUsage
    public static native int IP_RECVTOS();
    public static native int IP_TOS();
    public static native int IP_TTL();
    /**
     * Version constant to be used in {@link StructCapUserHeader} with
     * {@link Os#capset(StructCapUserHeader, StructCapUserData[])} and
     * {@link Os#capget(StructCapUserHeader)}.
     *
     * See <a href="https://man7.org/linux/man-pages/man2/capget.2.html">capget(2)</a>.
     *
     * @hide
     */
    @UnsupportedAppUsage
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static native int _LINUX_CAPABILITY_VERSION_3();
    public static native int MAP_FIXED();
    public static native int MAP_ANONYMOUS();
    /**
     * Flag argument for {@code mmap(long, long, int, int, FileDescriptor, long)}.
     *
     * See <a href="http://man7.org/linux/man-pages/man2/mmap.2.html">mmap(2)</a>.
     *
     * @hide
     */
    @UnsupportedAppUsage
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static native int MAP_POPULATE();
    public static native int MAP_PRIVATE();
    public static native int MAP_SHARED();
    public static native int MCAST_JOIN_GROUP();
    public static native int MCAST_LEAVE_GROUP();
    public static native int MCAST_JOIN_SOURCE_GROUP();
    public static native int MCAST_LEAVE_SOURCE_GROUP();
    public static native int MCAST_BLOCK_SOURCE();
    public static native int MCAST_UNBLOCK_SOURCE();
    public static native int MCL_CURRENT();
    public static native int MCL_FUTURE();
    public static native int MFD_CLOEXEC();
    public static native int MSG_CTRUNC();
    public static native int MSG_DONTROUTE();
    public static native int MSG_EOR();
    public static native int MSG_OOB();
    public static native int MSG_PEEK();
    public static native int MSG_TRUNC();
    public static native int MSG_WAITALL();
    public static native int MS_ASYNC();
    public static native int MS_INVALIDATE();
    public static native int MS_SYNC();
    public static native int NETLINK_NETFILTER();
    public static native int NETLINK_ROUTE();
    /**
     * SELinux enforces that only system_server and netd may use this netlink socket type.
     */
    public static native int NETLINK_INET_DIAG();
    public static native int NI_DGRAM();
    public static native int NI_NAMEREQD();
    public static native int NI_NOFQDN();
    public static native int NI_NUMERICHOST();
    public static native int NI_NUMERICSERV();
    public static native int O_ACCMODE();
    public static native int O_APPEND();
    public static native int O_CLOEXEC();
    public static native int O_CREAT();
    /**
     * Flag for {@code Os#open(String, int, int)}.
     *
     * When enabled, tries to minimize cache effects of the I/O to and from this
     * file. In general this will degrade performance, but it is
     * useful in special situations, such as when applications do
     * their own caching. File I/O is done directly to/from
     * user-space buffers. The {@link O_DIRECT} flag on its own makes an
     * effort to transfer data synchronously, but does not give
     * the guarantees of the {@link O_SYNC} flag that data and necessary
     * metadata are transferred. To guarantee synchronous I/O,
     * {@link O_SYNC} must be used in addition to {@link O_DIRECT}.
     *
     * See <a href="https://man7.org/linux/man-pages/man2/open.2.html">open(2)</a>.
     *
     * @hide
     */
    @UnsupportedAppUsage
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static native int O_DIRECT();
    public static native int O_EXCL();
    public static native int O_NOCTTY();
    public static native int O_NOFOLLOW();
    public static native int O_NONBLOCK();
    public static native int O_RDONLY();
    public static native int O_RDWR();
    public static native int O_SYNC();
    public static native int O_DSYNC();
    public static native int O_TRUNC();
    public static native int O_WRONLY();
    public static native int POLLERR();
    public static native int POLLHUP();
    public static native int POLLIN();
    public static native int POLLNVAL();
    public static native int POLLOUT();
    public static native int POLLPRI();
    public static native int POLLRDBAND();
    public static native int POLLRDNORM();
    public static native int POLLWRBAND();
    public static native int POLLWRNORM();
    /**
     * Reads or changes the ambient capability set of the calling thread.
     * Has to be used as a first argument for {@link Os#prctl(int, long, long, long, long)}.
     *
     * See <a href="https://man7.org/linux/man-pages/man2/prctl.2.html">prctl(2)</a>.
     *
     * @hide
     */
    @UnsupportedAppUsage
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static native int PR_CAP_AMBIENT();
    /**
     * The capability specified in {@code arg3} of {@link Os#prctl(int, long, long, long, long)}
     * is added to the ambient set. The specified capability must already
     * be present in both the permitted and the inheritable sets of the process.
     * Has to be used as a second argument for {@link Os#prctl(int, long, long, long, long)}.
     *
     * See <a href="https://man7.org/linux/man-pages/man2/prctl.2.html">prctl(2)</a>.
     * @hide
     */
    @UnsupportedAppUsage
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static native int PR_CAP_AMBIENT_RAISE();
    public static native int PR_GET_DUMPABLE();
    public static native int PR_SET_DUMPABLE();
    public static native int PR_SET_NO_NEW_PRIVS();
    public static native int PROT_EXEC();
    public static native int PROT_NONE();
    public static native int PROT_READ();
    public static native int PROT_WRITE();
    public static native int R_OK();
    /**
     * Specifies a value one greater than the maximum file
     * descriptor number that can be opened by this process.
     *
     * <p>Attempts ({@link Os#open(String, int, int)}, {@link Os#pipe()},
     * {@link Os#dup(java.io.FileDescriptor)}, etc.) to exceed this
     * limit yield the error {@link EMFILE}.
     *
     * See <a href="https://man7.org/linux/man-pages/man3/vlimit.3.html">getrlimit(2)</a>.
     *
     * @hide
     */
    @UnsupportedAppUsage
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static native int RLIMIT_NOFILE();
    public static native int RT_SCOPE_HOST();
    public static native int RT_SCOPE_LINK();
    public static native int RT_SCOPE_NOWHERE();
    public static native int RT_SCOPE_SITE();
    public static native int RT_SCOPE_UNIVERSE();
    /**
     * Bitmask for IPv4 addresses add/delete events multicast groups mask.
     * Used in {@link NetlinkSocketAddress}.
     *
     * See <a href="https://man7.org/linux/man-pages/man7/netlink.7.html">netlink(7)</a>.
     *
     * @hide
     */
    @UnsupportedAppUsage
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static native int RTMGRP_IPV4_IFADDR();
    /** @hide */
    @UnsupportedAppUsage
    public static native int RTMGRP_IPV4_MROUTE();
    /** @hide */
    @UnsupportedAppUsage
    public static native int RTMGRP_IPV4_ROUTE();
    /** @hide */
    @UnsupportedAppUsage
    public static native int RTMGRP_IPV4_RULE();
    /** @hide */
    @UnsupportedAppUsage
    public static native int RTMGRP_IPV6_IFADDR();
    /** @hide */
    @UnsupportedAppUsage
    public static native int RTMGRP_IPV6_IFINFO();
    /** @hide */
    @UnsupportedAppUsage
    public static native int RTMGRP_IPV6_MROUTE();
    /** @hide */
    @UnsupportedAppUsage
    public static native int RTMGRP_IPV6_PREFIX();
    /** @hide */
    @UnsupportedAppUsage
    public static native int RTMGRP_IPV6_ROUTE();
    /** @hide */
    @UnsupportedAppUsage
    public static native int RTMGRP_LINK();
    public static native int RTMGRP_NEIGH();
    /** @hide */
    @UnsupportedAppUsage
    public static native int RTMGRP_NOTIFY();
    /** @hide */
    @UnsupportedAppUsage
    public static native int RTMGRP_TC();
    public static native int SEEK_CUR();
    public static native int SEEK_END();
    public static native int SEEK_SET();
    public static native int SHUT_RD();
    public static native int SHUT_RDWR();
    public static native int SHUT_WR();
    public static native int SIGABRT();
    public static native int SIGALRM();
    public static native int SIGBUS();
    public static native int SIGCHLD();
    public static native int SIGCONT();
    public static native int SIGFPE();
    public static native int SIGHUP();
    public static native int SIGILL();
    public static native int SIGINT();
    public static native int SIGIO();
    public static native int SIGKILL();
    public static native int SIGPIPE();
    public static native int SIGPROF();
    public static native int SIGPWR();
    public static native int SIGQUIT();
    public static native int SIGRTMAX();
    public static native int SIGRTMIN();
    public static native int SIGSEGV();
    public static native int SIGSTKFLT();
    public static native int SIGSTOP();
    public static native int SIGSYS();
    public static native int SIGTERM();
    public static native int SIGTRAP();
    public static native int SIGTSTP();
    public static native int SIGTTIN();
    public static native int SIGTTOU();
    public static native int SIGURG();
    public static native int SIGUSR1();
    public static native int SIGUSR2();
    public static native int SIGVTALRM();
    public static native int SIGWINCH();
    public static native int SIGXCPU();
    public static native int SIGXFSZ();
    public static native int SIOCGIFADDR();
    public static native int SIOCGIFBRDADDR();
    public static native int SIOCGIFDSTADDR();
    public static native int SIOCGIFNETMASK();

    /**
     * Set the close-on-exec ({@code FD_CLOEXEC}) flag on the new file
     * descriptor created by {@link Os#socket(int,int,int)} or
     * {@link Os#socketpair(int,int,int,java.io.FileDescriptor,java.io.FileDescriptor)}.
     * See the description of the O_CLOEXEC flag in
     * <a href="http://man7.org/linux/man-pages/man2/open.2.html">open(2)</a>
     * for reasons why this may be useful.
     *
     * <p>Applications wishing to make use of this flag on older API versions
     * may use {@link #O_CLOEXEC} instead. On Android, {@code O_CLOEXEC} and
     * {@code SOCK_CLOEXEC} are the same value.
     */
    public static native int SOCK_CLOEXEC();
    public static native int SOCK_DGRAM();

    /**
     * Set the O_NONBLOCK file status flag on the file descriptor
     * created by {@link Os#socket(int,int,int)} or
     * {@link Os#socketpair(int,int,int,java.io.FileDescriptor,java.io.FileDescriptor)}.
     *
     * <p>Applications wishing to make use of this flag on older API versions
     * may use {@link #O_NONBLOCK} instead. On Android, {@code O_NONBLOCK}
     * and {@code SOCK_NONBLOCK} are the same value.
     */
    public static native int SOCK_NONBLOCK();
    public static native int SOCK_RAW();
    public static native int SOCK_SEQPACKET();
    public static native int SOCK_STREAM();
    public static native int SOL_SOCKET();
    public static native int SOL_UDP();
    public static native int SO_BINDTODEVICE();
    public static native int SO_BROADCAST();
    public static native int SO_DEBUG();
    /** @hide */
    @UnsupportedAppUsage
    public static native int SO_DOMAIN();
    public static native int SO_DONTROUTE();
    public static native int SO_ERROR();
    public static native int SO_KEEPALIVE();
    public static native int SO_LINGER();
    public static native int SO_OOBINLINE();
    public static native int SO_PASSCRED();
    public static native int SO_PEERCRED();
    /** @hide */
    @UnsupportedAppUsage
    public static native int SO_PROTOCOL();
    public static native int SO_RCVBUF();
    public static native int SO_RCVLOWAT();
    public static native int SO_RCVTIMEO();
    public static native int SO_REUSEADDR();
    public static native int SO_SNDBUF();
    public static native int SO_SNDLOWAT();
    public static native int SO_SNDTIMEO();
    public static native int SO_TYPE();
    /**
     * Bitmask for flags argument of
     * {@link splice(java.io.FileDescriptor, Int64Ref, FileDescriptor, Int64Ref, long, int)}.
     *
     * Attempt to move pages instead of copying.  This is only a
     * hint to the kernel: pages may still be copied if the
     * kernel cannot move the pages from the pipe, or if the pipe
     * buffers don't refer to full pages.
     *
     * See <a href="https://man7.org/linux/man-pages/man2/splice.2.html">splice(2)</a>.
     *
     * @hide
     */
    @UnsupportedAppUsage
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static native int SPLICE_F_MOVE();
    /** @hide */
    @UnsupportedAppUsage
    public static native int SPLICE_F_NONBLOCK();
    /**
     * Bitmask for flags argument of
     * {@link splice(java.io.FileDescriptor, Int64Ref, FileDescriptor, Int64Ref, long, int)}.
     *
     * <p>Indicates that more data will be coming in a subsequent splice. This is
     * a helpful hint when the {@code fdOut} refers to a socket.
     *
     * See <a href="https://man7.org/linux/man-pages/man2/splice.2.html">splice(2)</a>.
     *
     * @hide
     */
    @UnsupportedAppUsage
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static native int SPLICE_F_MORE();
    public static native int STDERR_FILENO();
    public static native int STDIN_FILENO();
    public static native int STDOUT_FILENO();
    public static native int ST_MANDLOCK();
    public static native int ST_NOATIME();
    public static native int ST_NODEV();
    public static native int ST_NODIRATIME();
    public static native int ST_NOEXEC();
    public static native int ST_NOSUID();
    public static native int ST_RDONLY();
    public static native int ST_RELATIME();
    public static native int ST_SYNCHRONOUS();
    public static native int S_IFBLK();
    public static native int S_IFCHR();
    public static native int S_IFDIR();
    public static native int S_IFIFO();
    public static native int S_IFLNK();
    public static native int S_IFMT();
    public static native int S_IFREG();
    public static native int S_IFSOCK();
    public static native int S_IRGRP();
    public static native int S_IROTH();
    public static native int S_IRUSR();
    public static native int S_IRWXG();
    public static native int S_IRWXO();
    public static native int S_IRWXU();
    public static native int S_ISGID();
    public static native int S_ISUID();
    public static native int S_ISVTX();
    public static native int S_IWGRP();
    public static native int S_IWOTH();
    public static native int S_IWUSR();
    public static native int S_IXGRP();
    public static native int S_IXOTH();
    public static native int S_IXUSR();
    public static native int TCP_NODELAY();
    public static native int TCP_USER_TIMEOUT();
    public static native int UDP_GRO();
    public static native int UDP_SEGMENT();
    /**
     * Get the number of bytes in the output buffer.
     *
     * See <a href="https://man7.org/linux/man-pages/man2/ioctl.2.html">ioctl(2)</a>.
     *
     * @hide
     */
    @UnsupportedAppUsage
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static native int TIOCOUTQ();
    /**
     * Sockopt option to encapsulate ESP packets in UDP.
     *
     * @hide
     */
    @UnsupportedAppUsage
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static native int UDP_ENCAP();
    /** @hide */
    @UnsupportedAppUsage
    public static native int UDP_ENCAP_ESPINUDP_NON_IKE();
    /** @hide */
    @UnsupportedAppUsage
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static native int UDP_ENCAP_ESPINUDP();
    /** @hide */
    @UnsupportedAppUsage
    public static native int UNIX_PATH_MAX();
    public static native int WCONTINUED();
    public static native int WEXITED();
    public static native int WNOHANG();
    public static native int WNOWAIT();
    public static native int WSTOPPED();
    public static native int WUNTRACED();
    public static native int W_OK();
    /**
     * {@code flags} option for {@link Os#setxattr(String, String, byte[], int)}.
     *
     * <p>Performs a pure create, which fails if the named attribute exists already.
     *
     * See <a href="http://man7.org/linux/man-pages/man2/setxattr.2.html">setxattr(2)</a>.
     *
     * @hide
     */
    @UnsupportedAppUsage
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static native int XATTR_CREATE();
    /**
     * {@code flags} option for {@link Os#setxattr(String, String, byte[], int)}.
     *
     * <p>Perform a pure replace operation, which fails if the named attribute
     * does not already exist.
     *
     * See <a href="http://man7.org/linux/man-pages/man2/setxattr.2.html">setxattr(2)</a>.
     *
     * @hide
     */
    @UnsupportedAppUsage
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static native int XATTR_REPLACE();
    public static native int X_OK();
    public static native int _SC_2_CHAR_TERM();
    public static native int _SC_2_C_BIND();
    public static native int _SC_2_C_DEV();
    public static native int _SC_2_C_VERSION();
    public static native int _SC_2_FORT_DEV();
    public static native int _SC_2_FORT_RUN();
    public static native int _SC_2_LOCALEDEF();
    public static native int _SC_2_SW_DEV();
    public static native int _SC_2_UPE();
    public static native int _SC_2_VERSION();
    public static native int _SC_AIO_LISTIO_MAX();
    public static native int _SC_AIO_MAX();
    public static native int _SC_AIO_PRIO_DELTA_MAX();
    public static native int _SC_ARG_MAX();
    public static native int _SC_ASYNCHRONOUS_IO();
    public static native int _SC_ATEXIT_MAX();
    public static native int _SC_AVPHYS_PAGES();
    public static native int _SC_BC_BASE_MAX();
    public static native int _SC_BC_DIM_MAX();
    public static native int _SC_BC_SCALE_MAX();
    public static native int _SC_BC_STRING_MAX();
    public static native int _SC_CHILD_MAX();
    public static native int _SC_CLK_TCK();
    public static native int _SC_COLL_WEIGHTS_MAX();
    public static native int _SC_DELAYTIMER_MAX();
    public static native int _SC_EXPR_NEST_MAX();
    public static native int _SC_FSYNC();
    public static native int _SC_GETGR_R_SIZE_MAX();
    public static native int _SC_GETPW_R_SIZE_MAX();
    public static native int _SC_IOV_MAX();
    public static native int _SC_JOB_CONTROL();
    public static native int _SC_LINE_MAX();
    public static native int _SC_LOGIN_NAME_MAX();
    public static native int _SC_MAPPED_FILES();
    public static native int _SC_MEMLOCK();
    public static native int _SC_MEMLOCK_RANGE();
    public static native int _SC_MEMORY_PROTECTION();
    public static native int _SC_MESSAGE_PASSING();
    public static native int _SC_MQ_OPEN_MAX();
    public static native int _SC_MQ_PRIO_MAX();
    public static native int _SC_NGROUPS_MAX();
    public static native int _SC_NPROCESSORS_CONF();
    public static native int _SC_NPROCESSORS_ONLN();
    public static native int _SC_OPEN_MAX();
    public static native int _SC_PAGESIZE();
    public static native int _SC_PAGE_SIZE();
    public static native int _SC_PASS_MAX();
    public static native int _SC_PHYS_PAGES();
    public static native int _SC_PRIORITIZED_IO();
    public static native int _SC_PRIORITY_SCHEDULING();
    public static native int _SC_REALTIME_SIGNALS();
    public static native int _SC_RE_DUP_MAX();
    public static native int _SC_RTSIG_MAX();
    public static native int _SC_SAVED_IDS();
    public static native int _SC_SEMAPHORES();
    public static native int _SC_SEM_NSEMS_MAX();
    public static native int _SC_SEM_VALUE_MAX();
    public static native int _SC_SHARED_MEMORY_OBJECTS();
    public static native int _SC_SIGQUEUE_MAX();
    public static native int _SC_STREAM_MAX();
    public static native int _SC_SYNCHRONIZED_IO();
    public static native int _SC_THREADS();
    public static native int _SC_THREAD_ATTR_STACKADDR();
    public static native int _SC_THREAD_ATTR_STACKSIZE();
    public static native int _SC_THREAD_DESTRUCTOR_ITERATIONS();
    public static native int _SC_THREAD_KEYS_MAX();
    public static native int _SC_THREAD_PRIORITY_SCHEDULING();
    public static native int _SC_THREAD_PRIO_INHERIT();
    public static native int _SC_THREAD_PRIO_PROTECT();
    public static native int _SC_THREAD_SAFE_FUNCTIONS();
    public static native int _SC_THREAD_STACK_MIN();
    public static native int _SC_THREAD_THREADS_MAX();
    public static native int _SC_TIMERS();
    public static native int _SC_TIMER_MAX();
    public static native int _SC_TTY_NAME_MAX();
    public static native int _SC_TZNAME_MAX();
    public static native int _SC_VERSION();
    public static native int _SC_XBS5_ILP32_OFF32();
    public static native int _SC_XBS5_ILP32_OFFBIG();
    public static native int _SC_XBS5_LP64_OFF64();
    public static native int _SC_XBS5_LPBIG_OFFBIG();
    public static native int _SC_XOPEN_CRYPT();
    public static native int _SC_XOPEN_ENH_I18N();
    public static native int _SC_XOPEN_LEGACY();
    public static native int _SC_XOPEN_REALTIME();
    public static native int _SC_XOPEN_REALTIME_THREADS();
    public static native int _SC_XOPEN_SHM();
    public static native int _SC_XOPEN_UNIX();
    public static native int _SC_XOPEN_VERSION();
    public static native int _SC_XOPEN_XCU_VERSION();

    /**
     * Returns the string name of a getaddrinfo(3) error value.
     * For example, "EAI_AGAIN".
     */
    public static native String gaiName(int error);

    /**
     * Returns the string name of an errno value.
     * For example, "EACCES". See {@link Os#strerror} for human-readable errno descriptions.
     */
    public static native String errnoName(int errno);

//    @UnsupportedAppUsage
//    private static native void initConstants();
//
//    // A hack to avoid these constants being inlined by javac...
//    @UnsupportedAppUsage
//    private static int placeholder() { return 0; }
//    // ...because we want to initialize them at runtime.
//    static {
//        initConstants();
//    }
}
