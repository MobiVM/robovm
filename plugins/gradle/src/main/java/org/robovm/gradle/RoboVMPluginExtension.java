/*
 * Copyright (C) 2014 RoboVM AB.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.gradle;

import org.gradle.api.Project;

/**
 *
 * @author Junji Takakura
 */
public class RoboVMPluginExtension {

    public static final String NAME = "robovm";
    private final Project project;
    private String propertiesFile;
    private String configFile;
    private String iosSignIdentity;
    private String iosProvisioningProfile;
    private String iosSimulatorSdk;
    private String stdoutFifo;
    private String stderrFifo;
    private String os;
    private String arch;
    private boolean iosSkipSigning = false;
    private boolean debug = false;
    private int debugPort = -1;
    private boolean skipLaunch = false;
    private boolean skipLinking = false;
    private boolean enableBitcode = false;
    private String archs;
    private String installDir;    
    private String cacheDir;
    private String keychainPassword;
    private String keychainPasswordFile;
    private boolean dumpIntermediates = false;

    public RoboVMPluginExtension(Project project) {
        this.project = project;
    }

    public Project getProject() {
        return project;
    }

    public String getPropertiesFile() {
        return propertiesFile;
    }

    public void setPropertiesFile(String propertiesFile) {
        this.propertiesFile = propertiesFile;
    }

    public String getConfigFile() {
        return configFile;
    }

    public void setConfigFile(String configFile) {
        this.configFile = configFile;
    }

    public String getIosSignIdentity() {
        return project.hasProperty("robovm.iosSignIdentity") 
                ? project.getProperties().get("robovm.iosSignIdentity").toString() 
                : iosSignIdentity;
    }

    public void setIosSignIdentity(String iosSignIdentity) {
        this.iosSignIdentity = iosSignIdentity;
    }

    public String getIosProvisioningProfile() {
        return project.hasProperty("robovm.iosProvisioningProfile") 
                ? project.getProperties().get("robovm.iosProvisioningProfile").toString() 
                : iosProvisioningProfile;
    }

    public void setIosProvisioningProfile(String iosProvisioningProfile) {
        this.iosProvisioningProfile = iosProvisioningProfile;
    }

    public String getIosSimulatorSdk() {
        return project.hasProperty("robovm.iosSimulatorSdk") 
                ? project.getProperties().get("robovm.iosSimulatorSdk").toString() 
                : iosSimulatorSdk;
    }

    public void setIosSimulatorSdk(String iosSimulatorSdk) {
        this.iosSimulatorSdk = iosSimulatorSdk;
    }

    public boolean isIosSkipSigning() {
        return project.hasProperty("robovm.iosSkipSigning") 
                ? Boolean.parseBoolean(project.getProperties().get("robovm.iosSkipSigning").toString())
                : iosSkipSigning;
    }

    public void setIosSkipSigning(boolean iosSkipSigning) {
        this.iosSkipSigning = iosSkipSigning;
    }

    public String getOs() {
        return project.hasProperty("robovm.os") ? project.getProperties().get("robovm.os").toString() : os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getArch() {
        return project.hasProperty("robovm.arch") ? project.getProperties().get("robovm.arch").toString() : arch;
    }

    public void setArch(String arch) {
        this.arch = arch;
    }
    
    public boolean isDebug() {
        return project.hasProperty("robovm.debug") 
                ? Boolean.parseBoolean(project.getProperties().get("robovm.debug").toString()) 
                : debug;
    }
    
    public void setDebug(boolean debug) {
        this.debug = debug;
    }

    public boolean isSkipLaunch() {
        return project.hasProperty("robovm.skipLaunch")
                ? Boolean.parseBoolean(project.getProperties().get("robovm.skipLaunch").toString())
                : skipLaunch;
    }

    public void setSkipLaunch(boolean skipLaunch) {
        this.skipLaunch = skipLaunch;
    }
    
    public boolean isSkipLinking() {
        return project.hasProperty("robovm.skipLinking")
                ? Boolean.parseBoolean(project.getProperties().get("robovm.skipLinking").toString())
                : skipLinking;
    }

    public void setSkipLinking(boolean skipLinking) {
        this.skipLinking = skipLinking;
    }

    public boolean isEnableBitcode() {
        return project.hasProperty("robovm.enableBitcode")
                ? Boolean.parseBoolean(project.getProperties().get("robovm.enableBitcode").toString())
                : enableBitcode;
    }

    public void setEnableBitcode(boolean enableBitcode) {
        this.enableBitcode = enableBitcode;
    }
    
    public int getDebugPort() {
        return project.hasProperty("robovm.debugPort") 
                ? Integer.parseInt(project.getProperties().get("robovm.debugPort").toString()) 
                : debugPort;
    }
    
    public void setDebugPort(int debugPort) {
        this.debugPort = debugPort;
    }
    
    public String getArchs() {
        if (project.hasProperty("robovm.ipaArchs")) {
            // Kept for backwards compatibility
            return project.getProperties().get("robovm.ipaArchs").toString();
        }
        if (project.hasProperty("robovm.archs")) {
            return project.getProperties().get("robovm.archs").toString();
        }
        return archs;
    }
    
    public void setArchs(String ipaArchs) {
        this.archs = ipaArchs;
    }

    public String getInstallDir() {
        return project.hasProperty("robovm.installDir") ? project.getProperties().get("robovm.installDir").toString() : installDir;
    }

    public void setInstallDir(String installDir) {
        this.installDir = installDir;
    }
    
    public String getLicenseKey() {
        return project.hasProperty("robovm.licenseKey") ? project.getProperties().get("robovm.licenseKey").toString() : null;
    }
    
    public void setCachedir(String cacheDir) {
        this.cacheDir = cacheDir;
    }
    
    public String getCacheDir() {
        return project.hasProperty("robovm.cacheDir") ? project.getProperties().get("robovm.cacheDir").toString() : null;
    }
    
    public String getKeychainPassword() {
        return project.hasProperty("robovm.keychainPassword") ? project.getProperties().get("robovm.keychainPassword").toString() : keychainPassword;
    }
    
    public void setKeychainPassword(String keychainPassword) {
        this.keychainPassword = keychainPassword;
    }
    
    public String getKeychainPasswordFile() {
        return project.hasProperty("robovm.keychainPasswordFile") ? project.getProperties().get("robovm.keychainPasswordFile").toString() : keychainPasswordFile;
    }
    
    public void setKeychainPasswordFile(String keychainPasswordFile) {
        this.keychainPasswordFile = keychainPasswordFile;
    }

	public boolean isDumpIntermediates() {
		return dumpIntermediates;
	}

	public void setDumpIntermediates(boolean dumpIntermediates) {
		this.dumpIntermediates = dumpIntermediates;
	}
}
