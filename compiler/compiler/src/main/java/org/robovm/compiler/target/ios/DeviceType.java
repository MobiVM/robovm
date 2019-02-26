/*
 * Copyright (C) 2013 RoboVM AB
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
package org.robovm.compiler.target.ios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.robovm.compiler.config.Arch;
import org.robovm.compiler.log.Logger;
import org.robovm.compiler.util.Executor;

/**
 * Simulator device types, consisting of the device type id and SDK version as
 * listed by xcrun simctl devices -j list.
 */
public class DeviceType implements Comparable<DeviceType> {
    public static final String PREFIX = "com.apple.CoreSimulator.SimDeviceType.";
    public static final String IOS_VERSION_PREFIX = "com.apple.CoreSimulator.SimRuntime.iOS-";
    public static final String PREFERRED_IPHONE_SIM_NAME = "iPhone 6";
    public static final String PREFERRED_IPAD_SIM_NAME = "iPad Air";
    
    public static final String[] ONLY_32BIT_DEVICES = {"iPhone 4", "iPhone 4s", "iPhone 5", "iPhone 5c", "iPad 2"};

    public static enum DeviceFamily {
        iPhone,
        iPad
    }

    private final String deviceName;
    private final String udid;
    private final String state;
    private final SDK sdk;
    private final Set<Arch> archs;

    DeviceType(String deviceName, String udid, String state, SDK sdk, Set<Arch> archs) {
        this.deviceName = deviceName;
        this.udid = udid;
        this.state = state;
        this.sdk = sdk;
        this.archs = archs;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public SDK getSdk() {
        return sdk;
    }

    public Set<Arch> getArchs() {
        return Collections.unmodifiableSet(archs);
    }

    /**
     * @return id as understood by the AppCompiler -simdevicetype flag
     */
    public String getSimpleDeviceTypeId() {
        return getSimpleDeviceName() + ", " + sdk.getVersion();
    }

    public String getSimpleDeviceName() {
        return deviceName + " (" + udid + ")";
    }

    public DeviceFamily getFamily() {
        if (deviceName.contains("iPhone")) {
            return DeviceFamily.iPhone;
        } else {
            return DeviceFamily.iPad;
        }
    }
    
    public String getUdid() {
		return udid;
	}
    
    public String getState() {
    	return state;
    }

    public static List<DeviceType> listDeviceTypes() {
        try {
        	List<SDK> sdks = SDK.listSimulatorSDKs();
        	Map<String, SDK> sdkMap = new HashMap<>();
        	for (SDK sdk : sdks) {
        		sdkMap.put(sdk.getVersion(), sdk);
        	}
        	
            String capture = new Executor(Logger.NULL_LOGGER, "xcrun").args(
                    "simctl", "list", "devices", "-j").execCapture();
            List<DeviceType> types = new ArrayList<DeviceType>();
            
            JSONParser parser = new JSONParser();
            JSONObject deviceList = (JSONObject)((JSONObject) parser.parse(capture)).get("devices");
            
            Iterator iter=deviceList.entrySet().iterator();
            while(iter.hasNext()){
    			Map.Entry entry=(Map.Entry)iter.next();
    			String sdkMapKey = entry.getKey().toString();
    			if (sdkMapKey.startsWith(IOS_VERSION_PREFIX)) {
    			    // com.apple.CoreSimulator.SimRuntime.iOS-
                    sdkMapKey = sdkMapKey.replace(IOS_VERSION_PREFIX, "").replace('-', '.');
                } else if (sdkMapKey.startsWith("iOS ")) {
                    sdkMapKey = sdkMapKey.replace("iOS ","");
                } else {
    			    // not iOS
    			    continue;
                }
    			JSONArray devices = (JSONArray) entry.getValue();
    			for (Object obj : devices) {
    				JSONObject device = (JSONObject) obj;
    				SDK sdk = sdkMap.get(sdkMapKey);
    				final String deviceName = device.get("name").toString();
    				
    				if (!device.get("availability").toString().contains("unavailable") && sdk != null) {
    					Set<Arch> archs = new HashSet<>();
    					archs.add(Arch.x86);
    					if (!Arrays.asList(ONLY_32BIT_DEVICES).contains(deviceName)) {
    						archs.add(Arch.x86_64);
    					}

    					types.add(new DeviceType(deviceName, device.get("udid").toString(), 
    							device.get("state").toString(), sdk, archs));
    				}
    			}
            }

            // Sort. Make sure that devices that have an id which is a prefix of
            // another id comes before in the list.
            Collections.sort(types);
            return types;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int compareTo(DeviceType that) {
        int c = this.sdk.compareTo(that.sdk);
        if (c == 0) {
            c = this.getFamily().compareTo(that.getFamily());
            if (c == 0) {
                c = this.deviceName.compareToIgnoreCase(that.deviceName);
            }
        }
        return c;
    }

    private static List<DeviceType> filter(List<DeviceType> deviceTypes, Arch arch,
            DeviceFamily family, String deviceName, String sdkVersion) {

        deviceName = deviceName == null ? null : deviceName.toLowerCase();

        List<DeviceType> result = new ArrayList<>();
        for (DeviceType type : deviceTypes) {
            if (arch == null || type.getArchs().contains(arch)) {
                if (family == null || family == type.getFamily()) {
                    if (deviceName == null || type.getDeviceName().toLowerCase().contains(deviceName)) {
                        if (sdkVersion == null || type.getSdk().getVersion().equals(sdkVersion)) {
                            result.add(type);
                        }
                    }
                }
            }
        }
        return result;
    }

    public static List<String> getSimpleDeviceTypeIds() {
        List<String> result = new ArrayList<>();
        for (DeviceType type : listDeviceTypes()) {
            result.add(type.getSimpleDeviceTypeId());
        }
        return result;
    }

    public static DeviceType getDeviceType(String displayName) {
        List<DeviceType> types = listDeviceTypes();
        if (displayName == null) {
            return null;
        }
        for (DeviceType type : types) {
            if (displayName.equals(type.getSimpleDeviceTypeId())) {
                return type;
            }
        }
        return null;
    }

    public static DeviceType getBestDeviceType() {
        return getBestDeviceType(null, null, null, null);
    }

    public static DeviceType getBestDeviceType(DeviceFamily family) {
        return getBestDeviceType(null, family, null, null);
    }

    /**
     * Returns the best {@link DeviceType} matching the parameters. If multiple
     * device types match the parameters the first one with the highest SDK
     * number will be returned. If no device name and no {@link DeviceFamily} is
     * specified this method will default to {@link DeviceFamily#iPhone}.
     */
    public static DeviceType getBestDeviceType(Arch arch, DeviceFamily family,
            String deviceName, String sdkVersion) {

        if (deviceName == null && family == null) {
            family = DeviceFamily.iPhone;
        }
        String preferredDeciveName = PREFERRED_IPHONE_SIM_NAME;
        if (family == DeviceFamily.iPad) {
            preferredDeciveName = PREFERRED_IPAD_SIM_NAME;
        }


        // set simulator types and find one that matches version and name
        DeviceType exact = null;
        DeviceType bestDefault = null;
        DeviceType bestAny = null;
        List<DeviceType> devices = filter(listDeviceTypes(), arch, family, deviceName, sdkVersion);
        for (DeviceType type : devices) {
            if (deviceName != null && type.getDeviceName().equals(deviceName)) {
                // match for specified device
                if (exact == null || (sdkVersion == null && type.getSdk().getVersionCode() >  exact.getSdk().getVersionCode()))
                    exact = type;
            } else if (deviceName == null && type.getDeviceName().equals(preferredDeciveName)) {
                // match for preferable device
                if (bestDefault == null || (sdkVersion == null && type.getSdk().getVersionCode() >  bestDefault.getSdk().getVersionCode()))
                    bestDefault = type;
            } else {
                // just pick one with best SDK version
                if (bestAny == null || (sdkVersion == null && type.getSdk().getVersionCode() >  bestAny.getSdk().getVersionCode()))
                    bestAny = type;
            }
        }

        DeviceType best = exact;
        if (best == null) {
            best = bestDefault != null ? bestDefault : bestAny;
        }
        if (best == null) {
            throw new IllegalArgumentException("Unable to find a matching device "
                    + "[arch=" + arch + ", family=" + family
                    + ", name=" + deviceName + ", sdk=" + sdkVersion + "]");
        }
        return best;
    }

    @Override
    public String toString() {
        return "DeviceType [deviceName=" + deviceName + ", sdk=" + sdk + ", archs=" + archs + "]";
    }

	
}
