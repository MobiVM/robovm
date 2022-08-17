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

/**
 * Linux-like operating system. The user of this interface has access to various methods
 * that expose basic operating system functionality, like file and file descriptors operations
 * (open, close, read, write), socket operations (connect, bind, send*, recv*), process
 * operations (exec*, getpid), filesystem operations (mkdir, unlink, chmod, chown) and others.
 *
 * @see Linux
 *
 * @hide
 */
@SystemApi(client = MODULE_LIBRARIES)
@libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
public interface Os {

    /**
     * @hide
     */
    public FileDescriptor accept(FileDescriptor fd, SocketAddress peerAddress) throws ErrnoException, SocketException;

    /**
     * @hide
     */
    public boolean access(String path, int mode) throws ErrnoException;

    /**
     * @hide
     */
    public InetAddress[] android_getaddrinfo(String node, StructAddrinfo hints, int netId) throws GaiException;

    /**
     * @hide
     */
    public void bind(FileDescriptor fd, InetAddress address, int port) throws ErrnoException, SocketException;

    /**
     * @hide
     */
    public void bind(FileDescriptor fd, SocketAddress address) throws ErrnoException, SocketException;

    /**
     * @hide
     */
    public StructCapUserData[] capget(StructCapUserHeader hdr) throws ErrnoException;

    /**
     * @hide
     */
    public void capset(StructCapUserHeader hdr, StructCapUserData[] data) throws ErrnoException;

    /**
     * @hide
     */
    @UnsupportedAppUsage
    public void chmod(String path, int mode) throws ErrnoException;

    /**
     * @hide
     */
    public void chown(String path, int uid, int gid) throws ErrnoException;

    /**
     * @hide
     */
    @UnsupportedAppUsage
    public void close(FileDescriptor fd) throws ErrnoException;

    /**
     * @hide
     */
    public void android_fdsan_exchange_owner_tag(FileDescriptor fd, long previousOwnerId, long newOwnerId);

    /**
     * @hide
     */
    public long android_fdsan_get_owner_tag(FileDescriptor fd);

    /**
     * @hide
     */
    public String android_fdsan_get_tag_type(long tag);

    /**
     * @hide
     */
    public long android_fdsan_get_tag_value(long tag);


    /**
     * @hide
     */
    @UnsupportedAppUsage
    public void connect(FileDescriptor fd, InetAddress address, int port) throws ErrnoException, SocketException;

    /**
     * @hide
     */
    public void connect(FileDescriptor fd, SocketAddress address) throws ErrnoException, SocketException;

    /**
     * @hide
     */
    public FileDescriptor dup(FileDescriptor oldFd) throws ErrnoException;

    /**
     * @hide
     */
    public FileDescriptor dup2(FileDescriptor oldFd, int newFd) throws ErrnoException;

    /**
     * @hide
     */
    public String[] environ();

    /**
     * @hide
     */
    public void execv(String filename, String[] argv) throws ErrnoException;

    /**
     * @hide
     */
    public void execve(String filename, String[] argv, String[] envp) throws ErrnoException;

    /**
     * @hide
     */
    public void fchmod(FileDescriptor fd, int mode) throws ErrnoException;

    /**
     * @hide
     */
    public void fchown(FileDescriptor fd, int uid, int gid) throws ErrnoException;

    /**
     * @hide
     */
    public int fcntlInt(FileDescriptor fd, int cmd, int arg) throws ErrnoException;

    /**
     * @hide
     */
    public int fcntlVoid(FileDescriptor fd, int cmd) throws ErrnoException;

    /**
     * @hide
     */
    public void fdatasync(FileDescriptor fd) throws ErrnoException;

    /**
     * @hide
     */
    public StructStat fstat(FileDescriptor fd) throws ErrnoException;

    /**
     * @hide
     */
    public StructStatVfs fstatvfs(FileDescriptor fd) throws ErrnoException;

    /**
     * @hide
     */
    public void fsync(FileDescriptor fd) throws ErrnoException;

    /**
     * @hide
     */
    public void ftruncate(FileDescriptor fd, long length) throws ErrnoException;

    /**
     * @hide
     */
    @UnsupportedAppUsage
    public String gai_strerror(int error);

    /**
     * @hide
     */
    public int getegid();

    /**
     * @hide
     */
    public int geteuid();

    /**
     * @hide
     */
    public int getgid();

    /**
     * @hide
     */
    public String getenv(String name);

    /* TODO: break into getnameinfoHost and getnameinfoService? */
    /**
     * @hide
     */
    public String getnameinfo(InetAddress address, int flags) throws GaiException;

    /**
     * @hide
     */
    public SocketAddress getpeername(FileDescriptor fd) throws ErrnoException;

    /**
     * @hide
     */
    public int getpgid(int pid) throws ErrnoException;

    /**
     * @hide
     */
    public int getpid();

    /**
     * @hide
     */
    public int getppid();

    /**
     * @hide
     */
    public StructPasswd getpwnam(String name) throws ErrnoException;

    /**
     * @hide
     */
    public StructPasswd getpwuid(int uid) throws ErrnoException;

    /**
     * @hide
     */
    public StructRlimit getrlimit(int resource) throws ErrnoException;

    /**
     * @hide
     */
    public SocketAddress getsockname(FileDescriptor fd) throws ErrnoException;

    /**
     * @hide
     */
    public int getsockoptByte(FileDescriptor fd, int level, int option) throws ErrnoException;

    /**
     * @hide
     */
    public InetAddress getsockoptInAddr(FileDescriptor fd, int level, int option) throws ErrnoException;

    /**
     * @hide
     */
    public int getsockoptInt(FileDescriptor fd, int level, int option) throws ErrnoException;

    /**
     * @hide
     */
    public StructLinger getsockoptLinger(FileDescriptor fd, int level, int option) throws ErrnoException;

    /**
     * @hide
     */
    public StructTimeval getsockoptTimeval(FileDescriptor fd, int level, int option) throws ErrnoException;

    /**
     * @hide
     */
    public StructUcred getsockoptUcred(FileDescriptor fd, int level, int option) throws ErrnoException;

    /**
     * @hide
     */
    public int gettid();

    /**
     * @hide
     */
    public int getuid();

    /**
     * @hide
     */
    public byte[] getxattr(String path, String name) throws ErrnoException;

    /**
     * @hide
     */
    public StructIfaddrs[] getifaddrs() throws ErrnoException;

    /**
     * @hide
     */
    public String if_indextoname(int index);

    /**
     * @hide
     */
    public int if_nametoindex(String name);

    /**
     * @hide
     */
    public InetAddress inet_pton(int family, String address);

    /**
     * @hide
     */
    public int ioctlFlags(FileDescriptor fd, String interfaceName) throws ErrnoException;

    /**
     * @hide
     */
    public InetAddress ioctlInetAddress(FileDescriptor fd, int cmd, String interfaceName) throws ErrnoException;

    /**
     * @hide
     */
    public int ioctlInt(FileDescriptor fd, int cmd) throws ErrnoException;

    /**
     * @hide
     */
    public int ioctlMTU(FileDescriptor fd, String interfaceName) throws ErrnoException;

    /**
     * @hide
     */
    public boolean isatty(FileDescriptor fd);

    /**
     * @hide
     */
    public void kill(int pid, int signal) throws ErrnoException;

    /**
     * @hide
     */
    public void lchown(String path, int uid, int gid) throws ErrnoException;

    /**
     * @hide
     */
    public void link(String oldPath, String newPath) throws ErrnoException;

    /**
     * @hide
     */
    public void listen(FileDescriptor fd, int backlog) throws ErrnoException;

    /**
     * @hide
     */
    public String[] listxattr(String path) throws ErrnoException;

    /**
     * @hide
     */
    public long lseek(FileDescriptor fd, long offset, int whence) throws ErrnoException;

    /**
     * @hide
     */
    public StructStat lstat(String path) throws ErrnoException;

    /**
     * @hide
     */
    public FileDescriptor memfd_create(String name, int flags) throws ErrnoException;

    /**
     * @hide
     */
    public void mincore(long address, long byteCount, byte[] vector) throws ErrnoException;

    /**
     * @hide
     */
    public void mkdir(String path, int mode) throws ErrnoException;

    /**
     * @hide
     */
    public void mkfifo(String path, int mode) throws ErrnoException;

    /**
     * @hide
     */
    public void mlock(long address, long byteCount) throws ErrnoException;

    /**
     * @hide
     */
    @UnsupportedAppUsage
    public long mmap(long address, long byteCount, int prot, int flags, FileDescriptor fd, long offset) throws ErrnoException;

    /**
     * @hide
     */
    public void msync(long address, long byteCount, int flags) throws ErrnoException;

    /**
     * @hide
     */
    public void munlock(long address, long byteCount) throws ErrnoException;

    /**
     * @hide
     */
    @UnsupportedAppUsage
    public void munmap(long address, long byteCount) throws ErrnoException;

    /**
     * @hide
     */
    @UnsupportedAppUsage
    public FileDescriptor open(String path, int flags, int mode) throws ErrnoException;

    /**
     * @hide
     */
    public FileDescriptor[] pipe2(int flags) throws ErrnoException;

    /* TODO: if we used the non-standard ppoll(2) behind the scenes, we could take a long timeout. */
    /**
     * @hide
     */
    public int poll(StructPollfd[] fds, int timeoutMs) throws ErrnoException;

    /**
     * @hide
     */
    public void posix_fallocate(FileDescriptor fd, long offset, long length) throws ErrnoException;

    /**
     * @hide
     */
    public int prctl(int option, long arg2, long arg3, long arg4, long arg5) throws ErrnoException;

    /**
     * @hide
     */
    public int pread(FileDescriptor fd, ByteBuffer buffer, long offset) throws ErrnoException, InterruptedIOException;

    /**
     * @hide
     */
    public int pread(FileDescriptor fd, byte[] bytes, int byteOffset, int byteCount, long offset) throws ErrnoException, InterruptedIOException;

    /**
     * @hide
     */
    public int pwrite(FileDescriptor fd, ByteBuffer buffer, long offset) throws ErrnoException, InterruptedIOException;

    /**
     * @hide
     */
    public int pwrite(FileDescriptor fd, byte[] bytes, int byteOffset, int byteCount, long offset) throws ErrnoException, InterruptedIOException;

    /**
     * @hide
     */
    public int read(FileDescriptor fd, ByteBuffer buffer) throws ErrnoException, InterruptedIOException;

    /**
     * @hide
     */
    @UnsupportedAppUsage
    public int read(FileDescriptor fd, byte[] bytes, int byteOffset, int byteCount) throws ErrnoException, InterruptedIOException;

    /**
     * @hide
     */
    public String readlink(String path) throws ErrnoException;

    /**
     * @hide
     */
    public String realpath(String path) throws ErrnoException;

    /**
     * @hide
     */
    public int readv(FileDescriptor fd, Object[] buffers, int[] offsets, int[] byteCounts) throws ErrnoException, InterruptedIOException;

    /**
     * @hide
     */
    public int recvfrom(FileDescriptor fd, ByteBuffer buffer, int flags, InetSocketAddress srcAddress) throws ErrnoException, SocketException;

    /**
     * @hide
     */
    public int recvfrom(FileDescriptor fd, byte[] bytes, int byteOffset, int byteCount, int flags, InetSocketAddress srcAddress) throws ErrnoException, SocketException;

    /**
     * @hide
     */
    public int recvmsg(FileDescriptor fd, StructMsghdr msg, int flags) throws ErrnoException, SocketException;

    /**
     * @hide
     */
    @UnsupportedAppUsage
    public void remove(String path) throws ErrnoException;

    /**
     * @hide
     */
    public void removexattr(String path, String name) throws ErrnoException;

    /**
     * @hide
     */
    public void rename(String oldPath, String newPath) throws ErrnoException;

    /**
     * @hide
     */
    public int sendmsg(FileDescriptor fd, StructMsghdr msg, int flags) throws ErrnoException, SocketException;

    /**
     * @hide
     */
    public int sendto(FileDescriptor fd, ByteBuffer buffer, int flags, InetAddress inetAddress, int port) throws ErrnoException, SocketException;

    /**
     * @hide
     */
    public int sendto(FileDescriptor fd, byte[] bytes, int byteOffset, int byteCount, int flags, InetAddress inetAddress, int port) throws ErrnoException, SocketException;

    /**
     * @hide
     */
    public int sendto(FileDescriptor fd, byte[] bytes, int byteOffset, int byteCount, int flags, SocketAddress address) throws ErrnoException, SocketException;

    /**
     * @hide
     */
    public long sendfile(FileDescriptor outFd, FileDescriptor inFd, Int64Ref offset, long byteCount) throws ErrnoException;

    /**
     * @hide
     */
    public void setegid(int egid) throws ErrnoException;

    /**
     * @hide
     */
    @UnsupportedAppUsage
    public void setenv(String name, String value, boolean overwrite) throws ErrnoException;

    /**
     * @hide
     */
    public void seteuid(int euid) throws ErrnoException;

    /**
     * @hide
     */
    public void setgid(int gid) throws ErrnoException;

    /**
     * @hide
     */
    public void setpgid(int pid, int pgid) throws ErrnoException;

    /**
     * @hide
     */
    public void setregid(int rgid, int egid) throws ErrnoException;

    /**
     * @hide
     */
    public void setreuid(int ruid, int euid) throws ErrnoException;

    /**
     * @hide
     */
    public int setsid() throws ErrnoException;

    /**
     * @hide
     */
    public void setsockoptByte(FileDescriptor fd, int level, int option, int value) throws ErrnoException;

    /**
     * @hide
     */
    public void setsockoptIfreq(FileDescriptor fd, int level, int option, String value) throws ErrnoException;

    /**
     * @hide
     */
    public void setsockoptInt(FileDescriptor fd, int level, int option, int value) throws ErrnoException;

    /**
     * @hide
     */
    public void setsockoptIpMreqn(FileDescriptor fd, int level, int option, int value) throws ErrnoException;

    /**
     * @hide
     */
    public void setsockoptGroupReq(FileDescriptor fd, int level, int option, StructGroupReq value) throws ErrnoException;

    /**
     * @hide
     */
    public void setsockoptLinger(FileDescriptor fd, int level, int option, StructLinger value) throws ErrnoException;

    /**
     * @hide
     */
    @UnsupportedAppUsage
    public void setsockoptTimeval(FileDescriptor fd, int level, int option, StructTimeval value) throws ErrnoException;

    /**
     * @hide
     */
    public void setuid(int uid) throws ErrnoException;

    /**
     * @hide
     */
    public void setxattr(String path, String name, byte[] value, int flags) throws ErrnoException;

    /**
     * @hide
     */
    public void shutdown(FileDescriptor fd, int how) throws ErrnoException;

    /**
     * @hide
     */
    public FileDescriptor socket(int domain, int type, int protocol) throws ErrnoException;

    /**
     * @hide
     */
    public void socketpair(int domain, int type, int protocol, FileDescriptor fd1, FileDescriptor fd2) throws ErrnoException;

    /**
     * @hide
     */
    public long splice(FileDescriptor fdIn, Int64Ref offIn, FileDescriptor fdOut, Int64Ref offOut, long len, int flags) throws ErrnoException;

    /**
     * @hide
     */
    @UnsupportedAppUsage
    public StructStat stat(String path) throws ErrnoException;

    /**
     * @hide
     */
    public StructStatVfs statvfs(String path) throws ErrnoException;

    /**
     * @hide
     */
    @UnsupportedAppUsage
    public String strerror(int errno);

    /**
     * @hide
     */
    public String strsignal(int signal);

    /**
     * @hide
     */
    public void symlink(String oldPath, String newPath) throws ErrnoException;

    /**
     * @hide
     */
    @UnsupportedAppUsage
    public long sysconf(int name);

    /**
     * @hide
     */
    public void tcdrain(FileDescriptor fd) throws ErrnoException;

    /**
     * @hide
     */
    public void tcsendbreak(FileDescriptor fd, int duration) throws ErrnoException;

    /**
     * @hide
     */
    public int umask(int mask);

    /**
     * @hide
     */
    public StructUtsname uname();

    /**
     * @hide
     */
    public void unlink(String pathname) throws ErrnoException;

    /**
     * @hide
     */
    public void unsetenv(String name) throws ErrnoException;

    /**
     * @hide
     */
    public int waitpid(int pid, Int32Ref status, int options) throws ErrnoException;

    /**
     * @hide
     */
    public int write(FileDescriptor fd, ByteBuffer buffer) throws ErrnoException, InterruptedIOException;

    /**
     * @hide
     */
    public int write(FileDescriptor fd, byte[] bytes, int byteOffset, int byteCount) throws ErrnoException, InterruptedIOException;

    /**
     * @hide
     */
    public int writev(FileDescriptor fd, Object[] buffers, int[] offsets, int[] byteCounts) throws ErrnoException, InterruptedIOException;

    /**
     * Atomically sets the system's default {@link Os} implementation to be
     * {@code update} if the current value {@code == expect}.
     *
     * @param expect the expected value.
     * @param update the new value to set; must not be null.
     * @return whether the update was successful.
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static boolean compareAndSetDefault(Os expect, Os update) {
        return Libcore.compareAndSetOs(expect, update);
    }

    /**
     * @return the system's default {@link Os} implementation currently in use.
     *
     * @hide
     */
    @SystemApi(client = MODULE_LIBRARIES)
    @libcore.api.CorePlatformApi(status = libcore.api.CorePlatformApi.Status.STABLE)
    public static Os getDefault() {
        return Libcore.getOs();
    }
}
