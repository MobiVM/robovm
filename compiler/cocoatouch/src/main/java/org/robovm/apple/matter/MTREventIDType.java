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
/*<annotations>*//*</annotations>*/
public enum /*<name>*/MTREventIDType/*</name>*/ implements ValuedEnum {
    /*<values>*/
    /**
     * @since Available in iOS 16.4 and later.
     */
    EventIDTypeClusterAccessControlEventAccessControlEntryChangedID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    EventIDTypeClusterAccessControlEventAccessControlExtensionChangedID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    EventIDTypeClusterActionsEventStateChangedID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    EventIDTypeClusterActionsEventActionFailedID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    EventIDTypeClusterBasicInformationEventStartUpID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    EventIDTypeClusterBasicInformationEventShutDownID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    EventIDTypeClusterBasicInformationEventLeaveID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    EventIDTypeClusterBasicInformationEventReachableChangedID(3L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    EventIDTypeClusterOTASoftwareUpdateRequestorEventStateTransitionID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    EventIDTypeClusterOTASoftwareUpdateRequestorEventVersionAppliedID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    EventIDTypeClusterOTASoftwareUpdateRequestorEventDownloadErrorID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    EventIDTypeClusterPowerSourceEventWiredFaultChangeID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    EventIDTypeClusterPowerSourceEventBatFaultChangeID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    EventIDTypeClusterPowerSourceEventBatChargeFaultChangeID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    EventIDTypeClusterGeneralDiagnosticsEventHardwareFaultChangeID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    EventIDTypeClusterGeneralDiagnosticsEventRadioFaultChangeID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    EventIDTypeClusterGeneralDiagnosticsEventNetworkFaultChangeID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    EventIDTypeClusterGeneralDiagnosticsEventBootReasonID(3L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    EventIDTypeClusterSoftwareDiagnosticsEventSoftwareFaultID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    EventIDTypeClusterThreadNetworkDiagnosticsEventConnectionStatusID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    EventIDTypeClusterThreadNetworkDiagnosticsEventNetworkFaultChangeID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    EventIDTypeClusterWiFiNetworkDiagnosticsEventDisconnectionID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    EventIDTypeClusterWiFiNetworkDiagnosticsEventAssociationFailureID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    EventIDTypeClusterWiFiNetworkDiagnosticsEventConnectionStatusID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    EventIDTypeClusterBridgedDeviceBasicInformationEventStartUpID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    EventIDTypeClusterBridgedDeviceBasicInformationEventShutDownID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    EventIDTypeClusterBridgedDeviceBasicInformationEventLeaveID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    EventIDTypeClusterBridgedDeviceBasicInformationEventReachableChangedID(3L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    EventIDTypeClusterSwitchEventSwitchLatchedID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    EventIDTypeClusterSwitchEventInitialPressID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    EventIDTypeClusterSwitchEventLongPressID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    EventIDTypeClusterSwitchEventShortReleaseID(3L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    EventIDTypeClusterSwitchEventLongReleaseID(4L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    EventIDTypeClusterSwitchEventMultiPressOngoingID(5L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    EventIDTypeClusterSwitchEventMultiPressCompleteID(6L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    EventIDTypeClusterBooleanStateEventStateChangeID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    EventIDTypeClusterDoorLockEventDoorLockAlarmID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    EventIDTypeClusterDoorLockEventDoorStateChangeID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    EventIDTypeClusterDoorLockEventLockOperationID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    EventIDTypeClusterDoorLockEventLockOperationErrorID(3L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    EventIDTypeClusterDoorLockEventLockUserChangeID(4L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    EventIDTypeClusterPumpConfigurationAndControlEventSupplyVoltageLowID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    EventIDTypeClusterPumpConfigurationAndControlEventSupplyVoltageHighID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    EventIDTypeClusterPumpConfigurationAndControlEventPowerMissingPhaseID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    EventIDTypeClusterPumpConfigurationAndControlEventSystemPressureLowID(3L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    EventIDTypeClusterPumpConfigurationAndControlEventSystemPressureHighID(4L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    EventIDTypeClusterPumpConfigurationAndControlEventDryRunningID(5L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    EventIDTypeClusterPumpConfigurationAndControlEventMotorTemperatureHighID(6L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    EventIDTypeClusterPumpConfigurationAndControlEventPumpMotorFatalFailureID(7L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    EventIDTypeClusterPumpConfigurationAndControlEventElectronicTemperatureHighID(8L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    EventIDTypeClusterPumpConfigurationAndControlEventPumpBlockedID(9L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    EventIDTypeClusterPumpConfigurationAndControlEventSensorFailureID(10L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    EventIDTypeClusterPumpConfigurationAndControlEventElectronicNonFatalFailureID(11L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    EventIDTypeClusterPumpConfigurationAndControlEventElectronicFatalFailureID(12L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    EventIDTypeClusterPumpConfigurationAndControlEventGeneralFaultID(13L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    EventIDTypeClusterPumpConfigurationAndControlEventLeakageID(14L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    EventIDTypeClusterPumpConfigurationAndControlEventAirDetectionID(15L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    EventIDTypeClusterPumpConfigurationAndControlEventTurbineOperationID(16L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    EventIDTypeClusterUnitTestingEventTestEventID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    EventIDTypeClusterUnitTestingEventTestFabricScopedEventID(2L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/MTREventIDType/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/MTREventIDType/*</name>*/ valueOf(long n) {
        for (/*<name>*/MTREventIDType/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/MTREventIDType/*</name>*/.class.getName());
    }
}
