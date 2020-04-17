package org.robovm.compiler.clazz;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.file.*;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * Implements Java9 module based class path, mostly required for unit tests
 * @author dkimitsa
 */
public class Java9RuntimePath extends AbstractPath {
    private final Map<String, JrtFilePathClass> knownClasses = new HashMap<>();
    private final Path jrtModulesPath = FileSystems.getFileSystem(URI.create("jrt:/")).getPath("/modules");

    Java9RuntimePath(File file, Clazzes clazzes, int index, boolean inBootclasspath) {
        super(file, clazzes, index, inBootclasspath);
    }

    @Override
    protected Set<Clazz> doListClasses() {
        Set<Clazz> s = new TreeSet<>();

        try (DirectoryStream<java.nio.file.Path> modulesStream = Files.newDirectoryStream(jrtModulesPath)) {
            for (Path module : modulesStream) {
                // check each module folder for the class
                Files.walk(module).forEach(cls -> {
                    if (Files.isRegularFile(cls) && cls.toString().endsWith(".class")) {
                        String fileName = module.relativize(cls).toString();
                        JrtFilePathClass path = new JrtFilePathClass(fileName, cls);
                        s.add(path);
                        knownClasses.put(fileName, path);
                    }
                });
            }
        } catch (FileSystemNotFoundException ex) {
            System.out.println("Could not read my modules (perhaps not Java 9?).");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return s;
    }

    @Override
    public boolean hasChangedSince(long timestamp) {
        long lastModified;
        try {
            lastModified = Files.getLastModifiedTime(jrtModulesPath).toMillis();
            return lastModified > timestamp;
        } catch (IOException e) {
            return false;
        }
    }

    @Override
    public boolean contains(String file) {
        return knownClasses.containsKey(file);
    }

    @Override
    public InputStream open(String file) throws IOException {
        return Files.newInputStream(knownClasses.get(file).entry);
    }


    private class JrtFilePathClass extends Clazz {
        private final Path entry;

        JrtFilePathClass(String name, Path entry) {
            super(Java9RuntimePath.this.clazzes, name, Java9RuntimePath.this);
            this.entry = entry;
        }

        @Override
        public byte[] getBytes() throws IOException {
            return Files.readAllBytes(entry);
        }

        @Override
        public long lastModified() {
            try {
                return Files.getLastModifiedTime(entry).toMillis();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}