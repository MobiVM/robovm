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

import com.intellij.facet.ModifiableFacetModel
import com.intellij.openapi.externalSystem.model.DataNode
import com.intellij.openapi.externalSystem.model.Key
import com.intellij.openapi.externalSystem.model.ProjectKeys
import com.intellij.openapi.externalSystem.model.project.ProjectData
import com.intellij.openapi.externalSystem.service.project.IdeModifiableModelsProvider
import com.intellij.openapi.externalSystem.service.project.manage.AbstractProjectDataService
import com.intellij.openapi.externalSystem.util.ExternalSystemApiUtil
import com.intellij.openapi.module.Module
import com.intellij.openapi.project.Project
import org.jetbrains.plugins.gradle.util.GradleConstants.SYSTEM_ID
import org.robovm.idea.facet.*
import org.robovm.idea.sdk.RoboVmSdkType


/**
 * Key identifies as RoboVM module being imported by gradle.
 * Being set in RoboVMGradleProjectResolver. Using facet setting class here as data
 */
internal val RoboVmGradleModelKey = Key.create(RoboVmFacetConfiguration.Settings::class.java, 1)

/**
 * Attaches RoboVM facet to modules imported by gradle.
 * (triggered by RoboVmModelKey in DataNode, attached by RoboVMGradleProjectResolver)
 */
class RoboVmModuleDataService : AbstractProjectDataService<RoboVmFacetConfiguration.Settings, Module>() {

    override fun getTargetDataKey(): Key<RoboVmFacetConfiguration.Settings> = RoboVmGradleModelKey

    override fun postProcess(
        toImport: Collection<DataNode<RoboVmFacetConfiguration.Settings>>,
        projectData: ProjectData?,
        project: Project,
        modelsProvider: IdeModifiableModelsProvider
    ) {
        if (project.isDisposed) return

        // for each module with RoboVMGradleModel attached just add RoboVM facet
        toImport.forEach { nodeToImport ->
            ExternalSystemApiUtil.findParent(nodeToImport, ProjectKeys.MODULE)?.let { moduleNode ->
                val module = modelsProvider.findIdeModule(moduleNode.data) ?: return@let
                val externalModel = nodeToImport.data
                val facetModel = modelsProvider.getModifiableFacetModel(module)
                facetModel.getFacetByType(RoboVmFacetType.TYPE_ID)?.let {
                    // facet already attached, replace its settings
                    it.configuration.replaceSettings(externalModel)
                } ?: run {
                    // create new facet
                    module.attachRoboVmFacet(facetModel, externalModel)
                }

                // setup sdk
                val moduleModel = modelsProvider.getModifiableRootModel(module)
                moduleModel.sdk = RoboVmSdkType.setUpSdkIfNeeded(project)
            }
        }
    }

    /**
     * Creates RoboVM facet for the [module] with the default facet configuration.
     */
    private fun Module.attachRoboVmFacet(
        facetModel: ModifiableFacetModel,
        settings: RoboVmFacetConfiguration.Settings
    ): RoboVmFacet {
        val facetType = RoboVmFacetType.INSTANCE
        val configuration = RoboVmFacetConfiguration(settings)
        val facet = facetType.createFacet(this, RoboVmFacetType.NAME, configuration, null)
        @Suppress("UnstableApiUsage")
        facetModel.addFacet(facet, ExternalSystemApiUtil.toExternalSource(SYSTEM_ID))
        return facet
    }
}

