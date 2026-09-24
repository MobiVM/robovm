/*
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
package org.robovm.idea.maven.sync

import com.intellij.openapi.externalSystem.service.project.IdeModifiableModelsProvider
import com.intellij.openapi.module.Module
import com.intellij.openapi.project.Project
import org.jetbrains.idea.maven.importing.FacetImporter
import org.jetbrains.idea.maven.importing.MavenRootModelAdapter
import org.jetbrains.idea.maven.project.MavenProject
import org.jetbrains.idea.maven.project.MavenProjectChanges
import org.jetbrains.idea.maven.project.MavenProjectsProcessorTask
import org.jetbrains.idea.maven.project.MavenProjectsTree
import org.robovm.idea.facet.RoboVmFacet
import org.robovm.idea.facet.RoboVmFacetConfiguration
import org.robovm.idea.facet.RoboVmFacetType
import org.robovm.idea.sdk.RoboVmSdkType
import kotlin.io.path.absolutePathString

/**
 * Facet Imported for maven project that has `robovm-maven-plugin`.
 * Attaches RoboVM facet and setups SDK
 */
class RoboVmMavenImporter: FacetImporter<RoboVmFacet, RoboVmFacetConfiguration, RoboVmFacetType>(
    ROBOVM_PLUGIN_GROUP_ID, ROBOVM_PLUGIN_ARTIFACT_ID, RoboVmFacetType.INSTANCE
) {
    companion object {
        const val ROBOVM_PLUGIN_GROUP_ID = "com.mobidevelop.robovm"
        const val ROBOVM_PLUGIN_ARTIFACT_ID = "robovm-maven-plugin"
    }

    override fun isFacetDetectionDisabled(project: Project): Boolean = false

    @Suppress("UnstableApiUsage")
    override fun reimportFacet(
        modelsProvider: IdeModifiableModelsProvider,
        module: Module,
        rootModel: MavenRootModelAdapter,
        facet: RoboVmFacet,
        mavenTree: MavenProjectsTree,
        mavenProject: MavenProject,
        changes: MavenProjectChanges,
        mavenProjectToModuleName: MutableMap<MavenProject, String>,
        postTasks: MutableList<MavenProjectsProcessorTask>
    ) {
        // replace settings
        val contentRoot = mavenProject.file.parent.toNioPath().absolutePathString()
        val version = mavenProject.findPlugin(ROBOVM_PLUGIN_GROUP_ID, ROBOVM_PLUGIN_ARTIFACT_ID)?.version ?: "unknown"
        facet.configuration.replaceSettings(RoboVmFacetConfiguration.Settings(RoboVmFacetConfiguration.BuildSystem.Maven, contentRoot, version))

        // setup sdk
        val moduleModel = modelsProvider.getModifiableRootModel(module)
        moduleModel.sdk = RoboVmSdkType.setUpSdkIfNeeded(module.project)
    }
}