package org.robovm.idea.components;

import com.intellij.compiler.server.BuildProcessParametersProvider;
import com.intellij.util.PathUtil;
import groovy.lang.GroovyObject;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.impl.Log4jLoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class RoboVmBuildProcessParametersProvider extends BuildProcessParametersProvider {
    @Override
    @NotNull
    public List<String> getClassPath() {
        List<String> classpath = new ArrayList<>();
        classpath.add(PathUtil.getJarPathForClass(GroovyObject.class));
        classpath.add(PathUtil.getJarPathForClass(Logger.class));
        classpath.add(PathUtil.getJarPathForClass(Log4jLoggerFactory.class));
        return classpath;
    }
}
