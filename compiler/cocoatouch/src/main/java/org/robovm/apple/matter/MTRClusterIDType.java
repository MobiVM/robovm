/*
 * Copyright (C) 2013-2015 RoboVM AB
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
package org.robovm.apple.matter;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.security.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsUnsignedIntMarshaler.class)/*</annotations>*/
public enum /*<name>*/MTRClusterIDType/*</name>*/ implements ValuedEnum {
    /*<values>*/
    /**
     * @since Available in iOS 16.4 and later.
     */
    IDTypeIdentifyID(3L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    IDTypeGroupsID(4L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    IDTypeScenesID(5L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    IDTypeOnOffID(6L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    IDTypeOnOffSwitchConfigurationID(7L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    IDTypeLevelControlID(8L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    IDTypeBinaryInputBasicID(15L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    IDTypePulseWidthModulationID(28L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    IDTypeDescriptorID(29L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    IDTypeBindingID(30L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    IDTypeAccessControlID(31L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    IDTypeActionsID(37L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    IDTypeBasicInformationID(40L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    IDTypeOTASoftwareUpdateProviderID(41L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    IDTypeOTASoftwareUpdateRequestorID(42L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    IDTypeLocalizationConfigurationID(43L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    IDTypeTimeFormatLocalizationID(44L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    IDTypeUnitLocalizationID(45L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    IDTypePowerSourceConfigurationID(46L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    IDTypePowerSourceID(47L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    IDTypeGeneralCommissioningID(48L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    IDTypeNetworkCommissioningID(49L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    IDTypeDiagnosticLogsID(50L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    IDTypeGeneralDiagnosticsID(51L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    IDTypeSoftwareDiagnosticsID(52L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    IDTypeThreadNetworkDiagnosticsID(53L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    IDTypeWiFiNetworkDiagnosticsID(54L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    IDTypeEthernetNetworkDiagnosticsID(55L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    IDTypeTimeSynchronizationID(56L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    IDTypeBridgedDeviceBasicInformationID(57L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    IDTypeSwitchID(59L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    IDTypeAdministratorCommissioningID(60L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    IDTypeOperationalCredentialsID(62L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    IDTypeGroupKeyManagementID(63L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    IDTypeFixedLabelID(64L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    IDTypeUserLabelID(65L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    IDTypeProxyConfigurationID(66L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    IDTypeProxyDiscoveryID(67L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    IDTypeProxyValidID(68L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    IDTypeBooleanStateID(69L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    IDTypeModeSelectID(80L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    IDTypeDoorLockID(257L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    IDTypeWindowCoveringID(258L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    IDTypeBarrierControlID(259L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    IDTypePumpConfigurationAndControlID(512L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    IDTypeThermostatID(513L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    IDTypeFanControlID(514L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    IDTypeThermostatUserInterfaceConfigurationID(516L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    IDTypeColorControlID(768L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    IDTypeBallastConfigurationID(769L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    IDTypeIlluminanceMeasurementID(1024L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    IDTypeTemperatureMeasurementID(1026L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    IDTypePressureMeasurementID(1027L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    IDTypeFlowMeasurementID(1028L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    IDTypeRelativeHumidityMeasurementID(1029L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    IDTypeOccupancySensingID(1030L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    IDTypeWakeOnLANID(1283L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    IDTypeChannelID(1284L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    IDTypeTargetNavigatorID(1285L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    IDTypeMediaPlaybackID(1286L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    IDTypeMediaInputID(1287L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    IDTypeLowPowerID(1288L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    IDTypeKeypadInputID(1289L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    IDTypeContentLauncherID(1290L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    IDTypeAudioOutputID(1291L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    IDTypeApplicationLauncherID(1292L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    IDTypeApplicationBasicID(1293L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    IDTypeAccountLoginID(1294L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    IDTypeElectricalMeasurementID(2820L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    IDTypeUnitTestingID(4294048773L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    IDTypeFaultInjectionID(4294048774L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/MTRClusterIDType/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/MTRClusterIDType/*</name>*/ valueOf(long n) {
        for (/*<name>*/MTRClusterIDType/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/MTRClusterIDType/*</name>*/.class.getName());
    }
}
