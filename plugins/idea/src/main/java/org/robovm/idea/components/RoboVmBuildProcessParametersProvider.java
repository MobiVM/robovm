package org.robovm.idea.components;

import com.google.gson.Gson;
import com.intellij.compiler.server.BuildProcessParametersProvider;
import com.intellij.openapi.project.Project;
import com.intellij.util.PathUtil;
import groovy.lang.GroovyObject;
import org.apache.tools.ant.taskdefs.Ant;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.impl.Log4jLoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class RoboVmBuildProcessParametersProvider extends BuildProcessParametersProvider {
    private Project project = null;

    public RoboVmBuildProcessParametersProvider(@NotNull Project project) {
        this.project = project;
    }

    @Override
    @NotNull
    public List<String> getClassPath() {
        List<String> classpath = new ArrayList<>();
        classpath.add(PathUtil.getJarPathForClass(Ant.class));
        classpath.add(PathUtil.getJarPathForClass(GroovyObject.class));
        classpath.add(PathUtil.getJarPathForClass(Gson.class));
        classpath.add(PathUtil.getJarPathForClass(Logger.class));
        classpath.add(PathUtil.getJarPathForClass(Log4jLoggerFactory.class));
        return classpath;
    }
}
