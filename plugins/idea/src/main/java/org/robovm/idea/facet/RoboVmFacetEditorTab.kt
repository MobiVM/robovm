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

import com.intellij.facet.ui.FacetEditorTab
import com.intellij.openapi.fileChooser.FileChooserDescriptorFactory
import com.intellij.openapi.ui.TextBrowseFolderListener
import com.intellij.openapi.ui.TextFieldWithBrowseButton
import com.intellij.openapi.vfs.VirtualFile
import com.intellij.util.ui.FormBuilder
import java.awt.BorderLayout
import javax.swing.JComponent
import javax.swing.JLabel
import javax.swing.JPanel
import kotlin.io.path.absolutePathString

/**
 * Editor for Facet settings. Displays:
 * - build system (e.g. gradle)
 * - version of plugin in build system (might be different from Idea plugin)
 * - content root of module
 *
 * Allows to edit:
 * - content root for modules managed by Idea (e.g. not Maven/Gradle)
 */
class RoboVmFacetEditorTab(
    private val configuration: RoboVmFacetConfiguration,
    private val mutableContentRoot: Boolean
): FacetEditorTab() {
    private var modifiedSettings: RoboVmFacetConfiguration.Settings? = null
    private val buildSystemVal = JLabel()
    private val externalVersionVal = JLabel()
    private val contentRootVal: JComponent by lazy {
        if (mutableContentRoot) {
            TextFieldWithBrowseButton().apply {
                isEditable = false
                val listener = object : TextBrowseFolderListener(
                    FileChooserDescriptorFactory.createSingleFolderDescriptor().withTitle("RoboVM Content Root")
                ) {
                    @Suppress("UnstableApiUsage")
                    override fun onFileChosen(chosenFile: VirtualFile) {
                        // value picked
                        modifiedSettings = configuration.settings.copy(contentRoot = chosenFile.toNioPath().absolutePathString())
                    }
                }
                addBrowseFolderListener(listener)
            }
        } else {
            JLabel()
        }
    }

    private val panel: JPanel = FormBuilder.createFormBuilder()
        .addLabeledComponent(JLabel("Build system:"), buildSystemVal, 1, false)
        .addLabeledComponent(JLabel("Content root:"), contentRootVal, 1, false)
        .addLabeledComponent(JLabel("Version:"), externalVersionVal, 1, false)
        .let { builder ->
            // wrap to make panel pinned top
            JPanel(BorderLayout()).apply { add(builder.panel, BorderLayout.NORTH) }
        }

    override fun createComponent(): JComponent = panel

    override fun isModified(): Boolean = modifiedSettings != null && modifiedSettings != configuration.settings
    override fun apply() {
        modifiedSettings?.takeIf { it != configuration.settings }?.let { configuration.replaceSettings(it) }
    }
    override fun reset() {
        buildSystemVal.text = configuration.settings.buildSystem?.name ?: "NOT CONFIGURED!"
        contentRootVal.text = configuration.settings.contentRoot ?: "NOT CONFIGURED!"
        externalVersionVal.text = configuration.settings.externalVersion ?: "NOT CONFIGURED!"
        modifiedSettings = null
    }

    override fun getDisplayName(): String = "RoboVM Build System Settings"

    // extension to work with mutableContentRoot
    private var JComponent.text: String
        get() = when (this) {
            is JLabel -> text
            is TextFieldWithBrowseButton -> text
            else -> throw IllegalStateException()
        }
        set (v) = when (this) {
            is JLabel -> text = v
            is TextFieldWithBrowseButton -> text = v
            else -> throw IllegalStateException()
        }
}