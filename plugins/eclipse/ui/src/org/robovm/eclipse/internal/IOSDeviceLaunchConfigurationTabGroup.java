/*
 * Copyright (C) 2012 RoboVM AB
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
package org.robovm.eclipse.internal;

import java.util.Arrays;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.CommonTab;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;
import org.eclipse.debug.ui.sourcelookup.SourceLookupTab;
import org.eclipse.jdt.debug.ui.launchConfigurations.JavaClasspathTab;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.robovm.compiler.config.Arch;
import org.robovm.compiler.target.ios.ProvisioningProfile;
import org.robovm.compiler.target.ios.SigningIdentity;
import org.robovm.eclipse.RoboVMPlugin;

/**
 * @author niklas
 *
 */
public class IOSDeviceLaunchConfigurationTabGroup extends AbstractLaunchConfigurationTabGroup {

    @Override
    public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
        setTabs(new ILaunchConfigurationTab[] {
                new DeviceTab(),
                new IOSArgumentsTab(),
                new JavaClasspathTab(),
                new SourceLookupTab(),
                new IOSEnvironmentTab(),
                new CommonTab()
        });
    }

    public static class DeviceTab extends RoboVMTab {
        private static final Arch[] POSSIBLE_ARCH_VALUES = RoboVMPlugin.IOS_DEVICE_ARCH_VALUES;
        private static final String[] POSSIBLE_ARCH_NAMES = RoboVMPlugin.IOS_DEVICE_ARCH_NAMES;

        private List<SigningIdentity> signingIdentities;
        private List<ProvisioningProfile> provisioningProfiles;
        private Combo signingIdCombo;
        private Combo profileCombo;
        private Combo archCombo;
        
        public DeviceTab() {
        }
        
        private String[] readSigningIdentities() {
            String[] result = new String[signingIdentities.size() + 2];
            int i = 0;
            result[i++] = "Auto (matches 'iPhone Developer|iOS Development')";
            result[i++] = "Don't sign";
            for (SigningIdentity sid : signingIdentities) {
                result[i++] = sid.getName();
            }
            return result;
        }
        
        private String[] readProvisioningProfiles() {
            String[] result = new String[provisioningProfiles.size() + 1];
            int i = 0;
            result[i++] = "Auto";
            for (ProvisioningProfile p : provisioningProfiles) {
                String appId = p.getEntitlements().objectForKey("application-identifier").toString();
                result[i++] = p.getName() + " (" + appId + ")";
            }
            return result;
        }
        
        @Override
        public void createControl(Composite parent) {
            Composite root = createRoot(parent);
            createProjectEditor(root);
            createDeviceEditor(root);
            setControl(root);
        }
        
        protected void createDeviceEditor(Composite parent) {
            Group group = new Group(parent, SWT.NONE);
            group.setText("iOS Device:");
            group.setFont(group.getFont());
            group.setLayout(new GridLayout(2, false));
            group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
            ((GridData) group.getLayoutData()).horizontalSpan = 1;
            ((GridLayout) group.getLayout()).verticalSpacing = 0;
            
            Label signingIdLabel = new Label(group, SWT.NONE);
            signingIdLabel.setFont(group.getFont());
            signingIdLabel.setText("Signing identity:");
            signingIdLabel.setLayoutData(new GridData(GridData.BEGINNING, GridData.CENTER, false, false));

            signingIdCombo = new Combo(group, SWT.READ_ONLY | SWT.BORDER);
            signingIdCombo.setLayoutData(new GridData(GridData.FILL, GridData.CENTER, true, false));
            signingIdCombo.addSelectionListener(new SelectionAdapter() {
                @Override
                public void widgetSelected(SelectionEvent event) {
                    updateLaunchConfigurationDialog();
                }
            });

            Label profileLabel = new Label(group, SWT.NONE);
            profileLabel.setFont(group.getFont());
            profileLabel.setText("Provisioning profile:");
            profileLabel.setLayoutData(new GridData(GridData.BEGINNING, GridData.CENTER, false, false));

            profileCombo = new Combo(group, SWT.READ_ONLY | SWT.BORDER);
            profileCombo.setLayoutData(new GridData(GridData.FILL, GridData.CENTER, true, false));
            profileCombo.addSelectionListener(new SelectionAdapter() {
                @Override
                public void widgetSelected(SelectionEvent event) {
                    updateLaunchConfigurationDialog();
                }
            });

            Label archLabel = new Label(group, SWT.NONE);
            archLabel.setFont(group.getFont());
            archLabel.setText("Arch:");
            archLabel.setLayoutData(new GridData(GridData.BEGINNING, GridData.CENTER, false, false));
            
            archCombo = new Combo(group, SWT.READ_ONLY | SWT.BORDER);
            archCombo.setItems(POSSIBLE_ARCH_NAMES);
            archCombo.select(Arrays.asList(POSSIBLE_ARCH_VALUES).indexOf(IOSDeviceLaunchConfigurationDelegate.DEFAULT_ARCH));
            archCombo.setLayoutData(new GridData(GridData.FILL, GridData.CENTER, true, false));
            archCombo.addSelectionListener(new SelectionAdapter() {
                @Override
                public void widgetSelected(SelectionEvent event) {
                    updateLaunchConfigurationDialog();
                }
            });
            
            setControl(group);
        }

        @Override
        public void initializeFrom(ILaunchConfiguration config) {
            super.initializeFrom(config);

            signingIdentities = SigningIdentity.list();
            provisioningProfiles = ProvisioningProfile.list();
            signingIdCombo.setItems(readSigningIdentities());
            signingIdCombo.select(0);
            profileCombo.setItems(readProvisioningProfiles());
            profileCombo.select(0);
            
            try {
                String v = config.getAttribute(IOSDeviceLaunchConfigurationDelegate.ATTR_IOS_DEVICE_SIGNING_ID, (String) null);
                if (IOSDeviceLaunchConfigurationDelegate.SIGNING_ID_SKIP_SIGNING.equals(v)) {
                    signingIdCombo.select(1);
                } else if (v != null) {
                    try {
                        SigningIdentity signingIdentity = SigningIdentity.find(signingIdentities, v);
                        int idx = signingIdentities.indexOf(signingIdentity);
                        signingIdCombo.select(idx + 2);
                    } catch (IllegalArgumentException e) {
                        // Ignore
                    }
                }
            } catch (CoreException e) {
                RoboVMPlugin.log(e);
            }
            try {
                String v = config.getAttribute(IOSDeviceLaunchConfigurationDelegate.ATTR_IOS_DEVICE_PROVISIONING_PROFILE, (String) null);
                if (v != null) {
                    try {
                        ProvisioningProfile profile = ProvisioningProfile.find(provisioningProfiles, v);
                        int idx = provisioningProfiles.indexOf(profile);
                        profileCombo.select(idx + 1);
                    } catch (IllegalArgumentException e) {
                        // Ignore
                    }
                }
            } catch (CoreException e) {
                RoboVMPlugin.log(e);
            }
            
            try {
                Arch v = Arch.valueOf(config.getAttribute(IOSDeviceLaunchConfigurationDelegate.ATTR_IOS_DEVICE_ARCH,
                        IOSDeviceLaunchConfigurationDelegate.DEFAULT_ARCH.toString()));
                int idx = Arrays.asList(POSSIBLE_ARCH_VALUES).indexOf(v);
                if (idx != -1) {
                    archCombo.select(idx);
                }
            } catch (Exception e) {
                RoboVMPlugin.log(e);
                archCombo.select(Arrays.asList(POSSIBLE_ARCH_VALUES).indexOf(IOSDeviceLaunchConfigurationDelegate.DEFAULT_ARCH));
            }

        }

        @Override
        public void performApply(ILaunchConfigurationWorkingCopy wc) {
            super.performApply(wc);
            
            int signingIdIndex = signingIdCombo.getSelectionIndex();
            String signingId = null;
            if (signingIdIndex == 1) {
                signingId = IOSDeviceLaunchConfigurationDelegate.SIGNING_ID_SKIP_SIGNING;
            } else if (signingIdIndex >= 2) {
                signingId = signingIdentities.get(signingIdIndex - 2).getFingerprint();
            }
            wc.setAttribute(IOSDeviceLaunchConfigurationDelegate.ATTR_IOS_DEVICE_SIGNING_ID, signingId);
            
            int profileIndex = profileCombo.getSelectionIndex();
            ProvisioningProfile profile = profileIndex == 0 ? null : provisioningProfiles.get(profileIndex - 1);
            wc.setAttribute(IOSDeviceLaunchConfigurationDelegate.ATTR_IOS_DEVICE_PROVISIONING_PROFILE, 
                    profile != null ? profile.getUuid() : null);

            Arch arch = POSSIBLE_ARCH_VALUES[archCombo.getSelectionIndex()];
            wc.setAttribute(IOSDeviceLaunchConfigurationDelegate.ATTR_IOS_DEVICE_ARCH, arch.toString());
        }

        @Override
        public void setDefaults(ILaunchConfigurationWorkingCopy wc) {
            super.setDefaults(wc);
            wc.setAttribute(IOSDeviceLaunchConfigurationDelegate.ATTR_IOS_DEVICE_SIGNING_ID, (String) null);
            wc.setAttribute(IOSDeviceLaunchConfigurationDelegate.ATTR_IOS_DEVICE_PROVISIONING_PROFILE, (String) null);
            wc.setAttribute(IOSDeviceLaunchConfigurationDelegate.ATTR_IOS_DEVICE_ARCH, 
                    IOSDeviceLaunchConfigurationDelegate.DEFAULT_ARCH.toString());
        }
        
    }
}
