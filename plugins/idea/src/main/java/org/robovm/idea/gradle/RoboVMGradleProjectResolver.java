package org.robovm.idea.gradle;

import com.intellij.openapi.externalSystem.model.DataNode;
import com.intellij.openapi.externalSystem.model.project.ModuleData;
import com.intellij.openapi.externalSystem.model.project.ProjectData;
import com.intellij.openapi.externalSystem.util.ExternalSystemConstants;
import com.intellij.openapi.externalSystem.util.Order;
import org.gradle.tooling.model.idea.IdeaModule;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.plugins.gradle.service.project.AbstractProjectResolverExtension;
import org.jetbrains.plugins.gradle.settings.GradleExecutionSettings;
import org.robovm.compiler.model.RoboVMGradleModel;

import java.util.Collections;
import java.util.Set;

/**
 * gradle project resolver to detect RoboVM gradle module and disable module per source set for it
 * @author dkimitsa
 */
@Order(ExternalSystemConstants.UNORDERED)
public class RoboVMGradleProjectResolver extends AbstractProjectResolverExtension {

    @NotNull
    @Override
    public Set<Class<?>> getExtraProjectModelClasses() {
        return Collections.singleton(RoboVMGradleModel.class);
    }

    @Nullable
    @Override
    public DataNode<ModuleData> createModule(@NotNull IdeaModule gradleModule, @NotNull DataNode<ProjectData> projectDataNode) {
        GradleExecutionSettings settings = resolverCtx.getSettings();
        RoboVMGradleModel model = resolverCtx.getExtraProject(gradleModule, RoboVMGradleModel.class);
        if (model != null && settings != null) {
            // robovm module (uses robovm plugin in build.gradle), disable modules per source set
            boolean saved = settings.isResolveModulePerSourceSet();
            try {
                settings.setResolveModulePerSourceSet(false);
                return super.createModule(gradleModule, projectDataNode);
            } finally {
                settings.setResolveModulePerSourceSet(saved);
            }
        } else {
            return super.createModule(gradleModule, projectDataNode);
        }
    }
}
