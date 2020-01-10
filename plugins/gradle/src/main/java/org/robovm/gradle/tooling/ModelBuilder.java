package org.robovm.gradle.tooling;

import org.gradle.api.Project;
import org.gradle.tooling.provider.model.ToolingModelBuilder;
import org.robovm.compiler.model.RoboVMGradleModel;
import org.robovm.gradle.RoboVMPlugin;

import java.io.Serializable;

/**
 * Model builder that returns information from robovm plugin/extension
 * @author dkitmisa
 */
public class ModelBuilder implements ToolingModelBuilder {
    @Override
    public boolean canBuild(String modelName) {
        return modelName.equals(RoboVMGradleModel.class.getName());
    }

    @Override
    public Object buildAll(String modelName, Project project) {
        return new DefaultRoboVMGradleModel();
    }


    /**
     * basic implementation of RoboVMGradleModel protocol
     * TODO: its the point where it has to be extended with all other parameters from extension to be
     *       exposed to Idea plugin
     */
    public static class DefaultRoboVMGradleModel implements RoboVMGradleModel, Serializable {
        @Override
        public String getVersion() {
            return RoboVMPlugin.getRoboVMVersion();
        }
    }
}
