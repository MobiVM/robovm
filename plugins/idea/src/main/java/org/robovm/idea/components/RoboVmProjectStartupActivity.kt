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
package org.robovm.idea.components

import com.intellij.facet.ProjectFacetManager
import com.intellij.openapi.components.service
import com.intellij.openapi.project.Project
import com.intellij.openapi.startup.ProjectActivity
import org.robovm.idea.RoboVmPlugin
import org.robovm.idea.facet.RoboVmFacetType

/**
 * Replacement for ProjectComponent/ApplicationComponent.
 * Does RoboVM related initializations only if project with RoboVM facet is opened
 */
class RoboVmProjectStartupActivity: ProjectActivity {
    override suspend fun execute(project: Project) {
        if (project.isDisposed) return

        // do it only if project contains RoboVM facet
        val modulesWithFacet = ProjectFacetManager.getInstance(project).getModulesWithFacet(RoboVmFacetType.TYPE_ID)
        if (modulesWithFacet.isNotEmpty()) {
            RoboVmPlugin.initializeProject(project)

            // show xcode dialog if applicable
            val setupService = service<RoboVmAppSetupService>()
            setupService.showXcodeSetupDialog()

            // and configure debugger
            setupService.setupDebugger()
        }
    }
}