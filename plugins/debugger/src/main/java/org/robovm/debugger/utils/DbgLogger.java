package org.robovm.debugger.utils;

import sun.util.logging.LoggingSupport;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Date;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.LogRecord;
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
        impl.setLevel(Level.ALL);
        impl.setUseParentHandlers(false);
        if (logFile != null) {
            try {
                FileHandler handler = new FileHandler(logFile.getAbsolutePath());
                handler.setFormatter(new DbgFormatter());
                impl.addHandler(handler);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        if (enableConsole) {
            ConsoleHandler handler = new ConsoleHandler();
            handler.setFormatter(new DbgFormatter());
            impl.addHandler(handler);
        }
    }


    private static class DbgFormatter extends Formatter {
        // format string for printing the log record
        private static final String format = LoggingSupport.getSimpleFormat();
        private final Date date = new Date();

        private static final String LINE_SEPARATOR = System.getProperty("line.separator");

        @Override
        public String format(LogRecord record) {
            StringBuilder sb = new StringBuilder();

            date.setTime(record.getMillis());
            sb.append(date).append(" ").append(record.getLevel().getLocalizedName())
                    .append(": ").append(formatMessage(record)).append(LINE_SEPARATOR);

            if (record.getThrown() != null) {
                try {
                    StringWriter sw = new StringWriter();
                    PrintWriter pw = new PrintWriter(sw);
                    record.getThrown().printStackTrace(pw);
                    pw.close();
                    sb.append(sw.toString());
                } catch (Exception ignored) {
                }
            }
            return sb.toString();
        }
    }
}
