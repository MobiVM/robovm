package org.robovm.idea.facet

import com.intellij.facet.FacetConfiguration
import com.intellij.facet.ui.FacetEditorContext
import com.intellij.facet.ui.FacetEditorTab
import com.intellij.facet.ui.FacetValidatorsManager
import com.intellij.openapi.components.PersistentStateComponent
import com.intellij.util.ui.FormBuilder
import java.awt.BorderLayout
import javax.swing.JComponent
import javax.swing.JLabel
import javax.swing.JPanel


class RoboVmFacetConfiguration() : FacetConfiguration, PersistentStateComponent<RoboVmFacetConfiguration.Settings> {
    enum class BuildSystem {
        IntelliJ,
        Gradle,
        Maven
    }
    data class Settings(
        var buildSystem: BuildSystem?,    // maven, gradle
        var contentRoot: String?, // location module was imported (dir where .pom or .gradle file is located)
        var externalVersion: String?, // version of gradle/maven plugin
    ) {
        internal constructor(): this(null, null, null)
    }

    var settings: Settings = Settings()
        private set

    /**
     * replaces settings, but not guaranties these to be saved
     */
    fun replaceSettings(settings: Settings) {
        this.settings = settings
    }

    constructor(settings: Settings): this() {
        this.settings = settings
    }

    override fun createEditorTabs(editorContext: FacetEditorContext, validatorsManager: FacetValidatorsManager): Array<FacetEditorTab> {
        return arrayOf(RoboVmFacetEditorTab(this, settings.buildSystem == BuildSystem.IntelliJ))
    }

    override fun getState(): Settings? = settings
    override fun loadState(state: Settings) {
        this.settings = state
    }
}