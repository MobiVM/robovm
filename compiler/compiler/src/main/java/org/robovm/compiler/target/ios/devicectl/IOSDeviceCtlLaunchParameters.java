/*
 * Copyright (C) 2025 The MobiVM Contributors
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
 */package org.robovm.compiler.target.ios.devicectl;

import org.robovm.compiler.target.LaunchParameters;
import org.robovm.compiler.target.ios.IIOSLaunchParameters;
import org.robovm.compiler.target.ios.IOSTarget;

/**
 * {@link LaunchParameters} implementation used by {@link IOSTarget} when
 * launching on device using `devicectl` tool
 */
public class IOSDeviceCtlLaunchParameters extends LaunchParameters implements IIOSLaunchParameters {
    private String deviceId;

    public String getDeviceId() {
        return deviceId;
    }
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId != null && !deviceId.isEmpty() ? deviceId : null;
    }
}
