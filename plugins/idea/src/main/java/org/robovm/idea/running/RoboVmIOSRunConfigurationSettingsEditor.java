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

import com.dd.plist.*;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.options.SettingsEditor;
import com.intellij.ui.JBColor;
import org.jetbrains.annotations.NotNull;
import org.robovm.compiler.config.Arch;
import org.robovm.compiler.config.Config;
import org.robovm.compiler.config.CpuArch;
import org.robovm.compiler.target.ios.DeviceType;
import org.robovm.compiler.target.ios.IOSTarget;
import org.robovm.compiler.target.ios.ProvisioningProfile;
import org.robovm.compiler.target.ios.SigningIdentity;
import org.robovm.compiler.util.InfoPList;
import org.robovm.idea.RoboVmPlugin;
import org.robovm.idea.running.RoboVmRunConfiguration.EntryType;
import org.robovm.libimobiledevice.IDevice;
import org.xml.sax.SAXException;

import javax.swing.*;
import javax.xml.parsers.ParserConfigurationException;
import java.awt.*;
import java.io.IOException;
import java.text.ParseException;
import java.util.*;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static org.robovm.idea.running.RoboVmRunConfiguration.AUTO_PROVISIONING_PROFILE;
import static org.robovm.idea.running.RoboVmRunConfiguration.AUTO_SIGNING_IDENTITY;

public class RoboVmIOSRunConfigurationSettingsEditor extends SettingsEditor<RoboVmRunConfiguration> {
    private static final CpuArch[] DEVICE_ARCHS = {CpuArch.arm64, CpuArch.thumbv7};
    private static final CpuArch[] SIMULATOR_ARCHS = {CpuArch.arm64, CpuArch.x86_64};

    public static final String AUTO_SIMULATOR_IPHONE_TITLE = "Auto (prefers '" + DeviceType.PREFERRED_IPHONE_SIM_NAME + "')";
    public static final String AUTO_SIMULATOR_IPAD_TITLE = "Auto (prefers '" + DeviceType.PREFERRED_IPAD_SIM_NAME + "')";


    private JPanel panel;
    private JTabbedPane tabbedPane1;
    private JComboBox<ModuleNameDecorator> module;
    private JLabel bundleLabel;
    private JRadioButton attachedDeviceRadioButton;
    private JRadioButton simulatorRadioButton;
    private JComboBox<SimTypeDecorator> simType;
    private JComboBox<SigningIdentityDecorator> signingIdentity;
    private JComboBox<ProvisioningProfileDecorator> provisioningProfile;
    private JComboBox<CpuArch> simArch;
    private JComboBox<CpuArch> deviceArch;
    private JTextArea args;
    private JCheckBox pairedWatch;
    private JComboBox<IDeviceDecorator> targetDeviceUDID;
    private JPanel errorsPanel;
    private JTextPane errors;

    // copy of data that is time consuming to fetch (fetched only once when dialog is created)
    private List<ModuleNameDecorator> roboVmModules;
    private List<SimTypeDecorator> simDeviceTypes;
    private final SimTypeDecorator simulatorAutoIPhone = new SimTypeDecorator(AUTO_SIMULATOR_IPHONE_TITLE, EntryType.AUTO);
    private final SimTypeDecorator simulatorAutoIPad = new SimTypeDecorator(AUTO_SIMULATOR_IPAD_TITLE, EntryType.AUTO2);
    private List<ProvisioningProfileDecorator> provisioningProfiles;
    private final ProvisioningProfileDecorator provisioningProfileAuto = new ProvisioningProfileDecorator(AUTO_PROVISIONING_PROFILE, EntryType.AUTO);
    private List<SigningIdentityDecorator> signingIdentities;
    private final SigningIdentityDecorator signingIdentityAuto = new SigningIdentityDecorator(AUTO_SIGNING_IDENTITY, EntryType.AUTO);

    private List<IDeviceDecorator> connectedDevices;
    private boolean moduleHasWatchApp;
    // true if editor internally updating data and listeners should ignore the events
    private boolean updatingData;

    private final ArrayList<String> provisioningProfileErrors = new ArrayList<>();
    private final ArrayList<String> signingIdentityErrors = new ArrayList<>();
    private final ArrayList<String> deviceIdentityErrors = new ArrayList<>();
    private IDevice.EventListener ideviceListener;

    @NotNull
    @Override
    protected JComponent createEditor() {
        // populate controls with stable data
        populateDeviceArch();
        populateSigningIdentities();
        populateProvisioningProfiles();
        populateDevices();
        populateSimulators();
        roboVmModules = null; // will be populated once modules list is known

        simType.addActionListener(e -> {
            if (!updatingData) {
                updateSimArchs((SimTypeDecorator) simType.getSelectedItem());
                updatePairedWatch(false, null);
            }
        });
        module.addActionListener(e -> {

            if (!updatingData) {
                updatePairedWatch(true, null);
            }

            checkProfilesCertsAndDeviceCompat();

        } );

        provisioningProfile.addActionListener(e -> {
            checkProfilesCertsAndDeviceCompat();
        });

        signingIdentity.addActionListener(e -> {
            checkProfilesCertsAndDeviceCompat();
        });


        ideviceListener = new IDevice.EventListener() {
            @Override
            public void deviceAdded(String udid) {
                populateDevices();
                checkProfilesCertsAndDeviceCompat();
            }

            @Override
            public void deviceRemoved(String udid) {
                populateDevices();
                checkProfilesCertsAndDeviceCompat();
            }
        };
        IDevice.addEventListener(ideviceListener);


        return panel;
    }

    @Override
    protected void resetEditorFrom(@NotNull RoboVmRunConfiguration config) {
        try {
            updatingData = true;
            module.setSelectedItem(getModuleFromConfig(config));
            simType.setSelectedItem(getSimulatorFromConfig(config));
            simArch.setSelectedItem(populateSimulatorArch((SimTypeDecorator) simType.getSelectedItem(), config.getSimulatorArch()));
            updatePairedWatch(true, config.simulatorLaunchWatch());

            deviceArch.setSelectedItem(config.getDeviceArch());
            signingIdentity.setSelectedItem(getSigningIdentityFromConfig(config));
            provisioningProfile.setSelectedItem(getProvisioningProfileFromConfig(config));
            targetDeviceUDID.setSelectedItem(config.getTargetDeviceUDID());
            attachedDeviceRadioButton.setSelected(config.getTargetType() == RoboVmRunConfiguration.TargetType.Device || simType.getItemCount() == 0);
            args.setText(config.getArguments());
        } finally {
            updatingData = false;
        }
    }

    @Override
    protected void applyEditorTo(@NotNull RoboVmRunConfiguration config) throws ConfigurationException {
        // validate all data
        if (module.getSelectedItem() == null)
            throw new ConfigurationException("RoboVM module is not specified!");
        if (simType.getSelectedItem() == null)
            throw buildConfigurationException("Simulator is not specified!", () -> simType.setSelectedItem(simulatorAutoIPhone));
        if (simArch.getSelectedItem() == null)
            throw buildConfigurationException("Simulator architecture is not specified!", () -> simArch.setSelectedIndex(0));
        if (deviceArch.getSelectedItem() == null)
            throw buildConfigurationException("Device architecture is not specified!", () -> deviceArch.setSelectedItem(Arch.arm64));
        if (signingIdentity.getSelectedItem() == null)
            throw buildConfigurationException("Signing identity is not specified!", () -> signingIdentity.setSelectedItem(signingIdentityAuto));
        if (provisioningProfile.getSelectedItem() == null)
            throw buildConfigurationException("Provisioning profile is not specified!", () -> provisioningProfile.setSelectedItem(provisioningProfileAuto));

        // save all data
        config.setModuleName(Decorator.from(module).name);
        config.setTargetType(attachedDeviceRadioButton.isSelected() ? RoboVmRunConfiguration.TargetType.Device : RoboVmRunConfiguration.TargetType.Simulator);
        // device related
        config.setDeviceArch((CpuArch) deviceArch.getSelectedItem());
        config.setSigningIdentityType(Decorator.from(signingIdentity).entryType);
        config.setSigningIdentity(Decorator.from(signingIdentity).id);
        config.setProvisioningProfileType(Decorator.from(provisioningProfile).entryType);
        config.setProvisioningProfile(Decorator.from(provisioningProfile).id);
        // TargetDeviceUDID is optional
        config.setTargetDeviceUDID(Decorator.idOrNullFrom(targetDeviceUDID));
        // simulator related
        config.setSimulatorArch((CpuArch) simArch.getSelectedItem());
        config.setSimulatorType(Decorator.from(simType).entryType);
        config.setSimulator(Decorator.from(simType).id);
        config.setSimulatorSdk(-1); // legacy, will not be used
        config.setArguments(args.getText());
        config.setSimulatorLaunchWatch(pairedWatch.isSelected());
    }

    private CpuArch populateSimulatorArch(SimTypeDecorator simulator, CpuArch arch) {
        CpuArch result = null;
        simArch.removeAllItems();
        if (simulator != null) {
            Set<CpuArch> simArches;
            if (simulator == simulatorAutoIPad || simulator == simulatorAutoIPhone){
                simArches = new HashSet<>();
                // auto simulator, use default OS arch (x86_64 or arm64 on m1) is allowed, if arch doesn't match -- override
                simArches.add(DeviceType.DEFAULT_HOST_ARCH);
                // also allow to have x86_64 on m1 to allow old projects without arm64 support to run on auto sim
                if (DeviceType.DEFAULT_HOST_ARCH == CpuArch.arm64)
                    simArches.add(CpuArch.x86_64);
            } else {
                simArches = simulator.data.getArchs().stream()
                        .map(Arch::getCpuArch)
                        .collect(Collectors.toSet());
            }
            for (CpuArch a : SIMULATOR_ARCHS) {
                if (simArches.contains(a)) {
                    simArch.addItem(a);
                    if (a == arch)
                        result = a;
                }
            }
        }

        return result;
    }

    private void populateDeviceArch() {
        deviceArch.removeAllItems();
        for (CpuArch arch : DEVICE_ARCHS)
            deviceArch.addItem(arch);
    }

    private void populateModules(@NotNull RoboVmRunConfiguration config) {
        if (roboVmModules != null)
            return;

        this.roboVmModules = RoboVmPlugin.getRoboVmModules(config.getProject(), IOSTarget.TYPE).stream()
                .map(ModuleNameDecorator::new)
                .collect(Collectors.toList());

        // populate with RoboVM Sdk modules
        this.module.removeAllItems();
        this.roboVmModules.forEach(m -> module.addItem(m));
    }

    private void populateSigningIdentities() {
        this.signingIdentities = SigningIdentity.list().stream()
                .map(SigningIdentityDecorator::new)
                .collect(Collectors.toList());

        signingIdentity.removeAllItems();
        signingIdentity.addItem(signingIdentityAuto);
        this.signingIdentities.forEach(t -> signingIdentity.addItem(t));
    }

    private void populateProvisioningProfiles() {
        this.provisioningProfiles = ProvisioningProfile.list().stream()
                .map(ProvisioningProfileDecorator::new)
                .collect(Collectors.toList());

        provisioningProfile.removeAllItems();
        provisioningProfile.addItem(provisioningProfileAuto);
        this.provisioningProfiles.forEach(t -> provisioningProfile.addItem(t));
    }

    private void populateDevices () {
        this.connectedDevices = Arrays.stream(IDevice.listUdids()).map(IDeviceDecorator::new).collect(Collectors.toList());

        targetDeviceUDID.removeAllItems();
        this.connectedDevices.forEach(d -> targetDeviceUDID.addItem(d));
    }

    private void populateSimulators() {
        this.simDeviceTypes = DeviceType.listDeviceTypes().stream()
                .map(SimTypeDecorator::new)
                .collect(Collectors.toList());

        simType.removeAllItems();
        simType.addItem(simulatorAutoIPhone);
        simType.addItem(simulatorAutoIPad);
        this.simDeviceTypes.forEach(t -> simType.addItem(t));
    }

    private ModuleNameDecorator getModuleFromConfig(RoboVmRunConfiguration config) {
        populateModules(config);

        // validate if module is known
        String name = config.getModuleName();
        return getMatchingDecorator(EntryType.ID, name, (ModuleNameDecorator) module.getSelectedItem(),
                null, null, roboVmModules);
    }

    private SimTypeDecorator getSimulatorFromConfig(RoboVmRunConfiguration config) {
        String name = config.getSimulator();
        return getMatchingDecorator(config.getSimulatorType(), name,
                (SimTypeDecorator) simType.getSelectedItem(),
                null, simulatorAutoIPhone, simulatorAutoIPad,
                simDeviceTypes,  t -> SimTypeDecorator.matchesName(t, config.getSimulator(), config.getSimulatorSdk()));
    }

    private SigningIdentityDecorator getSigningIdentityFromConfig(RoboVmRunConfiguration config) {
        String name = config.getSigningIdentity();
        return getMatchingDecorator(config.getSigningIdentityType(), name,
                (SigningIdentityDecorator) signingIdentity.getSelectedItem(),
                AUTO_SIGNING_IDENTITY, signingIdentityAuto, null,
                signingIdentities, t -> Decorator.matchesName(t, name));
    }

    private ProvisioningProfileDecorator getProvisioningProfileFromConfig(RoboVmRunConfiguration config) {
        String name = config.getProvisioningProfile();
        return getMatchingDecorator(config.getProvisioningProfileType(), name,
                (ProvisioningProfileDecorator) provisioningProfile.getSelectedItem(),
                AUTO_PROVISIONING_PROFILE, provisioningProfileAuto, null,
                provisioningProfiles, t -> Decorator.matchesName(t, name));
    }


    /**
     * Universal entry point for getting decorator by name or id
     * @param entryType     type of entry if it was configured, null if legacy
     * @param value         name/id (depending on entry)
     * @param selectedItem  currently selected item
     * @param autoKey       in case of legacy, identifier of auto field
     * @param auto1         decorator matching auto
     * @param auto2         same for auto 2 (e.g. autoIpad)
     * @param values           all known values (on form of decorator)
     * @param byNamePredicate  predicate to find item by name
     * @return matching decorator
     */
    private <T extends Decorator<?>> T getMatchingDecorator(EntryType entryType, String value, T selectedItem,
                                                            String autoKey, T auto1, T auto2,
                                                            List<T> values,  Predicate<T> byNamePredicate) {
        if (entryType != null) {
            // by entry type and ID
            return getMatchingDecorator(entryType, value, selectedItem, auto1, auto2, values);
        } else {
            // legacy by name
            return getMatchingDecorator(value, selectedItem, autoKey, auto1, values, byNamePredicate);
        }
    }

    /**
     * version for case when entry type is known
     */
    private <T extends Decorator<?>> T getMatchingDecorator(EntryType entryType, String id, T selectedItem, T auto1, T auto2, List<T> values) {
        T result = null;
        switch (entryType) {
            case ID:
                // looking for exact match, quick check against selected item
                if (Decorator.matchesId(selectedItem, id)) {
                    result = selectedItem;
                } else {
                    result = values.stream().filter(t -> Decorator.matchesId(t, id)).findAny().orElse(null);
                }
                break;
            case AUTO:
                result = auto1;
                break;
            case AUTO2:
                result = auto2;
                break;
        }

        return result;
    }

    /**
     * version for legacy case, matching by name only
     */
    private <T extends Decorator<?>> T getMatchingDecorator(String name, T selectedItem, String autoKey, T auto, List<T> values, Predicate<T> byNamePredicate) {
        // backward compatibility, should not happen once saved with ID
        T result = null;
        if (name != null) {
            // lookup Auto values first
            if (name.equals(autoKey))
                result = auto;
            else if (selectedItem != null && byNamePredicate.test(selectedItem)) {
                result = selectedItem;
            } else {
                result = values.stream().filter(byNamePredicate).findAny().orElse(null);
            }
        }
        return result;
    }

    private void updateSimArchs(SimTypeDecorator simulator) {
        CpuArch arch = populateSimulatorArch(simulator, (CpuArch) simArch.getSelectedItem());
        if (arch == null && simArch.getItemCount() > 0)
            arch = simArch.getItemAt(0);
        simArch.setSelectedItem(arch);
    }

    private void checkProfilesCertsAndDeviceCompat() {
        markCompatibleProfiles();
        markCompatibleCertificates();
        markCompatibleDevices();

        checkSelectedProvisioningProfile();
        checkSelectedSigningIdentity();
        checkSelectedDevice();
        updateErrors();
    }

    private void updatePairedWatch(boolean moduleChanged, Boolean valueToSet) {
        boolean visible;
        boolean enabled;
        boolean selected = valueToSet != null ? valueToSet : pairedWatch.isSelected();
        String text;

        if (moduleChanged) {
            // module changed
            Decorator<Module> moduleSelected = Decorator.from(module);
            Config config = moduleSelected != null ? RoboVmPlugin.loadRawModuleConfig(moduleSelected.data) : null;
            moduleHasWatchApp = config != null && config.getWatchKitApp() != null;



            if (config != null) {
                Properties properties = config.getProperties();
                InfoPList infoPList = config.getInfoPList();
                infoPList.parse(properties);
                if (infoPList.getBundleIdentifier() != null) {
                    bundleLabel.setText(infoPList.getBundleIdentifier());
                    bundleLabel.setForeground(JBColor.foreground());
                } else {
                    bundleLabel.setForeground(Color.GRAY);
                }
            }
        }

        if (!moduleHasWatchApp) {
            selected = false;
            enabled = false;
            visible = false;
            text = "";
        } else {
            visible = true;
            Decorator<DeviceType> simSelected = Decorator.from(simType);
            if (simSelected != null && simSelected.entryType == EntryType.ID && simSelected.data.getPair() != null) {
                // has pair
                text = "Launch paired: " + simSelected.data.getPair().getDeviceName();
                enabled = true;
            } else {
                // no pair
                text = "Not paired with watch";
                enabled = false;
                selected = false;
            }
        }

        pairedWatch.setVisible(visible);
        pairedWatch.setSelected(selected);
        pairedWatch.setEnabled(enabled);
        pairedWatch.setText(text);
    }


    private void updateErrors() {
        if (provisioningProfileErrors.isEmpty() && signingIdentityErrors.isEmpty() && deviceIdentityErrors.isEmpty()) {
            errors.setText("");
            errorsPanel.setVisible(false);
            return;
        };

        StringBuilder buffer = new StringBuilder();

        buffer.append("Errors").append("\n\n");

        if (!provisioningProfileErrors.isEmpty()) {
            buffer.append("Provisioning Profile Errors -> ").append("\n");
            for (String provisioningProfileError : provisioningProfileErrors) {
                buffer.append(provisioningProfileError).append("\n");
            }
            buffer.append("\n");
        }
        if (!signingIdentityErrors.isEmpty()) {
            buffer.append("Certificate Errors -> ").append("\n");
            for (String certificateError : signingIdentityErrors) {
                buffer.append(certificateError).append("\n");
            }
            buffer.append("\n");
        }
        if (!deviceIdentityErrors.isEmpty()) {
            buffer.append("Device Errors -> ").append("\n");
            for (String deviceError : deviceIdentityErrors) {
                buffer.append(deviceError).append("\n");
            }
            buffer.append("\n");
        }
        errors.setText(buffer.toString());
        errorsPanel.setVisible(true);
    }

    private void checkSelectedProvisioningProfile () {
        Decorator<ProvisioningProfile> selectedProvisioningDecorator = Decorator.from(provisioningProfile);
        if (selectedProvisioningDecorator != null && selectedProvisioningDecorator.data != null) {//Perhaps none
            ProvisioningProfile provisioningProfile = selectedProvisioningDecorator.data;

            Decorator<Module> moduleSelected = Decorator.from(module);
            Config config = moduleSelected != null ? RoboVmPlugin.loadRawModuleConfig(moduleSelected.data) : null;
            if (config != null) {
                if (isProvisioningProfileValid(provisioningProfile, config, true)) {
                    //Its already marked valid or invalid, just want to do this to propagate errors
                }
            }
        }
    }

    private void checkSelectedSigningIdentity () {
        Decorator<SigningIdentity> selectedSigningIdentity = Decorator.from(signingIdentity);
        if (selectedSigningIdentity != null && selectedSigningIdentity.data != null) {
            SigningIdentity signingIdent = selectedSigningIdentity.data;


            Decorator<Module> moduleSelected = Decorator.from(module);
            Config config = moduleSelected != null ? RoboVmPlugin.loadRawModuleConfig(moduleSelected.data) : null;
            if (config != null) {
                if (isSigningIdentityValid(signingIdent, config, true)) {
                    //Its already marked valid or invalid, just want to do this to propagate errors
                }
            }
        }
    }

    private void checkSelectedDevice () {
        Decorator<String> selectedDevice = Decorator.from(targetDeviceUDID);

        if (selectedDevice != null && selectedDevice.data != null) {
            String selectedDeviceUUID = selectedDevice.data;

            Decorator<ProvisioningProfile> profileSelected = Decorator.from(provisioningProfile);
            //ony care about profile

            if (profileSelected != null && profileSelected.data != null) {
                if (isDeviceValid(profileSelected, selectedDeviceUUID, true)) {

                }
            }
        }
    }

    private boolean isDeviceValid(Decorator<ProvisioningProfile> profileSelected, String selectedDeviceUUID, boolean createErrorStrings) {
        if (createErrorStrings) {
            deviceIdentityErrors.clear();
        }

        NSObject provisionedDevices = profileSelected.data.getDict().get("ProvisionedDevices");
        if (provisionedDevices != null) {
            NSArray arrayOfProvisionedDevices = (NSArray) provisionedDevices;
            boolean foundDeviceInProfile = false;
            for (NSObject nsObject : arrayOfProvisionedDevices.getArray()) {
                NSString deviceID = (NSString) nsObject;
                if (selectedDeviceUUID.equalsIgnoreCase(deviceID.toString())) {
                    foundDeviceInProfile = true;
                    break;
                }
            }
            if (foundDeviceInProfile) {
                return true;
            } else {
                deviceIdentityErrors.add("Device is not in the provisioning profile");
                return false;
            }
        }



        return false;
    }

    private boolean isSigningIdentityValid(SigningIdentity signingIdentity, Config config, boolean createErrorStrings) {
        if (createErrorStrings) {
            signingIdentityErrors.clear();
        }

        boolean currentlyValid = false;


        Decorator<ProvisioningProfile> currentSelectedProvisioningProfile = Decorator.from(provisioningProfile);

        boolean isProfileSelectedAndValid = currentSelectedProvisioningProfile != null && currentSelectedProvisioningProfile.data != null;
        if (isProfileSelectedAndValid) {
            isProfileSelectedAndValid = isProvisioningProfileValid(currentSelectedProvisioningProfile.data, config, false);
        }

        if (isProfileSelectedAndValid) {
            Set<String> certFingerprints = currentSelectedProvisioningProfile.data.getCertFingerprints();
            if (certFingerprints.contains(signingIdentity.getFingerprint())) {
                currentlyValid = true;
            } else {
                if (createErrorStrings) {
                    signingIdentityErrors.add("Signing Certificate is not in the selected Provisioning Profile");
                }
            }
        } else { //Check all of them
            for (ProvisioningProfileDecorator provisioningProfile : provisioningProfiles) {
                ProvisioningProfile profile = provisioningProfile.data;
                if (profile != null) {
                    if (isProvisioningProfileValid(profile, config, false)) {
                        Set<String> certFingerprints = profile.getCertFingerprints();
                        if (certFingerprints.contains(signingIdentity.getFingerprint())) {
                            currentlyValid = true;
                        }
                    }
                }
            }

            if (!currentlyValid) {
                if (createErrorStrings) {
                    signingIdentityErrors.add("Signing Certificate is not in any of the Provisioning profiles valid for this app");
                }
            }
        }



        return currentlyValid;
    }

    private boolean isProvisioningProfileValid (ProvisioningProfile profile, Config config, boolean createErrorStrings) {
        if (createErrorStrings) {
            provisioningProfileErrors.clear();
        }

        String bundleId = bundleLabel.getText();
        String candidateAppId = profile.getAppIdPrefix() + "." + bundleId;
        String profileAppId = profile.getAppId();

        // check the id
        boolean currentlyCompatible = profileAppId.equalsIgnoreCase(candidateAppId);
        if (!currentlyCompatible){
            // check for wildcard
            if (profileAppId.endsWith(".*")) {
                currentlyCompatible = candidateAppId.startsWith(profileAppId.substring(0, profileAppId.length() - 1));
            }
        }

        if (!currentlyCompatible) {
            if (createErrorStrings) {
                String profileAppIdNoPrefix = profileAppId.substring(profile.getAppIdPrefix() .length() + 1);
                provisioningProfileErrors.add("Bundle ID from profile=[" + profileAppIdNoPrefix + "] does not match module Bundle ID [" + bundleId + "]");
            }
        }

        //Check if required entitlements are in the profile
        if (config.getIosEntitlementsPList() != null) {
            try {
                NSDictionary entitlementsFromProject = (NSDictionary) PropertyListParser.parse(config.getIosEntitlementsPList());

                NSDictionary entitlementsFromProfile = profile.getEntitlements();

                for (String key : entitlementsFromProject.keySet()) {
                    if (!isEntitlementRequiredToBeInProfile(key)) continue;

                    if (!entitlementsFromProfile.containsKey(key)) {
                        currentlyCompatible = false;
                        if (createErrorStrings) {
                            //might have to do valid checks, if real entitlment, and its required to be in profile
                            provisioningProfileErrors.add("Entitlement " + key + " doesn't exist in provisioning profile");
                        }
                    }
                }

            } catch (IOException | PropertyListFormatException | ParseException | ParserConfigurationException |
                     SAXException e) {
                e.printStackTrace();
            }
        }


        return currentlyCompatible;
    }

    private static final HashSet<String> entitlementsRequiredInProfile = new HashSet<>();
    static {
        entitlementsRequiredInProfile.add("com.apple.developer.networking.wifi-info");
        entitlementsRequiredInProfile.add("com.apple.developer.devicecheck.appattest-environment");
        entitlementsRequiredInProfile.add("com.apple.developer.authentication-services.autofill-credential-provider");
        entitlementsRequiredInProfile.add("com.apple.developer.ClassKit-environment");
        entitlementsRequiredInProfile.add("com.apple.developer.driverkit.communicates-with-drivers");
        entitlementsRequiredInProfile.add("com.apple.developer.usernotifications.communication");
        entitlementsRequiredInProfile.add("com.apple.developer.default-data-protection");
        entitlementsRequiredInProfile.add("com.apple.developer.kernel.extended-virtual-addressing");
        entitlementsRequiredInProfile.add("com.apple.developer.family-controls");
        entitlementsRequiredInProfile.add("com.apple.developer.group-session");
        entitlementsRequiredInProfile.add("com.apple.developer.healthkit");
        entitlementsRequiredInProfile.add("com.apple.developer.homekit");
        entitlementsRequiredInProfile.add("com.apple.developer.networking.HotspotConfiguration");
        entitlementsRequiredInProfile.add("ICloudContainerIdentifiers");
        entitlementsRequiredInProfile.add("com.apple.developer.kernel.increased-memory-limit");
        entitlementsRequiredInProfile.add("inter-app-audio");
        entitlementsRequiredInProfile.add("keychain-access-groups");
        entitlementsRequiredInProfile.add("com.apple.developer.associated-domains.mdm-managed");
        entitlementsRequiredInProfile.add("com.apple.developer.networking.multipath");
        entitlementsRequiredInProfile.add("com.apple.developer.nfc.readersession.formats");
        entitlementsRequiredInProfile.add("com.apple.developer.networking.vpn.api");
        entitlementsRequiredInProfile.add("aps-environment");
        entitlementsRequiredInProfile.add("com.apple.developer.push-to-talk");
        entitlementsRequiredInProfile.add("com.apple.developer.shared-with-you");
        entitlementsRequiredInProfile.add("com.apple.developer.applesignin");
        entitlementsRequiredInProfile.add("com.apple.external-accessory.wireless-configuration");
        entitlementsRequiredInProfile.add("com.apple.developer.weatherkit");
        entitlementsRequiredInProfile.add("com.apple.developer.usernotifications.time-sensitive");
        entitlementsRequiredInProfile.add("com.apple.developer.siri");
        entitlementsRequiredInProfile.add("com.apple.developer.user-fonts");
        entitlementsRequiredInProfile.add("com.apple.developer.associated-domains");
        entitlementsRequiredInProfile.add("com.apple.security.application-groups");
        entitlementsRequiredInProfile.add("com.apple.developer.in-app-payments");
        entitlementsRequiredInProfile.add("com.apple.developer.networking.networkextension");

    }
    private boolean isEntitlementRequiredToBeInProfile(String key) {
        return entitlementsRequiredInProfile.contains(key);
    }


    private void markCompatibleProfiles() {
        Decorator<Module> moduleSelected = Decorator.from(module);
        Config config = moduleSelected != null ? RoboVmPlugin.loadRawModuleConfig(moduleSelected.data) : null;
        if (config != null) {
            for (ProvisioningProfileDecorator profile : provisioningProfiles) {
                if (isProvisioningProfileValid(profile.data, config, false)) {
                    profile.setCurrentlyCompatible(true);
                } else {
                    profile.setCurrentlyCompatible(false);
                }
            }
        }
    }

    private void markCompatibleCertificates () {
        Decorator<Module> moduleSelected = Decorator.from(module);
        Config config = moduleSelected != null ? RoboVmPlugin.loadRawModuleConfig(moduleSelected.data) : null;
        if (config != null) {
            for (SigningIdentityDecorator identity : signingIdentities) {
                if (isSigningIdentityValid(identity.data, config, false)) {
                    identity.setCurrentlyCompatible(true);
                } else {
                    identity.setCurrentlyCompatible(false);
                }
            }
        }
    }

    private void markCompatibleDevices () {
        Decorator<Module> moduleSelected = Decorator.from(module);
        Config config = moduleSelected != null ? RoboVmPlugin.loadRawModuleConfig(moduleSelected.data) : null;
        if (config != null) {
            for (ProvisioningProfileDecorator profile : provisioningProfiles) {
                if (isProvisioningProfileValid(profile.data, config, false)) {
                    //Check over all devices and see if the device is valid
                    for (IDeviceDecorator connectedDevice : connectedDevices) {
                        String uuid = connectedDevice.data;

                        if (isDeviceValid(profile, uuid, false)) {
                            connectedDevice.setCurrentlyCompatible(true);
                        } else {
                            connectedDevice.setCurrentlyCompatible(false);
                        }

                    }
                }
            }
        } else {
            connectedDevices.forEach(d -> {
                d.setCurrentlyCompatible(true);
            });
        }
    }

    /**
     * helper to build exception with quick fix action
     */
    ConfigurationException buildConfigurationException(String message, Runnable quickFix) {
        ConfigurationException exc = new ConfigurationException(message);
        exc.setQuickFix(quickFix);
        return exc;
    }

    /**
     * base decorator for items with name and identifier
     *
     * @param <T> type of data
     */
    private static abstract class Decorator<T> {
        final T data;
        final String id;
        final String name;
        final EntryType entryType;

        Decorator(T data, String id, String name, EntryType entryType) {
            this.data = data;
            this.id = id;
            this.name = name;
            this.entryType = entryType;
        }

        static boolean matchesId(Decorator<?> d, String id) {
            return d != null && d.id != null && d.id.equals(id);
        }

        static boolean matchesName(Decorator<?> d, String name) {
            return d != null && d.name != null && d.name.equals(name);
        }

        static <T> Decorator<T> from(JComboBox<? extends Decorator<T>> cb) {
            //noinspection unchecked
            return (Decorator<T>) cb.getSelectedItem();
        }

        /**
         * @return id from decorator if it presents
         */
        static <T> String idOrNullFrom(JComboBox<? extends Decorator<T>> cb) {
            //noinspection unchecked
            Decorator<T> decorator = (Decorator<T>) cb.getSelectedItem();
            return decorator != null ? decorator.id : null;
        }
    }

    /**
     * decorator for simulator type
     */
    private static class SimTypeDecorator extends Decorator<DeviceType> {
        SimTypeDecorator(String title, EntryType entryType) {
            super(null, null, title, entryType);
        }

        SimTypeDecorator(DeviceType data) {
            super(data, data.getUdid(), data.getDeviceName(), EntryType.ID);
        }

        public static boolean matchesName(SimTypeDecorator d, String name, int version) {
            return d != null && d.data != null &&
                    d.data.getVersion().versionCode == version &&
                    d.name != null && d.name.equals(name);
        }

        @Override
        public String toString() {
            return data == null ? name : data.getSimpleDeviceName() + " - " + data.getVersion();
        }
    }

    /**
     * decorator for connected device
     */
    private static class IDeviceDecorator extends Decorator<String> {

        private boolean currentlyCompatible = true;
        IDeviceDecorator (String title, EntryType entryType) {
            super(null, null, title, entryType);
        }

        IDeviceDecorator(String deviceIdentifier) {
            super(deviceIdentifier, deviceIdentifier, deviceIdentifier, EntryType.ID);
        }

        public void setCurrentlyCompatible(boolean currentlyCompatible) {
            this.currentlyCompatible = currentlyCompatible;
        }


        @Override
        public String toString() {
            boolean offline = !IDevice.isConnected(id);
            if (currentlyCompatible && !offline) {
                return name;
            } else {
                String nameBuffer = "";
                nameBuffer += id;
                if (currentlyCompatible) {
                    nameBuffer += " [Incompatible]";
                }
                if (offline) {
                    nameBuffer += " [Offline]";
                }
                return nameBuffer;
            }
        }
    }


    /**
     * decorator for singing identity
     */
    private static class SigningIdentityDecorator extends Decorator<SigningIdentity> {

        private boolean currentlyCompatible = true;
        SigningIdentityDecorator(String title, EntryType entryType) {
            super(null, null, title, entryType);
        }

        SigningIdentityDecorator(SigningIdentity identity) {
            super(identity, identity.getFingerprint(), identity.getName(), EntryType.ID);
        }

        public void setCurrentlyCompatible(boolean currentlyCompatible) {
            this.currentlyCompatible = currentlyCompatible;
        }

        @Override
        public String toString() {
            if (currentlyCompatible) {
                return name;
            } else {
                return name + " [Incompatible]";
            }
        }
    }

    /**
     * decorator for provisioning profile
     */
    private static class ProvisioningProfileDecorator extends Decorator<ProvisioningProfile> {

        private boolean currentlyCompatible = true;
        ProvisioningProfileDecorator(String title, EntryType entryType) {
            super(null, null, title, entryType);
        }

        ProvisioningProfileDecorator(ProvisioningProfile profile) {
            super(profile, profile.getUuid(), profile.getName(), EntryType.ID);
        }

        public void setCurrentlyCompatible(boolean currentlyCompatible) {
            this.currentlyCompatible = currentlyCompatible;
        }

        @Override
        public String toString() {
            if (currentlyCompatible) {
                return name;
            } else {
                return name + " [Incompatible]";
            }
        }
    }

    /**
     * decorator for module
     */
    private static class ModuleNameDecorator extends Decorator<Module> {
        ModuleNameDecorator(Module module) {
            super(module, module.getName(), module.getName(), EntryType.ID);
        }

        @Override
        public String toString() {
            return name;
        }
    }

    @Override
    protected void disposeEditor() {
        super.disposeEditor();
        IDevice.removeEventListener(ideviceListener);
    }
}
