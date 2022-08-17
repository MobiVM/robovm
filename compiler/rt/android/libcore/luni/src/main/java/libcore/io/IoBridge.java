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

package libcore.io;

import android.annotation.SystemApi;
import android.compat.annotation.UnsupportedAppUsage;
import android.system.ErrnoException;
import android.system.StructGroupReq;
import android.system.StructLinger;
import android.system.StructPollfd;
import android.system.StructTimeval;

import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.BindException;
import java.net.ConnectException;
import java.net.DatagramPacket;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.NetworkInterface;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketOptions;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

import libcore.util.ArrayUtils;
import libcore.util.NonNull;
import libcore.util.Nullable;

import static android.annotation.SystemApi.Client.MODULE_LIBRARIES;
import static android.system.OsConstants.*;

/**
 * Collection of utility methods to work with blocking and non-blocking I/O that wrap raw POSIX
 * system calls, e.g. {@link android.system.Os}. These wrappers are to signal other blocked I/O
 * threads and avoid boilerplate code of routine error checks when using raw system calls.
 *
 * <p>
 * For example, when using {@link Os#read(FileDescriptor, byte[], int, int)}, return value can
 * contain:
 * <ul>
 *   <li>{@code 0} which means EOF</li>
 *   <li>{@code N > 0} which means number of bytes read</li>
 *   <li>{@code -1} which means error, and {@link ErrnoException} is thrown</li>
 * </ul>
 *
 * <p>
 * {@link ErrnoException} in its turn can be one of:
 * <ul>
 *   <li>{@link android.system.OsConstants#EAGAIN} which means the file descriptor refers to a file
 *       or a socket, which has been marked nonblocking
 *       ({@link android.system.OsConstants#O_NONBLOCK}), and the read would block</li>
 *   <li>{@link android.system.OsConstants#EBADF} which means the file descriptor is not a valid
 *       file descriptor or is not open for reading</li>
 *   <li>{@link android.system.OsConstants#EFAULT} which means given buffer is outside accessible
 *       address space</li>
 *   <li>{@link android.system.OsConstants#EINTR} which means the call was interrupted by a signal
 *       before any data was read</li>
 *   <li>{@link android.system.OsConstants#EINVAL} which means the file descriptor is attached to
 *       an object which is unsuitable for reading; or the file was opened with the
 *       {@link android.system.OsConstants#O_DIRECT} flag, and either the address specified in
 *       {@code buffer}, the value specified in {@code count}, or the file {@code offset} is not
 *       suitably aligned</li>
 *   <li>{@link android.system.OsConstants#EIO} which means I/O error happened</li>
 *   <li>{@link android.system.OsConstants#EISDIR} which means the file descriptor refers to a
 *       directory</li>
 * </ul>
 *
 * All these errors require handling, and this class contains some wrapper methods that handle most
 * common cases, making usage of system calls more user friendly.
 *
 * @hide
 */
@SystemApi(client = MODULE_LIBRARIES)
@libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
public final class IoBridge {

    private IoBridge() {
    }

    /** @hide */
    public static int available(FileDescriptor fd) throws IOException {
        try {
            int available = Libcore.os.ioctlInt(fd, FIONREAD);
            if (available < 0) {
                // If the fd refers to a regular file, the result is the difference between
                // the file size and the file position. This may be negative if the position
                // is past the end of the file. If the fd refers to a special file masquerading
                // as a regular file, the result may be negative because the special file
                // may appear to have zero size and yet a previous read call may have
                // read some amount of data and caused the file position to be advanced.
                available = 0;
            }
            return available;
        } catch (ErrnoException errnoException) {
            if (errnoException.errno == ENOTTY) {
                // The fd is unwilling to opine about its read buffer.
                return 0;
            }
            throw errnoException.rethrowAsIOException();
        }
    }

    /** @hide */
    public static void bind(FileDescriptor fd, InetAddress address, int port) throws SocketException {
        if (address instanceof Inet6Address) {
            Inet6Address inet6Address = (Inet6Address) address;
            if (inet6Address.getScopeId() == 0 && inet6Address.isLinkLocalAddress()) {
                // Linux won't let you bind a link-local address without a scope id.
                // Find one.
                NetworkInterface nif = NetworkInterface.getByInetAddress(address);
                if (nif == null) {
                    throw new SocketException("Can't bind to a link-local address without a scope id: " + address);
                }
                try {
                    address = Inet6Address.getByAddress(address.getHostName(), address.getAddress(), nif.getIndex());
                } catch (UnknownHostException ex) {
                    throw new AssertionError(ex); // Can't happen.
                }
            }
        }
        try {
            Libcore.os.bind(fd, address, port);
        } catch (ErrnoException errnoException) {
            if (errnoException.errno == EADDRINUSE || errnoException.errno == EADDRNOTAVAIL ||
                errnoException.errno == EPERM || errnoException.errno == EACCES) {
                throw new BindException(errnoException.getMessage(), errnoException);
            } else {
                throw new SocketException(errnoException.getMessage(), errnoException);
            }
        }
    }


    /**
     * Connects socket 'fd' to 'inetAddress' on 'port', with no timeout. The lack of a timeout
     * means this method won't throw SocketTimeoutException.
     *
     * @hide
     */
    public static void connect(FileDescriptor fd, InetAddress inetAddress, int port) throws SocketException {
        try {
            IoBridge.connect(fd, inetAddress, port, 0);
        } catch (SocketTimeoutException ex) {
            throw new AssertionError(ex); // Can't happen for a connect without a timeout.
        }
    }

    /**
     * Connects socket 'fd' to 'inetAddress' on 'port', with a the given 'timeoutMs'.
     * Use timeoutMs == 0 for a blocking connect with no timeout.
     *
     * @hide
     */
    public static void connect(FileDescriptor fd, InetAddress inetAddress, int port, int timeoutMs) throws SocketException, SocketTimeoutException {
        try {
            connectErrno(fd, inetAddress, port, timeoutMs);
        } catch (ErrnoException errnoException) {
            if (errnoException.errno == EHOSTUNREACH) {
                throw new NoRouteToHostException("Host unreachable");
            }
            if (errnoException.errno == EADDRNOTAVAIL) {
                throw new NoRouteToHostException("Address not available");
            }
            throw new ConnectException(createMessageForException(fd, inetAddress, port, timeoutMs,
                    errnoException), errnoException);
        } catch (SocketException ex) {
            throw ex; // We don't want to doubly wrap these.
        } catch (SocketTimeoutException ex) {
            throw ex; // We don't want to doubly wrap these.
        } catch (IOException ex) {
            throw new SocketException(ex);
        }
    }

    private static void connectErrno(FileDescriptor fd, InetAddress inetAddress, int port, int timeoutMs) throws ErrnoException, IOException {
        // With no timeout, just call connect(2) directly.
        if (timeoutMs <= 0) {
            Libcore.os.connect(fd, inetAddress, port);
            return;
        }

        // For connect with a timeout, we:
        //   1. set the socket to non-blocking,
        //   2. connect(2),
        //   3. loop using poll(2) to decide whether we're connected, whether we should keep
        //      waiting, or whether we've seen a permanent failure and should give up,
        //   4. set the socket back to blocking.

        // 1. set the socket to non-blocking.
        IoUtils.setBlocking(fd, false);

        // 2. call connect(2) non-blocking.
        long finishTimeNanos = System.nanoTime() + TimeUnit.MILLISECONDS.toNanos(timeoutMs);
        try {
            Libcore.os.connect(fd, inetAddress, port);
            IoUtils.setBlocking(fd, true); // 4. set the socket back to blocking.
            return; // We connected immediately.
        } catch (ErrnoException errnoException) {
            if (errnoException.errno != EINPROGRESS) {
                throw errnoException;
            }
            // EINPROGRESS means we should keep trying...
        }

        // 3. loop using poll(2).
        int remainingTimeoutMs;
        do {
            remainingTimeoutMs =
                    (int) TimeUnit.NANOSECONDS.toMillis(finishTimeNanos - System.nanoTime());
            if (remainingTimeoutMs <= 0) {
                throw new SocketTimeoutException(
                        createMessageForException(fd, inetAddress, port, timeoutMs, null));
            }
        } while (!IoBridge.isConnected(fd, inetAddress, port, timeoutMs, remainingTimeoutMs));
        IoUtils.setBlocking(fd, true); // 4. set the socket back to blocking.
    }

    /**
     * Constructs the message for an exception that the caller is about to throw.
     *
     * @hide
     */
    private static String createMessageForException(FileDescriptor fd, InetAddress inetAddress,
            int port, int timeoutMs, Exception causeOrNull) {
        // Figure out source address from fd.
        InetSocketAddress localAddress = null;
        try {
            localAddress = getLocalInetSocketAddress(fd);
        } catch (SocketException ignored) {
            // The caller is about to throw an exception, so this one would only distract.
        }

        StringBuilder sb = new StringBuilder("failed to connect")
              .append(" to ")
              .append(inetAddress)
              .append(" (port ")
              .append(port)
              .append(")");
        if (localAddress != null) {
            sb.append(" from ")
              .append(localAddress.getAddress())
              .append(" (port ")
              .append(localAddress.getPort())
              .append(")");
        }
        if (timeoutMs > 0) {
            sb.append(" after ")
              .append(timeoutMs)
              .append("ms");
        }
        if (causeOrNull != null) {
            sb.append(": ")
              .append(causeOrNull.getMessage());
        }
        return sb.toString();
    }

    /**
     * Closes the Unix file descriptor associated with the supplied file descriptor, resets the
     * internal int to -1, and sends a signal to any threads are currently blocking. In order for
     * the signal to be sent the blocked threads must have registered with the
     * {@link AsynchronousCloseMonitor} before they entered the blocking operation. {@code fd} will be
     * invalid after this call.
     *
     * <p>This method is a no-op if passed a {@code null} or already-closed file descriptor.
     *
     * @param fd file descriptor to be closed
     * @throws IOException if underlying system call fails with {@link ErrnoException}
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static void closeAndSignalBlockedThreads(@NonNull FileDescriptor fd) throws IOException {
        if (fd == null) {
            return;
        }

        // fd is invalid after we call release$.
        // If multiple threads reach this point simultaneously, release$ is synchronized, so one
        // of them will receive the old fd, and the rest will get an empty FileDescriptor.
        FileDescriptor oldFd = fd.release$();
        if (!oldFd.valid()) {
            return;
        }

        AsynchronousCloseMonitor.signalBlockedThreads(oldFd);
        try {
            Libcore.os.close(oldFd);
        } catch (ErrnoException errnoException) {
            throw errnoException.rethrowAsIOException();
        }
    }

    /** @hide */
    @UnsupportedAppUsage
    public static boolean isConnected(FileDescriptor fd, InetAddress inetAddress, int port,
            int timeoutMs, int remainingTimeoutMs) throws IOException {
        ErrnoException cause;
        try {
            StructPollfd[] pollFds = new StructPollfd[] { new StructPollfd() };
            pollFds[0].fd = fd;
            pollFds[0].events = (short) POLLOUT;
            int rc = Libcore.os.poll(pollFds, remainingTimeoutMs);
            if (rc == 0) {
                return false; // Timeout.
            }
            int connectError = Libcore.os.getsockoptInt(fd, SOL_SOCKET, SO_ERROR);
            if (connectError == 0) {
                return true; // Success!
            }
            throw new ErrnoException("isConnected", connectError); // The connect(2) failed.
        } catch (ErrnoException errnoException) {
            if (!fd.valid()) {
                throw new SocketException("Socket closed");
            }
            cause = errnoException;
        }
        String detail = createMessageForException(fd, inetAddress, port, timeoutMs, cause);
        if (cause.errno == ETIMEDOUT) {
            SocketTimeoutException e = new SocketTimeoutException(detail);
            e.initCause(cause);
            throw e;
        }
        throw new ConnectException(detail, cause);
    }

    // Socket options used by java.net but not exposed in SocketOptions.
    /** @hide */
    public static final int JAVA_MCAST_JOIN_GROUP = 19;
    /** @hide */
    public static final int JAVA_MCAST_LEAVE_GROUP = 20;
    /** @hide */
    public static final int JAVA_IP_MULTICAST_TTL = 17;
    /** @hide */
    public static final int JAVA_IP_TTL = 25;

    /**
     * java.net has its own socket options similar to the underlying Unix ones. We paper over the
     * differences here.
     * @hide
     */
    public static Object getSocketOption(FileDescriptor fd, int option) throws SocketException {
        try {
            return getSocketOptionErrno(fd, option);
        } catch (ErrnoException errnoException) {
            throw errnoException.rethrowAsSocketException();
        }
    }

    private static Object getSocketOptionErrno(FileDescriptor fd, int option) throws ErrnoException, SocketException {
        switch (option) {
        case SocketOptions.IP_MULTICAST_IF:
        case SocketOptions.IP_MULTICAST_IF2:
            return Libcore.os.getsockoptInt(fd, IPPROTO_IPV6, IPV6_MULTICAST_IF);
        case SocketOptions.IP_MULTICAST_LOOP:
            // Since setting this from java.net always sets IPv4 and IPv6 to the same value,
            // it doesn't matter which we return.
            // NOTE: getsockopt's return value means "isEnabled", while OpenJDK code java.net
            // requires a value that means "isDisabled" so we NEGATE the system call value here.
            return !booleanFromInt(Libcore.os.getsockoptInt(fd, IPPROTO_IPV6, IPV6_MULTICAST_LOOP));
        case IoBridge.JAVA_IP_MULTICAST_TTL:
            // Since setting this from java.net always sets IPv4 and IPv6 to the same value,
            // it doesn't matter which we return.
            return Libcore.os.getsockoptInt(fd, IPPROTO_IPV6, IPV6_MULTICAST_HOPS);
        case IoBridge.JAVA_IP_TTL:
            // Since setting this from java.net always sets IPv4 and IPv6 to the same value,
            // it doesn't matter which we return.
            return Libcore.os.getsockoptInt(fd, IPPROTO_IPV6, IPV6_UNICAST_HOPS);
        case SocketOptions.IP_TOS:
            // Since setting this from java.net always sets IPv4 and IPv6 to the same value,
            // it doesn't matter which we return.
            return Libcore.os.getsockoptInt(fd, IPPROTO_IPV6, IPV6_TCLASS);
        case SocketOptions.SO_BROADCAST:
            return booleanFromInt(Libcore.os.getsockoptInt(fd, SOL_SOCKET, SO_BROADCAST));
        case SocketOptions.SO_KEEPALIVE:
            return booleanFromInt(Libcore.os.getsockoptInt(fd, SOL_SOCKET, SO_KEEPALIVE));
        case SocketOptions.SO_LINGER:
            StructLinger linger = Libcore.os.getsockoptLinger(fd, SOL_SOCKET, SO_LINGER);
            if (!linger.isOn()) {
                return false;
            }
            return linger.l_linger;
        case SocketOptions.SO_OOBINLINE:
            return booleanFromInt(Libcore.os.getsockoptInt(fd, SOL_SOCKET, SO_OOBINLINE));
        case SocketOptions.SO_RCVBUF:
            return Libcore.os.getsockoptInt(fd, SOL_SOCKET, SO_RCVBUF);
        case SocketOptions.SO_REUSEADDR:
            return booleanFromInt(Libcore.os.getsockoptInt(fd, SOL_SOCKET, SO_REUSEADDR));
        case SocketOptions.SO_SNDBUF:
            return Libcore.os.getsockoptInt(fd, SOL_SOCKET, SO_SNDBUF);
        case SocketOptions.SO_TIMEOUT:
            return (int) Libcore.os.getsockoptTimeval(fd, SOL_SOCKET, SO_RCVTIMEO).toMillis();
        case SocketOptions.TCP_NODELAY:
            return booleanFromInt(Libcore.os.getsockoptInt(fd, IPPROTO_TCP, TCP_NODELAY));
        case SocketOptions.SO_BINDADDR:
            return ((InetSocketAddress) Libcore.os.getsockname(fd)).getAddress();
        default:
            throw new SocketException("Unknown socket option: " + option);
        }
    }

    private static boolean booleanFromInt(int i) {
        return (i != 0);
    }

    private static int booleanToInt(boolean b) {
        return b ? 1 : 0;
    }

    /**
     * java.net has its own socket options similar to the underlying Unix ones. We paper over the
     * differences here.
     *
     * @hide
     */
    public static void setSocketOption(FileDescriptor fd, int option, Object value) throws SocketException {
        try {
            setSocketOptionErrno(fd, option, value);
        } catch (ErrnoException errnoException) {
            throw errnoException.rethrowAsSocketException();
        }
    }

    private static void setSocketOptionErrno(FileDescriptor fd, int option, Object value) throws ErrnoException, SocketException {
        switch (option) {
        case SocketOptions.IP_MULTICAST_IF:
            NetworkInterface nif = NetworkInterface.getByInetAddress((InetAddress) value);
            if (nif == null) {
                throw new SocketException(
                        "bad argument for IP_MULTICAST_IF : address not bound to any interface");
            }
            // Although IPv6 was cleaned up to use int, IPv4 uses an ip_mreqn containing an int.
            Libcore.os.setsockoptIpMreqn(fd, IPPROTO_IP, IP_MULTICAST_IF, nif.getIndex());
            Libcore.os.setsockoptInt(fd, IPPROTO_IPV6, IPV6_MULTICAST_IF, nif.getIndex());
            return;
        case SocketOptions.IP_MULTICAST_IF2:
            // Although IPv6 was cleaned up to use int, IPv4 uses an ip_mreqn containing an int.
            Libcore.os.setsockoptIpMreqn(fd, IPPROTO_IP, IP_MULTICAST_IF, (Integer) value);
            Libcore.os.setsockoptInt(fd, IPPROTO_IPV6, IPV6_MULTICAST_IF, (Integer) value);
            return;
        case SocketOptions.IP_MULTICAST_LOOP:
            // Although IPv6 was cleaned up to use int, IPv4 multicast loopback uses a byte.
            // NOTE: setsockopt's arguement value means "isEnabled", while OpenJDK code java.net
            // uses a value that means "isDisabled" so we NEGATE the system call value here.
            int enable = booleanToInt(!((Boolean) value));
            Libcore.os.setsockoptByte(fd, IPPROTO_IP, IP_MULTICAST_LOOP, enable);
            Libcore.os.setsockoptInt(fd, IPPROTO_IPV6, IPV6_MULTICAST_LOOP, enable);
            return;
        case IoBridge.JAVA_IP_MULTICAST_TTL:
            // Although IPv6 was cleaned up to use int, and IPv4 non-multicast TTL uses int,
            // IPv4 multicast TTL uses a byte.
            Libcore.os.setsockoptByte(fd, IPPROTO_IP, IP_MULTICAST_TTL, (Integer) value);
            Libcore.os.setsockoptInt(fd, IPPROTO_IPV6, IPV6_MULTICAST_HOPS, (Integer) value);
            return;
        case IoBridge.JAVA_IP_TTL:
            Libcore.os.setsockoptInt(fd, IPPROTO_IP, IP_TTL, (Integer) value);
            Libcore.os.setsockoptInt(fd, IPPROTO_IPV6, IPV6_UNICAST_HOPS, (Integer) value);
            return;
        case SocketOptions.IP_TOS:
            Libcore.os.setsockoptInt(fd, IPPROTO_IP, IP_TOS, (Integer) value);
            Libcore.os.setsockoptInt(fd, IPPROTO_IPV6, IPV6_TCLASS, (Integer) value);
            return;
        case SocketOptions.SO_BROADCAST:
            Libcore.os.setsockoptInt(fd, SOL_SOCKET, SO_BROADCAST, booleanToInt((Boolean) value));
            return;
        case SocketOptions.SO_KEEPALIVE:
            Libcore.os.setsockoptInt(fd, SOL_SOCKET, SO_KEEPALIVE, booleanToInt((Boolean) value));
            return;
        case SocketOptions.SO_LINGER:
            boolean on = false;
            int seconds = 0;
            if (value instanceof Integer) {
                on = true;
                seconds = Math.min((Integer) value, 65535);
            }
            StructLinger linger = new StructLinger(booleanToInt(on), seconds);
            Libcore.os.setsockoptLinger(fd, SOL_SOCKET, SO_LINGER, linger);
            return;
        case SocketOptions.SO_OOBINLINE:
            Libcore.os.setsockoptInt(fd, SOL_SOCKET, SO_OOBINLINE, booleanToInt((Boolean) value));
            return;
        case SocketOptions.SO_RCVBUF:
            Libcore.os.setsockoptInt(fd, SOL_SOCKET, SO_RCVBUF, (Integer) value);
            return;
        case SocketOptions.SO_REUSEADDR:
            Libcore.os.setsockoptInt(fd, SOL_SOCKET, SO_REUSEADDR, booleanToInt((Boolean) value));
            return;
        case SocketOptions.SO_SNDBUF:
            Libcore.os.setsockoptInt(fd, SOL_SOCKET, SO_SNDBUF, (Integer) value);
            return;
        case SocketOptions.SO_TIMEOUT:
            int millis = (Integer) value;
            StructTimeval tv = StructTimeval.fromMillis(millis);
            Libcore.os.setsockoptTimeval(fd, SOL_SOCKET, SO_RCVTIMEO, tv);
            return;
        case SocketOptions.TCP_NODELAY:
            Libcore.os.setsockoptInt(fd, IPPROTO_TCP, TCP_NODELAY, booleanToInt((Boolean) value));
            return;
        case IoBridge.JAVA_MCAST_JOIN_GROUP:
        case IoBridge.JAVA_MCAST_LEAVE_GROUP:
        {
            StructGroupReq groupReq = (StructGroupReq) value;
            int level = (groupReq.gr_group instanceof Inet4Address) ? IPPROTO_IP : IPPROTO_IPV6;
            int op = (option == JAVA_MCAST_JOIN_GROUP) ? MCAST_JOIN_GROUP : MCAST_LEAVE_GROUP;
            Libcore.os.setsockoptGroupReq(fd, level, op, groupReq);
            return;
        }
        default:
            throw new SocketException("Unknown socket option: " + option);
        }
    }

    /**
     * Wrapper for {@link Os#open(String, int, int)} that behaves similar to {@link java.io.File}.
     * When a {@link java.io.File} is opened and there is an error, it throws
     * {@link java.io.FileNotFoundException} regardless of what went wrong, when POSIX
     * {@link Os#open(String, int, int)} throws more grained exceptions of what went wrong.
     *
     * <p>Additionally, attempt to open directory using {@link java.io.File} is also error, however
     * POSIX {@link Os#open(String, int, int)} for read-only directories is not error.
     *
     * @see <a href="https://man7.org/linux/man-pages/man2/open.2.html">open(2)</a>.
     *
     * @param path  path of the file to be opened
     * @param flags bitmask of the access, file creation and file status flags
     * @return {@link FileDescriptor} of an opened file
     * @throws FileNotFoundException if there was error opening file under {@code path}
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static @NonNull FileDescriptor open(@NonNull String path, int flags) throws FileNotFoundException {
        FileDescriptor fd = null;
        try {
            fd = Libcore.os.open(path, flags, 0666);
            // Posix open(2) fails with EISDIR only if you ask for write permission.
            // Java disallows reading directories too.f
            if (S_ISDIR(Libcore.os.fstat(fd).st_mode)) {
                throw new ErrnoException("open", EISDIR);
            }
            return fd;
        } catch (ErrnoException errnoException) {
            try {
                if (fd != null) {
                    closeAndSignalBlockedThreads(fd);
                }
            } catch (IOException ignored) {
            }
            FileNotFoundException ex = new FileNotFoundException(path + ": " + errnoException.getMessage());
            ex.initCause(errnoException);
            throw ex;
        }
    }

    /**
     * Wrapper for {@link Os#read(FileDescriptor, byte[], int, int)} that behaves similar to
     * {@link java.io.FileInputStream#read(byte[], int, int)} and
     * {@link java.io.FileReader#read(char[], int, int)} which interpret reading at {@code EOF} as
     * error, when POSIX system call returns {@code 0} (and future reads return {@code -1}).
     *
     * <p>@see <a href="https://man7.org/linux/man-pages/man2/read.2.html">read(2)</a>.
     *
     * @param fd         file descriptor to read from
     * @param bytes      buffer to put data read from {@code fd}
     * @param byteOffset offset in {@code bytes} buffer to put read data at
     * @param byteCount  number of bytes to read from {@code fd}
     * @return           number of bytes read, if read operation was successful
     * @throws IOException if underlying system call returned error
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static int read(@NonNull FileDescriptor fd, @NonNull byte[] bytes, int byteOffset, int byteCount) throws IOException {
        ArrayUtils.throwsIfOutOfBounds(bytes.length, byteOffset, byteCount);
        if (byteCount == 0) {
            return 0;
        }
        try {
            int readCount = Libcore.os.read(fd, bytes, byteOffset, byteCount);
            if (readCount == 0) {
                return -1;
            }
            return readCount;
        } catch (ErrnoException errnoException) {
            if (errnoException.errno == EAGAIN) {
                // We return 0 rather than throw if we try to read from an empty non-blocking pipe.
                return 0;
            }
            throw errnoException.rethrowAsIOException();
        }
    }

    /**
     * Wrapper for {@link Os#write(FileDescriptor, byte[], int, int)} that behaves similar to
     * {@link java.io.FileOutputStream#write(byte[], int, int)} and
     * {@link java.io.FileWriter#write(char[], int, int)} which always either write all requested
     * bytes, or fail with error; as opposed to POSIX write, when the number of bytes written may
     * be less than {@code bytes}. This may happen, for example, if there is insufficient space on
     * the underlying  physical medium, or the {@code RLIMIT_FSIZE} resource limit is encountered,
     * or the call was interrupted by a signal handler after having written less than {@code bytes}
     * bytes.
     *
     * <p>@see <a href="https://man7.org/linux/man-pages/man2/write.2.html">write(2)</a>.
     *
     * @param fd         file descriptor to write to
     * @param bytes      buffer containing the data to be written
     * @param byteOffset offset in {@code bytes} buffer to read written data from
     * @param byteCount  number of bytes to write to {@code fd}
     * @throws IOException if underlying system call returned error
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static void write(@NonNull FileDescriptor fd,@NonNull  byte[] bytes, int byteOffset, int byteCount) throws IOException {
        ArrayUtils.throwsIfOutOfBounds(bytes.length, byteOffset, byteCount);
        if (byteCount == 0) {
            return;
        }
        try {
            while (byteCount > 0) {
                int bytesWritten = Libcore.os.write(fd, bytes, byteOffset, byteCount);
                byteCount -= bytesWritten;
                byteOffset += bytesWritten;
            }
        } catch (ErrnoException errnoException) {
            throw errnoException.rethrowAsIOException();
        }
    }

    /**
     * Wrapper around {@link Os#sendto(FileDescriptor, byte[], int, int, int, InetAddress, int)}
     * that allows sending data over both TCP and UDP socket; handles
     * {@link android.system.OsConstants#EAGAIN} and {@link android.system.OsConstants#ECONNREFUSED}
     * and behaves similar to and behaves similar to
     * {@link java.net.DatagramSocket#send(DatagramPacket)} and
     * {@link Socket#getOutputStream()#write(FileDescriptor, byte[], int, int)}.
     *
     * <p>See {@link android.system.OsConstants} for available flags.
     *
     * <p>@see <a href="https://man7.org/linux/man-pages/man2/send.2.html">send(2)</a>.
     *
     * @param fd          {@link FileDescriptor} of the socket to send data over
     * @param bytes       byte buffer containing the data to be sent
     * @param byteOffset  offset in {@code bytes} at which data to be sent starts
     * @param byteCount   number of bytes to be sent
     * @param flags       bitwise OR of zero or more of flags, like {@link android.system.OsConstants#MSG_DONTROUTE}
     * @param inetAddress destination address
     * @param port        destination port
     * @return            number of bytes sent on success
     * @throws IOException if underlying system call returned error
     *
     * @hide
     */
    public static int sendto(@NonNull FileDescriptor fd, @NonNull byte[] bytes, int byteOffset, int byteCount, int flags, @Nullable InetAddress inetAddress, int port) throws IOException {
        boolean isDatagram = (inetAddress != null);
        if (!isDatagram && byteCount <= 0) {
            return 0;
        }
        int result;
        try {
            result = Libcore.os.sendto(fd, bytes, byteOffset, byteCount, flags, inetAddress, port);
        } catch (ErrnoException errnoException) {
            result = maybeThrowAfterSendto(isDatagram, errnoException);
        }
        return result;
    }

    /** @hide */
    public static int sendto(FileDescriptor fd, ByteBuffer buffer, int flags, InetAddress inetAddress, int port) throws IOException {
        boolean isDatagram = (inetAddress != null);
        if (!isDatagram && buffer.remaining() == 0) {
            return 0;
        }
        int result;
        try {
            result = Libcore.os.sendto(fd, buffer, flags, inetAddress, port);
        } catch (ErrnoException errnoException) {
            result = maybeThrowAfterSendto(isDatagram, errnoException);
        }
        return result;
    }

    private static int maybeThrowAfterSendto(boolean isDatagram, ErrnoException errnoException)
            throws IOException {
        if (isDatagram) {
            if (errnoException.errno == ECONNREFUSED) {
                throw new PortUnreachableException("ICMP Port Unreachable");
            }
        } else {
            if (errnoException.errno == EAGAIN) {
                // We were asked to write to a non-blocking socket, but were told
                // it would block, so report "no bytes written".
                return 0;
            }
        }
        throw errnoException.rethrowAsIOException();
    }

    /**
     * Wrapper around {@link Os#recvfrom(FileDescriptor, byte[], int, int, int, InetSocketAddress)}
     * that receives a message from both TCP and UDP socket; handles
     * {@link android.system.OsConstants#EAGAIN} and {@link android.system.OsConstants#ECONNREFUSED}
     * and behaves similar to {@link java.net.DatagramSocket#receive(DatagramPacket)} and
     * {@link Socket#getInputStream()#recvfrom(boolean, FileDescriptor, byte[], int, int, int, DatagramPacket, boolean)}.
     *
     * <p>If {@code packet} is not {@code null}, and the underlying protocol provides the source
     * address of the message, that source address is placed in the {@code packet}.
     *
     * @see <a href="https://man7.org/linux/man-pages/man2/recv.2.html">recv(2)</a>.
     *
     * @param isRead      {@code true} if some data been read already from {@code fd}
     * @param fd          socket to receive data from
     * @param bytes       buffer to put data read from {@code fd}
     * @param byteOffset  offset in {@code bytes} buffer to put read data at
     * @param byteCount   number of bytes to read from {@code fd}
     * @param flags       bitwise OR of zero or more of flags, like {@link android.system.OsConstants#MSG_DONTROUTE}
     * @param packet      {@link DatagramPacket} to fill with source address
     * @param isConnected {@code true} if socket {@code fd} is connected
     * @return            number of bytes read, if read operation was successful
     * @throws IOException if underlying system call returned error
     *
     * @hide
     */
    public static int recvfrom(boolean isRead, @NonNull FileDescriptor fd, @NonNull byte[] bytes, int byteOffset, int byteCount, int flags, @Nullable DatagramPacket packet, boolean isConnected) throws IOException {
        int result;
        try {
            InetSocketAddress srcAddress = packet != null ? new InetSocketAddress() : null;
            result = Libcore.os.recvfrom(fd, bytes, byteOffset, byteCount, flags, srcAddress);
            result = postRecvfrom(isRead, packet, srcAddress, result);
        } catch (ErrnoException errnoException) {
            result = maybeThrowAfterRecvfrom(isRead, isConnected, errnoException);
        }
        return result;
    }

    /** @hide */
    public static int recvfrom(boolean isRead, FileDescriptor fd, ByteBuffer buffer, int flags, DatagramPacket packet, boolean isConnected) throws IOException {
        int result;
        try {
            InetSocketAddress srcAddress = packet != null ? new InetSocketAddress() : null;
            result = Libcore.os.recvfrom(fd, buffer, flags, srcAddress);
            result = postRecvfrom(isRead, packet, srcAddress, result);
        } catch (ErrnoException errnoException) {
            result = maybeThrowAfterRecvfrom(isRead, isConnected, errnoException);
        }
        return result;
    }

    private static int postRecvfrom(boolean isRead, DatagramPacket packet, InetSocketAddress srcAddress, int byteCount) {
        if (isRead && byteCount == 0) {
            return -1;
        }
        if (packet != null) {
            packet.setReceivedLength(byteCount);
            packet.setPort(srcAddress.getPort());

            // packet.address should only be changed when it is different from srcAddress.
            if (!srcAddress.getAddress().equals(packet.getAddress())) {
                packet.setAddress(srcAddress.getAddress());
            }
        }
        return byteCount;
    }

    private static int maybeThrowAfterRecvfrom(boolean isRead, boolean isConnected, ErrnoException errnoException) throws SocketException, SocketTimeoutException {
        if (isRead) {
            if (errnoException.errno == EAGAIN) {
                return 0;
            } else {
                throw errnoException.rethrowAsSocketException();
            }
        } else {
            if (isConnected && errnoException.errno == ECONNREFUSED) {
                throw new PortUnreachableException("ICMP Port Unreachable", errnoException);
            } else if (errnoException.errno == EAGAIN) {
                SocketTimeoutException e = new SocketTimeoutException();
                e.initCause(errnoException);
                throw e;
            } else {
                throw errnoException.rethrowAsSocketException();
            }
        }
    }

    /**
     * Creates an endpoint for communication and returns a file descriptor that refers
     * to that endpoint.
     *
     * <p>The {@code domain} specifies a communication domain; this selects the protocol
     * family which will be used for communication, e.g. {@link android.system.OsConstants#AF_UNIX}
     * {@link android.system.OsConstants#AF_INET}.
     *
     * <p>The socket has the indicated type, which specifies the communication semantics,
     * e.g. {@link android.system.OsConstants#SOCK_STREAM} or
     * {@link android.system.OsConstants#SOCK_DGRAM}.
     *
     * <p>The protocol specifies a particular protocol to be used with the
     * socket. Normally only a single protocol exists to support a
     * particular socket type within a given protocol family, in which
     * case protocol can be specified as {@code 0}.
     *
     * @see <a href="https://man7.org/linux/man-pages/man2/socket.2.html">socket(2)</a>.
     *
     * @param domain   socket domain
     * @param type     socket type
     * @param protocol socket protocol
     * @return {@link FileDescriptor} of an opened socket
     * @throws SocketException if underlying system call returned error
     *
     * @hide
     */
    public static @NonNull FileDescriptor socket(int domain, int type, int protocol) throws SocketException {
        FileDescriptor fd;
        try {
            fd = Libcore.os.socket(domain, type, protocol);

            return fd;
        } catch (ErrnoException errnoException) {
            throw errnoException.rethrowAsSocketException();
        }
    }

    /**
     * Wait for some event on a file descriptor, blocks until the event happened or timeout period
     * passed. See poll(2) and @link{android.system.Os.Poll}.
     *
     * @throws SocketException if poll(2) fails.
     * @throws SocketTimeoutException if the event has not happened before timeout period has passed.
     *
     * @hide
     */
    public static void poll(FileDescriptor fd, int events, int timeout)
            throws SocketException, SocketTimeoutException {
        StructPollfd[] pollFds = new StructPollfd[]{ new StructPollfd() };
        pollFds[0].fd = fd;
        pollFds[0].events = (short) events;

        try {
            int ret = android.system.Os.poll(pollFds, timeout);
            if (ret == 0) {
                throw new SocketTimeoutException("Poll timed out");
            }
        } catch (ErrnoException e) {
            e.rethrowAsSocketException();
        }
    }

    /**
     * Returns the current address to which the socket {@code fd} is bound.
     *
     * @see <a href="https://man7.org/linux/man-pages/man2/getsockname.2.html">getsockname(2)</a>.
     *
     * @param fd socket to get the bounded address of
     * @return current address to which the socket {@code fd} is bound
     * @throws SocketException if {@code fd} is not currently bound to an {@link InetSocketAddress}
     *
     * @hide
     */
    public static @NonNull InetSocketAddress getLocalInetSocketAddress(@NonNull FileDescriptor fd)
            throws SocketException {
        try {
            SocketAddress socketAddress = Libcore.os.getsockname(fd);
            // When a Socket is pending closure because socket.close() was called but other threads
            // are still using it, the FileDescriptor can be dup2'ed to an AF_UNIX one; see the
            // deferred close logic in PlainSocketImpl.socketClose0(true) for details.
            // If socketAddress is not the expected type then we assume that the socket is being
            // closed, so we throw a SocketException (just like in the case of an ErrnoException).
            // http://b/64209834
            if ((socketAddress != null) && !(socketAddress instanceof InetSocketAddress)) {
                throw new SocketException("Socket assumed to be pending closure: Expected sockname "
                        + "to be an InetSocketAddress, got " + socketAddress.getClass());
            }
            return (InetSocketAddress) socketAddress;
        } catch (ErrnoException errnoException) {
            throw errnoException.rethrowAsSocketException();
        }
    }
}
