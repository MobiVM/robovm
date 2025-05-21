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
package org.robovm.idea.gradle.sync

import com.intellij.openapi.externalSystem.model.DataNode
import com.intellij.openapi.externalSystem.model.project.ModuleData
import com.intellij.openapi.externalSystem.model.project.ProjectData
import com.intellij.openapi.externalSystem.util.ExternalSystemConstants
import com.intellij.openapi.externalSystem.util.Order
import org.gradle.tooling.model.idea.IdeaModule
import org.jetbrains.plugins.gradle.service.project.AbstractProjectResolverExtension
import org.robovm.compiler.model.RoboVMGradleModel
import org.robovm.idea.facet.RoboVmFacetConfiguration

/**
 * gradle project resolver to detect RoboVM gradle module and disable module per source set for it
 * @author dkimitsa
 */
@Order(ExternalSystemConstants.UNORDERED)
class RoboVMGradleProjectResolver : AbstractProjectResolverExtension() {
    override fun getExtraProjectModelClasses() = setOf(RoboVMGradleModel::class.java)

    override fun createModule(gradleModule: IdeaModule, projectDataNode: DataNode<ProjectData>): DataNode<ModuleData>? {
        val model = resolverCtx.getExtraProject(gradleModule, RoboVMGradleModel::class.java)
        if (model != null) {
            // settings are nullable till 2024.3
            val saved = resolverCtx.settings?.isResolveModulePerSourceSet
            // robovm module (uses robovm plugin in build.gradle)
            try {
                // disable modules per source set for RoboVM module
                resolverCtx.settings?.run { isResolveModulePerSourceSet = false }
                return super.createModule(gradleModule, projectDataNode)?.also { moduleDataNode ->
                    val externalSettings = RoboVmFacetConfiguration.Settings(
                        buildSystem = RoboVmFacetConfiguration.BuildSystem.Gradle,
                        contentRoot = moduleDataNode.data.linkedExternalProjectPath,
                        externalVersion = model.version
                    )
                    moduleDataNode.createChild(RoboVmGradleModelKey, externalSettings)
                }
            } catch (e: Exception) {
                if (saved != null)
                    resolverCtx.settings?.run { isResolveModulePerSourceSet = saved }
                throw e
            }
        } else {
            return super.createModule(gradleModule, projectDataNode)
        }
    }
}
