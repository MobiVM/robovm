package org.robovm.idea.components;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.android.tools.idea.gradle.facet.AndroidGradleFacet;
import com.android.tools.idea.gradle.invoker.GradleInvoker;
import com.android.tools.idea.gradle.project.BuildSettings;
import com.android.tools.idea.gradle.util.AndroidGradleSettings;
import com.android.tools.idea.gradle.util.BuildMode;
import com.google.common.annotations.VisibleForTesting;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.project.Project;
import org.apache.tools.ant.taskdefs.Ant;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.impl.Log4jLoggerFactory;

import com.google.gson.Gson;
import com.intellij.compiler.server.BuildProcessParametersProvider;
import com.intellij.util.PathUtil;
import groovy.lang.GroovyObject;

import static com.android.tools.idea.gradle.compiler.BuildProcessJvmArgs.BUILD_MODE;
import static com.android.tools.idea.gradle.compiler.BuildProcessJvmArgs.GRADLE_TASKS_TO_INVOKE_PROPERTY_PREFIX;
import static com.android.tools.idea.gradle.util.Projects.isBuildWithGradle;
import static com.android.tools.idea.gradle.util.Projects.lastGradleSyncFailed;


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

    @NotNull
    @Override
    public List<String> getVMArguments() {
        List<String> args = new ArrayList<>();
        if (!isBuildWithGradle(project)) return args;
        BuildSettings buildSettings = BuildSettings.getInstance(project);
        Module[] modules = buildSettings.getModulesToBuild();
        BuildMode mode = buildSettings.getBuildMode();
        if (mode == null) return args;
        if (modules == null) return args;        
        if (mode == BuildMode.ASSEMBLE && lastGradleSyncFailed(project)) return args;        
        
        List<String> tasks = GradleInvoker.findTasksToExecute(modules, 
                                                              mode, 
                                                              GradleInvoker.getTestCompileType(buildSettings.getRunConfigurationTypeId()));

        if(tasks.size() == 0 && mode == BuildMode.ASSEMBLE) {
            int idx = 0;
            for(int i = 0; i < modules.length; i++) {
                Module module = modules[i];
                AndroidGradleFacet facet = AndroidGradleFacet.getInstance(module);
                if (facet == null) continue;                
                args.add(AndroidGradleSettings.createJvmArg(GRADLE_TASKS_TO_INVOKE_PROPERTY_PREFIX + idx++,
                                                            GradleInvoker.createBuildTask(facet.getConfiguration().GRADLE_PROJECT_PATH, "assemble")));                
            }
        }
        return args;
    }
}
