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

import libcore.io.Libcore;
import libcore.util.NonNull;
import libcore.util.Nullable;

import java.io.FileDescriptor;
import java.io.InterruptedIOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.SocketException;
import java.nio.ByteBuffer;

/**
 * Access to low-level system functionality. Most of these are system calls. Most users will want
 * to use higher-level APIs where available, but this class provides access to the underlying
 * primitives used to implement the higher-level APIs.
 *
 * <p>The corresponding constants can be found in {@link OsConstants}.
 */
public final class Os {
    private Os() {}

    // Ideally we'd just have the version that accepts SocketAddress but we're stuck with
    // this one for legacy reasons. http://b/123568439
    /**
     * See <a href="http://man7.org/linux/man-pages/man2/accept.2.html">accept(2)</a>.
     */
    public static FileDescriptor accept(FileDescriptor fd, InetSocketAddress peerAddress) throws ErrnoException, SocketException { return accept(fd, (SocketAddress) peerAddress); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/accept.2.html">accept(2)</a>.
     * @hide
     */
    public static FileDescriptor accept(FileDescriptor fd, SocketAddress peerAddress) throws ErrnoException, SocketException { return Libcore.os.accept(fd, peerAddress); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/access.2.html">access(2)</a>.
     */
    public static boolean access(String path, int mode) throws ErrnoException { return Libcore.os.access(path, mode); }

    /** @hide */
    public static InetAddress[] android_getaddrinfo(String node, StructAddrinfo hints, int netId) throws GaiException { return Libcore.os.android_getaddrinfo(node, hints, netId); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/bind.2.html">bind(2)</a>.
     */
    public static void bind(FileDescriptor fd, InetAddress address, int port) throws ErrnoException, SocketException { Libcore.os.bind(fd, address, port); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/bind.2.html">bind(2)</a>.
     */
    public static void bind(@NonNull FileDescriptor fd, @NonNull SocketAddress address) throws ErrnoException, SocketException { Libcore.os.bind(fd, address); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/capget.2.html">capget(2)</a>.
     *
     * @param hdr capabilities header, containing version and pid
     * @return list of capabilities data structures, each containing effective, permitted,
     *         and inheritable fields are bit masks of the capabilities
     * @throws ErrnoException if {@code hdr} structure contains invalid data
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static @Nullable StructCapUserData[] capget(@NonNull StructCapUserHeader hdr) throws ErrnoException {
        return Libcore.os.capget(hdr);
    }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/capset.2.html">capset(2)</a>.
     *
     * @param hdr capabilities header, containing version and pid
     * @param data capabilities data list, containing effective, permitted,
     *             and inheritable fields. Must be the same length as returned value
     * @throws ErrnoException if {@code hdr} structure contains invalid data; or
     *                        an attempt was made to add a capability to the permitted
     *                        set, or to set a capability in the effective set that is
     *                        not in the permitted set; or
     *                        the caller attempted to use
     *                        {@link capset(StructCapUserHeader, StructCapUserData[])}
     *                        to modify the capabilities of a thread other than itself,
     *                        but lacked sufficient privilege;
     *                        or there is no such thread.
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static void capset(@NonNull StructCapUserHeader hdr, @NonNull StructCapUserData[] data)
            throws ErrnoException {
        Libcore.os.capset(hdr, data);
    }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/chmod.2.html">chmod(2)</a>.
     */
    public static void chmod(String path, int mode) throws ErrnoException { Libcore.os.chmod(path, mode); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/chown.2.html">chown(2)</a>.
     */
    public static void chown(String path, int uid, int gid) throws ErrnoException { Libcore.os.chown(path, uid, gid); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/close.2.html">close(2)</a>.
     */
    public static void close(FileDescriptor fd) throws ErrnoException { Libcore.os.close(fd); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/connect.2.html">connect(2)</a>.
     */
    public static void connect(FileDescriptor fd, InetAddress address, int port) throws ErrnoException, SocketException { Libcore.os.connect(fd, address, port); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/connect.2.html">connect(2)</a>.
     */
    public static void connect(@NonNull FileDescriptor fd, @NonNull SocketAddress address) throws ErrnoException, SocketException { Libcore.os.connect(fd, address); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/dup.2.html">dup(2)</a>.
     */
    public static FileDescriptor dup(FileDescriptor oldFd) throws ErrnoException { return Libcore.os.dup(oldFd); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/dup2.2.html">dup2(2)</a>.
     */
    public static FileDescriptor dup2(FileDescriptor oldFd, int newFd) throws ErrnoException { return Libcore.os.dup2(oldFd, newFd); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man3/environ.3.html">environ(3)</a>.
     */
    public static String[] environ() { return Libcore.os.environ(); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/execv.2.html">execv(2)</a>.
     */
    public static void execv(String filename, String[] argv) throws ErrnoException { Libcore.os.execv(filename, argv); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/execve.2.html">execve(2)</a>.
     */
    public static void execve(String filename, String[] argv, String[] envp) throws ErrnoException { Libcore.os.execve(filename, argv, envp); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/fchmod.2.html">fchmod(2)</a>.
     */
    public static void fchmod(FileDescriptor fd, int mode) throws ErrnoException { Libcore.os.fchmod(fd, mode); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/fchown.2.html">fchown(2)</a>.
     */
    public static void fchown(FileDescriptor fd, int uid, int gid) throws ErrnoException { Libcore.os.fchown(fd, uid, gid); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/fcntl.2.html">fcntl(2)</a>.
     */
    public static int fcntlInt(@NonNull FileDescriptor fd, int cmd, int arg) throws ErrnoException { return Libcore.os.fcntlInt(fd, cmd, arg); }

    /** @hide */
    public static int fcntlVoid(FileDescriptor fd, int cmd) throws ErrnoException { return Libcore.os.fcntlVoid(fd, cmd); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/fdatasync.2.html">fdatasync(2)</a>.
     */
    public static void fdatasync(FileDescriptor fd) throws ErrnoException { Libcore.os.fdatasync(fd); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/fstat.2.html">fstat(2)</a>.
     */
    public static StructStat fstat(FileDescriptor fd) throws ErrnoException { return Libcore.os.fstat(fd); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/fstatvfs.2.html">fstatvfs(2)</a>.
     */
    public static StructStatVfs fstatvfs(FileDescriptor fd) throws ErrnoException { return Libcore.os.fstatvfs(fd); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/fsync.2.html">fsync(2)</a>.
     */
    public static void fsync(FileDescriptor fd) throws ErrnoException { Libcore.os.fsync(fd); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/ftruncate.2.html">ftruncate(2)</a>.
     */
    public static void ftruncate(FileDescriptor fd, long length) throws ErrnoException { Libcore.os.ftruncate(fd, length); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man3/gai_strerror.3.html">gai_strerror(3)</a>.
     */
    public static String gai_strerror(int error) { return Libcore.os.gai_strerror(error); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/getegid.2.html">getegid(2)</a>.
     */
    public static int getegid() { return Libcore.os.getegid(); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/geteuid.2.html">geteuid(2)</a>.
     */
    public static int geteuid() { return Libcore.os.geteuid(); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/getgid.2.html">getgid(2)</a>.
     */
    public static int getgid() { return Libcore.os.getgid(); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man3/getenv.3.html">getenv(3)</a>.
     */
    public static String getenv(String name) { return Libcore.os.getenv(name); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man3/getifaddrs.3.html">getifaddrs(3)</a>.
     * @hide
     */
    public static StructIfaddrs[] getifaddrs() throws ErrnoException { return Libcore.os.getifaddrs(); }

    /** @hide */
    public static String getnameinfo(InetAddress address, int flags) throws GaiException { return Libcore.os.getnameinfo(address, flags); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/getpeername.2.html">getpeername(2)</a>.
     */
    public static SocketAddress getpeername(FileDescriptor fd) throws ErrnoException { return Libcore.os.getpeername(fd); }

    /**
     * Gets process's pgid (process group ID).
     *
     * See <a href="http://man7.org/linux/man-pages/man2/getpgid.2.html">getpgid(2)</a>.
     *
     * @param pid process id to get the pgid of
     * @return process's pgid
     * @throws ErrnoException if {@code pid} does not match any process
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static int getpgid(int pid) throws ErrnoException { return Libcore.os.getpgid(pid); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/getpid.2.html">getpid(2)</a>.
     */
    public static int getpid() { return Libcore.os.getpid(); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/getppid.2.html">getppid(2)</a>.
     */
    public static int getppid() { return Libcore.os.getppid(); }

    /** @hide */
    public static StructPasswd getpwnam(String name) throws ErrnoException { return Libcore.os.getpwnam(name); }

    /** @hide */
    public static StructPasswd getpwuid(int uid) throws ErrnoException { return Libcore.os.getpwuid(uid); }

    /**
     * Gets the resource limit.
     *
     * See <a href="https://man7.org/linux/man-pages/man3/vlimit.3.html">getrlimit(2)</a>.
     *
     * @param resource resource id
     * @return         the limit of the given resource
     * @throws ErrnoException the value specified in {@code resource} is not valid
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static @Nullable StructRlimit getrlimit(int resource) throws ErrnoException { return Libcore.os.getrlimit(resource); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/getsockname.2.html">getsockname(2)</a>.
     */
    public static SocketAddress getsockname(FileDescriptor fd) throws ErrnoException { return Libcore.os.getsockname(fd); }

    /** @hide */
    public static int getsockoptByte(FileDescriptor fd, int level, int option) throws ErrnoException { return Libcore.os.getsockoptByte(fd, level, option); }

    /** @hide */
    public static InetAddress getsockoptInAddr(FileDescriptor fd, int level, int option) throws ErrnoException { return Libcore.os.getsockoptInAddr(fd, level, option); }

    /**
     * Gets socket options for the socket referred to by the file descriptor {@code fd}.
     *
     * See <a href="https://man7.org/linux/man-pages/man2/getsockopt.2.html">getsockopt(2)</a>.
     * For the list of available options see <a href="https://man7.org/linux/man-pages/man7/socket.7.html">socket(7)</a>.
     *
     * @param fd    file descriptor of the socket to get options of
     * @param level level at which the {@code option} resides. For example,
     *              to indicate that an option is to be interpreted by the TCP protocol,
     *              level should be set to the protocol number of TCP
     * @param option name of the option to get
     * @return socket options for file descriptor {@code fd}
     * @throws ErrnoException if {@code fd} is invalid; or
     *                        {@code option} is unknown at given {@code level}
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static int getsockoptInt(@NonNull FileDescriptor fd, int level, int option) throws ErrnoException { return Libcore.os.getsockoptInt(fd, level, option); }

    /**
     * Gets {@link OsConstants#SO_LINGER} option for the socket referred to by the file descriptor {@code fd}.
     * When enabled, a {@link close(FileDescriptor) or {@link shutdown(FileDescriptor, int)} will
     * not return until all queued messages for the socket have been successfully sent or the
     * linger timeout has been reached. Otherwise, the call returns immediately and the closing is
     * done in the background.
     *
     * See <a href="https://man7.org/linux/man-pages/man7/socket.7.html">socket(7)</a>.
     *
     * @param fd     file descriptor of the socket to get {@code OsConstants.SO_LINGER} option of
     * @param level  level at which the {@code option} resides
     * @param option name of the option to get
     * @return       {@link StructLinger} associated with given {@code fd}
     * @throws ErrnoException
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static @Nullable StructLinger getsockoptLinger(@NonNull FileDescriptor fd, int level, int option) throws ErrnoException { return Libcore.os.getsockoptLinger(fd, level, option); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/setsockopt.2.html">getsockopt(2)</a>.
     *
     * <p>Only for use with {@code option} values that return a {@code struct timeval} such as
     * {@link OsConstants#SO_RCVTIMEO} and {@link OsConstants#SO_SNDTIMEO}. Use with other
     * options may throw an {@code IllegalArgumentException} or return junk values.
     */
    public static @NonNull StructTimeval getsockoptTimeval(@NonNull FileDescriptor fd, int level, int option) throws ErrnoException { return Libcore.os.getsockoptTimeval(fd, level, option); }

    /** @hide */
    public static StructUcred getsockoptUcred(FileDescriptor fd, int level, int option) throws ErrnoException { return Libcore.os.getsockoptUcred(fd, level, option); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/gettid.2.html">gettid(2)</a>.
     */
    public static int gettid() { return Libcore.os.gettid(); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/getuid.2.html">getuid(2)</a>.
     */
    public static int getuid() { return Libcore.os.getuid(); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/getxattr.2.html">getxattr(2)</a>
     */
    public static byte[] getxattr(String path, String name) throws ErrnoException { return Libcore.os.getxattr(path, name); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man3/if_indextoname.3.html">if_indextoname(3)</a>.
     */
    public static String if_indextoname(int index) { return Libcore.os.if_indextoname(index); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man3/if_nametoindex.3.html">if_nametoindex(3)</a>.
     */
    public static int if_nametoindex(String name) { return Libcore.os.if_nametoindex(name); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man3/inet_pton.3.html">inet_pton(3)</a>.
     */
    public static InetAddress inet_pton(int family, String address) { return Libcore.os.inet_pton(family, address); }

    /** @hide */
    public static InetAddress ioctlInetAddress(FileDescriptor fd, int cmd, String interfaceName) throws ErrnoException { return Libcore.os.ioctlInetAddress(fd, cmd, interfaceName); }

    /**
     * See <a href="https://man7.org/linux/man-pages/man2/ioctl.2.html">ioctl(3)</a>.
     * System call manipulates the underlying device parameters of special files. In particular,
     * many operating characteristics of character special files.
     *
     * @param fd    an open file descriptor
     * @param cmd   encoded in it whether the argument is an "in" parameter or "out" parameter
     * @return      returns a nonnegative value on success
     * @throws ErrnoException A checked exception thrown when {@link Os} methods fail.
     *                        {@see android.system.ErrnoException}
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static int ioctlInt(@NonNull FileDescriptor fd, int cmd) throws ErrnoException {
        return Libcore.os.ioctlInt(fd, cmd);
    }

    /**
     * See <a href="http://man7.org/linux/man-pages/man3/isatty.3.html">isatty(3)</a>.
     */
    public static boolean isatty(FileDescriptor fd) { return Libcore.os.isatty(fd); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/kill.2.html">kill(2)</a>.
     */
    public static void kill(int pid, int signal) throws ErrnoException { Libcore.os.kill(pid, signal); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/lchown.2.html">lchown(2)</a>.
     */
    public static void lchown(String path, int uid, int gid) throws ErrnoException { Libcore.os.lchown(path, uid, gid); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/link.2.html">link(2)</a>.
     */
    public static void link(String oldPath, String newPath) throws ErrnoException { Libcore.os.link(oldPath, newPath); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/listen.2.html">listen(2)</a>.
     */
    public static void listen(FileDescriptor fd, int backlog) throws ErrnoException { Libcore.os.listen(fd, backlog); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/listxattr.2.html">listxattr(2)</a>
     */
    public static String[] listxattr(String path) throws ErrnoException { return Libcore.os.listxattr(path); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/lseek.2.html">lseek(2)</a>.
     */
    public static long lseek(FileDescriptor fd, long offset, int whence) throws ErrnoException { return Libcore.os.lseek(fd, offset, whence); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/lstat.2.html">lstat(2)</a>.
     */
    public static StructStat lstat(String path) throws ErrnoException { return Libcore.os.lstat(path); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/memfd_create.2.html">memfd_create(2)</a>.
     */
    public static @NonNull FileDescriptor memfd_create(@NonNull String name, int flags) throws ErrnoException { return Libcore.os.memfd_create(name, flags); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/mincore.2.html">mincore(2)</a>.
     */
    public static void mincore(long address, long byteCount, byte[] vector) throws ErrnoException { Libcore.os.mincore(address, byteCount, vector); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/mkdir.2.html">mkdir(2)</a>.
     */
    public static void mkdir(String path, int mode) throws ErrnoException { Libcore.os.mkdir(path, mode); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man3/mkfifo.3.html">mkfifo(3)</a>.
     */
    public static void mkfifo(String path, int mode) throws ErrnoException { Libcore.os.mkfifo(path, mode); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/mlock.2.html">mlock(2)</a>.
     */
    public static void mlock(long address, long byteCount) throws ErrnoException { Libcore.os.mlock(address, byteCount); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/mmap.2.html">mmap(2)</a>.
     */
    public static long mmap(long address, long byteCount, int prot, int flags, FileDescriptor fd, long offset) throws ErrnoException { return Libcore.os.mmap(address, byteCount, prot, flags, fd, offset); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/msync.2.html">msync(2)</a>.
     */
    public static void msync(long address, long byteCount, int flags) throws ErrnoException { Libcore.os.msync(address, byteCount, flags); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/munlock.2.html">munlock(2)</a>.
     */
    public static void munlock(long address, long byteCount) throws ErrnoException { Libcore.os.munlock(address, byteCount); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/munmap.2.html">munmap(2)</a>.
     */
    public static void munmap(long address, long byteCount) throws ErrnoException { Libcore.os.munmap(address, byteCount); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/open.2.html">open(2)</a>.
     */
    public static FileDescriptor open(String path, int flags, int mode) throws ErrnoException { return Libcore.os.open(path, flags, mode); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/pipe.2.html">pipe(2)</a>.
     */
    public static FileDescriptor[] pipe() throws ErrnoException { return Libcore.os.pipe2(0); }

    /**
     * Creates a pipe, a unidirectional data channel that can be used for interprocess communication.
     *
     * See <a href="http://man7.org/linux/man-pages/man2/pipe.2.html">pipe(2)</a>.
     *
     * @param flags bitmask of options, e.g. {@link OsConstants#O_CLOEXEC}, {@link OsConstants#O_DIRECT}
     *              or {@link OsConstants#O_NONBLOCK}.
     *              If {@code flags} is {@code 0}, then {@link pipe2(int)} is the same as {@link pipe()}.
     * @return array of two file descriptors referring to the ends of the pipe, where
     *         first file descriptor is the read end of the pipe, and second is a write end
     * @throws ErrnoException if {@code flags} contains invalid value; or
     *                        the per-process limit on the number of open file
     *                        descriptors has been reached; or
     *                        the system-wide limit on the total number of open files
     *                        has been reached; or
     *                        the user hard limit on memory that can be allocated for
     *                        pipes has been reached and the caller is not privileged
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static @Nullable FileDescriptor[] pipe2(int flags) throws ErrnoException { return Libcore.os.pipe2(flags); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/poll.2.html">poll(2)</a>.
     *
     * <p>Note that in Lollipop this could throw an {@code ErrnoException} with {@code EINTR}.
     * In later releases, the implementation will automatically just restart the system call with
     * an appropriately reduced timeout.
     */
    public static int poll(StructPollfd[] fds, int timeoutMs) throws ErrnoException { return Libcore.os.poll(fds, timeoutMs); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man3/posix_fallocate.3.html">posix_fallocate(3)</a>.
     */
    public static void posix_fallocate(FileDescriptor fd, long offset, long length) throws ErrnoException { Libcore.os.posix_fallocate(fd, offset, length); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/prctl.2.html">prctl(2)</a>.
     */
    public static int prctl(int option, long arg2, long arg3, long arg4, long arg5) throws ErrnoException { return Libcore.os.prctl(option, arg2, arg3, arg4, arg5); };

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/pread.2.html">pread(2)</a>.
     */
    public static int pread(FileDescriptor fd, ByteBuffer buffer, long offset) throws ErrnoException, InterruptedIOException { return Libcore.os.pread(fd, buffer, offset); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/pread.2.html">pread(2)</a>.
     */
    public static int pread(FileDescriptor fd, byte[] bytes, int byteOffset, int byteCount, long offset) throws ErrnoException, InterruptedIOException { return Libcore.os.pread(fd, bytes, byteOffset, byteCount, offset); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/pwrite.2.html">pwrite(2)</a>.
     */
    public static int pwrite(FileDescriptor fd, ByteBuffer buffer, long offset) throws ErrnoException, InterruptedIOException { return Libcore.os.pwrite(fd, buffer, offset); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/pwrite.2.html">pwrite(2)</a>.
     */
    public static int pwrite(FileDescriptor fd, byte[] bytes, int byteOffset, int byteCount, long offset) throws ErrnoException, InterruptedIOException { return Libcore.os.pwrite(fd, bytes, byteOffset, byteCount, offset); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/read.2.html">read(2)</a>.
     */
    public static int read(FileDescriptor fd, ByteBuffer buffer) throws ErrnoException, InterruptedIOException { return Libcore.os.read(fd, buffer); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/read.2.html">read(2)</a>.
     */
    public static int read(FileDescriptor fd, byte[] bytes, int byteOffset, int byteCount) throws ErrnoException, InterruptedIOException { return Libcore.os.read(fd, bytes, byteOffset, byteCount); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/readlink.2.html">readlink(2)</a>.
     */
    public static String readlink(String path) throws ErrnoException { return Libcore.os.readlink(path); }

    /**
     * Eexpands all symbolic links and resolves references to {@code /./},
     * {@code /../} and extra {@code /} characters string named by path
     * to produce a canonicalized absolute pathname.
     *
     * See <a href="http://man7.org/linux/man-pages/man3/realpath.3.html">realpath(3)</a>.
     *
     * @param path string to resolve
     * @return     resolved path if no error occurred. Returns {@code null} if {@code path}
     *             is {@code null}
     * @throws ErrnoException read or search permission was denied for a component of
     *                        the path prefix; or an I/O error occurred while reading
     *                        from the filesystem; or too many symbolic links were
     *                        encountered in translating the pathname; or
     *                        the named file does not exist; or a component of the path
     *                        prefix is not a directory
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    @libcore.api.IntraCoreApi
    public static @Nullable String realpath(@Nullable String path) throws ErrnoException { return Libcore.os.realpath(path); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/readv.2.html">readv(2)</a>.
     */
    public static int readv(FileDescriptor fd, Object[] buffers, int[] offsets, int[] byteCounts) throws ErrnoException, InterruptedIOException { return Libcore.os.readv(fd, buffers, offsets, byteCounts); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/recvfrom.2.html">recvfrom(2)</a>.
     */
    public static int recvfrom(FileDescriptor fd, ByteBuffer buffer, int flags, InetSocketAddress srcAddress) throws ErrnoException, SocketException { return Libcore.os.recvfrom(fd, buffer, flags, srcAddress); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/recvfrom.2.html">recvfrom(2)</a>.
     */
    public static int recvfrom(FileDescriptor fd, byte[] bytes, int byteOffset, int byteCount, int flags, InetSocketAddress srcAddress) throws ErrnoException, SocketException { return Libcore.os.recvfrom(fd, bytes, byteOffset, byteCount, flags, srcAddress); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/recvmsg.2.html">recvmsg(2)</a>.
     */
    public static int recvmsg(@NonNull FileDescriptor fd, @NonNull StructMsghdr msg, int flags) throws ErrnoException, SocketException { return Libcore.os.recvmsg(fd, msg, flags); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man3/remove.3.html">remove(3)</a>.
     */
    public static void remove(String path) throws ErrnoException { Libcore.os.remove(path); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/removexattr.2.html">removexattr(2)</a>.
     */
    public static void removexattr(String path, String name) throws ErrnoException { Libcore.os.removexattr(path, name); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/rename.2.html">rename(2)</a>.
     */
    public static void rename(String oldPath, String newPath) throws ErrnoException { Libcore.os.rename(oldPath, newPath); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/sendfile.2.html">sendfile(2)</a>.
     */
    public static long sendfile(FileDescriptor outFd, FileDescriptor inFd, Int64Ref offset, long byteCount) throws ErrnoException {
        return Libcore.os.sendfile(outFd, inFd, offset, byteCount);
    }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/sendmsg.2.html">sendmsg(2)</a>.
     */
    public static int sendmsg(@NonNull FileDescriptor fd, @NonNull StructMsghdr msg, int flags) throws ErrnoException, SocketException {
        return Libcore.os.sendmsg(fd, msg, flags);
    }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/sendto.2.html">sendto(2)</a>.
     */
    public static int sendto(FileDescriptor fd, ByteBuffer buffer, int flags, InetAddress inetAddress, int port) throws ErrnoException, SocketException { return Libcore.os.sendto(fd, buffer, flags, inetAddress, port); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/sendto.2.html">sendto(2)</a>.
     */
    public static int sendto(FileDescriptor fd, byte[] bytes, int byteOffset, int byteCount, int flags, InetAddress inetAddress, int port) throws ErrnoException, SocketException { return Libcore.os.sendto(fd, bytes, byteOffset, byteCount, flags, inetAddress, port); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/sendto.2.html">sendto(2)</a>.
     */
    public static int sendto(@NonNull FileDescriptor fd, @NonNull byte[] bytes, int byteOffset, int byteCount, int flags, @Nullable SocketAddress address) throws ErrnoException, SocketException { return Libcore.os.sendto(fd, bytes, byteOffset, byteCount, flags, address); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/setegid.2.html">setegid(2)</a>.
     * @deprecated Android Applications do not have sufficient privileges to call this method.
     */
    @Deprecated
    public static void setegid(int egid) throws ErrnoException { Libcore.os.setegid(egid); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man3/setenv.3.html">setenv(3)</a>.
     */
    public static void setenv(String name, String value, boolean overwrite) throws ErrnoException { Libcore.os.setenv(name, value, overwrite); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/seteuid.2.html">seteuid(2)</a>.
     * @deprecated Android Applications do not have sufficient privileges to call this method.
     */
    @Deprecated
    public static void seteuid(int euid) throws ErrnoException { Libcore.os.seteuid(euid); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/setgid.2.html">setgid(2)</a>.
     * @deprecated Android Applications do not have sufficient privileges to call this method.
     */
    @Deprecated
    public static void setgid(int gid) throws ErrnoException { Libcore.os.setgid(gid); }

    /**
     * Sets process's pgid (process group ID).
     *
     * See <a href="http://man7.org/linux/man-pages/man2/setpgid.2.html">setpgid(2)</a>.
     *
     * @param pid  process id to set the pgid of
     * @param pgid new pgid for process {@code pid}
     * @throws ErrnoException an attempt was made to change the process group ID of one
     *                        of the children of the calling process and the child had
     *                        already performed an {@link execve(String, String[], String[])}; or
     *                        {@code pgid} is less than {@code 0}; or
     *                        an attempt was made to move a process into a process group
     *                        in a different session, or to change the process group ID
     *                        of one of the children of the calling process and the
     *                        child was in a different session, or to change the process
     *                        group ID of a session leader; or
     *                        {@code pid} is not the calling process and not a child
     *                        of the calling process
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static void setpgid(int pid, int pgid) throws ErrnoException { Libcore.os.setpgid(pid, pgid); }

    /**
     * Set real and/or effective group ID of the calling process.
     *
     * See <a href="http://man7.org/linux/man-pages/man2/setregid.2.html">setregid(2)</a>.
     *
     * @param rgid real group ID
     * @param egid effective group ID
     * @throws ErrnoException one or more of the target group IDs is not valid
     *                        in this user namespace; or the calling process is
     *                        not privileged
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static void setregid(int rgid, int egid) throws ErrnoException { Libcore.os.setregid(rgid, egid); }

    /**
     * Set real and/or effective user ID of the calling process.
     *
     * See <a href="http://man7.org/linux/man-pages/man2/setreuid.2.html">setreuid(2)</a>.
     *
     * @param ruid real user ID
     * @param euid effective user ID
     * @throws ErrnoException one or more of the target user IDs is not valid
     *                        in this user namespace; or the calling process is
     *                        not privileged
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static void setreuid(int ruid, int euid) throws ErrnoException { Libcore.os.setreuid(ruid, euid); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/setsid.2.html">setsid(2)</a>.
     */
    public static int setsid() throws ErrnoException { return Libcore.os.setsid(); }

    /** @hide */
    public static void setsockoptByte(FileDescriptor fd, int level, int option, int value) throws ErrnoException { Libcore.os.setsockoptByte(fd, level, option, value); }

    /**
     * Sets a supplied socket {@code option} to {@code value}.
     *
     * See <a href="https://man7.org/linux/man-pages/man2/getsockopt.2.html">getsockopt(2)</a>.
     * For the list of available options see <a href="https://man7.org/linux/man-pages/man7/socket.7.html">socket(7)</a>.
     * Corresponding socket options constants reside in {@link OsCosntants}, e.g. {@link OsConstants#SO_REUSEADDR}.
     *
     * @param fd    file descriptor of the socket to set options of
     * @param level level at which the {@code option} resides. For example,
     *              to indicate that an option is to be interpreted by the TCP protocol,
     *              level should be set to the protocol number of TCP
     * @param option name of the option to set
     * @param value  interface name
     * @return socket options for file descriptor {@code fd}
     * @throws ErrnoException if {@code fd} is invalid; or
     *                        {@code option} is unknown at given {@code level}
     *
     * @hide
     */
    @UnsupportedAppUsage
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static void setsockoptIfreq(@NonNull FileDescriptor fd, int level, int option, @Nullable String value) throws ErrnoException { Libcore.os.setsockoptIfreq(fd, level, option, value); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/setsockopt.2.html">setsockopt(2)</a>.
     */
    public static void setsockoptInt(FileDescriptor fd, int level, int option, int value) throws ErrnoException { Libcore.os.setsockoptInt(fd, level, option, value); }

    /** @hide */
    public static void setsockoptIpMreqn(FileDescriptor fd, int level, int option, int value) throws ErrnoException { Libcore.os.setsockoptIpMreqn(fd, level, option, value); }

    /** @hide */
    public static void setsockoptGroupReq(FileDescriptor fd, int level, int option, StructGroupReq value) throws ErrnoException { Libcore.os.setsockoptGroupReq(fd, level, option, value); }

    /**
     * Sets {@link OsConstants#SO_LINGER} option for the socket referred to by the file descriptor
     * {@code fd}.
     *
     * @param fd     file descriptor
     * @param level  level at which the {@code option} resides
     * @param option name of the option to set
     * @param value  {@link StructLinger} to set for {@code fd}
     * @throws ErrnoException if {@code fd} is invalid; or
     *                        {@code option} is unknown at given {@code level}
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static void setsockoptLinger(@NonNull FileDescriptor fd, int level, int option, @NonNull StructLinger value) throws ErrnoException { Libcore.os.setsockoptLinger(fd, level, option, value); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/setsockopt.2.html">setsockopt(2)</a>.
     *
     * <p>Only for use with {@code option} values that take a {@code struct timeval} such as
     * {@link OsConstants#SO_RCVTIMEO} and {@link OsConstants#SO_SNDTIMEO}. Use with other
     * options is likely to cause incorrect behavior.
     */
    public static void setsockoptTimeval(@NonNull FileDescriptor fd, int level, int option, @NonNull StructTimeval value) throws ErrnoException { Libcore.os.setsockoptTimeval(fd, level, option, value); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/setuid.2.html">setuid(2)</a>.
     * @deprecated Android Applications do not have sufficient privileges to call this method.
     */
    @Deprecated
    public static void setuid(int uid) throws ErrnoException { Libcore.os.setuid(uid); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/setxattr.2.html">setxattr(2)</a>
     */
    public static void setxattr(String path, String name, byte[] value, int flags) throws ErrnoException { Libcore.os.setxattr(path, name, value, flags); };

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/shutdown.2.html">shutdown(2)</a>.
     */
    public static void shutdown(FileDescriptor fd, int how) throws ErrnoException { Libcore.os.shutdown(fd, how); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/socket.2.html">socket(2)</a>.
     */
    public static FileDescriptor socket(int domain, int type, int protocol) throws ErrnoException { return Libcore.os.socket(domain, type, protocol); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/socketpair.2.html">socketpair(2)</a>.
     */
    public static void socketpair(int domain, int type, int protocol, FileDescriptor fd1, FileDescriptor fd2) throws ErrnoException { Libcore.os.socketpair(domain, type, protocol, fd1, fd2); }

    /**
     * Moves data between two file descriptors without copying
     * between kernel address space and user address space. It
     * transfers up to {@code len} bytes of data from the file descriptor {@code fdIn}
     * to the file descriptor {@code fdOut}, where one of the file descriptors
     * must refer to a pipe.
     *
     * The following semantics apply for {@code fdIn} and {@code offIn}:
     * <ul>
     *   <li>If {@code fdIn} refers to a pipe, then {@code offIn} must be {@code null}.</li>
     *   <li>If {@code fdIn} does not refer to a pipe and {@code offIn} is {@code null}, then
     *       bytes are read from {@code fdIn} starting from the file offset, and
     *       the file offset is adjusted appropriately.</li>
     *   <li>If {@code fdIn} does not refer to a pipe and {@code offIn} is not {@code null}, then
     *       {@code offIn} must point to a buffer which specifies the starting
     *       offset from which bytes will be read from {@code fdIn}; in this case,
     *       the file offset of {@code fdIn} is not changed.</li>
     * </ul>
     *
     * Analogous statements apply for {@code fdOut} and {@code offOut}.
     *
     * The flags argument is a bit mask that is composed by ORing
     * together zero or more of the following values:
     * <ul>
     *   <li>{@link OsConstants#SPLICE_F_MOVE}
     *       Attempt to move pages instead of copying. This is only a
     *       hint to the kernel: pages may still be copied if the
     *       kernel cannot move the pages from the pipe, or if the pipe
     *       buffers don't refer to full pages.</li>
     *   <li>{@link OsConstants#SPLICE_F_NONBLOCK}
     *       Do not block on I/O. This makes the splice pipe
     *       operations nonblocking, but
     *       {@link splice(FileDescriptor, Int64Ref, FileDescriptor, Int64Ref, long, int)}
     *       may nevertheless block because the file descriptors that are spliced
     *       to/from may block (unless they have the {@link OsConstants#O_NONBLOCK} flag set).</li>
     *   <li>{@link OsConstants#SPLICE_F_MORE}
     *       More data will be coming in a subsequent splice.</li>
     *   <li>{@link OsConstants#SPLICE_F_GIFT} Unused</li>
     * </ul>
     *
     * See <a href="http://man7.org/linux/man-pages/man2/splice.2.html">splice(2)</a>.
     *
     * @param fdIn   file descriptor to read from
     * @param offIn  {@code null} for pipe; file offset; or pointer to a buffer that specifies starting offset
     * @param fdOut  file descriptor to write to
     * @param offOut {@code null} for pipe; file offset; or pointer to a buffer that specifies starting offset
     * @param len    number of bytes to read/write
     * @param flags  bitmask of options
     * @return       number of bytes spliced on success. A return value of {@code 0} means end of input.
     * @throws ErrnoException if target fs does not support splicing; or
     *                        target file opened in append mode; or
     *                        one or both file descriptors are invalid; or
     *                        neither of file descriptors refer to a pipe; or
     *                        {@code fdIn} and {@code fdOut} refer to a same pipe
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static long splice(@NonNull FileDescriptor fdIn, @Nullable Int64Ref offIn, @NonNull FileDescriptor fdOut, @Nullable Int64Ref offOut, long len, int flags) throws ErrnoException { return Libcore.os.splice(fdIn, offIn, fdOut, offOut, len, flags); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/stat.2.html">stat(2)</a>.
     */
    public static StructStat stat(String path) throws ErrnoException { return Libcore.os.stat(path); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/statvfs.2.html">statvfs(2)</a>.
     */
    public static StructStatVfs statvfs(String path) throws ErrnoException { return Libcore.os.statvfs(path); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man3/strerror.3.html">strerror(2)</a>.
     */
    public static String strerror(int errno) { return Libcore.os.strerror(errno); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man3/strsignal.3.html">strsignal(3)</a>.
     */
    public static String strsignal(int signal) { return Libcore.os.strsignal(signal); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/symlink.2.html">symlink(2)</a>.
     */
    public static void symlink(String oldPath, String newPath) throws ErrnoException { Libcore.os.symlink(oldPath, newPath); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man3/sysconf.3.html">sysconf(3)</a>.
     */
    public static long sysconf(int name) { return Libcore.os.sysconf(name); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man3/tcdrain.3.html">tcdrain(3)</a>.
     */
    public static void tcdrain(FileDescriptor fd) throws ErrnoException { Libcore.os.tcdrain(fd); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man3/tcsendbreak.3.html">tcsendbreak(3)</a>.
     */
    public static void tcsendbreak(FileDescriptor fd, int duration) throws ErrnoException { Libcore.os.tcsendbreak(fd, duration); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/umask.2.html">umask(2)</a>.
     */
    public static int umask(int mask) { return Libcore.os.umask(mask); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/uname.2.html">uname(2)</a>.
     */
    public static StructUtsname uname() { return Libcore.os.uname(); }

    /**
     * Deletes a name from the filesystem. If that name was the last link to a file
     * and no processes have the file open, the file is deleted and the space it was
     * using is made available for reuse.
     *
     * See <a href="http://man7.org/linux/man-pages/man2/unlink.2.html">unlink(2)</a>.
     *
     * @param pathname name in the filesystem to delete
     * @throws ErrnoException write access to {@code pathname} is not allowed; or
     *                        I/O error occurred; or
     *                        {@code pathname} refers to directory; or
     *                        too many symbolic links were encountered in translating {@code pathname}; or
     *                        {@code pathname} is used by the system or another process
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static void unlink(@Nullable String pathname) throws ErrnoException { Libcore.os.unlink(pathname); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man3/unsetenv.3.html">unsetenv(3)</a>.
     */
    public static void unsetenv(String name) throws ErrnoException { Libcore.os.unsetenv(name); }

    /**
     * @hide See <a href="http://man7.org/linux/man-pages/man2/waitpid.2.html">waitpid(2)</a>.
     *
     * @throws IllegalArgumentException if {@code status != null && status.length != 1}
     */
    public static int waitpid(int pid, Int32Ref status, int options) throws ErrnoException {
        return Libcore.os.waitpid(pid, status, options);
    }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/write.2.html">write(2)</a>.
     */
    public static int write(FileDescriptor fd, ByteBuffer buffer) throws ErrnoException, InterruptedIOException { return Libcore.os.write(fd, buffer); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/write.2.html">write(2)</a>.
     */
    public static int write(FileDescriptor fd, byte[] bytes, int byteOffset, int byteCount) throws ErrnoException, InterruptedIOException { return Libcore.os.write(fd, bytes, byteOffset, byteCount); }

    /**
     * See <a href="http://man7.org/linux/man-pages/man2/writev.2.html">writev(2)</a>.
     */
    public static int writev(FileDescriptor fd, Object[] buffers, int[] offsets, int[] byteCounts) throws ErrnoException, InterruptedIOException { return Libcore.os.writev(fd, buffers, offsets, byteCounts); }
}
