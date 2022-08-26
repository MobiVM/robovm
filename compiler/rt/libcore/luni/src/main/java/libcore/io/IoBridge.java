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

import android.system.ErrnoException;
import android.system.Int32Ref;
import android.system.StructGroupReq;
import android.system.StructLinger;
import android.system.StructPollfd;
import android.system.StructTimeval;

import libcore.util.ArrayUtils;

import dalvik.annotation.compat.UnsupportedAppUsage;
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
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketOptions;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

import static android.system.OsConstants.*;

/**
 * Implements java.io/java.net/java.nio semantics in terms of the underlying POSIX system calls.
 *
 * @hide
 */
@libcore.api.CorePlatformApi
public final class IoBridge {

    private IoBridge() {
    }

    public static int available(FileDescriptor fd) throws IOException {
        try {
            Int32Ref available = new Int32Ref(0);
            Libcore.os.ioctlInt(fd, FIONREAD, available);
            if (available.value < 0) {
                // If the fd refers to a regular file, the result is the difference between
                // the file size and the file position. This may be negative if the position
                // is past the end of the file. If the fd refers to a special file masquerading
                // as a regular file, the result may be negative because the special file
                // may appear to have zero size and yet a previous read call may have
                // read some amount of data and caused the file position to be advanced.
                available.value = 0;
            }
            return available.value;
        } catch (ErrnoException errnoException) {
            if (errnoException.errno == ENOTTY) {
                // The fd is unwilling to opine about its read buffer.
                return 0;
            }
            throw errnoException.rethrowAsIOException();
        }
    }


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
     * AsynchronousCloseMonitor before they entered the blocking operation. {@code fd} will be
     * invalid after this call.
     *
     * <p>This method is a no-op if passed a {@code null} or already-closed file descriptor.
     */
    @libcore.api.CorePlatformApi
    public static void closeAndSignalBlockedThreads(FileDescriptor fd) throws IOException {
        if (fd == null || !fd.valid()) {
            return;
        }
        // fd is invalid after we call release.
        FileDescriptor oldFd = fd.release$();
        AsynchronousCloseMonitor.signalBlockedThreads(oldFd);
        try {
            Libcore.os.close(oldFd);
        } catch (ErrnoException errnoException) {
            throw errnoException.rethrowAsIOException();
        }
    }

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
    public static final int JAVA_MCAST_JOIN_GROUP = 19;
    public static final int JAVA_MCAST_LEAVE_GROUP = 20;
    public static final int JAVA_IP_MULTICAST_TTL = 17;
    public static final int JAVA_IP_TTL = 25;

    /**
     * java.net has its own socket options similar to the underlying Unix ones. We paper over the
     * differences here.
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
     * java.io only throws FileNotFoundException when opening files, regardless of what actually
     * went wrong. Additionally, java.io is more restrictive than POSIX when it comes to opening
     * directories: POSIX says read-only is okay, but java.io doesn't even allow that. We also
     * have an Android-specific hack to alter the default permissions.
     */
    @libcore.api.CorePlatformApi
    public static FileDescriptor open(String path, int flags) throws FileNotFoundException {
        FileDescriptor fd = null;
        try {
            // On Android, we don't want default permissions to allow global access.
            int mode = ((flags & O_ACCMODE) == O_RDONLY) ? 0 : 0600;
            fd = Libcore.os.open(path, flags, mode);
            // Posix open(2) fails with EISDIR only if you ask for write permission.
            // Java disallows reading directories too.
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
     * java.io thinks that a read at EOF is an error and should return -1, contrary to traditional
     * Unix practice where you'd read until you got 0 bytes (and any future read would return -1).
     */
    @libcore.api.CorePlatformApi
    public static int read(FileDescriptor fd, byte[] bytes, int byteOffset, int byteCount) throws IOException {
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
     * java.io always writes every byte it's asked to, or fails with an error. (That is, unlike
     * Unix it never just writes as many bytes as happens to be convenient.)
     */
    @libcore.api.CorePlatformApi
    public static void write(FileDescriptor fd, byte[] bytes, int byteOffset, int byteCount) throws IOException {
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

    @libcore.api.CorePlatformApi
    public static int sendto(FileDescriptor fd, byte[] bytes, int byteOffset, int byteCount, int flags, InetAddress inetAddress, int port) throws IOException {
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

    @libcore.api.CorePlatformApi
    public static int recvfrom(boolean isRead, FileDescriptor fd, byte[] bytes, int byteOffset, int byteCount, int flags, DatagramPacket packet, boolean isConnected) throws IOException {
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

    @libcore.api.CorePlatformApi
    public static FileDescriptor socket(int domain, int type, int protocol) throws SocketException {
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
     */
    public static void poll(FileDescriptor fd, int events, int timeout)
            throws SocketException, SocketTimeoutException {
        StructPollfd[] pollFds = new StructPollfd[]{ new StructPollfd() };
        pollFds[0].fd = fd;
        pollFds[0].events = (short) events;

        try {
            int ret = Libcore.os.poll(pollFds, timeout);
            if (ret == 0) {
                throw new SocketTimeoutException("Poll timed out");
            }
        } catch (ErrnoException e) {
            e.rethrowAsSocketException();
        }
    }

    /**
     * @throws SocketException if fd is not currently bound to an InetSocketAddress
     */
    @libcore.api.CorePlatformApi
    public static InetSocketAddress getLocalInetSocketAddress(FileDescriptor fd)
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
