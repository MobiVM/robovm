package org.robovm.idea.utils;

import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public final class RoboFileUtils {

    /**
     * wrapper around mkdirs that throws IOException if operation fails
     */
    public static void mkdirs(File f) throws IOException {
        if (!f.exists() && !f.mkdirs()) {
            throw new IOException("mkdirs failed on " + f);
        }
    }

    /**
     * wrapper around setLastModified that throws IOException if operation fails
     */
    public static void setLastModified(File f, long time) throws IOException {
        if (!f.setLastModified(time)) {
            throw new IOException("setLastModified failed on " + f);
        }
    }

    /**
     * wrapper around listFiles that throws IOException if operation fails
     */
    public static @NotNull File[] listFiles(File f) throws IOException {
        File[] files = f.listFiles();
        if (files == null) {
            throw new IOException("listFiles failed on " + f);
        }

        return files;
    }

    /**
     * wrapper around listFiles that throws IOException if operation fails
     */
    public static @NotNull File[] listFiles(File f, FilenameFilter filter) throws IOException {
        File[] files = f.listFiles(filter);
        if (files == null) {
            throw new IOException("listFiles failed on " + f);
        }

        return files;
    }

    /**
     * wrapper around setExecutable that throws IOException if operation fails
     */
    public static void setExecutable(File f, boolean executable) throws IOException {
        if (!f.setExecutable(executable)) {
            throw new IOException("setExecutable failed on " + f);
        }
    }
}
