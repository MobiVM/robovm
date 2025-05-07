/*
 * Copyright (C) 2015 RoboVM AB
 *
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
package org.robovm.idea.sdk

import com.intellij.openapi.application.ApplicationManager
import com.intellij.openapi.application.runWriteAction
import com.intellij.openapi.components.service
import com.intellij.openapi.project.Project
import com.intellij.openapi.projectRoots.*
import com.intellij.openapi.projectRoots.impl.SdkConfigurationUtil
import com.intellij.openapi.roots.OrderRootType
import com.intellij.openapi.vfs.LocalFileSystem
import com.intellij.pom.java.LanguageLevel
import org.jdom.Element
import org.robovm.compiler.Version
import org.robovm.idea.RoboVmIcons
import org.robovm.idea.RoboVmLocations
import org.robovm.idea.RoboVmPlugin

class RoboVmSdkType : SdkType(SDK_NAME) {
    @Suppress("CompanionObjectInExtension")
    companion object {
        private const val SDK_NAME = "RoboVM SDK"
        @JvmField
        val INSTANCE = RoboVmSdkType()

        @JvmField
        val SUGGESTED_SDK_NAME = if (RoboVmLocations.roboVmHome.isDev) "$SDK_NAME (DEV)" else SDK_NAME

        @JvmField
        val REQUIRED_JAVA_LANGUAGE_LEVEL: LanguageLevel = LanguageLevel.JDK_1_8

        /**
         * Setups RoboVM SDK
         * rules:
         * - only one RoboVM SDK allowed
         * - if not available will be created
         * - if available should match criteria: same sdkPath + version
         * - all not compatible SDKs will be dropped
         * - all duplicates will be dropped
         */
        @JvmStatic
        fun setUpSdkIfNeeded(project: Project): Sdk {
            val unsupported = mutableListOf<Sdk>()
            var candidate: Sdk? = null
            // check if there is existing
            val expectedHomeDir = RoboVmLocations.roboVmHome.homeDir.absolutePath
            val expectedVersion = Version.getCompilerVersion()
            ProjectJdkTable.getInstance().allJdks.asSequence().filter { it.sdkType is RoboVmSdkType }.forEach {
                if (candidate == null && it.isSupported(expectedHomeDir, expectedVersion)) candidate = it
                else unsupported.add(it)
            }

            // removing unsupported
            if (unsupported.isNotEmpty()) {
                ApplicationManager.getApplication().invokeAndWait {
                    runWriteAction {
                        val jdkTable = ProjectJdkTable.getInstance()
                        unsupported.forEach {
                            RoboVmPlugin.logInfo(project, "Removing unsupported SDK: %s", it.toString())
                            jdkTable.removeJdk(it)
                        }
                    }
                }
            }

            // return SDK if valid was found
            candidate?.let { return it }

            // adding new sdk
            val sdkToAdd: Sdk
            val unpacker = service<RoboVmSdkUnpackService>()
            val roboVmHome = unpacker.extractSdkIfNeeded(project)
            // configure
            val newSdkName = SdkConfigurationUtil.createUniqueSdkName(INSTANCE, roboVmHome.homeDir.absolutePath,
                ProjectJdkTable.getInstance().allJdks.toList())
            sdkToAdd = ProjectJdkTable.getInstance().createSdk(newSdkName, INSTANCE)
            INSTANCE.setupSdkPaths(sdkToAdd)

            ApplicationManager.getApplication().invokeAndWait {
                runWriteAction {
                    RoboVmPlugin.logInfo(project, "Adding RoboVM SDK: %s", sdkToAdd.name)
                    ProjectJdkTable.getInstance().addJdk(sdkToAdd)
                }
            }

            return sdkToAdd
        }

        /**
         * @return true if Sdk isSupported:
         * - should be called only for .sdkType == RoboVmSdkType
         * - home path and version should match
         */
        private fun Sdk.isSupported(expectedHomeDir: String, expectedVersion: String ): Boolean {
            return this.homePath == expectedHomeDir && this.versionString == expectedVersion
        }
    }


    @Deprecated("Deprecated in Java")
    override fun suggestHomePath(): String? = null

    override fun isValidSdkHome(path: String) = true

    override fun suggestSdkName(currentSdkName: String?, sdkHome: String) = SUGGESTED_SDK_NAME

    override fun getVersionString(sdkHome: String): String? = Version.getCompilerVersion()

    override fun createAdditionalDataConfigurable(sdkModel: SdkModel, sdkModificator: SdkModificator) = null

    override fun getPresentableName() = SDK_NAME

    override fun getIcon() = RoboVmIcons.ROBOVM_SMALL

    override fun saveAdditionalData(additionalData: SdkAdditionalData, additional: Element) {
    }


    override fun setupSdkPaths(sdk: Sdk) {
        val sdkModificator = sdk.sdkModificator
        sdkModificator.removeAllRoots()

        // add all class and source jars from the SDK lib/ folder
        val home = RoboVmLocations.roboVmHome
        for (file in RoboVmPlugin.getSdkLibraries()) {
            val virtualFile = checkNotNull(LocalFileSystem.getInstance().refreshAndFindFileByIoFile(file))
            sdkModificator.addRoot(virtualFile, if (file.name.endsWith("-sources.jar")) OrderRootType.SOURCES else OrderRootType.CLASSES)
        }

        // set the home path
        sdkModificator.homePath = home.homeDir.absolutePath
        sdkModificator.versionString = Version.getCompilerVersion()

        // commit changes and let IDEA handle the rest
        ApplicationManager.getApplication().invokeAndWait { runWriteAction { sdkModificator.commitChanges() } }
    }

}