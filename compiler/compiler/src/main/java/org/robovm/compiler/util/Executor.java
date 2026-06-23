/*
 * Copyright (C) 2013 RoboVM AB
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/gpl-2.0.html>.
 */
package org.robovm.compiler.util;

import org.robovm.compiler.log.ErrorOutputStream;
import org.robovm.compiler.log.InfoOutputStream;
import org.robovm.compiler.log.Logger;

import java.io.*;
import java.util.*;
import java.util.function.Consumer;

/**
 * Builder style wrapper around <code>commons-exec</code> which also adds support for asynchronous
 * execution.
 */
public class Executor {
    private final String cmd;
    private final Logger logger;
    private final List<String> args = new ArrayList<>();
    private Map<String, String> env = new HashMap<>();
    private boolean inheritEnv = true;
    private File wd;
    private OutputStream out;
    private OutputStream err;
    private InputStream in;
    private boolean closeOutputStreams = false;

    ///
    /// Special case markers for stdout/stderr and stdin handling, to be used in out()/err()/in() methods to
    /// specify that the stream should be inherited from parent process or discarded,
    /// instead of being piped to a custom stream
    ///
    public static OutputStream DISCARD_OUTPUT = new TagOutputStream("discarded (/dev/null)");
    public static OutputStream INHERIT_OUTPUT = new TagOutputStream("inherited (to parent's stdout/stderr)");
    public static OutputStream PIPE_OUTPUT = new TagOutputStream("output to process pipe");
    public static InputStream INHERIT_INPUT = new TagInputStream("inherited (from parent's stdin)");
    public static InputStream PIPE_INPUT = new TagInputStream("input from process pipe");

    /**
     * Exception thrown when a command executed by this {@link Executor} fails.
     */
    public static class ExecuteException extends IOException{
        public final int exitCode;
        public static final int INTERRUPTED_EXIT_CODE = -200;
        public ExecuteException(int exitCode, String message) {
            super(message);
            this.exitCode = exitCode;
        }
        public int getExitCode() {
            return exitCode;
        }
    }

    /**
     * Creates a new instance which will execute the specified command.
     * 
     * @param logger {@link Logger} used by this {@link Executor}.
     * @param cmd the command to be executed. Either the full path to an executable or the name of
     *            an executable which will be searched for in the search paths specified by the 
     *            <code>PATH</code> environment variable. 
     */
    public Executor(Logger logger, String cmd) {
        this.cmd = cmd;
        this.logger = logger;
    }
    
    /**
     * Creates a new instance which will execute the specified command.
     * 
     * @param logger {@link Logger} used by this {@link Executor}.
     * @param cmd the command to be executed. 
     */
    public Executor(Logger logger, File cmd) {
        this(logger, cmd.getAbsolutePath());
    }
    
    /**
     * Adds arguments from the specified {@link Collection}. {@link File} arguments will be 
     * converted to absolute paths using {@link File#getAbsolutePath()}. All other types of args
     * will be converted to {@link String}s using {@link Object#toString()}.
     * 
     * @param args the arguments to add.
     * @return this {@link Executor}.
     */
    public Executor args(Collection<Object> args) {
        if (!args.isEmpty()) {
            return args(args.toArray(new Object[0]));
        }
        return this;
    }
    
    /**
     * Adds one or more argument. {@link File} arguments will be converted to absolute paths using 
     * {@link File#getAbsolutePath()}. All other types of args will be converted to {@link String}s 
     * using {@link Object#toString()}.
     * 
     * @param args the argument(s) to add.
     * @return this {@link Executor}.
     */
    @SuppressWarnings("unchecked")
    public Executor args(Object ... args) {
        for (Object a : args) {
            if (a instanceof Collection) {
                args((Collection<Object>) a);
            } else if (a instanceof Object[]) {
                args((Object[]) a);
            } else {
                this.args.add(a instanceof File ? ((File) a).getAbsolutePath() : a.toString());
            }
        }
        return this;
    }
    
    /**
     * Sets the environment variables for the child process.
     * 
     * @param env the environment variables.
     * @return this {@link Executor}.
     */
    public Executor env(Map<String, String> env) {
        this.env = env;
        return this;
    }
    
    /**
     * Adds a single environment variable.
     * 
     * @param name the name of environment variable
     * @param value the value of environment variable
     * @return this {@link Executor}.
     */
    public Executor addEnv(String name, String value) {
        this.env.put(name, value);
        return this;
    }
    
    /**
     * Sets whether the parent's environment variables should be inherited by the child process.
     * Defaults to <code>true</code>.
     * 
     * @param b <code>true</code> or <code>false</code>.
     * @return this {@link Executor}.
     */
    public Executor inheritEnv(boolean b) {
        this.inheritEnv = b;
        return this;
    }
    
    /**
     * Sets the working directory of the child process. If not set the working directory will be
     * the same as the parent's.
     * 
     * @param wd the working directory.
     * @return this {@link Executor}.
     */
    public Executor wd(File wd) {
        this.wd = wd;
        return this;
    }

    /**
     * Redirects the stdout and stderr streams of the child process to the specified 
     * {@link OutputStream}. If not specified stdout and stderr will be inherited from the
     * parent process.
     * 
     * @param out the {@link OutputStream}.
     * @return this {@link Executor}.
     */
    public Executor errOut(OutputStream out) {
        Objects.requireNonNull(out);
        out(out);
        err(out);
        return this;
    }

    /**
     * Redirects the stdout and stderr streams of the child process to the specified
     * {@link Logger}
     */
    public Executor errOut(Logger logger) {
        Objects.requireNonNull(logger);
        out(new InfoOutputStream(logger));
        err(new ErrorOutputStream(logger));
        return this;
    }

    /**
     * Redirects the stdout stream of the child process to the specified
     * {@link OutputStream}. If not specified stdout will be inherited from the
     * parent process.
     *
     * @param out the {@link OutputStream}.
     * @return this {@link Executor}.
     */
    public Executor out(OutputStream out) {
        this.out = out;
        return this;
    }

    /**
     * Redirects the stderr stream of the child process to the specified
     * {@link OutputStream}. If not specified stderr will be inherited from the
     * parent process.
     *
     * @param err the {@link OutputStream}.
     * @return this {@link Executor}.
     */
    public Executor err(OutputStream err) {
        this.err = err;
        return this;
    }

    /**
     * Uses the specified {@link InputStream} as the stdin stream for the child process.
     *
     * @param in the {@link InputStream}.
     * @return this {@link Executor}.
     */
    public Executor in(InputStream in) {
        this.in = in;
        return this;
    }

    /**
     * Sets whether the stdout and stderr {@link OutputStream}s should be closed after the command
     * has finished.
     *
     * @param b <code>true</code> or <code>false</code>.
     */
    public Executor closeOutputStreams(boolean b) {
        this.closeOutputStreams = b;
        return this;
    }

    private List<String> generateCommandLine() {
        List<String> commandLine = new ArrayList<>();
        commandLine.add(cmd);
        commandLine.addAll(args);
        return commandLine;
    }

    private ProcessBuilder initProcessBuilder(List<String> commandLine) {
        ProcessBuilder pb = new ProcessBuilder(commandLine);

        // working directory
        if (wd != null) pb.directory(wd);

        // environment variables
        Map<String, String> pbEnv = pb.environment();
        if (!inheritEnv) pbEnv.clear();
        pbEnv.putAll(this.env);

        return pb;
    }

    private String quoteArgument(String arg) {
        if (arg == null) return "";
        if (arg.contains(" ") && !arg.startsWith("\"") && !arg.startsWith("'")) {
            return "\"" + arg + "\"";
        }
        return arg;
    }

    private void logCommandLine(List<String> commandLine) {
        if (logger == null) return;
        if (commandLine.size() == 1) {
            logger.info(quoteArgument(commandLine.get(0)));
            return;
        }

        StringBuilder result = new StringBuilder();
        boolean firstLine = true;
        for (String currArgument: commandLine) {
            result.append(quoteArgument(currArgument));
            if (result.length() != 0) result.append(' ');
            if (result.length() > 2048) {
                logger.info((firstLine ? "" : "    ") + result);
                result.delete(0, result.length());
                firstLine = false;
            }
        }
        if (result.length() > 0) logger.info((firstLine ? "" : "    ") + result);
    }

    /**
     * setups process builder redirection for stdout, stderr and stdin according to the provided streams
     * and returns list of pump tasks to be started after process is started to pump data between process streams
     * in case custom streams are provided.
     */
    private List<Consumer<Process>> setupRedirection(ProcessBuilder pb, OutputStream out, OutputStream err, InputStream in) {
        List<Consumer<Process>> threads = new ArrayList<>();

        // combine stderr with stdout if they are redirected to the same stream
        if (out == err) pb.redirectErrorStream(true);

        if (out == null || out == DISCARD_OUTPUT) {
            pb.redirectOutput(ProcessBuilder.Redirect.DISCARD);
        } else if (out == INHERIT_OUTPUT) {
            pb.redirectOutput(ProcessBuilder.Redirect.INHERIT);
        } else {
            pb.redirectOutput(ProcessBuilder.Redirect.PIPE);
            // custom stream provided, pump process output to it in a separate thread
            if (out != PIPE_OUTPUT)
                threads.add(p -> pumpStreams(p.getInputStream(), out, closeOutputStreams));
        }

        if (err == null || err == DISCARD_OUTPUT) {
            pb.redirectError(ProcessBuilder.Redirect.DISCARD);
        } else if (err == INHERIT_OUTPUT) {
            pb.redirectError(ProcessBuilder.Redirect.INHERIT);
        } else {
            pb.redirectError(ProcessBuilder.Redirect.PIPE);
            // custom stream provided, pump process err to it in a separate thread
            if (err != PIPE_OUTPUT)
                threads.add(p -> pumpStreams(p.getErrorStream(), err, closeOutputStreams));
        }

        if (in == null) {
            // there is no input is expected to process, close the stream to let process know
            threads.add( p -> closeSilently(p.getOutputStream()) );
        } else if (in == INHERIT_INPUT) {
            pb.redirectInput(ProcessBuilder.Redirect.INHERIT);
        } else {
            pb.redirectInput(ProcessBuilder.Redirect.PIPE);
            // custom stream provided, pump it to process input in a separate thread
            if (in != PIPE_INPUT)
                threads.add( p -> pumpStreams(in, p.getOutputStream(),false));
        }

        return threads;
    }

    /**
     * Executes the command and waits for it to finish.
     * It uses the provided streams for stdout, stderr and stdin redirection according, but if not specified:
     * - stdin will be configured as discarded
     * - stdout and stderr will be directed to logger if provided or discarded otherwise.
     *
     * @throws ExecuteException if the process exits with non-zero exit code or if the waiting for process is
     *         interrupted.
     */
    public int exec() throws IOException {
        List<String> commandLine = generateCommandLine();
        logCommandLine(commandLine);
        ProcessBuilder pb = initProcessBuilder(commandLine);

        // setup IO redirection
        List<Consumer<Process>> pumpTasks = setupRedirection(pb,
            out != null ? out : (logger != null ? new InfoOutputStream(logger) : null),
            err != null ? err : (logger != null ? new ErrorOutputStream(logger) : null),
            in
        );

        Process process = pb.start();
        try {
            // start pump threads for custom streams if there are any
            // no need to bother for their completion:
            // these will terminate as soon as stream ends, also these are daemon threads so they
            // won't prevent JVM from exiting if something goes wrong
            for (Consumer<Process> task : pumpTasks) {
                Thread t = new Thread(() -> task.accept(process));
                t.setDaemon(true);
                t.start();
            }

            int code = process.waitFor();
            if (code != 0) throw new ExecuteException(code, "Command '" +  String.join(" ",  commandLine) + "' failed ");
            return code;
        } catch (InterruptedException e) {
            // wait interrupted, terminate process
            process.destroy();
            throw new ExecuteException(ExecuteException.INTERRUPTED_EXIT_CODE, "Command '" +  String.join(" ",  commandLine) + "' interrupted ");
        }
    }

    /**
     * Executes the command and returns process.
     * It uses the provided streams for stdout, stderr and stdin redirection according, but if not specified:
     * - stdin will set to PIPE mode
     * - stdout and stderr will be set to PIPE mode
     * If redirection to logger is needed, it has to be set as a custom stream using out()/err() methods
     */
    public Process execAsync() throws IOException {
        List<String> commandLine = generateCommandLine();
        logCommandLine(commandLine);

        ProcessBuilder pb = initProcessBuilder(commandLine);

        // setup IO redirection
        List<Consumer<Process>> pumpTasks = setupRedirection(pb,
            out != null ? out : PIPE_OUTPUT,
            err != null ? err :PIPE_OUTPUT,
            in != null ? in : PIPE_INPUT
        );

        Process process = pb.start();
        // start pump threads for custom streams if there are any
        // no need to bother for their completion:
        // these will terminate as soon as stream ends, also these are daemon threads so they
        // won't prevent JVM from exiting if something goes wrong
        for (Consumer<Process> task : pumpTasks) {
            Thread t = new Thread(() -> task.accept(process));
            t.setDaemon(true);
            t.start();
        }

        return process;
    }

    public String execCapture() throws IOException {
        List<String> commandLine = generateCommandLine();
        logCommandLine(commandLine);

        // override output stream from logger to capture output
        // meanwhile, error stream will be logged as usual to this.logger
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        out(baos);
        exec();

        return baos.toString().trim();
    }

    private static void pumpStreams(InputStream in, OutputStream out, boolean closeOutput) {
        try {
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
                out.flush(); // critical for stdin pumping
            }
        } catch (IOException ignored) {
        } finally {
            if (closeOutput) closeSilently(out);
        }
    }

    private static void closeSilently(OutputStream out) {
        try { out.close(); } catch (IOException ignored) { }
    }

    /**
     * Utility class to be used as constant to tag specific cases of using stdout/stderr redirects
     */
    private static class TagOutputStream extends OutputStream{
        private final String description;

        public TagOutputStream(String name) {
            this.description = name;
        }

        @Override
        public void write(int b) {
            throw new UnsupportedOperationException("this class is to be used as a tag only");
        }

        @Override
        public String toString() {
            return description;
        }
    }

    /**
     * Utility class to be used as constant to tag specific cases of using stdin redirects
     */
    private static class TagInputStream extends InputStream {
        private final String description;

        public TagInputStream(String name) {
            this.description = name;
        }

        @Override
        public String toString() {
            return description;
        }

        @Override
        public int read() {
            throw new UnsupportedOperationException("this class is to be used as a tag only");
        }
    }
}
