/*
 * Copyright 2016 Justin Shapcott.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.debugger.utils;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/**
 * @author Demyan Kimitsa
 * Simple logger that writes both file and console
 */
public class DbgLogger {
    private static Logger impl;
    static {
        impl = Logger.getLogger("robovm-debugger");
        impl.setLevel(Level.ALL);
        impl.setUseParentHandlers(false);
    }

    private final String tag;

    private DbgLogger(String tag) {
        this.tag = tag + ": ";
    }


    public void debug(String message) {
        impl.log(Level.INFO, this.tag + message);
    }

    public void info(String message) {
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
        // just in case debugger is being run second time -- remove all handlers
        for (Handler h : impl.getHandlers())
            impl.removeHandler(h);

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
        private final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss.SSS");
        private final Date date = new Date();

        private static final String LINE_SEPARATOR = System.getProperty("line.separator");

        @Override
        public String format(LogRecord record) {
            StringBuilder sb = new StringBuilder();

            date.setTime(record.getMillis());
            sb.append(dateFormat.format(date)).append(" ").append(record.getLevel().getLocalizedName())
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
