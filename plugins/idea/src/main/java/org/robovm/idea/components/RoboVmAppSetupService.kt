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

import com.intellij.debugger.settings.DebuggerSettings
import com.intellij.ide.util.PropertiesComponent
import com.intellij.openapi.application.ApplicationManager
import com.intellij.openapi.application.EDT
import com.intellij.openapi.components.Service
import com.intellij.ui.classFilter.ClassFilter
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import org.robovm.compiler.util.ToolchainUtil
import org.robovm.idea.components.setupwizard.NoXcodeSetupDialog
import org.robovm.idea.components.setupwizard.XcodeSetupDialog

/**
 * Application level service that combines setup related activities
 */
@Service
class RoboVmAppSetupService {
    companion object {
        const val ROBOVM_HAS_SHOWN_NO_XCODE_WIZARD: String = "robovm.hasShownNoXcodeWizard"
        const val ROBOVM_HAS_CONFIGURED_DEBUGGER: String = "robovm.hasConfiguredDebugger"
    }

    private fun isNotApplicable(): Boolean {
        return ApplicationManager.getApplication().isHeadlessEnvironment ||
            ApplicationManager.getApplication().isUnitTestMode
    }

    /// xcode setup dialog to be shown only once per Idea launch
    private var xcodeSetupDialogShown = false

    /**
     * Shows XCode dialog (or no Xcode available dialog)
     */
    suspend fun showXcodeSetupDialog() {
        // uncomment to force dialog
        // PropertiesComponent.getInstance().unsetValue(ROBOVM_HAS_SHOWN_NO_XCODE_WIZARD)

        // show only once even if there is no xcode installed
        if (isNotApplicable() || xcodeSetupDialogShown) return
        xcodeSetupDialogShown = true

        // make sure Xcode is installed
        // If we are on a Mac, otherwise
        // inform the user that they
        // won't be able to compile for
        // iOS
        if (System.getProperty("os.name").contains("Mac")) {
            try {
                ToolchainUtil.findXcodePath()
            } catch (e: Throwable) {
                withContext(Dispatchers.EDT) { XcodeSetupDialog().isVisible = true }
            }
        } else {
            if (!PropertiesComponent.getInstance().getBoolean(ROBOVM_HAS_SHOWN_NO_XCODE_WIZARD, false)) {
                withContext(Dispatchers.EDT) { NoXcodeSetupDialog().isVisible = true }
                PropertiesComponent.getInstance().setValue(ROBOVM_HAS_SHOWN_NO_XCODE_WIZARD, "true")
            }
        }
    }


    /**
     * Setups debugger to not step-into RoboVM related internal code (dalvik.*", "libcore.*)
     * Setup is being done only once
     */
    suspend fun setupDebugger() {
        if (PropertiesComponent.getInstance().getBoolean(ROBOVM_HAS_CONFIGURED_DEBUGGER, false)) return
        PropertiesComponent.getInstance().setValue(ROBOVM_HAS_CONFIGURED_DEBUGGER, "true")

        val robovmFilters = arrayOf("dalvik.*", "libcore.*")
        val steppingFilters = DebuggerSettings.getInstance().steppingFilters
        var modifiedFilters: MutableList<ClassFilter>? = null
        for (rvmPattern in robovmFilters) {
            val exists = steppingFilters.any {
                val pattern = it.pattern
                // if pattern is same or configured patter covers robovm ones, (e.g. java.* covers java.lang.*)
                pattern == rvmPattern || (pattern.endsWith(".*") && rvmPattern.startsWith(pattern.take(pattern.length -1)))
            }
            if (exists) continue

            // not configured, add to the end of existing filters
            if (modifiedFilters == null) modifiedFilters = steppingFilters.toMutableList()
            modifiedFilters.add(ClassFilter(rvmPattern))
        }

        if (modifiedFilters != null) DebuggerSettings.getInstance().steppingFilters = modifiedFilters.toTypedArray()
    }
}