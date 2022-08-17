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

import static android.annotation.SystemApi.Client.MODULE_LIBRARIES;

import android.system.ErrnoException;
import android.system.GaiException;
import android.system.Int32Ref;
import android.system.Int64Ref;
import android.system.StructAddrinfo;
import android.system.StructCapUserData;
import android.system.StructCapUserHeader;
import android.system.StructGroupReq;
import android.system.StructIfaddrs;
import android.system.StructLinger;
import android.system.StructMsghdr;
import android.system.StructPasswd;
import android.system.StructPollfd;
import android.system.StructRlimit;
import android.system.StructStat;
import android.system.StructStatVfs;
import android.system.StructTimeval;
import android.system.StructUcred;
import android.system.StructUtsname;

import android.annotation.SystemApi;
import android.compat.annotation.UnsupportedAppUsage;
import java.io.FileDescriptor;
import java.io.InterruptedIOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.util.Objects;

import libcore.util.NonNull;
import libcore.util.Nullable;

/**
 * Subclass this if you want to override some {@link Os} methods but otherwise delegate.
 *
 * @hide
 */
@SystemApi(client = MODULE_LIBRARIES)
@libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
public class ForwardingOs implements Os {
    @UnsupportedAppUsage
    private final Os os;

    /**
     * Constructs new {@link ForwardingOs}.
     *
     * @param os {@link Os} delegate for not overridden methods
     *
     * @hide
     */
    @UnsupportedAppUsage
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    protected ForwardingOs(@NonNull Os os) {
        this.os = Objects.requireNonNull(os);
    }

    /**
     * @return the delegate object passed to the constructor.
     *
     * @hide
     */
    protected final Os delegate() {
        return os;
    }

    /**
     *
     * @hide
     */
    public FileDescriptor accept(FileDescriptor fd, SocketAddress peerAddress) throws ErrnoException, SocketException { return os.accept(fd, peerAddress); }

    /**
     * Checks whether the calling process can access the file
     * {@code path}. If {@code path} is a symbolic link, it is dereferenced.
     *
     * The mode specifies the accessibility check(s) to be performed,
     * and is either the value {@link android.system.OsConstants#F_OK},
     * or a mask consisting of the bitwise OR of one or more of
     * {@link android.system.OsConstants#R_OK}, {@link android.system.OsConstants#W_OK},
     * and {@link android.system.OsConstants#X_OK}.
     *
     * {@link android.system.OsConstants#F_OK} tests for the
     * existence of the file. {@link android.system.OsConstants#R_OK},
     * {@link android.system.OsConstants#W_OK}, and {@link android.system.OsConstants#X_OK}
     * test whether the file exists and grants read, write, and execute permissions, respectively.
     *
     * @see <a href="https://man7.org/linux/man-pages/man2/access.2.html">access(2)</a>.
     *
     * @param path path of the file to check access for
     * @param mode accessibility checks mask
     * @return {@code true} if file is accessible (all requested permissions granted,
     *         or mode is {@link android.system.OsConstants#F_OK} and the file exists));
     *         and throws otherwise
     * @throws ErrnoException if at least one bit in mode asked for a permission that is denied,
     *                        or mode is {@link android.system.OsConstants#F_OK} and the file
     *                        does not exist, or some other error occurred. See the full list
     *                        of errors in the "See Also" list.
     *
     * @hide
     */
    @UnsupportedAppUsage
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)

    /**
     * @hide
     */
    public boolean access(@Nullable String path, int mode) throws ErrnoException { return os.access(path, mode); }

    /**
     * @hide
     */
    public InetAddress[] android_getaddrinfo(String node, StructAddrinfo hints, int netId) throws GaiException { return os.android_getaddrinfo(node, hints, netId); }

    /**
     * @hide
     */
    public void bind(FileDescriptor fd, InetAddress address, int port) throws ErrnoException, SocketException { os.bind(fd, address, port); }

    /**
     * @hide
     */
    public void bind(FileDescriptor fd, SocketAddress address) throws ErrnoException, SocketException { os.bind(fd, address); }

    /**
     * @hide
     */
    @Override
    public StructCapUserData[] capget(StructCapUserHeader hdr) throws ErrnoException {
        return os.capget(hdr);
    }

    /**
     * @hide
     */
    @Override
    public void capset(StructCapUserHeader hdr, StructCapUserData[] data) throws ErrnoException {
        os.capset(hdr, data);
    }

    /**
     * @hide
     */
    @UnsupportedAppUsage
    public void chmod(String path, int mode) throws ErrnoException { os.chmod(path, mode); }

    /**
     * @hide
     */
    @UnsupportedAppUsage
    public void chown(String path, int uid, int gid) throws ErrnoException { os.chown(path, uid, gid); }

    /**
     * @hide
     */
    public void close(FileDescriptor fd) throws ErrnoException { os.close(fd); }

    /**
     * @hide
     */
    public void android_fdsan_exchange_owner_tag(FileDescriptor fd, long previousOwnerId, long newOwnerId) { os.android_fdsan_exchange_owner_tag(fd, previousOwnerId, newOwnerId); }

    /**
     * @hide
     */
    public long android_fdsan_get_owner_tag(FileDescriptor fd) { return os.android_fdsan_get_owner_tag(fd); }

    /**
     * @hide
     */
    public String android_fdsan_get_tag_type(long tag) { return os.android_fdsan_get_tag_type(tag); }

    /**
     * @hide
     */
    public long android_fdsan_get_tag_value(long tag) { return os.android_fdsan_get_tag_value(tag); }

    /**
     * @hide
     */
    public void connect(FileDescriptor fd, InetAddress address, int port) throws ErrnoException, SocketException { os.connect(fd, address, port); }

    /**
     * @hide
     */
    public void connect(FileDescriptor fd, SocketAddress address) throws ErrnoException, SocketException { os.connect(fd, address); }

    /**
     * @hide
     */
    public FileDescriptor dup(FileDescriptor oldFd) throws ErrnoException { return os.dup(oldFd); }

    /**
     * @hide
     */
    public FileDescriptor dup2(FileDescriptor oldFd, int newFd) throws ErrnoException { return os.dup2(oldFd, newFd); }

    /**
     * @hide
     */
    public String[] environ() { return os.environ(); }

    /**
     * @hide
     */
    public void execv(String filename, String[] argv) throws ErrnoException { os.execv(filename, argv); }

    /**
     * @hide
     */
    public void execve(String filename, String[] argv, String[] envp) throws ErrnoException { os.execve(filename, argv, envp); }

    /**
     * @hide
     */
    public void fchmod(FileDescriptor fd, int mode) throws ErrnoException { os.fchmod(fd, mode); }

    /**
     * @hide
     */
    public void fchown(FileDescriptor fd, int uid, int gid) throws ErrnoException { os.fchown(fd, uid, gid); }

    /**
     * @hide
     */
    public int fcntlInt(FileDescriptor fd, int cmd, int arg) throws ErrnoException { return os.fcntlInt(fd, cmd, arg); }

    /**
     * @hide
     */
    public int fcntlVoid(FileDescriptor fd, int cmd) throws ErrnoException { return os.fcntlVoid(fd, cmd); }

    /**
     * @hide
     */
    public void fdatasync(FileDescriptor fd) throws ErrnoException { os.fdatasync(fd); }

    /**
     * @hide
     */
    public StructStat fstat(FileDescriptor fd) throws ErrnoException { return os.fstat(fd); }

    /**
     * @hide
     */
    public StructStatVfs fstatvfs(FileDescriptor fd) throws ErrnoException { return os.fstatvfs(fd); }

    /**
     * @hide
     */
    public void fsync(FileDescriptor fd) throws ErrnoException { os.fsync(fd); }

    /**
     * @hide
     */
    public void ftruncate(FileDescriptor fd, long length) throws ErrnoException { os.ftruncate(fd, length); }

    /**
     * @hide
     */
    public String gai_strerror(int error) { return os.gai_strerror(error); }

    /**
     * @hide
     */
    public int getegid() { return os.getegid(); }

    /**
     * @hide
     */
    public int geteuid() { return os.geteuid(); }

    /**
     * @hide
     */
    public int getgid() { return os.getgid(); }

    /**
     * @hide
     */
    @UnsupportedAppUsage
    public String getenv(String name) { return os.getenv(name); }

    /**
     * @hide
     */
    public String getnameinfo(InetAddress address, int flags) throws GaiException { return os.getnameinfo(address, flags); }

    /**
     * @hide
     */
    public SocketAddress getpeername(FileDescriptor fd) throws ErrnoException { return os.getpeername(fd); }

    /**
     * @hide
     */
    public int getpgid(int pid) throws ErrnoException { return os.getpgid(pid); }

    /**
     * @hide
     */
    public int getpid() { return os.getpid(); }

    /**
     * @hide
     */
    public int getppid() { return os.getppid(); }

    /**
     * @hide
     */
    public StructPasswd getpwnam(String name) throws ErrnoException { return os.getpwnam(name); }

    /**
     * @hide
     */
    public StructPasswd getpwuid(int uid) throws ErrnoException { return os.getpwuid(uid); }

    /**
     * @hide
     */
    public StructRlimit getrlimit(int resource) throws ErrnoException { return os.getrlimit(resource); }

    /**
     * @hide
     */
    public SocketAddress getsockname(FileDescriptor fd) throws ErrnoException { return os.getsockname(fd); }

    /**
     * @hide
     */
    public int getsockoptByte(FileDescriptor fd, int level, int option) throws ErrnoException { return os.getsockoptByte(fd, level, option); }

    /**
     * @hide
     */
    public InetAddress getsockoptInAddr(FileDescriptor fd, int level, int option) throws ErrnoException { return os.getsockoptInAddr(fd, level, option); }

    /**
     * @hide
     */
    public int getsockoptInt(FileDescriptor fd, int level, int option) throws ErrnoException { return os.getsockoptInt(fd, level, option); }

    /**
     * @hide
     */
    public StructLinger getsockoptLinger(FileDescriptor fd, int level, int option) throws ErrnoException { return os.getsockoptLinger(fd, level, option); }

    /**
     * @hide
     */
    public StructTimeval getsockoptTimeval(FileDescriptor fd, int level, int option) throws ErrnoException { return os.getsockoptTimeval(fd, level, option); }

    /**
     * @hide
     */
    public StructUcred getsockoptUcred(FileDescriptor fd, int level, int option) throws ErrnoException { return os.getsockoptUcred(fd, level, option); }

    /**
     * @hide
     */
    public int gettid() { return os.gettid(); }

    /**
     * @hide
     */
    public int getuid() { return os.getuid(); }

    /**
     * @hide
     */
    public byte[] getxattr(String path, String name) throws ErrnoException { return os.getxattr(path, name); }

    /**
     * @hide
     */
    public StructIfaddrs[] getifaddrs() throws ErrnoException { return os.getifaddrs(); }

    /**
     * @hide
     */
    public String if_indextoname(int index) { return os.if_indextoname(index); }

    /**
     * @hide
     */
    public int if_nametoindex(String name) { return os.if_nametoindex(name); }

    /**
     * @hide
     */
    public InetAddress inet_pton(int family, String address) { return os.inet_pton(family, address); }

    /**
     * @hide
     */
    public int ioctlFlags(FileDescriptor fd, String interfaceName) throws ErrnoException { return os.ioctlFlags(fd, interfaceName); }

    /**
     * @hide
     */
    public InetAddress ioctlInetAddress(FileDescriptor fd, int cmd, String interfaceName) throws ErrnoException { return os.ioctlInetAddress(fd, cmd, interfaceName); }

    /**
     * @hide
     */
    public int ioctlInt(FileDescriptor fd, int cmd) throws ErrnoException { return os.ioctlInt(fd, cmd); }

    /**
     * @hide
     */
    public int ioctlMTU(FileDescriptor fd, String interfaceName) throws ErrnoException { return os.ioctlMTU(fd, interfaceName); }

    /**
     * @hide
     */
    public boolean isatty(FileDescriptor fd) { return os.isatty(fd); }

    /**
     * @hide
     */
    public void kill(int pid, int signal) throws ErrnoException { os.kill(pid, signal); }

    /**
     * @hide
     */
    @UnsupportedAppUsage
    public void lchown(String path, int uid, int gid) throws ErrnoException { os.lchown(path, uid, gid); }

    /**
     * @hide
     */
    @UnsupportedAppUsage
    public void link(String oldPath, String newPath) throws ErrnoException { os.link(oldPath, newPath); }

    /**
     * @hide
     */
    public void listen(FileDescriptor fd, int backlog) throws ErrnoException { os.listen(fd, backlog); }

    /**
     * @hide
     */
    public String[] listxattr(String path) throws ErrnoException { return os.listxattr(path); }

    /**
     * @hide
     */
    public long lseek(FileDescriptor fd, long offset, int whence) throws ErrnoException { return os.lseek(fd, offset, whence); }

    /**
     * @hide
     */
    @UnsupportedAppUsage
    public StructStat lstat(String path) throws ErrnoException { return os.lstat(path); }

    /**
     * @hide
     */
    public FileDescriptor memfd_create(String name, int flags) throws ErrnoException { return os.memfd_create(name, flags); }

    /**
     * @hide
     */
    public void mincore(long address, long byteCount, byte[] vector) throws ErrnoException { os.mincore(address, byteCount, vector); }

    /**
     * @hide
     */
    @UnsupportedAppUsage
    public void mkdir(String path, int mode) throws ErrnoException { os.mkdir(path, mode); }

    /**
     * @hide
     */
    @UnsupportedAppUsage
    public void mkfifo(String path, int mode) throws ErrnoException { os.mkfifo(path, mode); }

    /**
     * @hide
     */
    public void mlock(long address, long byteCount) throws ErrnoException { os.mlock(address, byteCount); }

    /**
     * @hide
     */
    public long mmap(long address, long byteCount, int prot, int flags, FileDescriptor fd, long offset) throws ErrnoException { return os.mmap(address, byteCount, prot, flags, fd, offset); }

    /**
     * @hide
     */
    public void msync(long address, long byteCount, int flags) throws ErrnoException { os.msync(address, byteCount, flags); }

    /**
     * @hide
     */
    public void munlock(long address, long byteCount) throws ErrnoException { os.munlock(address, byteCount); }

    /**
     * @hide
     */
    public void munmap(long address, long byteCount) throws ErrnoException { os.munmap(address, byteCount); }

    /**
     * Opens the file specified by {@code path}.
     *
     * If the specified file does not exist, it may optionally (if
     * {@link android.system.OsConstants#O_CREAT} is specified in flags)
     * be created by {@link #open(String, int, int)}.
     *
     * The argument flags must include one of the following access
     * modes: {@link android.system.OsConstants#O_RDONLY},
     * {@link android.system.OsConstants#O_WRONLY}, or
     * {@link android.system.OsConstants#O_RDWR}. These request opening the
     * file read-only, write-only, or read/write, respectively.
     *
     * In addition, zero or more file creation flags and file status
     * flags can be bitwise-or'd in flags. The file creation flags are
     * {@link android.system.OsConstants#O_CLOEXEC}, {@link android.system.OsConstants#O_CREAT},
     * {@link android.system.OsConstants#O_DIRECTORY}, {@link android.system.OsConstants#O_EXCL},
     * {@link android.system.OsConstants#O_NOCTTY}, {@link android.system.OsConstants#O_NOFOLLOW},
     * {@link android.system.OsConstants#O_TMPFILE}, and {@link android.system.OsConstants#O_TRUNC}.
     *
     * @see <a href="https://man7.org/linux/man-pages/man2/open.2.html">open(2)</a>.
     *
     * @param path  path of the file to be opened
     * @param flags bitmask of the access, file creation and file status flags
     * @param mode  specifies the file mode bits to be applied when a new file is
     *              created. If neither {@link android.system.OsConstants#O_CREAT}
     *              nor {@link android.system.OsConstants#O_TMPFILE} is specified in
     *              flags, then mode is ignored (and can thus be specified as 0, or simply omitted).
     * @return {@link FileDescriptor} of an opened file
     * @throws ErrnoException if requested access to the file is not allowed, or search
     *                        permission is denied for one of the directories in the
     *                        path prefix of {@code path}, or the file did not exist yet and
     *                        write access to the parent directory is not allowed, or other error.
     *                        See the full list of errors in the "See Also" list.
     *
     * @hide
     */
    @UnsupportedAppUsage
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public FileDescriptor open(@Nullable String path, int flags, int mode) throws ErrnoException { return os.open(path, flags, mode); }

    /**
     * @hide
     */
    public FileDescriptor[] pipe2(int flags) throws ErrnoException { return os.pipe2(flags); }

    /**
     * @hide
     */
    public int poll(StructPollfd[] fds, int timeoutMs) throws ErrnoException { return os.poll(fds, timeoutMs); }

    /**
     * @hide
     */
    public void posix_fallocate(FileDescriptor fd, long offset, long length) throws ErrnoException { os.posix_fallocate(fd, offset, length); }

    /**
     * @hide
     */
    public int prctl(int option, long arg2, long arg3, long arg4, long arg5) throws ErrnoException { return os.prctl(option, arg2, arg3, arg4, arg5); }

    /**
     * @hide
     */
    public int pread(FileDescriptor fd, ByteBuffer buffer, long offset) throws ErrnoException, InterruptedIOException { return os.pread(fd, buffer, offset); }

    /**
     * @hide
     */
    public int pread(FileDescriptor fd, byte[] bytes, int byteOffset, int byteCount, long offset) throws ErrnoException, InterruptedIOException { return os.pread(fd, bytes, byteOffset, byteCount, offset); }

    /**
     * @hide
     */
    public int pwrite(FileDescriptor fd, ByteBuffer buffer, long offset) throws ErrnoException, InterruptedIOException { return os.pwrite(fd, buffer, offset); }

    /**
     * @hide
     */
    public int pwrite(FileDescriptor fd, byte[] bytes, int byteOffset, int byteCount, long offset) throws ErrnoException, InterruptedIOException { return os.pwrite(fd, bytes, byteOffset, byteCount, offset); }

    /**
     * @hide
     */
    public int read(FileDescriptor fd, ByteBuffer buffer) throws ErrnoException, InterruptedIOException { return os.read(fd, buffer); }

    /**
     * @hide
     */
    public int read(FileDescriptor fd, byte[] bytes, int byteOffset, int byteCount) throws ErrnoException, InterruptedIOException { return os.read(fd, bytes, byteOffset, byteCount); }

    /**
     * @hide
     */
    @UnsupportedAppUsage
    public String readlink(String path) throws ErrnoException { return os.readlink(path); }

    /**
     * @hide
     */
    public String realpath(String path) throws ErrnoException { return os.realpath(path); }

    /**
     * @hide
     */
    public int readv(FileDescriptor fd, Object[] buffers, int[] offsets, int[] byteCounts) throws ErrnoException, InterruptedIOException { return os.readv(fd, buffers, offsets, byteCounts); }

    /**
     * @hide
     */
    public int recvfrom(FileDescriptor fd, ByteBuffer buffer, int flags, InetSocketAddress srcAddress) throws ErrnoException, SocketException { return os.recvfrom(fd, buffer, flags, srcAddress); }

    /**
     * @hide
     */
    public int recvfrom(FileDescriptor fd, byte[] bytes, int byteOffset, int byteCount, int flags, InetSocketAddress srcAddress) throws ErrnoException, SocketException { return os.recvfrom(fd, bytes, byteOffset, byteCount, flags, srcAddress); }

    /**
     * @hide
     */
    public int recvmsg(FileDescriptor fd, StructMsghdr msg, int flags) throws ErrnoException, SocketException { return os.recvmsg(fd, msg, flags); }

    /**
     * Deletes a name from the filesystem.
     *
     * If the removed name was the last link to a file and no processes
     * have the file open, the file is deleted and the space it was
     * using is made available for reuse.
     *
     * If the name was the last link to a file, but any processes still
     * have the file open, the file will remain in existence until the
     * last file descriptor referring to it is closed.
     *
     * If the name referred to a symbolic link, the link is removed.
     *
     * If the name referred to a socket, FIFO, or device, the name is
     * removed, but processes which have the object open may continue to
     * use it.
     *
     * @see <a href="https://man7.org/linux/man-pages/man3/remove.3.html">remove(3)</a>.
     *
     * @param path file to delete
     * @throws ErrnoException if access to {@code path} is not allowed, an I/O error occurred.
     *                        See the full list of errors in the "See Also" list.
     *
     * @hide
     */
    @UnsupportedAppUsage
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public void remove(@Nullable String path) throws ErrnoException { os.remove(path); }

    /**
     * @hide
     */
    @UnsupportedAppUsage
    public void removexattr(String path, String name) throws ErrnoException { os.removexattr(path, name); }

    /**
     * Renames a file, moving it between directories if required.
     *
     * @see <a href="https://man7.org/linux/man-pages/man2/rename.2.html">rename(2)</a>.
     *
     * @param oldPath file to be moved to a new location {@code newPath}
     * @param newPath destination to move file {@code oldPath}
     * @throws ErrnoException if write permission is denied for the directory containing
     *                        {@code oldPath} or {@code newPath}, or, search permission is denied for
     *                        one of the directories in the path prefix of {@code oldPath} or
     *                        {@code newPath}, or {@code oldPath} is a directory and does not allow
     *                        write permission. See the full list of errors in the "See Also" list.
     *
     * @hide
     */
    @UnsupportedAppUsage
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public void rename(@Nullable String oldPath, @Nullable String newPath) throws ErrnoException { os.rename(oldPath, newPath); }

    /**
     * @hide
     */
    public long sendfile(FileDescriptor outFd, FileDescriptor inFd, Int64Ref offset, long byteCount) throws ErrnoException { return os.sendfile(outFd, inFd, offset, byteCount); }

    /**
     * @hide
     */
    public int sendmsg(FileDescriptor fd, StructMsghdr msg, int flags) throws ErrnoException, SocketException { return os.sendmsg(fd, msg, flags); }

    /**
     * @hide
     */
    public int sendto(FileDescriptor fd, ByteBuffer buffer, int flags, InetAddress inetAddress, int port) throws ErrnoException, SocketException { return os.sendto(fd, buffer, flags, inetAddress, port); }

    /**
     * @hide
     */
    public int sendto(FileDescriptor fd, byte[] bytes, int byteOffset, int byteCount, int flags, InetAddress inetAddress, int port) throws ErrnoException, SocketException { return os.sendto(fd, bytes, byteOffset, byteCount, flags, inetAddress, port); }

    /**
     * @hide
     */
    public int sendto(FileDescriptor fd, byte[] bytes, int byteOffset, int byteCount, int flags, SocketAddress address) throws ErrnoException, SocketException { return os.sendto(fd, bytes, byteOffset, byteCount, flags, address); }

    /**
     * @hide
     */
    public void setegid(int egid) throws ErrnoException { os.setegid(egid); }

    /**
     * @hide
     */
    @UnsupportedAppUsage
    public void setenv(String name, String value, boolean overwrite) throws ErrnoException { os.setenv(name, value, overwrite); }

    /**
     * @hide
     */
    public void seteuid(int euid) throws ErrnoException { os.seteuid(euid); }

    /**
     * @hide
     */
    public void setgid(int gid) throws ErrnoException { os.setgid(gid); }

    /**
     * @hide
     */
    public void setpgid(int pid, int pgid) throws ErrnoException { os.setpgid(pid, pgid); }

    /**
     * @hide
     */
    public void setregid(int rgid, int egid) throws ErrnoException { os.setregid(rgid, egid); }

    /**
     * @hide
     */
    public void setreuid(int ruid, int euid) throws ErrnoException { os.setreuid(ruid, euid); }

    /**
     * @hide
     */
    public int setsid() throws ErrnoException { return os.setsid(); }

    /**
     * @hide
     */
    public void setsockoptByte(FileDescriptor fd, int level, int option, int value) throws ErrnoException { os.setsockoptByte(fd, level, option, value); }

    /**
     * @hide
     */
    public void setsockoptIfreq(FileDescriptor fd, int level, int option, String value) throws ErrnoException { os.setsockoptIfreq(fd, level, option, value); }

    /**
     * @hide
     */
    public void setsockoptInt(FileDescriptor fd, int level, int option, int value) throws ErrnoException { os.setsockoptInt(fd, level, option, value); }

    /**
     * @hide
     */
    public void setsockoptIpMreqn(FileDescriptor fd, int level, int option, int value) throws ErrnoException { os.setsockoptIpMreqn(fd, level, option, value); }

    /**
     * @hide
     */
    public void setsockoptGroupReq(FileDescriptor fd, int level, int option, StructGroupReq value) throws ErrnoException { os.setsockoptGroupReq(fd, level, option, value); }

    /**
     * @hide
     */
    public void setsockoptLinger(FileDescriptor fd, int level, int option, StructLinger value) throws ErrnoException { os.setsockoptLinger(fd, level, option, value); }

    /**
     * @hide
     */
    @UnsupportedAppUsage
    public void setsockoptTimeval(FileDescriptor fd, int level, int option, StructTimeval value) throws ErrnoException { os.setsockoptTimeval(fd, level, option, value); }

    /**
     * @hide
     */
    public void setuid(int uid) throws ErrnoException { os.setuid(uid); }

    /**
     * @hide
     */
    @UnsupportedAppUsage
    public void setxattr(String path, String name, byte[] value, int flags) throws ErrnoException { os.setxattr(path, name, value, flags); }

    /**
     * @hide
     */
    public void shutdown(FileDescriptor fd, int how) throws ErrnoException { os.shutdown(fd, how); }

    /**
     * @hide
     */
    public FileDescriptor socket(int domain, int type, int protocol) throws ErrnoException { return os.socket(domain, type, protocol); }

    /**
     * @hide
     */
    public void socketpair(int domain, int type, int protocol, FileDescriptor fd1, FileDescriptor fd2) throws ErrnoException { os.socketpair(domain, type, protocol, fd1, fd2); }

    /**
     * @hide
     */
    public long splice(FileDescriptor fdIn, Int64Ref offIn, FileDescriptor fdOut, Int64Ref offOut, long len, int flags) throws ErrnoException { return os.splice(fdIn, offIn, fdOut, offOut, len, flags); }

    /**
     * Returns information about a file.
     *
     * @see <a href="https://man7.org/linux/man-pages/man2/lstat.2.html">stat(2)</a>.
     *
     * @param path path to file to get info about
     * @return {@link StructStat} containing information about the file
     * @throws ErrnoException See the full list of errors in the "See Also" list.
     *
     * @hide
     */
    @UnsupportedAppUsage
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public @Nullable StructStat stat(@Nullable String path) throws ErrnoException { return os.stat(path); }

    /**
     * @hide
     */
    @UnsupportedAppUsage
    public StructStatVfs statvfs(String path) throws ErrnoException { return os.statvfs(path); }

    /**
     * @hide
     */
    public String strerror(int errno) { return os.strerror(errno); }

    /**
     * @hide
     */
    public String strsignal(int signal) { return os.strsignal(signal); }

    /**
     * @hide
     */
    @UnsupportedAppUsage
    public void symlink(String oldPath, String newPath) throws ErrnoException { os.symlink(oldPath, newPath); }

    /**
     * @hide
     */
    @UnsupportedAppUsage
    public long sysconf(int name) { return os.sysconf(name); }

    /**
     * @hide
     */
    public void tcdrain(FileDescriptor fd) throws ErrnoException { os.tcdrain(fd); }

    /**
     * @hide
     */
    public void tcsendbreak(FileDescriptor fd, int duration) throws ErrnoException { os.tcsendbreak(fd, duration); }

    /**
     * @hide
     */
    public int umask(int mask) { return os.umask(mask); }

    /**
     * @hide
     */
    public StructUtsname uname() { return os.uname(); }

    /**
     * Deletes a name from the filesystem.
     *
     * If the removed name was the last link to a file and no processes
     * have the file open, the file is deleted and the space it was
     * using is made available for reuse.
     *
     * If the name was the last link to a file, but any processes still
     * have the file open, the file will remain in existence until the
     * last file descriptor referring to it is closed.
     *
     * If the name referred to a symbolic link, the link is removed.
     *
     * If the name referred to a socket, FIFO, or device, the name is
     * removed, but processes which have the object open may continue to
     * use it.
     *
     * @see <a href="https://man7.org/linux/man-pages/man2/unlink.2.html">unlink(2)</a>.
     *
     * @param pathname file to unlink
     * @throws ErrnoException if access to {@code pathname} is not allowed, an I/O error occurred.
     *                        See the full list of errors in the "See Also" list.
     *
     * @hide
     */
    @UnsupportedAppUsage
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public void unlink(@Nullable String pathname) throws ErrnoException { os.unlink(pathname); }

    /**
     * @hide
     */
    public void unsetenv(String name) throws ErrnoException { os.unsetenv(name); }

    /**
     * @hide
     */
    public int waitpid(int pid, Int32Ref status, int options) throws ErrnoException { return os.waitpid(pid, status, options); }

    /**
     * @hide
     */
    public int write(FileDescriptor fd, ByteBuffer buffer) throws ErrnoException, InterruptedIOException { return os.write(fd, buffer); }

    /**
     * @hide
     */
    public int write(FileDescriptor fd, byte[] bytes, int byteOffset, int byteCount) throws ErrnoException, InterruptedIOException { return os.write(fd, bytes, byteOffset, byteCount); }

    /**
     * @hide
     */
    public int writev(FileDescriptor fd, Object[] buffers, int[] offsets, int[] byteCounts) throws ErrnoException, InterruptedIOException { return os.writev(fd, buffers, offsets, byteCounts); }


    /**
     * @hide
     */
    public String toString() { return "ForwardingOs{os=" + os + "}"; }
}
