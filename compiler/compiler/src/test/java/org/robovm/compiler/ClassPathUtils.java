package org.robovm.compiler;

import org.apache.commons.lang3.JavaVersion;
import org.apache.commons.lang3.SystemUtils;
import soot.SourceLocator;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Simple helper to help resolving BC on both 1.8 and 9+ javas
 * @author dkimitsa
 */
public class ClassPathUtils {

    public static String getBcPath() {
        if (isJavaVersionAtLeast9()) {
            return SourceLocator.DUMMY_CLASSPATH_JDK9_FS;
        } else {
            return System.getProperty("sun.boot.class.path");
        }
    }

    public static List<File> getBcPaths() {
        if (isJavaVersionAtLeast9()) {
            return Collections.singletonList(new File(SourceLocator.DUMMY_CLASSPATH_JDK9_FS));
        } else {
            List<File> result = new ArrayList<>();
            String[] bcEntries = System.getProperty("sun.boot.class.path").split(File.pathSeparator);
            for (String entry : bcEntries)
                result.add(new File(entry));
            return result;
        }
    }

    public static boolean isJavaVersionAtLeast9() {
        // before java 9 version had number 1.x, this changed with Java9
        return !System.getProperty("java.version").startsWith("1.");
    }
}
