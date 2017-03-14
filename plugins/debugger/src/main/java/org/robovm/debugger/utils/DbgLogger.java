package org.robovm.debugger.utils;

import java.io.File;
import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * @author Demyan Kimitsa
 * Simple logger that writes both file and console
 */
public class DbgLogger {
    private static Logger impl;
    private final String tag;

    private DbgLogger(String tag) {
        this.tag = tag + ": ";
    }


    public void debug(String message) {
        impl.log(Level.INFO, this.tag + message);
    }

    public void warn(String message) {
        impl.log(Level.WARNING, this.tag + message);
    }

    public void error(String message) {
        impl.log(Level.SEVERE, this.tag + message);
    }

    public void error(String message, Throwable e) {
        impl.log(Level.SEVERE, this.tag + message, e);
    }

    // creates logger wrapper with different tags
    public static DbgLogger get(String tag) {
        return new DbgLogger(tag);
    }

    public static void setup(File logFile, boolean enableConsole) {
        impl = Logger.getLogger("Debugger");
        impl.setUseParentHandlers(false);
        if (logFile != null) {
            try {
                FileHandler handler = new FileHandler(logFile.getAbsolutePath());
                handler.setFormatter(new SimpleFormatter());
                impl.addHandler(handler);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (enableConsole) {
            ConsoleHandler handler = new ConsoleHandler();
            handler.setFormatter(new SimpleFormatter());
            impl.addHandler(handler);
        }
    }


    private static void d(String message) {
        impl.log(Level.INFO, message);
    }

    private static void w(String message) {
        impl.log(Level.WARNING, message);
    }

    private static void e(String message) {
        impl.log(Level.SEVERE, message);
    }

    private static void e(String message, Throwable e) {
        impl.log(Level.SEVERE, message, e);
    }
}
