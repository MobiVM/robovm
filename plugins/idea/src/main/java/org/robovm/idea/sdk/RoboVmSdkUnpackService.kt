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
package org.robovm.idea.sdk

import com.intellij.openapi.components.Service
import com.intellij.openapi.project.Project
import com.intellij.platform.ide.progress.withBackgroundProgress
import kotlinx.coroutines.*
import org.apache.commons.compress.archivers.tar.TarArchiveInputStream
import org.apache.commons.io.FileUtils
import org.apache.commons.io.IOUtils
import org.robovm.compiler.Version
import org.robovm.compiler.config.Config.Home
import org.robovm.idea.RoboVmLocations
import org.robovm.idea.RoboVmPlugin
import org.robovm.idea.utils.RoboFileUtils
import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import java.util.zip.GZIPInputStream

/**
 * Service as single point for SDK files unpack, keeps deferred to File-location of successfully unpacked SDK files
 * TODO: things to consider
 * 1. its single action operation -- if failed (for ex if there is no space left) it will not retry
 * 2. it unpacks package that contains folder with sdk named "robovm-${version}". in case folder name
 *    and plugin version mismatch -- sdk will not be installed
 * 3. there is no need to unpack SDK on every sync in case of release version (e.g. only SNAPSHOT files
 *    could change under same plugin's snapshot version)
 */
@Service(Service.Level.APP)
class RoboVmSdkUnpackService(private val scope: CoroutineScope) {
    private val sdkUnpackDeferred: Deferred<Home> by lazy {
        scope.async(Dispatchers.IO) {
            val sdkHome = RoboVmLocations.roboVmHome
            if (!sdkHome.isDev) {
                // in case of Dev environment no need to unpack SDK
                // using parent here as:
                // - sdkHome.homeDir points to final destination (e.g. .robovm-sdks/robovm-2.3.23)
                // - but `robovm-dist` contains `robovm-2.3.23` directory inside
                val homeDir = sdkHome.homeDir.parentFile
                if (!homeDir.exists() && !homeDir.mkdirs()) {
                    throw RuntimeException("Couldn't create sdk dir in " + homeDir.absolutePath)
                }

                // drop cache if files were changed
                val filesWereUpdated = extractSdk(homeDir)
                if (filesWereUpdated) {
                    RoboVmPlugin.logInfo(null, "Clearing ~/.robovm/cache folder due SDK files changed.")
                    try {
                        FileUtils.deleteDirectory(RoboVmLocations.cacheDir)
                    } catch (ignored: IOException) {
                    }
                }
            }
            sdkHome
        }
    }

    fun extractSdkIfNeeded(project: Project): Home {
        // wait till unpack task is complete
        return runBlocking {
            if (sdkUnpackDeferred.isActive) {
                withBackgroundProgress(project, "Unpacking RoboVm SDK...", cancellable = false) {
                    try {
                        val roboVmHome = sdkUnpackDeferred.await()
                        if (!roboVmHome.isDev) {
                            RoboVmPlugin.logInfo(
                                project,
                                "Installed RoboVM SDK %s to %s",
                                Version.getCompilerVersion(),
                                roboVmHome.homeDir.absolutePath
                            )
                        }
                        roboVmHome
                    } catch (e: Exception) {
                        RoboVmPlugin.logError(project, e.message)
                        throw e
                    }
                }
            } else sdkUnpackDeferred.await()
        }
    }

    /**
     * Extracts embedded to jar (relative to RoboVmPlugin.class) archive to specified destination folder
     * @return true if files in destination folder where changed
     */
    private fun extractSdk(dest: File): Boolean {
        val archive = "robovm-dist"
        val executableModeBits = (1 shl 0) or (1 shl 3) or (1 shl 6) // mode 0111
        try {
            TarArchiveInputStream(GZIPInputStream(RoboVmPlugin::class.java.getResourceAsStream("/$archive"))).use { tarIs ->
                var filesWereUpdated = false
                whileNotNull({ tarIs.nextEntry }) { entry ->
                    val f = File(dest, entry.name)
                    if (entry.isDirectory) {
                        RoboFileUtils.mkdirs(f)
                    } else {
                        // skip extracting if file looks to be same as in archive (ts and size matches)
                        if (f.exists() && f.lastModified() == entry.lastModifiedDate.time && f.length() == entry.size) {
                            return@whileNotNull
                        }
                        RoboFileUtils.mkdirs(f.parentFile)
                        FileOutputStream(f).use { out ->
                            IOUtils.copy(tarIs, out)
                        }
                        // set last modification time stamp as it was inside tar otherwise
                        // robovm will see new time stamp and will rebuild all classes that were inside jar
                        RoboFileUtils.setLastModified(f, entry.lastModifiedDate.time)

                        // set executable flag if it was in tar
                        if ((entry.mode and executableModeBits) != 0)
                            RoboFileUtils.setExecutable(f, true)

                        // mark that there was a change to SDK files
                        filesWereUpdated = true
                    }
                }

                return filesWereUpdated
            }
        } catch (t: Throwable) {
            throw RuntimeException("Couldn't extract SDK to " + dest.absolutePath, t)
        }
    }

    private inline fun <T> whileNotNull(predicate: () -> T?, action: (T) -> Unit) {
        while(true)
            predicate()?.let(action) ?: return
    }
}