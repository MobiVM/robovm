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
package org.robovm.idea

import org.robovm.compiler.Version
import org.robovm.compiler.config.Config
import java.io.File

object RoboVmLocations {
    /**
     * RoboVm home: not validated to allow SDK extraction routine to work with dev status
     * (and not unpack files when not required)
     */
    @JvmStatic
    val roboVmHome: Config.Home by lazy {
        Config.Home.suggestDevHome() ?: Config.Home(sdkHome, false)
    }

    /**
     * SDK home = ~/.robovm-sdks/robovm-$version
     */
    @JvmStatic
    val sdkHome: File by lazy {
        File(sdkHomeBase, "robovm-" + Version.getCompilerVersion())
    }

    /**
     * Location for SDKs
     * - SDK will be unpacked here;
     * - used when running in non-dev mode
     */
    @JvmStatic
    val sdkHomeBase: File by lazy {
        File(System.getProperty("user.home"), ".robovm-sdks")
    }


    /**
     * Location for RoboVM cache files
     */
    @JvmStatic
    val cacheDir: File by lazy {
        File(System.getProperty("user.home"), ".robovm/cache")
    }
}