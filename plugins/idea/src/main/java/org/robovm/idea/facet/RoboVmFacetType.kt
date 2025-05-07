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
package org.robovm.idea.facet

import com.intellij.facet.Facet
import com.intellij.facet.FacetType
import com.intellij.facet.FacetTypeId
import com.intellij.facet.FacetTypeRegistry
import com.intellij.openapi.module.JavaModuleType
import com.intellij.openapi.module.Module
import com.intellij.openapi.module.ModuleType
import com.intellij.openapi.project.guessModuleDir
import org.robovm.compiler.Version
import org.robovm.idea.RoboVmIcons
import javax.swing.*
import kotlin.io.path.absolutePathString

class RoboVmFacetType: FacetType<RoboVmFacet, RoboVmFacetConfiguration>(TYPE_ID, ID, NAME)  {
    @Suppress("CompanionObjectInExtension")
    companion object {
        @JvmField
        val ID = "robovm-facet"

        @JvmField
        val NAME = "RoboVM facet"

        @JvmField
        val TYPE_ID = FacetTypeId<RoboVmFacet>(ID)

        @JvmStatic
        val INSTANCE by lazy { FacetTypeRegistry.getInstance().findFacetType(TYPE_ID) as RoboVmFacetType }
    }

    override fun createDefaultConfiguration(): RoboVmFacetConfiguration {
        return RoboVmFacetConfiguration()
    }

    override fun isSuitableModuleType(moduleType: ModuleType<*>): Boolean {
        return moduleType is JavaModuleType
    }

    override fun createFacet(
        module: Module,
        name: String,
        configuration: RoboVmFacetConfiguration,
        underlyingFacet: Facet<*>?
    ): RoboVmFacet {
        if (configuration.settings.buildSystem == null) {
            // consider as imported from idea and re-create settings
            // have no path to module, try to guess one
            configuration.replaceSettings(
                RoboVmFacetConfiguration.Settings(
                    RoboVmFacetConfiguration.BuildSystem.IntelliJ,
                    module.guessModuleDir()?.toNioPath()?.absolutePathString(),
                    Version.getCompilerVersion()
                )
            )
        }
        return RoboVmFacet(module, name, configuration)
    }

    override fun getIcon(): Icon =  RoboVmIcons.ROBOVM_SMALL
}

