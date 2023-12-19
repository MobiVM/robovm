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
public enum /*<name>*/MTRCommandIDType/*</name>*/ implements ValuedEnum {
    /*<values>*/
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterIdentifyCommandIdentifyID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterIdentifyCommandTriggerEffectID(64L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterGroupsCommandAddGroupID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterGroupsCommandAddGroupResponseID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterGroupsCommandViewGroupID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterGroupsCommandViewGroupResponseID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterGroupsCommandGetGroupMembershipID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterGroupsCommandGetGroupMembershipResponseID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterGroupsCommandRemoveGroupID(3L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterGroupsCommandRemoveGroupResponseID(3L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterGroupsCommandRemoveAllGroupsID(4L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterGroupsCommandAddGroupIfIdentifyingID(5L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterScenesCommandAddSceneID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterScenesCommandAddSceneResponseID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterScenesCommandViewSceneID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterScenesCommandViewSceneResponseID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterScenesCommandRemoveSceneID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterScenesCommandRemoveSceneResponseID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterScenesCommandRemoveAllScenesID(3L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterScenesCommandRemoveAllScenesResponseID(3L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterScenesCommandStoreSceneID(4L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterScenesCommandStoreSceneResponseID(4L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterScenesCommandRecallSceneID(5L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterScenesCommandGetSceneMembershipID(6L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterScenesCommandGetSceneMembershipResponseID(6L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterScenesCommandEnhancedAddSceneID(64L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterScenesCommandEnhancedAddSceneResponseID(64L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterScenesCommandEnhancedViewSceneID(65L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterScenesCommandEnhancedViewSceneResponseID(65L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterScenesCommandCopySceneID(66L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterScenesCommandCopySceneResponseID(66L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterOnOffCommandOffID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterOnOffCommandOnID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterOnOffCommandToggleID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterOnOffCommandOffWithEffectID(64L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterOnOffCommandOnWithRecallGlobalSceneID(65L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterOnOffCommandOnWithTimedOffID(66L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterLevelControlCommandMoveToLevelID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterLevelControlCommandMoveID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterLevelControlCommandStepID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterLevelControlCommandStopID(3L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterLevelControlCommandMoveToLevelWithOnOffID(4L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterLevelControlCommandMoveWithOnOffID(5L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterLevelControlCommandStepWithOnOffID(6L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterLevelControlCommandStopWithOnOffID(7L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterLevelControlCommandMoveToClosestFrequencyID(8L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterActionsCommandInstantActionID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterActionsCommandInstantActionWithTransitionID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterActionsCommandStartActionID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterActionsCommandStartActionWithDurationID(3L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterActionsCommandStopActionID(4L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterActionsCommandPauseActionID(5L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterActionsCommandPauseActionWithDurationID(6L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterActionsCommandResumeActionID(7L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterActionsCommandEnableActionID(8L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterActionsCommandEnableActionWithDurationID(9L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterActionsCommandDisableActionID(10L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterActionsCommandDisableActionWithDurationID(11L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterOTASoftwareUpdateProviderCommandQueryImageID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterOTASoftwareUpdateProviderCommandQueryImageResponseID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterOTASoftwareUpdateProviderCommandApplyUpdateRequestID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterOTASoftwareUpdateProviderCommandApplyUpdateResponseID(3L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterOTASoftwareUpdateProviderCommandNotifyUpdateAppliedID(4L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterOTASoftwareUpdateRequestorCommandAnnounceOTAProviderID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterGeneralCommissioningCommandArmFailSafeID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterGeneralCommissioningCommandArmFailSafeResponseID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterGeneralCommissioningCommandSetRegulatoryConfigID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterGeneralCommissioningCommandSetRegulatoryConfigResponseID(3L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterGeneralCommissioningCommandCommissioningCompleteID(4L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterGeneralCommissioningCommandCommissioningCompleteResponseID(5L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterNetworkCommissioningCommandScanNetworksID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterNetworkCommissioningCommandScanNetworksResponseID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterNetworkCommissioningCommandAddOrUpdateWiFiNetworkID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterNetworkCommissioningCommandAddOrUpdateThreadNetworkID(3L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterNetworkCommissioningCommandRemoveNetworkID(4L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterNetworkCommissioningCommandNetworkConfigResponseID(5L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterNetworkCommissioningCommandConnectNetworkID(6L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterNetworkCommissioningCommandConnectNetworkResponseID(7L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterNetworkCommissioningCommandReorderNetworkID(8L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterDiagnosticLogsCommandRetrieveLogsRequestID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterDiagnosticLogsCommandRetrieveLogsResponseID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterGeneralDiagnosticsCommandTestEventTriggerID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterSoftwareDiagnosticsCommandResetWatermarksID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterThreadNetworkDiagnosticsCommandResetCountsID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterWiFiNetworkDiagnosticsCommandResetCountsID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterEthernetNetworkDiagnosticsCommandResetCountsID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterTimeSynchronizationCommandSetUtcTimeID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterAdministratorCommissioningCommandOpenCommissioningWindowID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterAdministratorCommissioningCommandOpenBasicCommissioningWindowID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterAdministratorCommissioningCommandRevokeCommissioningID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterOperationalCredentialsCommandAttestationRequestID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterOperationalCredentialsCommandAttestationResponseID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterOperationalCredentialsCommandCertificateChainRequestID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterOperationalCredentialsCommandCertificateChainResponseID(3L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterOperationalCredentialsCommandCSRRequestID(4L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterOperationalCredentialsCommandCSRResponseID(5L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterOperationalCredentialsCommandAddNOCID(6L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterOperationalCredentialsCommandUpdateNOCID(7L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterOperationalCredentialsCommandNOCResponseID(8L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterOperationalCredentialsCommandUpdateFabricLabelID(9L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterOperationalCredentialsCommandRemoveFabricID(10L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterOperationalCredentialsCommandAddTrustedRootCertificateID(11L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterGroupKeyManagementCommandKeySetWriteID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterGroupKeyManagementCommandKeySetReadID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterGroupKeyManagementCommandKeySetReadResponseID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterGroupKeyManagementCommandKeySetRemoveID(3L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterGroupKeyManagementCommandKeySetReadAllIndicesID(4L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterGroupKeyManagementCommandKeySetReadAllIndicesResponseID(5L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterModeSelectCommandChangeToModeID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterDoorLockCommandLockDoorID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterDoorLockCommandUnlockDoorID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterDoorLockCommandUnlockWithTimeoutID(3L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterDoorLockCommandSetWeekDayScheduleID(11L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterDoorLockCommandGetWeekDayScheduleID(12L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterDoorLockCommandGetWeekDayScheduleResponseID(12L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterDoorLockCommandClearWeekDayScheduleID(13L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterDoorLockCommandSetYearDayScheduleID(14L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterDoorLockCommandGetYearDayScheduleID(15L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterDoorLockCommandGetYearDayScheduleResponseID(15L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterDoorLockCommandClearYearDayScheduleID(16L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterDoorLockCommandSetHolidayScheduleID(17L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterDoorLockCommandGetHolidayScheduleID(18L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterDoorLockCommandGetHolidayScheduleResponseID(18L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterDoorLockCommandClearHolidayScheduleID(19L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterDoorLockCommandSetUserID(26L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterDoorLockCommandGetUserID(27L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterDoorLockCommandGetUserResponseID(28L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterDoorLockCommandClearUserID(29L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterDoorLockCommandSetCredentialID(34L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterDoorLockCommandSetCredentialResponseID(35L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterDoorLockCommandGetCredentialStatusID(36L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterDoorLockCommandGetCredentialStatusResponseID(37L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterDoorLockCommandClearCredentialID(38L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterWindowCoveringCommandUpOrOpenID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterWindowCoveringCommandDownOrCloseID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterWindowCoveringCommandStopMotionID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterWindowCoveringCommandGoToLiftValueID(4L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterWindowCoveringCommandGoToLiftPercentageID(5L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterWindowCoveringCommandGoToTiltValueID(7L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterWindowCoveringCommandGoToTiltPercentageID(8L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterBarrierControlCommandBarrierControlGoToPercentID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterBarrierControlCommandBarrierControlStopID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterThermostatCommandSetpointRaiseLowerID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterThermostatCommandGetWeeklyScheduleResponseID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterThermostatCommandSetWeeklyScheduleID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterThermostatCommandGetWeeklyScheduleID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterThermostatCommandClearWeeklyScheduleID(3L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterColorControlCommandMoveToHueID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterColorControlCommandMoveHueID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterColorControlCommandStepHueID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterColorControlCommandMoveToSaturationID(3L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterColorControlCommandMoveSaturationID(4L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterColorControlCommandStepSaturationID(5L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterColorControlCommandMoveToHueAndSaturationID(6L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterColorControlCommandMoveToColorID(7L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterColorControlCommandMoveColorID(8L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterColorControlCommandStepColorID(9L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterColorControlCommandMoveToColorTemperatureID(10L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterColorControlCommandEnhancedMoveToHueID(64L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterColorControlCommandEnhancedMoveHueID(65L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterColorControlCommandEnhancedStepHueID(66L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterColorControlCommandEnhancedMoveToHueAndSaturationID(67L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterColorControlCommandColorLoopSetID(68L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterColorControlCommandStopMoveStepID(71L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterColorControlCommandMoveColorTemperatureID(75L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterColorControlCommandStepColorTemperatureID(76L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterChannelCommandChangeChannelID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterChannelCommandChangeChannelResponseID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterChannelCommandChangeChannelByNumberID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterChannelCommandSkipChannelID(3L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterTargetNavigatorCommandNavigateTargetID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterTargetNavigatorCommandNavigateTargetResponseID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterMediaPlaybackCommandPlayID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterMediaPlaybackCommandPauseID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterMediaPlaybackCommandStopID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterMediaPlaybackCommandStartOverID(3L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterMediaPlaybackCommandPreviousID(4L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterMediaPlaybackCommandNextID(5L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterMediaPlaybackCommandRewindID(6L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterMediaPlaybackCommandFastForwardID(7L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterMediaPlaybackCommandSkipForwardID(8L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterMediaPlaybackCommandSkipBackwardID(9L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterMediaPlaybackCommandPlaybackResponseID(10L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterMediaPlaybackCommandSeekID(11L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterMediaInputCommandSelectInputID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterMediaInputCommandShowInputStatusID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterMediaInputCommandHideInputStatusID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterMediaInputCommandRenameInputID(3L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterLowPowerCommandSleepID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterKeypadInputCommandSendKeyID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterKeypadInputCommandSendKeyResponseID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterContentLauncherCommandLaunchContentID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterContentLauncherCommandLaunchURLID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterContentLauncherCommandLauncherResponseID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterAudioOutputCommandSelectOutputID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterAudioOutputCommandRenameOutputID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterApplicationLauncherCommandLaunchAppID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterApplicationLauncherCommandStopAppID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterApplicationLauncherCommandHideAppID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterApplicationLauncherCommandLauncherResponseID(3L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterAccountLoginCommandGetSetupPINID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterAccountLoginCommandGetSetupPINResponseID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterAccountLoginCommandLoginID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterAccountLoginCommandLogoutID(3L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterElectricalMeasurementCommandGetProfileInfoResponseCommandID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterElectricalMeasurementCommandGetProfileInfoCommandID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterElectricalMeasurementCommandGetMeasurementProfileResponseCommandID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterElectricalMeasurementCommandGetMeasurementProfileCommandID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterUnitTestingCommandTestID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterUnitTestingCommandTestSpecificResponseID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterUnitTestingCommandTestNotHandledID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterUnitTestingCommandTestAddArgumentsResponseID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterUnitTestingCommandTestSpecificID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterUnitTestingCommandTestSimpleArgumentResponseID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterUnitTestingCommandTestUnknownCommandID(3L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterUnitTestingCommandTestStructArrayArgumentResponseID(3L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterUnitTestingCommandTestAddArgumentsID(4L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterUnitTestingCommandTestListInt8UReverseResponseID(4L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterUnitTestingCommandTestSimpleArgumentRequestID(5L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterUnitTestingCommandTestEnumsResponseID(5L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterUnitTestingCommandTestStructArrayArgumentRequestID(6L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterUnitTestingCommandTestNullableOptionalResponseID(6L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterUnitTestingCommandTestStructArgumentRequestID(7L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterUnitTestingCommandTestComplexNullableOptionalResponseID(7L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterUnitTestingCommandTestNestedStructArgumentRequestID(8L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterUnitTestingCommandBooleanResponseID(8L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterUnitTestingCommandTestListStructArgumentRequestID(9L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterUnitTestingCommandSimpleStructResponseID(9L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterUnitTestingCommandTestListInt8UArgumentRequestID(10L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterUnitTestingCommandTestEmitTestEventResponseID(10L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterUnitTestingCommandTestNestedStructListArgumentRequestID(11L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterUnitTestingCommandTestEmitTestFabricScopedEventResponseID(11L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterUnitTestingCommandTestListNestedStructListArgumentRequestID(12L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterUnitTestingCommandTestListInt8UReverseRequestID(13L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterUnitTestingCommandTestEnumsRequestID(14L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterUnitTestingCommandTestNullableOptionalRequestID(15L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterUnitTestingCommandTestComplexNullableOptionalRequestID(16L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterUnitTestingCommandSimpleStructEchoRequestID(17L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterUnitTestingCommandTimedInvokeRequestID(18L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterUnitTestingCommandTestSimpleOptionalArgumentRequestID(19L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterUnitTestingCommandTestEmitTestEventRequestID(20L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterUnitTestingCommandTestEmitTestFabricScopedEventRequestID(21L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterFaultInjectionCommandFailAtFaultID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    ommandIDTypeClusterFaultInjectionCommandFailRandomlyAtFaultID(1L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/MTRCommandIDType/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/MTRCommandIDType/*</name>*/ valueOf(long n) {
        for (/*<name>*/MTRCommandIDType/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/MTRCommandIDType/*</name>*/.class.getName());
    }
}
