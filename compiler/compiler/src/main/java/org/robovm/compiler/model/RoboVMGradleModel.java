package org.robovm.compiler.model;

/**
 * interface for model used to interact between gradle plugin and idea (or something else if requried) using
 * ToolingModelBuilder
 * FIXME: probably it is not best place to have it as compiler doesn't use it
 *        but just in sace not introducing new mvn modules and considering that compiler is used
 *        by both gradle and idea plugin this interface is declared here
 */
public interface RoboVMGradleModel {
    String getVersion();
}
