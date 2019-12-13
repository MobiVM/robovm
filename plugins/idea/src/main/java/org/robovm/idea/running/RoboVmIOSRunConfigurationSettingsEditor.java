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
package org.robovm.idea.running;

import com.intellij.openapi.module.Module;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.options.SettingsEditor;
import org.jetbrains.annotations.NotNull;
import org.robovm.compiler.config.Arch;
import org.robovm.compiler.target.ios.DeviceType;
import org.robovm.compiler.target.ios.IOSTarget;
import org.robovm.compiler.target.ios.ProvisioningProfile;
import org.robovm.compiler.target.ios.SigningIdentity;
import org.robovm.idea.RoboVmPlugin;

import javax.swing.*;
import java.util.Comparator;
import java.util.List;

public class RoboVmIOSRunConfigurationSettingsEditor extends SettingsEditor<RoboVmRunConfiguration> {
    private static final Arch[] DEVICE_ARCHS = {Arch.thumbv7, Arch.arm64};
    private static final Arch[] SIMULATOR_ARCHS = {Arch.x86, Arch.x86_64};

    public static final String SKIP_SIGNING = "Don't sign";
    public static final String AUTO_SIGNING_IDENTITY = "Auto (matches 'iPhone Developer|iOS Development')";
    public static final String AUTO_PROVISIONING_PROFILE = "Auto";

    private JPanel panel;
    private JTabbedPane tabbedPane1;
    private JComboBox<String> module;
    private JRadioButton attachedDeviceRadioButton;
    private JRadioButton simulatorRadioButton;
    private JComboBox<SimTypeDecorator> simType;
    private JComboBox<String> signingIdentity;
    private JComboBox<String> provisioningProfile;
    private JComboBox<Arch> simArch;
    private JComboBox<Arch> deviceArch;
    private JTextArea args;

    @Override
    protected void resetEditorFrom(@NotNull RoboVmRunConfiguration config) {
        populateControls(config);
    }

    @Override
    protected void applyEditorTo(@NotNull RoboVmRunConfiguration config) throws ConfigurationException {
        if (module.getSelectedItem() == null)
            throw new ConfigurationException("RoboVM module is not specified!");
        config.setModuleName(module.getSelectedItem().toString());

        // device specific
        if (attachedDeviceRadioButton.isSelected() || simType.getSelectedItem() == null)
            // if there is no simulator any simulator -- save as device target
            config.setTargetType(RoboVmRunConfiguration.TargetType.Device);
        else
            config.setTargetType(RoboVmRunConfiguration.TargetType.Simulator);
        config.setDeviceArch((Arch) deviceArch.getSelectedItem());
        config.setSigningIdentity((String) signingIdentity.getSelectedItem());
        config.setProvisioningProfile((String) provisioningProfile.getSelectedItem());

        // simulator related settings
        SimTypeDecorator selectedSimType = (SimTypeDecorator) simType.getSelectedItem();
        config.setSimArch((Arch) simArch.getSelectedItem());
        config.setSimulatorName(selectedSimType != null ? selectedSimType.getType().getDeviceName() : null);
        config.setSimulatorSdk(selectedSimType != null ? selectedSimType.getType().getVersion().versionCode : 0);

        config.setArguments(args.getText());
    }

    @NotNull
    @Override
    protected JComponent createEditor() {
        return panel;
    }

    private void populateControls(@NotNull RoboVmRunConfiguration config) {
        updateModuleConfig(config);
        updateDeviceConfig(config);
        updateSimulatorConfig(config);

        attachedDeviceRadioButton.setSelected(config.getTargetType() == RoboVmRunConfiguration.TargetType.Device || simType.getItemCount() == 0);
        args.setText(config.getArguments());
    }

    private void updateModuleConfig(RoboVmRunConfiguration config) {
        // populate with RoboVM Sdk modules
        this.module.removeAllItems();
        List<Module> roboVmModules = RoboVmPlugin.getRoboVmModules(config.getProject(), IOSTarget.TYPE);
        roboVmModules.sort(Comparator.comparing(Module::getName));
        for (Module module : roboVmModules) {
            this.module.addItem(module.getName());
            if (module.getName().equals(config.getModuleName())) {
                this.module.setSelectedIndex(this.module.getItemCount() - 1);
                config.setModule(module);
            }
        }
    }

    private void updateSimulatorConfig(RoboVmRunConfiguration config) {
        simType.removeAllItems();
        simArch.removeAllItems();

        // check if there is any known simulator, if there isn't any -- just disable everything and return
        List<DeviceType> simDeviceTypes = DeviceType.listDeviceTypes();
        simType.setEnabled(!simDeviceTypes.isEmpty());
        simArch.setEnabled(!simDeviceTypes.isEmpty());
        simulatorRadioButton.setEnabled(!simDeviceTypes.isEmpty());
        if (simDeviceTypes.isEmpty())
            return;

        // set simulator types and find one that matches version and name
        int exactSimVersonMatchIdx = -1;
        int bestSimNameMatchIdx = -1, bestSimNameMatchVersion = -1;
        int bestDefaultSimMatchIdx = -1, bestDefaultSimMatchVersion = -1;
        String simulatorName = config.getSimulatorName();
        if (simulatorName == null)
            simulatorName = "";
        for (DeviceType type : simDeviceTypes) {
            simType.addItem(new SimTypeDecorator(type));
            if (type.getDeviceName().equals(simulatorName) && type.getVersion().versionCode == config.getSimulatorSdk()) {
                exactSimVersonMatchIdx = simType.getItemCount() - 1;
            } else if (type.getDeviceName().equals(simulatorName) && type.getVersion().versionCode > bestSimNameMatchVersion) {
                bestSimNameMatchIdx = simType.getItemCount() - 1;
                bestSimNameMatchVersion = type.getVersion().versionCode;
            } else if (simulatorName.isEmpty() && type.getDeviceName().contains("iPhone-6") &&
                    !type.getDeviceName().contains("Plus") && type.getVersion().versionCode > bestDefaultSimMatchVersion) {
                bestDefaultSimMatchIdx = simType.getItemCount() - 1;
                bestDefaultSimMatchVersion = type.getVersion().versionCode;
            }
        }
        if (exactSimVersonMatchIdx < 0) {
            // if exact match is not found use name match or default simulator
            if (bestSimNameMatchIdx >= 0)
                exactSimVersonMatchIdx = bestSimNameMatchIdx;
            else if (bestDefaultSimMatchIdx >= 0)
                exactSimVersonMatchIdx = bestDefaultSimMatchIdx;
            else exactSimVersonMatchIdx = simType.getItemCount() - 1;
        }
        if (exactSimVersonMatchIdx >= 0)
            simType.setSelectedIndex(exactSimVersonMatchIdx);

        // set default arch for selected simulator
        SimTypeDecorator wrapper = (SimTypeDecorator) simType.getSelectedItem();
        assert wrapper != null;
        for (Arch arch : SIMULATOR_ARCHS) {
            for (Arch otherArch : wrapper.getType().getArchs()) {
                if (arch == otherArch) {
                    simArch.addItem(otherArch);
                    if (otherArch == config.getSimArch()) {
                        simArch.setSelectedItem(otherArch);
                    } else if (config.getSimArch() == null && otherArch == Arch.x86_64) {
                        simArch.setSelectedItem(otherArch);
                    }
                }
            }
        }

        // set a listener that populates the arch of a selected
        // sim properly.
        simType.addItemListener(e -> updateSimArchs((SimTypeDecorator) e.getItem()));
    }

    private void updateSimArchs(SimTypeDecorator wrapper) {
        simArch.removeAllItems();
        for (Arch arch : SIMULATOR_ARCHS) {
            for (Arch otherArch : wrapper.getType().getArchs()) {
                if (arch == otherArch) {
                    simArch.addItem(otherArch);
                    if (otherArch == Arch.x86_64) {
                        simArch.setSelectedItem(otherArch);
                    }
                    break;
                }
            }
        }
    }

    private void updateDeviceConfig(RoboVmRunConfiguration config) {
        deviceArch.removeAllItems();
        signingIdentity.removeAllItems();
        provisioningProfile.removeAllItems();

        // populate signing identities
        signingIdentity.addItem(AUTO_SIGNING_IDENTITY);
        signingIdentity.addItem(SKIP_SIGNING);
        for (SigningIdentity identity : SigningIdentity.list()) {
            signingIdentity.addItem(identity.getName());
        }
        // first select auto,  then try to apply one from config (might do nothing if not in the list)
        signingIdentity.setSelectedIndex(0);
        String selectedIdentity = config.getSigningIdentity();
        if (selectedIdentity != null && !selectedIdentity.isEmpty())
            signingIdentity.setSelectedItem(selectedIdentity);

        // populate provisioning profiles
        provisioningProfile.addItem(AUTO_PROVISIONING_PROFILE);
        List<ProvisioningProfile> profiles = ProvisioningProfile.list();
        for (ProvisioningProfile profile : profiles) {
            provisioningProfile.addItem(profile.getName());
        }
        // first select auto profile, then try to apply one from config (might do nothing if not in the list)
        provisioningProfile.setSelectedIndex(0);
        String selectedProfile = config.getProvisioningProfile();
        if (selectedProfile != null && !selectedProfile.isEmpty())
            provisioningProfile.setSelectedItem(selectedProfile);

        // populate device archs
        for (Arch arch : DEVICE_ARCHS) {
            deviceArch.addItem(arch);
        }
        deviceArch.setSelectedIndex(0);
        if (config.getDeviceArch() != null) {
            deviceArch.setSelectedItem(config.getDeviceArch());
        }
    }

    private static class SimTypeDecorator {
        private final DeviceType type;

        public SimTypeDecorator(@NotNull DeviceType type) {
            this.type = type;
        }

        public @NotNull
        DeviceType getType() {
            return type;
        }

        @Override
        public String toString() {
            return type.getSimpleDeviceName() + " - " + type.getVersion();
        }
    }
}
