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
import com.intellij.openapi.externalSystem.model.ProjectKeys
import com.intellij.openapi.externalSystem.model.project.ContentRootData
import com.intellij.openapi.externalSystem.model.project.ExternalSystemSourceType
import com.intellij.openapi.externalSystem.model.project.ModuleData
import com.intellij.openapi.externalSystem.model.project.ProjectData
import com.intellij.openapi.externalSystem.util.ExternalSystemApiUtil
import com.intellij.openapi.externalSystem.util.ExternalSystemConstants
import com.intellij.openapi.externalSystem.util.Order
import org.gradle.tooling.model.idea.IdeaModule
import org.jetbrains.plugins.gradle.model.data.GradleSourceSetData
import org.jetbrains.plugins.gradle.service.project.AbstractProjectResolverExtension
import org.jetbrains.plugins.gradle.util.GradleConstants
import org.robovm.compiler.model.RoboVMGradleModel
import org.robovm.idea.facet.RoboVmFacetConfiguration
import java.io.File

/**
 * gradle project resolver to detect RoboVM gradle module and attach RoboVmGradleModelKey so
 * RoboVmModuleDataService will be able to create facet for it
 * @author dkimitsa
 */
@Order(ExternalSystemConstants.UNORDERED)
class RoboVMGradleProjectResolver : AbstractProjectResolverExtension() {
    override fun getExtraProjectModelClasses() = setOf(RoboVMGradleModel::class.java)

    override fun createModule(gradleModule: IdeaModule, projectDataNode: DataNode<ProjectData>): DataNode<ModuleData>? {
        val moduleNode = super.createModule(gradleModule, projectDataNode) ?: return null
        val model = resolverCtx.getExtraProject(gradleModule, RoboVMGradleModel::class.java) ?: return  moduleNode

        // RoboVm node, modules per source set might be active, in this case look for :main source set to attach
        // facet to.
        val externalSettings = RoboVmFacetConfiguration.Settings(
            buildSystem = RoboVmFacetConfiguration.BuildSystem.Gradle,
            contentRoot = moduleNode.data.linkedExternalProjectPath,
            externalVersion = model.version
        )
        val sourceSetNodes = ExternalSystemApiUtil.findAll(moduleNode, GradleSourceSetData.KEY)
        val nodeForFacet = sourceSetNodes.find { it.data.id.endsWith(":main") }
            ?: moduleNode
        nodeForFacet.createChild(RoboVmGradleModelKey, externalSettings)

        // configure build folder as ignored so it doesn't appear in project view and doesn't cause indexing
        externalSettings.contentRoot?.let { contentRoot ->
            val excludedFolderPath = contentRoot + File.separator + "robovm-build"
            val contentRoot = ContentRootData(GradleConstants.SYSTEM_ID, contentRoot)
            contentRoot.storePath(ExternalSystemSourceType.EXCLUDED, excludedFolderPath)
            moduleNode.createChild(ProjectKeys.CONTENT_ROOT, contentRoot)
        }

        return moduleNode
    }
}
