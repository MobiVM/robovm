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
public enum /*<name>*/MTRAttributeIDType/*</name>*/ implements ValuedEnum {
    /*<values>*/
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeGlobalAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeGlobalAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeGlobalAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeGlobalAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeGlobalAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterIdentifyAttributeIdentifyTimeID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterIdentifyAttributeIdentifyTypeID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterIdentifyAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterIdentifyAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterIdentifyAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterIdentifyAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterIdentifyAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterGroupsAttributeNameSupportID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterGroupsAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterGroupsAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterGroupsAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterGroupsAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterGroupsAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterOnOffAttributeOnOffID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterOnOffAttributeGlobalSceneControlID(16384L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterOnOffAttributeOnTimeID(16385L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterOnOffAttributeOffWaitTimeID(16386L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterOnOffAttributeStartUpOnOffID(16387L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterOnOffAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterOnOffAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterOnOffAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterOnOffAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterOnOffAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterLevelControlAttributeCurrentLevelID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterLevelControlAttributeRemainingTimeID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterLevelControlAttributeMinLevelID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterLevelControlAttributeMaxLevelID(3L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterLevelControlAttributeCurrentFrequencyID(4L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterLevelControlAttributeMinFrequencyID(5L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterLevelControlAttributeMaxFrequencyID(6L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterLevelControlAttributeOptionsID(15L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterLevelControlAttributeOnOffTransitionTimeID(16L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterLevelControlAttributeOnLevelID(17L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterLevelControlAttributeOnTransitionTimeID(18L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterLevelControlAttributeOffTransitionTimeID(19L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterLevelControlAttributeDefaultMoveRateID(20L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterLevelControlAttributeStartUpCurrentLevelID(16384L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterLevelControlAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterLevelControlAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterLevelControlAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterLevelControlAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterLevelControlAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPulseWidthModulationAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPulseWidthModulationAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPulseWidthModulationAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPulseWidthModulationAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPulseWidthModulationAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterDescriptorAttributeDeviceTypeListID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterDescriptorAttributeServerListID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterDescriptorAttributeClientListID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterDescriptorAttributePartsListID(3L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterDescriptorAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterDescriptorAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterDescriptorAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterDescriptorAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterDescriptorAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBindingAttributeBindingID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBindingAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBindingAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBindingAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBindingAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBindingAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterAccessControlAttributeACLID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterAccessControlAttributeExtensionID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterAccessControlAttributeSubjectsPerAccessControlEntryID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterAccessControlAttributeTargetsPerAccessControlEntryID(3L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterAccessControlAttributeAccessControlEntriesPerFabricID(4L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterAccessControlAttributeCommissioningARLID(5L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterAccessControlAttributeARLID(6L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterAccessControlAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterAccessControlAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterAccessControlAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterAccessControlAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterAccessControlAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterActionsAttributeActionListID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterActionsAttributeEndpointListsID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterActionsAttributeSetupURLID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterActionsAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterActionsAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterActionsAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterActionsAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterActionsAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBasicInformationAttributeDataModelRevisionID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBasicInformationAttributeVendorNameID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBasicInformationAttributeVendorIDID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBasicInformationAttributeProductNameID(3L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBasicInformationAttributeProductIDID(4L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBasicInformationAttributeNodeLabelID(5L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBasicInformationAttributeLocationID(6L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBasicInformationAttributeHardwareVersionID(7L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBasicInformationAttributeHardwareVersionStringID(8L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBasicInformationAttributeSoftwareVersionID(9L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBasicInformationAttributeSoftwareVersionStringID(10L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBasicInformationAttributeManufacturingDateID(11L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBasicInformationAttributePartNumberID(12L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBasicInformationAttributeProductURLID(13L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBasicInformationAttributeProductLabelID(14L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBasicInformationAttributeSerialNumberID(15L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBasicInformationAttributeLocalConfigDisabledID(16L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBasicInformationAttributeReachableID(17L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBasicInformationAttributeUniqueIDID(18L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBasicInformationAttributeCapabilityMinimaID(19L),
    /**
     * @since Available in iOS 17.0 and later.
     */
    AttributeIDTypeClusterBasicInformationAttributeProductAppearanceID(20L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterBasicInformationAttributeSpecificationVersionID(21L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterBasicInformationAttributeMaxPathsPerInvokeID(22L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBasicInformationAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBasicInformationAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBasicInformationAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBasicInformationAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBasicInformationAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterOTASoftwareUpdateProviderAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterOTASoftwareUpdateProviderAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterOTASoftwareUpdateProviderAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterOTASoftwareUpdateProviderAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterOTASoftwareUpdateProviderAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterOTASoftwareUpdateRequestorAttributeDefaultOTAProvidersID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterOTASoftwareUpdateRequestorAttributeUpdatePossibleID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterOTASoftwareUpdateRequestorAttributeUpdateStateID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterOTASoftwareUpdateRequestorAttributeUpdateStateProgressID(3L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterOTASoftwareUpdateRequestorAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterOTASoftwareUpdateRequestorAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterOTASoftwareUpdateRequestorAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterOTASoftwareUpdateRequestorAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterOTASoftwareUpdateRequestorAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterLocalizationConfigurationAttributeActiveLocaleID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterLocalizationConfigurationAttributeSupportedLocalesID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterLocalizationConfigurationAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterLocalizationConfigurationAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterLocalizationConfigurationAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterLocalizationConfigurationAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterLocalizationConfigurationAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterTimeFormatLocalizationAttributeHourFormatID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterTimeFormatLocalizationAttributeActiveCalendarTypeID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterTimeFormatLocalizationAttributeSupportedCalendarTypesID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterTimeFormatLocalizationAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterTimeFormatLocalizationAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterTimeFormatLocalizationAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterTimeFormatLocalizationAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterTimeFormatLocalizationAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitLocalizationAttributeTemperatureUnitID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitLocalizationAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitLocalizationAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitLocalizationAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitLocalizationAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitLocalizationAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPowerSourceConfigurationAttributeSourcesID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPowerSourceConfigurationAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPowerSourceConfigurationAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPowerSourceConfigurationAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPowerSourceConfigurationAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPowerSourceConfigurationAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPowerSourceAttributeStatusID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPowerSourceAttributeOrderID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPowerSourceAttributeDescriptionID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPowerSourceAttributeWiredAssessedInputVoltageID(3L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPowerSourceAttributeWiredAssessedInputFrequencyID(4L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPowerSourceAttributeWiredCurrentTypeID(5L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPowerSourceAttributeWiredAssessedCurrentID(6L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPowerSourceAttributeWiredNominalVoltageID(7L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPowerSourceAttributeWiredMaximumCurrentID(8L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPowerSourceAttributeWiredPresentID(9L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPowerSourceAttributeActiveWiredFaultsID(10L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPowerSourceAttributeBatVoltageID(11L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPowerSourceAttributeBatPercentRemainingID(12L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPowerSourceAttributeBatTimeRemainingID(13L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPowerSourceAttributeBatChargeLevelID(14L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPowerSourceAttributeBatReplacementNeededID(15L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPowerSourceAttributeBatReplaceabilityID(16L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPowerSourceAttributeBatPresentID(17L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPowerSourceAttributeActiveBatFaultsID(18L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPowerSourceAttributeBatReplacementDescriptionID(19L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPowerSourceAttributeBatCommonDesignationID(20L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPowerSourceAttributeBatANSIDesignationID(21L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPowerSourceAttributeBatIECDesignationID(22L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPowerSourceAttributeBatApprovedChemistryID(23L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPowerSourceAttributeBatCapacityID(24L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPowerSourceAttributeBatQuantityID(25L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPowerSourceAttributeBatChargeStateID(26L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPowerSourceAttributeBatTimeToFullChargeID(27L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPowerSourceAttributeBatFunctionalWhileChargingID(28L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPowerSourceAttributeBatChargingCurrentID(29L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPowerSourceAttributeActiveBatChargeFaultsID(30L),
    /**
     * @since Available in iOS 17.4 and later.
     */
    AttributeIDTypeClusterPowerSourceAttributeEndpointListID(31L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPowerSourceAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPowerSourceAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPowerSourceAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPowerSourceAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPowerSourceAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterGeneralCommissioningAttributeBreadcrumbID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterGeneralCommissioningAttributeBasicCommissioningInfoID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterGeneralCommissioningAttributeRegulatoryConfigID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterGeneralCommissioningAttributeLocationCapabilityID(3L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterGeneralCommissioningAttributeSupportsConcurrentConnectionID(4L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterGeneralCommissioningAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterGeneralCommissioningAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterGeneralCommissioningAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterGeneralCommissioningAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterGeneralCommissioningAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterNetworkCommissioningAttributeMaxNetworksID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterNetworkCommissioningAttributeNetworksID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterNetworkCommissioningAttributeScanMaxTimeSecondsID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterNetworkCommissioningAttributeConnectMaxTimeSecondsID(3L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterNetworkCommissioningAttributeInterfaceEnabledID(4L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterNetworkCommissioningAttributeLastNetworkingStatusID(5L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterNetworkCommissioningAttributeLastNetworkIDID(6L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterNetworkCommissioningAttributeLastConnectErrorValueID(7L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterNetworkCommissioningAttributeSupportedWiFiBandsID(8L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterNetworkCommissioningAttributeSupportedThreadFeaturesID(9L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterNetworkCommissioningAttributeThreadVersionID(10L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterNetworkCommissioningAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterNetworkCommissioningAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterNetworkCommissioningAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterNetworkCommissioningAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterNetworkCommissioningAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterDiagnosticLogsAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterDiagnosticLogsAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterDiagnosticLogsAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterDiagnosticLogsAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterDiagnosticLogsAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterGeneralDiagnosticsAttributeNetworkInterfacesID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterGeneralDiagnosticsAttributeRebootCountID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterGeneralDiagnosticsAttributeUpTimeID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterGeneralDiagnosticsAttributeTotalOperationalHoursID(3L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterGeneralDiagnosticsAttributeBootReasonID(4L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterGeneralDiagnosticsAttributeActiveHardwareFaultsID(5L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterGeneralDiagnosticsAttributeActiveRadioFaultsID(6L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterGeneralDiagnosticsAttributeActiveNetworkFaultsID(7L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterGeneralDiagnosticsAttributeTestEventTriggersEnabledID(8L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterGeneralDiagnosticsAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterGeneralDiagnosticsAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterGeneralDiagnosticsAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterGeneralDiagnosticsAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterGeneralDiagnosticsAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterSoftwareDiagnosticsAttributeThreadMetricsID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterSoftwareDiagnosticsAttributeCurrentHeapFreeID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterSoftwareDiagnosticsAttributeCurrentHeapUsedID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterSoftwareDiagnosticsAttributeCurrentHeapHighWatermarkID(3L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterSoftwareDiagnosticsAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterSoftwareDiagnosticsAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterSoftwareDiagnosticsAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterSoftwareDiagnosticsAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterSoftwareDiagnosticsAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDiagnosticsAttributeChannelID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDiagnosticsAttributeRoutingRoleID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDiagnosticsAttributeNetworkNameID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDiagnosticsAttributePanIdID(3L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDiagnosticsAttributeExtendedPanIdID(4L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDiagnosticsAttributeMeshLocalPrefixID(5L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDiagnosticsAttributeOverrunCountID(6L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDiagnosticsAttributeNeighborTableID(7L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDiagnosticsAttributeRouteTableID(8L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDiagnosticsAttributePartitionIdID(9L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDiagnosticsAttributeWeightingID(10L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDiagnosticsAttributeDataVersionID(11L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDiagnosticsAttributeStableDataVersionID(12L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDiagnosticsAttributeLeaderRouterIdID(13L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDiagnosticsAttributeDetachedRoleCountID(14L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDiagnosticsAttributeChildRoleCountID(15L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDiagnosticsAttributeRouterRoleCountID(16L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDiagnosticsAttributeLeaderRoleCountID(17L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDiagnosticsAttributeAttachAttemptCountID(18L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDiagnosticsAttributePartitionIdChangeCountID(19L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDiagnosticsAttributeBetterPartitionAttachAttemptCountID(20L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDiagnosticsAttributeParentChangeCountID(21L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDiagnosticsAttributeTxTotalCountID(22L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDiagnosticsAttributeTxUnicastCountID(23L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDiagnosticsAttributeTxBroadcastCountID(24L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDiagnosticsAttributeTxAckRequestedCountID(25L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDiagnosticsAttributeTxAckedCountID(26L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDiagnosticsAttributeTxNoAckRequestedCountID(27L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDiagnosticsAttributeTxDataCountID(28L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDiagnosticsAttributeTxDataPollCountID(29L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDiagnosticsAttributeTxBeaconCountID(30L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDiagnosticsAttributeTxBeaconRequestCountID(31L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDiagnosticsAttributeTxOtherCountID(32L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDiagnosticsAttributeTxRetryCountID(33L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDiagnosticsAttributeTxDirectMaxRetryExpiryCountID(34L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDiagnosticsAttributeTxIndirectMaxRetryExpiryCountID(35L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDiagnosticsAttributeTxErrCcaCountID(36L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDiagnosticsAttributeTxErrAbortCountID(37L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDiagnosticsAttributeTxErrBusyChannelCountID(38L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDiagnosticsAttributeRxTotalCountID(39L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDiagnosticsAttributeRxUnicastCountID(40L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDiagnosticsAttributeRxBroadcastCountID(41L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDiagnosticsAttributeRxDataCountID(42L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDiagnosticsAttributeRxDataPollCountID(43L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDiagnosticsAttributeRxBeaconCountID(44L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDiagnosticsAttributeRxBeaconRequestCountID(45L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDiagnosticsAttributeRxOtherCountID(46L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDiagnosticsAttributeRxAddressFilteredCountID(47L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDiagnosticsAttributeRxDestAddrFilteredCountID(48L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDiagnosticsAttributeRxDuplicatedCountID(49L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDiagnosticsAttributeRxErrNoFrameCountID(50L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDiagnosticsAttributeRxErrUnknownNeighborCountID(51L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDiagnosticsAttributeRxErrInvalidSrcAddrCountID(52L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDiagnosticsAttributeRxErrSecCountID(53L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDiagnosticsAttributeRxErrFcsCountID(54L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDiagnosticsAttributeRxErrOtherCountID(55L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDiagnosticsAttributeActiveTimestampID(56L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDiagnosticsAttributePendingTimestampID(57L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDiagnosticsAttributeDelayID(58L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDiagnosticsAttributeSecurityPolicyID(59L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDiagnosticsAttributeChannelPage0MaskID(60L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDiagnosticsAttributeOperationalDatasetComponentsID(61L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDiagnosticsAttributeActiveNetworkFaultsListID(62L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDiagnosticsAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDiagnosticsAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDiagnosticsAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDiagnosticsAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDiagnosticsAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterWiFiNetworkDiagnosticsAttributeBSSIDID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterWiFiNetworkDiagnosticsAttributeSecurityTypeID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterWiFiNetworkDiagnosticsAttributeWiFiVersionID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterWiFiNetworkDiagnosticsAttributeChannelNumberID(3L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterWiFiNetworkDiagnosticsAttributeRSSIID(4L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterWiFiNetworkDiagnosticsAttributeBeaconLostCountID(5L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterWiFiNetworkDiagnosticsAttributeBeaconRxCountID(6L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterWiFiNetworkDiagnosticsAttributePacketMulticastRxCountID(7L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterWiFiNetworkDiagnosticsAttributePacketMulticastTxCountID(8L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterWiFiNetworkDiagnosticsAttributePacketUnicastRxCountID(9L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterWiFiNetworkDiagnosticsAttributePacketUnicastTxCountID(10L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterWiFiNetworkDiagnosticsAttributeCurrentMaxRateID(11L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterWiFiNetworkDiagnosticsAttributeOverrunCountID(12L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterWiFiNetworkDiagnosticsAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterWiFiNetworkDiagnosticsAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterWiFiNetworkDiagnosticsAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterWiFiNetworkDiagnosticsAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterWiFiNetworkDiagnosticsAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterEthernetNetworkDiagnosticsAttributePHYRateID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterEthernetNetworkDiagnosticsAttributeFullDuplexID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterEthernetNetworkDiagnosticsAttributePacketRxCountID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterEthernetNetworkDiagnosticsAttributePacketTxCountID(3L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterEthernetNetworkDiagnosticsAttributeTxErrCountID(4L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterEthernetNetworkDiagnosticsAttributeCollisionCountID(5L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterEthernetNetworkDiagnosticsAttributeOverrunCountID(6L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterEthernetNetworkDiagnosticsAttributeCarrierDetectID(7L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterEthernetNetworkDiagnosticsAttributeTimeSinceResetID(8L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterEthernetNetworkDiagnosticsAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterEthernetNetworkDiagnosticsAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterEthernetNetworkDiagnosticsAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterEthernetNetworkDiagnosticsAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterEthernetNetworkDiagnosticsAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterTimeSynchronizationAttributeUTCTimeID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterTimeSynchronizationAttributeGranularityID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterTimeSynchronizationAttributeTimeSourceID(2L),
    /**
     * @since Available in iOS 17.0 and later.
     */
    AttributeIDTypeClusterTimeSynchronizationAttributeTrustedTimeSourceID(3L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterTimeSynchronizationAttributeTrustedTimeNodeIdID(3L),
    /**
     * @since Available in iOS 17.0 and later.
     */
    AttributeIDTypeClusterTimeSynchronizationAttributeDefaultNTPID(4L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterTimeSynchronizationAttributeDefaultNtpID(4L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterTimeSynchronizationAttributeTimeZoneID(5L),
    /**
     * @since Available in iOS 16.5 and later.
     */
    AttributeIDTypeClusterTimeSynchronizationAttributeDSTOffsetID(6L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterTimeSynchronizationAttributeLocalTimeID(7L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterTimeSynchronizationAttributeTimeZoneDatabaseID(8L),
    /**
     * @since Available in iOS 17.0 and later.
     */
    AttributeIDTypeClusterTimeSynchronizationAttributeNTPServerAvailableID(9L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterTimeSynchronizationAttributeNtpServerPortID(9L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterTimeSynchronizationAttributeTimeZoneListMaxSizeID(10L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterTimeSynchronizationAttributeDSTOffsetListMaxSizeID(11L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterTimeSynchronizationAttributeSupportsDNSResolveID(12L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterTimeSynchronizationAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterTimeSynchronizationAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterTimeSynchronizationAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterTimeSynchronizationAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterTimeSynchronizationAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBridgedDeviceBasicInformationAttributeVendorNameID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBridgedDeviceBasicInformationAttributeVendorIDID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBridgedDeviceBasicInformationAttributeProductNameID(3L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterBridgedDeviceBasicInformationAttributeProductIDID(4L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBridgedDeviceBasicInformationAttributeNodeLabelID(5L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBridgedDeviceBasicInformationAttributeHardwareVersionID(7L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBridgedDeviceBasicInformationAttributeHardwareVersionStringID(8L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBridgedDeviceBasicInformationAttributeSoftwareVersionID(9L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBridgedDeviceBasicInformationAttributeSoftwareVersionStringID(10L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBridgedDeviceBasicInformationAttributeManufacturingDateID(11L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBridgedDeviceBasicInformationAttributePartNumberID(12L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBridgedDeviceBasicInformationAttributeProductURLID(13L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBridgedDeviceBasicInformationAttributeProductLabelID(14L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBridgedDeviceBasicInformationAttributeSerialNumberID(15L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBridgedDeviceBasicInformationAttributeReachableID(17L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBridgedDeviceBasicInformationAttributeUniqueIDID(18L),
    /**
     * @since Available in iOS 17.0 and later.
     */
    AttributeIDTypeClusterBridgedDeviceBasicInformationAttributeProductAppearanceID(20L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBridgedDeviceBasicInformationAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBridgedDeviceBasicInformationAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBridgedDeviceBasicInformationAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBridgedDeviceBasicInformationAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBridgedDeviceBasicInformationAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterSwitchAttributeNumberOfPositionsID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterSwitchAttributeCurrentPositionID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterSwitchAttributeMultiPressMaxID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterSwitchAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterSwitchAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterSwitchAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterSwitchAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterSwitchAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterAdministratorCommissioningAttributeWindowStatusID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterAdministratorCommissioningAttributeAdminFabricIndexID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterAdministratorCommissioningAttributeAdminVendorIdID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterAdministratorCommissioningAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterAdministratorCommissioningAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterAdministratorCommissioningAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterAdministratorCommissioningAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterAdministratorCommissioningAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterOperationalCredentialsAttributeNOCsID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterOperationalCredentialsAttributeFabricsID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterOperationalCredentialsAttributeSupportedFabricsID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterOperationalCredentialsAttributeCommissionedFabricsID(3L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterOperationalCredentialsAttributeTrustedRootCertificatesID(4L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterOperationalCredentialsAttributeCurrentFabricIndexID(5L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterOperationalCredentialsAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterOperationalCredentialsAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterOperationalCredentialsAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterOperationalCredentialsAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterOperationalCredentialsAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterGroupKeyManagementAttributeGroupKeyMapID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterGroupKeyManagementAttributeGroupTableID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterGroupKeyManagementAttributeMaxGroupsPerFabricID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterGroupKeyManagementAttributeMaxGroupKeysPerFabricID(3L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterGroupKeyManagementAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterGroupKeyManagementAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterGroupKeyManagementAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterGroupKeyManagementAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterGroupKeyManagementAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterFixedLabelAttributeLabelListID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterFixedLabelAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterFixedLabelAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterFixedLabelAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterFixedLabelAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterFixedLabelAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUserLabelAttributeLabelListID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUserLabelAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUserLabelAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUserLabelAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUserLabelAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUserLabelAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBooleanStateAttributeStateValueID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBooleanStateAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBooleanStateAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBooleanStateAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBooleanStateAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBooleanStateAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterICDManagementAttributeIdleModeDurationID(0L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterICDManagementAttributeActiveModeDurationID(1L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterICDManagementAttributeActiveModeThresholdID(2L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterICDManagementAttributeRegisteredClientsID(3L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterICDManagementAttributeICDCounterID(4L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterICDManagementAttributeClientsSupportedPerFabricID(5L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterICDManagementAttributeUserActiveModeTriggerHintID(6L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterICDManagementAttributeUserActiveModeTriggerInstructionID(7L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterICDManagementAttributeOperatingModeID(8L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterICDManagementAttributeMaximumCheckInBackOffID(9L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterICDManagementAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterICDManagementAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterICDManagementAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterICDManagementAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterICDManagementAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterOvenCavityOperationalStateAttributePhaseListID(0L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterOvenCavityOperationalStateAttributeCurrentPhaseID(1L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterOvenCavityOperationalStateAttributeCountdownTimeID(2L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterOvenCavityOperationalStateAttributeOperationalStateListID(3L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterOvenCavityOperationalStateAttributeOperationalStateID(4L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterOvenCavityOperationalStateAttributeOperationalErrorID(5L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterOvenCavityOperationalStateAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterOvenCavityOperationalStateAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterOvenCavityOperationalStateAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterOvenCavityOperationalStateAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterOvenCavityOperationalStateAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterOvenModeAttributeSupportedModesID(0L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterOvenModeAttributeCurrentModeID(1L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterOvenModeAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterOvenModeAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterOvenModeAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterOvenModeAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterOvenModeAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterLaundryDryerControlsAttributeSupportedDrynessLevelsID(0L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterLaundryDryerControlsAttributeSelectedDrynessLevelID(1L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterLaundryDryerControlsAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterLaundryDryerControlsAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterLaundryDryerControlsAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterLaundryDryerControlsAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterLaundryDryerControlsAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterModeSelectAttributeDescriptionID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterModeSelectAttributeStandardNamespaceID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterModeSelectAttributeSupportedModesID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterModeSelectAttributeCurrentModeID(3L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterModeSelectAttributeStartUpModeID(4L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterModeSelectAttributeOnModeID(5L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterModeSelectAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterModeSelectAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterModeSelectAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterModeSelectAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterModeSelectAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterLaundryWasherModeAttributeSupportedModesID(0L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterLaundryWasherModeAttributeCurrentModeID(1L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterLaundryWasherModeAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterLaundryWasherModeAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterLaundryWasherModeAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterLaundryWasherModeAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterLaundryWasherModeAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterRefrigeratorAndTemperatureControlledCabinetModeAttributeSupportedModesID(0L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterRefrigeratorAndTemperatureControlledCabinetModeAttributeCurrentModeID(1L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterRefrigeratorAndTemperatureControlledCabinetModeAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterRefrigeratorAndTemperatureControlledCabinetModeAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterRefrigeratorAndTemperatureControlledCabinetModeAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterRefrigeratorAndTemperatureControlledCabinetModeAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterRefrigeratorAndTemperatureControlledCabinetModeAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterLaundryWasherControlsAttributeSpinSpeedsID(0L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterLaundryWasherControlsAttributeSpinSpeedCurrentID(1L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterLaundryWasherControlsAttributeNumberOfRinsesID(2L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterLaundryWasherControlsAttributeSupportedRinsesID(3L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterLaundryWasherControlsAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterLaundryWasherControlsAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterLaundryWasherControlsAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterLaundryWasherControlsAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterLaundryWasherControlsAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 17.4 and later.
     */
    AttributeIDTypeClusterRVCRunModeAttributeSupportedModesID(0L),
    /**
     * @since Available in iOS 17.4 and later.
     */
    AttributeIDTypeClusterRVCRunModeAttributeCurrentModeID(1L),
    /**
     * @since Available in iOS 17.4 and later.
     */
    AttributeIDTypeClusterRVCRunModeAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 17.4 and later.
     */
    AttributeIDTypeClusterRVCRunModeAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 17.4 and later.
     */
    AttributeIDTypeClusterRVCRunModeAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 17.4 and later.
     */
    AttributeIDTypeClusterRVCRunModeAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 17.4 and later.
     */
    AttributeIDTypeClusterRVCRunModeAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 17.4 and later.
     */
    AttributeIDTypeClusterRVCCleanModeAttributeSupportedModesID(0L),
    /**
     * @since Available in iOS 17.4 and later.
     */
    AttributeIDTypeClusterRVCCleanModeAttributeCurrentModeID(1L),
    /**
     * @since Available in iOS 17.4 and later.
     */
    AttributeIDTypeClusterRVCCleanModeAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 17.4 and later.
     */
    AttributeIDTypeClusterRVCCleanModeAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 17.4 and later.
     */
    AttributeIDTypeClusterRVCCleanModeAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 17.4 and later.
     */
    AttributeIDTypeClusterRVCCleanModeAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 17.4 and later.
     */
    AttributeIDTypeClusterRVCCleanModeAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterTemperatureControlAttributeTemperatureSetpointID(0L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterTemperatureControlAttributeMinTemperatureID(1L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterTemperatureControlAttributeMaxTemperatureID(2L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterTemperatureControlAttributeStepID(3L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterTemperatureControlAttributeSelectedTemperatureLevelID(4L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterTemperatureControlAttributeSupportedTemperatureLevelsID(5L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterTemperatureControlAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterTemperatureControlAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterTemperatureControlAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterTemperatureControlAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterTemperatureControlAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterRefrigeratorAlarmAttributeMaskID(0L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterRefrigeratorAlarmAttributeStateID(2L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterRefrigeratorAlarmAttributeSupportedID(3L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterRefrigeratorAlarmAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterRefrigeratorAlarmAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterRefrigeratorAlarmAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterRefrigeratorAlarmAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterRefrigeratorAlarmAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterDishwasherModeAttributeSupportedModesID(0L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterDishwasherModeAttributeCurrentModeID(1L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterDishwasherModeAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterDishwasherModeAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterDishwasherModeAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterDishwasherModeAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterDishwasherModeAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterAirQualityAttributeAirQualityID(0L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterAirQualityAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterAirQualityAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterAirQualityAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterAirQualityAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterAirQualityAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterSmokeCOAlarmAttributeExpressedStateID(0L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterSmokeCOAlarmAttributeSmokeStateID(1L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterSmokeCOAlarmAttributeCOStateID(2L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterSmokeCOAlarmAttributeBatteryAlertID(3L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterSmokeCOAlarmAttributeDeviceMutedID(4L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterSmokeCOAlarmAttributeTestInProgressID(5L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterSmokeCOAlarmAttributeHardwareFaultAlertID(6L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterSmokeCOAlarmAttributeEndOfServiceAlertID(7L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterSmokeCOAlarmAttributeInterconnectSmokeAlarmID(8L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterSmokeCOAlarmAttributeInterconnectCOAlarmID(9L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterSmokeCOAlarmAttributeContaminationStateID(10L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterSmokeCOAlarmAttributeSmokeSensitivityLevelID(11L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterSmokeCOAlarmAttributeExpiryDateID(12L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterSmokeCOAlarmAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterSmokeCOAlarmAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterSmokeCOAlarmAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterSmokeCOAlarmAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterSmokeCOAlarmAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterDishwasherAlarmAttributeMaskID(0L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterDishwasherAlarmAttributeLatchID(1L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterDishwasherAlarmAttributeStateID(2L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterDishwasherAlarmAttributeSupportedID(3L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterDishwasherAlarmAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterDishwasherAlarmAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterDishwasherAlarmAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterDishwasherAlarmAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterDishwasherAlarmAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterMicrowaveOvenModeAttributeSupportedModesID(0L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterMicrowaveOvenModeAttributeCurrentModeID(1L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterMicrowaveOvenModeAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterMicrowaveOvenModeAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterMicrowaveOvenModeAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterMicrowaveOvenModeAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterMicrowaveOvenModeAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterMicrowaveOvenControlAttributeCookTimeID(0L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterMicrowaveOvenControlAttributeMaxCookTimeID(1L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterMicrowaveOvenControlAttributePowerSettingID(2L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterMicrowaveOvenControlAttributeMinPowerID(3L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterMicrowaveOvenControlAttributeMaxPowerID(4L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterMicrowaveOvenControlAttributePowerStepID(5L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterMicrowaveOvenControlAttributeWattRatingID(8L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterMicrowaveOvenControlAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterMicrowaveOvenControlAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterMicrowaveOvenControlAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterMicrowaveOvenControlAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterMicrowaveOvenControlAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 17.4 and later.
     */
    AttributeIDTypeClusterOperationalStateAttributePhaseListID(0L),
    /**
     * @since Available in iOS 17.4 and later.
     */
    AttributeIDTypeClusterOperationalStateAttributeCurrentPhaseID(1L),
    /**
     * @since Available in iOS 17.4 and later.
     */
    AttributeIDTypeClusterOperationalStateAttributeCountdownTimeID(2L),
    /**
     * @since Available in iOS 17.4 and later.
     */
    AttributeIDTypeClusterOperationalStateAttributeOperationalStateListID(3L),
    /**
     * @since Available in iOS 17.4 and later.
     */
    AttributeIDTypeClusterOperationalStateAttributeOperationalStateID(4L),
    /**
     * @since Available in iOS 17.4 and later.
     */
    AttributeIDTypeClusterOperationalStateAttributeOperationalErrorID(5L),
    /**
     * @since Available in iOS 17.4 and later.
     */
    AttributeIDTypeClusterOperationalStateAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 17.4 and later.
     */
    AttributeIDTypeClusterOperationalStateAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 17.4 and later.
     */
    AttributeIDTypeClusterOperationalStateAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 17.4 and later.
     */
    AttributeIDTypeClusterOperationalStateAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 17.4 and later.
     */
    AttributeIDTypeClusterOperationalStateAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 17.4 and later.
     */
    AttributeIDTypeClusterRVCOperationalStateAttributePhaseListID(0L),
    /**
     * @since Available in iOS 17.4 and later.
     */
    AttributeIDTypeClusterRVCOperationalStateAttributeCurrentPhaseID(1L),
    /**
     * @since Available in iOS 17.4 and later.
     */
    AttributeIDTypeClusterRVCOperationalStateAttributeCountdownTimeID(2L),
    /**
     * @since Available in iOS 17.4 and later.
     */
    AttributeIDTypeClusterRVCOperationalStateAttributeOperationalStateListID(3L),
    /**
     * @since Available in iOS 17.4 and later.
     */
    AttributeIDTypeClusterRVCOperationalStateAttributeOperationalStateID(4L),
    /**
     * @since Available in iOS 17.4 and later.
     */
    AttributeIDTypeClusterRVCOperationalStateAttributeOperationalErrorID(5L),
    /**
     * @since Available in iOS 17.4 and later.
     */
    AttributeIDTypeClusterRVCOperationalStateAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 17.4 and later.
     */
    AttributeIDTypeClusterRVCOperationalStateAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 17.4 and later.
     */
    AttributeIDTypeClusterRVCOperationalStateAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 17.4 and later.
     */
    AttributeIDTypeClusterRVCOperationalStateAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 17.4 and later.
     */
    AttributeIDTypeClusterRVCOperationalStateAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterHEPAFilterMonitoringAttributeConditionID(0L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterHEPAFilterMonitoringAttributeDegradationDirectionID(1L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterHEPAFilterMonitoringAttributeChangeIndicationID(2L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterHEPAFilterMonitoringAttributeInPlaceIndicatorID(3L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterHEPAFilterMonitoringAttributeLastChangedTimeID(4L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterHEPAFilterMonitoringAttributeReplacementProductListID(5L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterHEPAFilterMonitoringAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterHEPAFilterMonitoringAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterHEPAFilterMonitoringAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterHEPAFilterMonitoringAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterHEPAFilterMonitoringAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterActivatedCarbonFilterMonitoringAttributeConditionID(0L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterActivatedCarbonFilterMonitoringAttributeDegradationDirectionID(1L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterActivatedCarbonFilterMonitoringAttributeChangeIndicationID(2L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterActivatedCarbonFilterMonitoringAttributeInPlaceIndicatorID(3L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterActivatedCarbonFilterMonitoringAttributeLastChangedTimeID(4L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterActivatedCarbonFilterMonitoringAttributeReplacementProductListID(5L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterActivatedCarbonFilterMonitoringAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterActivatedCarbonFilterMonitoringAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterActivatedCarbonFilterMonitoringAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterActivatedCarbonFilterMonitoringAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterActivatedCarbonFilterMonitoringAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterBooleanStateConfigurationAttributeCurrentSensitivityLevelID(0L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterBooleanStateConfigurationAttributeSupportedSensitivityLevelsID(1L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterBooleanStateConfigurationAttributeDefaultSensitivityLevelID(2L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterBooleanStateConfigurationAttributeAlarmsActiveID(3L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterBooleanStateConfigurationAttributeAlarmsSuppressedID(4L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterBooleanStateConfigurationAttributeAlarmsEnabledID(5L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterBooleanStateConfigurationAttributeAlarmsSupportedID(6L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterBooleanStateConfigurationAttributeSensorFaultID(7L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterBooleanStateConfigurationAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterBooleanStateConfigurationAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterBooleanStateConfigurationAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterBooleanStateConfigurationAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterBooleanStateConfigurationAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterValveConfigurationAndControlAttributeOpenDurationID(0L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterValveConfigurationAndControlAttributeDefaultOpenDurationID(1L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterValveConfigurationAndControlAttributeAutoCloseTimeID(2L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterValveConfigurationAndControlAttributeRemainingDurationID(3L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterValveConfigurationAndControlAttributeCurrentStateID(4L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterValveConfigurationAndControlAttributeTargetStateID(5L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterValveConfigurationAndControlAttributeCurrentLevelID(6L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterValveConfigurationAndControlAttributeTargetLevelID(7L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterValveConfigurationAndControlAttributeDefaultOpenLevelID(8L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterValveConfigurationAndControlAttributeValveFaultID(9L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterValveConfigurationAndControlAttributeLevelStepID(10L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterValveConfigurationAndControlAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterValveConfigurationAndControlAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterValveConfigurationAndControlAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterValveConfigurationAndControlAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterValveConfigurationAndControlAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterElectricalPowerMeasurementAttributePowerModeID(0L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterElectricalPowerMeasurementAttributeNumberOfMeasurementTypesID(1L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterElectricalPowerMeasurementAttributeAccuracyID(2L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterElectricalPowerMeasurementAttributeRangesID(3L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterElectricalPowerMeasurementAttributeVoltageID(4L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterElectricalPowerMeasurementAttributeActiveCurrentID(5L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterElectricalPowerMeasurementAttributeReactiveCurrentID(6L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterElectricalPowerMeasurementAttributeApparentCurrentID(7L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterElectricalPowerMeasurementAttributeActivePowerID(8L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterElectricalPowerMeasurementAttributeReactivePowerID(9L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterElectricalPowerMeasurementAttributeApparentPowerID(10L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterElectricalPowerMeasurementAttributeRMSVoltageID(11L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterElectricalPowerMeasurementAttributeRMSCurrentID(12L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterElectricalPowerMeasurementAttributeRMSPowerID(13L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterElectricalPowerMeasurementAttributeFrequencyID(14L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterElectricalPowerMeasurementAttributeHarmonicCurrentsID(15L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterElectricalPowerMeasurementAttributeHarmonicPhasesID(16L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterElectricalPowerMeasurementAttributePowerFactorID(17L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterElectricalPowerMeasurementAttributeNeutralCurrentID(18L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterElectricalPowerMeasurementAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterElectricalPowerMeasurementAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterElectricalPowerMeasurementAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterElectricalPowerMeasurementAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterElectricalPowerMeasurementAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterElectricalEnergyMeasurementAttributeAccuracyID(0L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterElectricalEnergyMeasurementAttributeCumulativeEnergyImportedID(1L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterElectricalEnergyMeasurementAttributeCumulativeEnergyExportedID(2L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterElectricalEnergyMeasurementAttributePeriodicEnergyImportedID(3L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterElectricalEnergyMeasurementAttributePeriodicEnergyExportedID(4L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterElectricalEnergyMeasurementAttributeCumulativeEnergyResetID(5L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterElectricalEnergyMeasurementAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterElectricalEnergyMeasurementAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterElectricalEnergyMeasurementAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterElectricalEnergyMeasurementAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterElectricalEnergyMeasurementAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterWaterHeaterManagementAttributeHeaterTypesID(0L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterWaterHeaterManagementAttributeHeatDemandID(1L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterWaterHeaterManagementAttributeTankVolumeID(2L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterWaterHeaterManagementAttributeEstimatedHeatRequiredID(3L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterWaterHeaterManagementAttributeTankPercentageID(4L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterWaterHeaterManagementAttributeBoostStateID(5L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterWaterHeaterManagementAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterWaterHeaterManagementAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterWaterHeaterManagementAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterWaterHeaterManagementAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterWaterHeaterManagementAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterMessagesAttributeMessagesID(0L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterMessagesAttributeActiveMessageIDsID(1L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterMessagesAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterMessagesAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterMessagesAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterMessagesAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterMessagesAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterDeviceEnergyManagementAttributeESATypeID(0L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterDeviceEnergyManagementAttributeESACanGenerateID(1L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterDeviceEnergyManagementAttributeESAStateID(2L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterDeviceEnergyManagementAttributeAbsMinPowerID(3L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterDeviceEnergyManagementAttributeAbsMaxPowerID(4L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterDeviceEnergyManagementAttributePowerAdjustmentCapabilityID(5L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterDeviceEnergyManagementAttributeForecastID(6L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterDeviceEnergyManagementAttributeOptOutStateID(7L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterDeviceEnergyManagementAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterDeviceEnergyManagementAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterDeviceEnergyManagementAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterDeviceEnergyManagementAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterDeviceEnergyManagementAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterEnergyEVSEAttributeStateID(0L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterEnergyEVSEAttributeSupplyStateID(1L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterEnergyEVSEAttributeFaultStateID(2L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterEnergyEVSEAttributeChargingEnabledUntilID(3L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterEnergyEVSEAttributeCircuitCapacityID(5L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterEnergyEVSEAttributeMinimumChargeCurrentID(6L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterEnergyEVSEAttributeMaximumChargeCurrentID(7L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterEnergyEVSEAttributeUserMaximumChargeCurrentID(9L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterEnergyEVSEAttributeRandomizationDelayWindowID(10L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterEnergyEVSEAttributeNextChargeStartTimeID(35L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterEnergyEVSEAttributeNextChargeTargetTimeID(36L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterEnergyEVSEAttributeNextChargeRequiredEnergyID(37L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterEnergyEVSEAttributeNextChargeTargetSoCID(38L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterEnergyEVSEAttributeApproximateEVEfficiencyID(39L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterEnergyEVSEAttributeSessionIDID(64L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterEnergyEVSEAttributeSessionDurationID(65L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterEnergyEVSEAttributeSessionEnergyChargedID(66L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterEnergyEVSEAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterEnergyEVSEAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterEnergyEVSEAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterEnergyEVSEAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterEnergyEVSEAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterPowerTopologyAttributeAvailableEndpointsID(0L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterPowerTopologyAttributeActiveEndpointsID(1L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterPowerTopologyAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterPowerTopologyAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterPowerTopologyAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterPowerTopologyAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterPowerTopologyAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterEnergyEVSEModeAttributeSupportedModesID(0L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterEnergyEVSEModeAttributeCurrentModeID(1L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterEnergyEVSEModeAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterEnergyEVSEModeAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterEnergyEVSEModeAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterEnergyEVSEModeAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterEnergyEVSEModeAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterWaterHeaterModeAttributeSupportedModesID(0L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterWaterHeaterModeAttributeCurrentModeID(1L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterWaterHeaterModeAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterWaterHeaterModeAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterWaterHeaterModeAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterWaterHeaterModeAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterWaterHeaterModeAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterDeviceEnergyManagementModeAttributeSupportedModesID(0L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterDeviceEnergyManagementModeAttributeCurrentModeID(1L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterDeviceEnergyManagementModeAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterDeviceEnergyManagementModeAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterDeviceEnergyManagementModeAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterDeviceEnergyManagementModeAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterDeviceEnergyManagementModeAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterDoorLockAttributeLockStateID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterDoorLockAttributeLockTypeID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterDoorLockAttributeActuatorEnabledID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterDoorLockAttributeDoorStateID(3L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterDoorLockAttributeDoorOpenEventsID(4L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterDoorLockAttributeDoorClosedEventsID(5L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterDoorLockAttributeOpenPeriodID(6L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterDoorLockAttributeNumberOfTotalUsersSupportedID(17L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterDoorLockAttributeNumberOfPINUsersSupportedID(18L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterDoorLockAttributeNumberOfRFIDUsersSupportedID(19L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterDoorLockAttributeNumberOfWeekDaySchedulesSupportedPerUserID(20L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterDoorLockAttributeNumberOfYearDaySchedulesSupportedPerUserID(21L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterDoorLockAttributeNumberOfHolidaySchedulesSupportedID(22L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterDoorLockAttributeMaxPINCodeLengthID(23L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterDoorLockAttributeMinPINCodeLengthID(24L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterDoorLockAttributeMaxRFIDCodeLengthID(25L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterDoorLockAttributeMinRFIDCodeLengthID(26L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterDoorLockAttributeCredentialRulesSupportID(27L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterDoorLockAttributeNumberOfCredentialsSupportedPerUserID(28L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterDoorLockAttributeLanguageID(33L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterDoorLockAttributeLEDSettingsID(34L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterDoorLockAttributeAutoRelockTimeID(35L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterDoorLockAttributeSoundVolumeID(36L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterDoorLockAttributeOperatingModeID(37L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterDoorLockAttributeSupportedOperatingModesID(38L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterDoorLockAttributeDefaultConfigurationRegisterID(39L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterDoorLockAttributeEnableLocalProgrammingID(40L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterDoorLockAttributeEnableOneTouchLockingID(41L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterDoorLockAttributeEnableInsideStatusLEDID(42L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterDoorLockAttributeEnablePrivacyModeButtonID(43L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterDoorLockAttributeLocalProgrammingFeaturesID(44L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterDoorLockAttributeWrongCodeEntryLimitID(48L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterDoorLockAttributeUserCodeTemporaryDisableTimeID(49L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterDoorLockAttributeSendPINOverTheAirID(50L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterDoorLockAttributeRequirePINforRemoteOperationID(51L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterDoorLockAttributeExpiringUserTimeoutID(53L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterDoorLockAttributeAliroReaderVerificationKeyID(128L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterDoorLockAttributeAliroReaderGroupIdentifierID(129L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterDoorLockAttributeAliroReaderGroupSubIdentifierID(130L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterDoorLockAttributeAliroExpeditedTransactionSupportedProtocolVersionsID(131L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterDoorLockAttributeAliroGroupResolvingKeyID(132L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterDoorLockAttributeAliroSupportedBLEUWBProtocolVersionsID(133L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterDoorLockAttributeAliroBLEAdvertisingVersionID(134L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterDoorLockAttributeNumberOfAliroCredentialIssuerKeysSupportedID(135L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterDoorLockAttributeNumberOfAliroEndpointKeysSupportedID(136L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterDoorLockAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterDoorLockAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterDoorLockAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterDoorLockAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterDoorLockAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterWindowCoveringAttributeTypeID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterWindowCoveringAttributePhysicalClosedLimitLiftID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterWindowCoveringAttributePhysicalClosedLimitTiltID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterWindowCoveringAttributeCurrentPositionLiftID(3L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterWindowCoveringAttributeCurrentPositionTiltID(4L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterWindowCoveringAttributeNumberOfActuationsLiftID(5L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterWindowCoveringAttributeNumberOfActuationsTiltID(6L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterWindowCoveringAttributeConfigStatusID(7L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterWindowCoveringAttributeCurrentPositionLiftPercentageID(8L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterWindowCoveringAttributeCurrentPositionTiltPercentageID(9L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterWindowCoveringAttributeOperationalStatusID(10L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterWindowCoveringAttributeTargetPositionLiftPercent100thsID(11L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterWindowCoveringAttributeTargetPositionTiltPercent100thsID(12L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterWindowCoveringAttributeEndProductTypeID(13L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterWindowCoveringAttributeCurrentPositionLiftPercent100thsID(14L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterWindowCoveringAttributeCurrentPositionTiltPercent100thsID(15L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterWindowCoveringAttributeInstalledOpenLimitLiftID(16L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterWindowCoveringAttributeInstalledClosedLimitLiftID(17L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterWindowCoveringAttributeInstalledOpenLimitTiltID(18L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterWindowCoveringAttributeInstalledClosedLimitTiltID(19L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterWindowCoveringAttributeModeID(23L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterWindowCoveringAttributeSafetyStatusID(26L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterWindowCoveringAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterWindowCoveringAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterWindowCoveringAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterWindowCoveringAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterWindowCoveringAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterServiceAreaAttributeSupportedAreasID(0L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterServiceAreaAttributeSupportedMapsID(1L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterServiceAreaAttributeSelectedAreasID(2L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterServiceAreaAttributeCurrentAreaID(3L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterServiceAreaAttributeEstimatedEndTimeID(4L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterServiceAreaAttributeProgressID(5L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterServiceAreaAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterServiceAreaAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterServiceAreaAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterServiceAreaAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterServiceAreaAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPumpConfigurationAndControlAttributeMaxPressureID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPumpConfigurationAndControlAttributeMaxSpeedID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPumpConfigurationAndControlAttributeMaxFlowID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPumpConfigurationAndControlAttributeMinConstPressureID(3L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPumpConfigurationAndControlAttributeMaxConstPressureID(4L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPumpConfigurationAndControlAttributeMinCompPressureID(5L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPumpConfigurationAndControlAttributeMaxCompPressureID(6L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPumpConfigurationAndControlAttributeMinConstSpeedID(7L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPumpConfigurationAndControlAttributeMaxConstSpeedID(8L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPumpConfigurationAndControlAttributeMinConstFlowID(9L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPumpConfigurationAndControlAttributeMaxConstFlowID(10L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPumpConfigurationAndControlAttributeMinConstTempID(11L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPumpConfigurationAndControlAttributeMaxConstTempID(12L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPumpConfigurationAndControlAttributePumpStatusID(16L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPumpConfigurationAndControlAttributeEffectiveOperationModeID(17L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPumpConfigurationAndControlAttributeEffectiveControlModeID(18L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPumpConfigurationAndControlAttributeCapacityID(19L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPumpConfigurationAndControlAttributeSpeedID(20L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPumpConfigurationAndControlAttributeLifetimeRunningHoursID(21L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPumpConfigurationAndControlAttributePowerID(22L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPumpConfigurationAndControlAttributeLifetimeEnergyConsumedID(23L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPumpConfigurationAndControlAttributeOperationModeID(32L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPumpConfigurationAndControlAttributeControlModeID(33L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPumpConfigurationAndControlAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPumpConfigurationAndControlAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPumpConfigurationAndControlAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPumpConfigurationAndControlAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPumpConfigurationAndControlAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThermostatAttributeLocalTemperatureID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThermostatAttributeOutdoorTemperatureID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThermostatAttributeOccupancyID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThermostatAttributeAbsMinHeatSetpointLimitID(3L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThermostatAttributeAbsMaxHeatSetpointLimitID(4L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThermostatAttributeAbsMinCoolSetpointLimitID(5L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThermostatAttributeAbsMaxCoolSetpointLimitID(6L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThermostatAttributePICoolingDemandID(7L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThermostatAttributePIHeatingDemandID(8L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThermostatAttributeHVACSystemTypeConfigurationID(9L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThermostatAttributeLocalTemperatureCalibrationID(16L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThermostatAttributeOccupiedCoolingSetpointID(17L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThermostatAttributeOccupiedHeatingSetpointID(18L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThermostatAttributeUnoccupiedCoolingSetpointID(19L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThermostatAttributeUnoccupiedHeatingSetpointID(20L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThermostatAttributeMinHeatSetpointLimitID(21L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThermostatAttributeMaxHeatSetpointLimitID(22L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThermostatAttributeMinCoolSetpointLimitID(23L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThermostatAttributeMaxCoolSetpointLimitID(24L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThermostatAttributeMinSetpointDeadBandID(25L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThermostatAttributeRemoteSensingID(26L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThermostatAttributeControlSequenceOfOperationID(27L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThermostatAttributeSystemModeID(28L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThermostatAttributeThermostatRunningModeID(30L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThermostatAttributeStartOfWeekID(32L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThermostatAttributeNumberOfWeeklyTransitionsID(33L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThermostatAttributeNumberOfDailyTransitionsID(34L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThermostatAttributeTemperatureSetpointHoldID(35L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThermostatAttributeTemperatureSetpointHoldDurationID(36L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThermostatAttributeThermostatProgrammingOperationModeID(37L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThermostatAttributeThermostatRunningStateID(41L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThermostatAttributeSetpointChangeSourceID(48L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThermostatAttributeSetpointChangeAmountID(49L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThermostatAttributeSetpointChangeSourceTimestampID(50L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThermostatAttributeOccupiedSetbackID(52L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThermostatAttributeOccupiedSetbackMinID(53L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThermostatAttributeOccupiedSetbackMaxID(54L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThermostatAttributeUnoccupiedSetbackID(55L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThermostatAttributeUnoccupiedSetbackMinID(56L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThermostatAttributeUnoccupiedSetbackMaxID(57L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThermostatAttributeEmergencyHeatDeltaID(58L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThermostatAttributeACTypeID(64L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThermostatAttributeACCapacityID(65L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThermostatAttributeACRefrigerantTypeID(66L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThermostatAttributeACCompressorTypeID(67L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThermostatAttributeACErrorCodeID(68L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThermostatAttributeACLouverPositionID(69L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThermostatAttributeACCoilTemperatureID(70L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThermostatAttributeACCapacityformatID(71L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterThermostatAttributePresetTypesID(72L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterThermostatAttributeScheduleTypesID(73L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterThermostatAttributeNumberOfPresetsID(74L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterThermostatAttributeNumberOfSchedulesID(75L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterThermostatAttributeNumberOfScheduleTransitionsID(76L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterThermostatAttributeNumberOfScheduleTransitionPerDayID(77L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterThermostatAttributeActivePresetHandleID(78L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterThermostatAttributeActiveScheduleHandleID(79L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterThermostatAttributePresetsID(80L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterThermostatAttributeSchedulesID(81L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterThermostatAttributeSetpointHoldExpiryTimestampID(82L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThermostatAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThermostatAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThermostatAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThermostatAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThermostatAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterFanControlAttributeFanModeID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterFanControlAttributeFanModeSequenceID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterFanControlAttributePercentSettingID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterFanControlAttributePercentCurrentID(3L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterFanControlAttributeSpeedMaxID(4L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterFanControlAttributeSpeedSettingID(5L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterFanControlAttributeSpeedCurrentID(6L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterFanControlAttributeRockSupportID(7L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterFanControlAttributeRockSettingID(8L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterFanControlAttributeWindSupportID(9L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterFanControlAttributeWindSettingID(10L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterFanControlAttributeAirflowDirectionID(11L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterFanControlAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterFanControlAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterFanControlAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterFanControlAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterFanControlAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThermostatUserInterfaceConfigurationAttributeTemperatureDisplayModeID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThermostatUserInterfaceConfigurationAttributeKeypadLockoutID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThermostatUserInterfaceConfigurationAttributeScheduleProgrammingVisibilityID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThermostatUserInterfaceConfigurationAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThermostatUserInterfaceConfigurationAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThermostatUserInterfaceConfigurationAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThermostatUserInterfaceConfigurationAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterThermostatUserInterfaceConfigurationAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterColorControlAttributeCurrentHueID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterColorControlAttributeCurrentSaturationID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterColorControlAttributeRemainingTimeID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterColorControlAttributeCurrentXID(3L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterColorControlAttributeCurrentYID(4L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterColorControlAttributeDriftCompensationID(5L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterColorControlAttributeCompensationTextID(6L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterColorControlAttributeColorTemperatureMiredsID(7L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterColorControlAttributeColorModeID(8L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterColorControlAttributeOptionsID(15L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterColorControlAttributeNumberOfPrimariesID(16L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterColorControlAttributePrimary1XID(17L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterColorControlAttributePrimary1YID(18L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterColorControlAttributePrimary1IntensityID(19L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterColorControlAttributePrimary2XID(21L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterColorControlAttributePrimary2YID(22L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterColorControlAttributePrimary2IntensityID(23L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterColorControlAttributePrimary3XID(25L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterColorControlAttributePrimary3YID(26L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterColorControlAttributePrimary3IntensityID(27L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterColorControlAttributePrimary4XID(32L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterColorControlAttributePrimary4YID(33L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterColorControlAttributePrimary4IntensityID(34L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterColorControlAttributePrimary5XID(36L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterColorControlAttributePrimary5YID(37L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterColorControlAttributePrimary5IntensityID(38L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterColorControlAttributePrimary6XID(40L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterColorControlAttributePrimary6YID(41L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterColorControlAttributePrimary6IntensityID(42L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterColorControlAttributeWhitePointXID(48L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterColorControlAttributeWhitePointYID(49L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterColorControlAttributeColorPointRXID(50L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterColorControlAttributeColorPointRYID(51L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterColorControlAttributeColorPointRIntensityID(52L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterColorControlAttributeColorPointGXID(54L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterColorControlAttributeColorPointGYID(55L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterColorControlAttributeColorPointGIntensityID(56L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterColorControlAttributeColorPointBXID(58L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterColorControlAttributeColorPointBYID(59L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterColorControlAttributeColorPointBIntensityID(60L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterColorControlAttributeEnhancedCurrentHueID(16384L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterColorControlAttributeEnhancedColorModeID(16385L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterColorControlAttributeColorLoopActiveID(16386L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterColorControlAttributeColorLoopDirectionID(16387L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterColorControlAttributeColorLoopTimeID(16388L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterColorControlAttributeColorLoopStartEnhancedHueID(16389L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterColorControlAttributeColorLoopStoredEnhancedHueID(16390L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterColorControlAttributeColorCapabilitiesID(16394L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterColorControlAttributeColorTempPhysicalMinMiredsID(16395L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterColorControlAttributeColorTempPhysicalMaxMiredsID(16396L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterColorControlAttributeCoupleColorTempToLevelMinMiredsID(16397L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterColorControlAttributeStartUpColorTemperatureMiredsID(16400L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterColorControlAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterColorControlAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterColorControlAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterColorControlAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterColorControlAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBallastConfigurationAttributePhysicalMinLevelID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBallastConfigurationAttributePhysicalMaxLevelID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBallastConfigurationAttributeBallastStatusID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBallastConfigurationAttributeMinLevelID(16L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBallastConfigurationAttributeMaxLevelID(17L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBallastConfigurationAttributeIntrinsicBallastFactorID(20L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBallastConfigurationAttributeBallastFactorAdjustmentID(21L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBallastConfigurationAttributeLampQuantityID(32L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBallastConfigurationAttributeLampTypeID(48L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBallastConfigurationAttributeLampManufacturerID(49L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBallastConfigurationAttributeLampRatedHoursID(50L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBallastConfigurationAttributeLampBurnHoursID(51L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBallastConfigurationAttributeLampAlarmModeID(52L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBallastConfigurationAttributeLampBurnHoursTripPointID(53L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBallastConfigurationAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBallastConfigurationAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBallastConfigurationAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBallastConfigurationAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBallastConfigurationAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterIlluminanceMeasurementAttributeMeasuredValueID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterIlluminanceMeasurementAttributeMinMeasuredValueID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterIlluminanceMeasurementAttributeMaxMeasuredValueID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterIlluminanceMeasurementAttributeToleranceID(3L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterIlluminanceMeasurementAttributeLightSensorTypeID(4L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterIlluminanceMeasurementAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterIlluminanceMeasurementAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterIlluminanceMeasurementAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterIlluminanceMeasurementAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterIlluminanceMeasurementAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterTemperatureMeasurementAttributeMeasuredValueID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterTemperatureMeasurementAttributeMinMeasuredValueID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterTemperatureMeasurementAttributeMaxMeasuredValueID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterTemperatureMeasurementAttributeToleranceID(3L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterTemperatureMeasurementAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterTemperatureMeasurementAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterTemperatureMeasurementAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterTemperatureMeasurementAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterTemperatureMeasurementAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPressureMeasurementAttributeMeasuredValueID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPressureMeasurementAttributeMinMeasuredValueID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPressureMeasurementAttributeMaxMeasuredValueID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPressureMeasurementAttributeToleranceID(3L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPressureMeasurementAttributeScaledValueID(16L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPressureMeasurementAttributeMinScaledValueID(17L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPressureMeasurementAttributeMaxScaledValueID(18L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPressureMeasurementAttributeScaledToleranceID(19L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPressureMeasurementAttributeScaleID(20L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPressureMeasurementAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPressureMeasurementAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPressureMeasurementAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPressureMeasurementAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterPressureMeasurementAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterFlowMeasurementAttributeMeasuredValueID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterFlowMeasurementAttributeMinMeasuredValueID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterFlowMeasurementAttributeMaxMeasuredValueID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterFlowMeasurementAttributeToleranceID(3L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterFlowMeasurementAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterFlowMeasurementAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterFlowMeasurementAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterFlowMeasurementAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterFlowMeasurementAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterRelativeHumidityMeasurementAttributeMeasuredValueID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterRelativeHumidityMeasurementAttributeMinMeasuredValueID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterRelativeHumidityMeasurementAttributeMaxMeasuredValueID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterRelativeHumidityMeasurementAttributeToleranceID(3L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterRelativeHumidityMeasurementAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterRelativeHumidityMeasurementAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterRelativeHumidityMeasurementAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterRelativeHumidityMeasurementAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterRelativeHumidityMeasurementAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterOccupancySensingAttributeOccupancyID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterOccupancySensingAttributeOccupancySensorTypeID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterOccupancySensingAttributeOccupancySensorTypeBitmapID(2L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterOccupancySensingAttributeHoldTimeID(3L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterOccupancySensingAttributeHoldTimeLimitsID(4L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterOccupancySensingAttributePIROccupiedToUnoccupiedDelayID(16L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterOccupancySensingAttributePIRUnoccupiedToOccupiedDelayID(17L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterOccupancySensingAttributePIRUnoccupiedToOccupiedThresholdID(18L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterOccupancySensingAttributeUltrasonicOccupiedToUnoccupiedDelayID(32L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterOccupancySensingAttributeUltrasonicUnoccupiedToOccupiedDelayID(33L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterOccupancySensingAttributeUltrasonicUnoccupiedToOccupiedThresholdID(34L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterOccupancySensingAttributePhysicalContactOccupiedToUnoccupiedDelayID(48L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterOccupancySensingAttributePhysicalContactUnoccupiedToOccupiedDelayID(49L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterOccupancySensingAttributePhysicalContactUnoccupiedToOccupiedThresholdID(50L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterOccupancySensingAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterOccupancySensingAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterOccupancySensingAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterOccupancySensingAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterOccupancySensingAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterCarbonMonoxideConcentrationMeasurementAttributeMeasuredValueID(0L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterCarbonMonoxideConcentrationMeasurementAttributeMinMeasuredValueID(1L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterCarbonMonoxideConcentrationMeasurementAttributeMaxMeasuredValueID(2L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterCarbonMonoxideConcentrationMeasurementAttributePeakMeasuredValueID(3L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterCarbonMonoxideConcentrationMeasurementAttributePeakMeasuredValueWindowID(4L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterCarbonMonoxideConcentrationMeasurementAttributeAverageMeasuredValueID(5L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterCarbonMonoxideConcentrationMeasurementAttributeAverageMeasuredValueWindowID(6L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterCarbonMonoxideConcentrationMeasurementAttributeUncertaintyID(7L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterCarbonMonoxideConcentrationMeasurementAttributeMeasurementUnitID(8L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterCarbonMonoxideConcentrationMeasurementAttributeMeasurementMediumID(9L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterCarbonMonoxideConcentrationMeasurementAttributeLevelValueID(10L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterCarbonMonoxideConcentrationMeasurementAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterCarbonMonoxideConcentrationMeasurementAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterCarbonMonoxideConcentrationMeasurementAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterCarbonMonoxideConcentrationMeasurementAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterCarbonMonoxideConcentrationMeasurementAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterCarbonDioxideConcentrationMeasurementAttributeMeasuredValueID(0L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterCarbonDioxideConcentrationMeasurementAttributeMinMeasuredValueID(1L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterCarbonDioxideConcentrationMeasurementAttributeMaxMeasuredValueID(2L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterCarbonDioxideConcentrationMeasurementAttributePeakMeasuredValueID(3L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterCarbonDioxideConcentrationMeasurementAttributePeakMeasuredValueWindowID(4L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterCarbonDioxideConcentrationMeasurementAttributeAverageMeasuredValueID(5L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterCarbonDioxideConcentrationMeasurementAttributeAverageMeasuredValueWindowID(6L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterCarbonDioxideConcentrationMeasurementAttributeUncertaintyID(7L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterCarbonDioxideConcentrationMeasurementAttributeMeasurementUnitID(8L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterCarbonDioxideConcentrationMeasurementAttributeMeasurementMediumID(9L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterCarbonDioxideConcentrationMeasurementAttributeLevelValueID(10L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterCarbonDioxideConcentrationMeasurementAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterCarbonDioxideConcentrationMeasurementAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterCarbonDioxideConcentrationMeasurementAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterCarbonDioxideConcentrationMeasurementAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterCarbonDioxideConcentrationMeasurementAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterNitrogenDioxideConcentrationMeasurementAttributeMeasuredValueID(0L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterNitrogenDioxideConcentrationMeasurementAttributeMinMeasuredValueID(1L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterNitrogenDioxideConcentrationMeasurementAttributeMaxMeasuredValueID(2L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterNitrogenDioxideConcentrationMeasurementAttributePeakMeasuredValueID(3L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterNitrogenDioxideConcentrationMeasurementAttributePeakMeasuredValueWindowID(4L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterNitrogenDioxideConcentrationMeasurementAttributeAverageMeasuredValueID(5L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterNitrogenDioxideConcentrationMeasurementAttributeAverageMeasuredValueWindowID(6L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterNitrogenDioxideConcentrationMeasurementAttributeUncertaintyID(7L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterNitrogenDioxideConcentrationMeasurementAttributeMeasurementUnitID(8L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterNitrogenDioxideConcentrationMeasurementAttributeMeasurementMediumID(9L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterNitrogenDioxideConcentrationMeasurementAttributeLevelValueID(10L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterNitrogenDioxideConcentrationMeasurementAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterNitrogenDioxideConcentrationMeasurementAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterNitrogenDioxideConcentrationMeasurementAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterNitrogenDioxideConcentrationMeasurementAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterNitrogenDioxideConcentrationMeasurementAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterOzoneConcentrationMeasurementAttributeMeasuredValueID(0L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterOzoneConcentrationMeasurementAttributeMinMeasuredValueID(1L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterOzoneConcentrationMeasurementAttributeMaxMeasuredValueID(2L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterOzoneConcentrationMeasurementAttributePeakMeasuredValueID(3L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterOzoneConcentrationMeasurementAttributePeakMeasuredValueWindowID(4L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterOzoneConcentrationMeasurementAttributeAverageMeasuredValueID(5L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterOzoneConcentrationMeasurementAttributeAverageMeasuredValueWindowID(6L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterOzoneConcentrationMeasurementAttributeUncertaintyID(7L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterOzoneConcentrationMeasurementAttributeMeasurementUnitID(8L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterOzoneConcentrationMeasurementAttributeMeasurementMediumID(9L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterOzoneConcentrationMeasurementAttributeLevelValueID(10L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterOzoneConcentrationMeasurementAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterOzoneConcentrationMeasurementAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterOzoneConcentrationMeasurementAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterOzoneConcentrationMeasurementAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterOzoneConcentrationMeasurementAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterPM25ConcentrationMeasurementAttributeMeasuredValueID(0L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterPM25ConcentrationMeasurementAttributeMinMeasuredValueID(1L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterPM25ConcentrationMeasurementAttributeMaxMeasuredValueID(2L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterPM25ConcentrationMeasurementAttributePeakMeasuredValueID(3L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterPM25ConcentrationMeasurementAttributePeakMeasuredValueWindowID(4L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterPM25ConcentrationMeasurementAttributeAverageMeasuredValueID(5L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterPM25ConcentrationMeasurementAttributeAverageMeasuredValueWindowID(6L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterPM25ConcentrationMeasurementAttributeUncertaintyID(7L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterPM25ConcentrationMeasurementAttributeMeasurementUnitID(8L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterPM25ConcentrationMeasurementAttributeMeasurementMediumID(9L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterPM25ConcentrationMeasurementAttributeLevelValueID(10L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterPM25ConcentrationMeasurementAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterPM25ConcentrationMeasurementAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterPM25ConcentrationMeasurementAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterPM25ConcentrationMeasurementAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterPM25ConcentrationMeasurementAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterFormaldehydeConcentrationMeasurementAttributeMeasuredValueID(0L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterFormaldehydeConcentrationMeasurementAttributeMinMeasuredValueID(1L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterFormaldehydeConcentrationMeasurementAttributeMaxMeasuredValueID(2L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterFormaldehydeConcentrationMeasurementAttributePeakMeasuredValueID(3L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterFormaldehydeConcentrationMeasurementAttributePeakMeasuredValueWindowID(4L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterFormaldehydeConcentrationMeasurementAttributeAverageMeasuredValueID(5L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterFormaldehydeConcentrationMeasurementAttributeAverageMeasuredValueWindowID(6L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterFormaldehydeConcentrationMeasurementAttributeUncertaintyID(7L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterFormaldehydeConcentrationMeasurementAttributeMeasurementUnitID(8L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterFormaldehydeConcentrationMeasurementAttributeMeasurementMediumID(9L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterFormaldehydeConcentrationMeasurementAttributeLevelValueID(10L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterFormaldehydeConcentrationMeasurementAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterFormaldehydeConcentrationMeasurementAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterFormaldehydeConcentrationMeasurementAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterFormaldehydeConcentrationMeasurementAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterFormaldehydeConcentrationMeasurementAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterPM1ConcentrationMeasurementAttributeMeasuredValueID(0L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterPM1ConcentrationMeasurementAttributeMinMeasuredValueID(1L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterPM1ConcentrationMeasurementAttributeMaxMeasuredValueID(2L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterPM1ConcentrationMeasurementAttributePeakMeasuredValueID(3L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterPM1ConcentrationMeasurementAttributePeakMeasuredValueWindowID(4L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterPM1ConcentrationMeasurementAttributeAverageMeasuredValueID(5L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterPM1ConcentrationMeasurementAttributeAverageMeasuredValueWindowID(6L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterPM1ConcentrationMeasurementAttributeUncertaintyID(7L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterPM1ConcentrationMeasurementAttributeMeasurementUnitID(8L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterPM1ConcentrationMeasurementAttributeMeasurementMediumID(9L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterPM1ConcentrationMeasurementAttributeLevelValueID(10L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterPM1ConcentrationMeasurementAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterPM1ConcentrationMeasurementAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterPM1ConcentrationMeasurementAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterPM1ConcentrationMeasurementAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterPM1ConcentrationMeasurementAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterPM10ConcentrationMeasurementAttributeMeasuredValueID(0L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterPM10ConcentrationMeasurementAttributeMinMeasuredValueID(1L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterPM10ConcentrationMeasurementAttributeMaxMeasuredValueID(2L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterPM10ConcentrationMeasurementAttributePeakMeasuredValueID(3L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterPM10ConcentrationMeasurementAttributePeakMeasuredValueWindowID(4L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterPM10ConcentrationMeasurementAttributeAverageMeasuredValueID(5L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterPM10ConcentrationMeasurementAttributeAverageMeasuredValueWindowID(6L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterPM10ConcentrationMeasurementAttributeUncertaintyID(7L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterPM10ConcentrationMeasurementAttributeMeasurementUnitID(8L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterPM10ConcentrationMeasurementAttributeMeasurementMediumID(9L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterPM10ConcentrationMeasurementAttributeLevelValueID(10L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterPM10ConcentrationMeasurementAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterPM10ConcentrationMeasurementAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterPM10ConcentrationMeasurementAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterPM10ConcentrationMeasurementAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterPM10ConcentrationMeasurementAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterTotalVolatileOrganicCompoundsConcentrationMeasurementAttributeMeasuredValueID(0L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterTotalVolatileOrganicCompoundsConcentrationMeasurementAttributeMinMeasuredValueID(1L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterTotalVolatileOrganicCompoundsConcentrationMeasurementAttributeMaxMeasuredValueID(2L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterTotalVolatileOrganicCompoundsConcentrationMeasurementAttributePeakMeasuredValueID(3L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterTotalVolatileOrganicCompoundsConcentrationMeasurementAttributePeakMeasuredValueWindowID(4L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterTotalVolatileOrganicCompoundsConcentrationMeasurementAttributeAverageMeasuredValueID(5L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterTotalVolatileOrganicCompoundsConcentrationMeasurementAttributeAverageMeasuredValueWindowID(6L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterTotalVolatileOrganicCompoundsConcentrationMeasurementAttributeUncertaintyID(7L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterTotalVolatileOrganicCompoundsConcentrationMeasurementAttributeMeasurementUnitID(8L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterTotalVolatileOrganicCompoundsConcentrationMeasurementAttributeMeasurementMediumID(9L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterTotalVolatileOrganicCompoundsConcentrationMeasurementAttributeLevelValueID(10L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterTotalVolatileOrganicCompoundsConcentrationMeasurementAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterTotalVolatileOrganicCompoundsConcentrationMeasurementAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterTotalVolatileOrganicCompoundsConcentrationMeasurementAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterTotalVolatileOrganicCompoundsConcentrationMeasurementAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterTotalVolatileOrganicCompoundsConcentrationMeasurementAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterRadonConcentrationMeasurementAttributeMeasuredValueID(0L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterRadonConcentrationMeasurementAttributeMinMeasuredValueID(1L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterRadonConcentrationMeasurementAttributeMaxMeasuredValueID(2L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterRadonConcentrationMeasurementAttributePeakMeasuredValueID(3L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterRadonConcentrationMeasurementAttributePeakMeasuredValueWindowID(4L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterRadonConcentrationMeasurementAttributeAverageMeasuredValueID(5L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterRadonConcentrationMeasurementAttributeAverageMeasuredValueWindowID(6L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterRadonConcentrationMeasurementAttributeUncertaintyID(7L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterRadonConcentrationMeasurementAttributeMeasurementUnitID(8L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterRadonConcentrationMeasurementAttributeMeasurementMediumID(9L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterRadonConcentrationMeasurementAttributeLevelValueID(10L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterRadonConcentrationMeasurementAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterRadonConcentrationMeasurementAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterRadonConcentrationMeasurementAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterRadonConcentrationMeasurementAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 17.6 and later.
     */
    AttributeIDTypeClusterRadonConcentrationMeasurementAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterWiFiNetworkManagementAttributeSSIDID(0L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterWiFiNetworkManagementAttributePassphraseSurrogateID(1L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterWiFiNetworkManagementAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterWiFiNetworkManagementAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterWiFiNetworkManagementAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterWiFiNetworkManagementAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterWiFiNetworkManagementAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterThreadBorderRouterManagementAttributeBorderRouterNameID(0L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterThreadBorderRouterManagementAttributeBorderAgentIDID(1L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterThreadBorderRouterManagementAttributeThreadVersionID(2L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterThreadBorderRouterManagementAttributeInterfaceEnabledID(3L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterThreadBorderRouterManagementAttributeActiveDatasetTimestampID(4L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterThreadBorderRouterManagementAttributePendingDatasetTimestampID(5L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterThreadBorderRouterManagementAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterThreadBorderRouterManagementAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterThreadBorderRouterManagementAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterThreadBorderRouterManagementAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterThreadBorderRouterManagementAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDirectoryAttributePreferredExtendedPanIDID(0L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDirectoryAttributeThreadNetworksID(1L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDirectoryAttributeThreadNetworkTableSizeID(2L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDirectoryAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDirectoryAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDirectoryAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDirectoryAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterThreadNetworkDirectoryAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterWakeOnLANAttributeMACAddressID(0L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterWakeOnLANAttributeLinkLocalAddressID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterWakeOnLANAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterWakeOnLANAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterWakeOnLANAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterWakeOnLANAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterWakeOnLANAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterChannelAttributeChannelListID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterChannelAttributeLineupID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterChannelAttributeCurrentChannelID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterChannelAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterChannelAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterChannelAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterChannelAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterChannelAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterTargetNavigatorAttributeTargetListID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterTargetNavigatorAttributeCurrentTargetID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterTargetNavigatorAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterTargetNavigatorAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterTargetNavigatorAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterTargetNavigatorAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterTargetNavigatorAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterMediaPlaybackAttributeCurrentStateID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterMediaPlaybackAttributeStartTimeID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterMediaPlaybackAttributeDurationID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterMediaPlaybackAttributeSampledPositionID(3L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterMediaPlaybackAttributePlaybackSpeedID(4L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterMediaPlaybackAttributeSeekRangeEndID(5L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterMediaPlaybackAttributeSeekRangeStartID(6L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterMediaPlaybackAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterMediaPlaybackAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterMediaPlaybackAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterMediaPlaybackAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterMediaPlaybackAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterMediaInputAttributeInputListID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterMediaInputAttributeCurrentInputID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterMediaInputAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterMediaInputAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterMediaInputAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterMediaInputAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterMediaInputAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterLowPowerAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterLowPowerAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterLowPowerAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterLowPowerAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterLowPowerAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterKeypadInputAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterKeypadInputAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterKeypadInputAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterKeypadInputAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterKeypadInputAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterContentLauncherAttributeAcceptHeaderID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterContentLauncherAttributeSupportedStreamingProtocolsID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterContentLauncherAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterContentLauncherAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterContentLauncherAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterContentLauncherAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterContentLauncherAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterAudioOutputAttributeOutputListID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterAudioOutputAttributeCurrentOutputID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterAudioOutputAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterAudioOutputAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterAudioOutputAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterAudioOutputAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterAudioOutputAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterApplicationLauncherAttributeCatalogListID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterApplicationLauncherAttributeCurrentAppID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterApplicationLauncherAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterApplicationLauncherAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterApplicationLauncherAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterApplicationLauncherAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterApplicationLauncherAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterApplicationBasicAttributeVendorNameID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterApplicationBasicAttributeVendorIDID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterApplicationBasicAttributeApplicationNameID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterApplicationBasicAttributeProductIDID(3L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterApplicationBasicAttributeApplicationID(4L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterApplicationBasicAttributeStatusID(5L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterApplicationBasicAttributeApplicationVersionID(6L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterApplicationBasicAttributeAllowedVendorListID(7L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterApplicationBasicAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterApplicationBasicAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterApplicationBasicAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterApplicationBasicAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterApplicationBasicAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterAccountLoginAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterAccountLoginAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterAccountLoginAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterAccountLoginAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterAccountLoginAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterContentAppObserverAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterContentAppObserverAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterContentAppObserverAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterContentAppObserverAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterContentAppObserverAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterCommissionerControlAttributeSupportedDeviceCategoriesID(0L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterCommissionerControlAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterCommissionerControlAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterCommissionerControlAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterCommissionerControlAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 18.4 and later.
     */
    AttributeIDTypeClusterCommissionerControlAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeBooleanID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeBitmap8ID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeBitmap16ID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeBitmap32ID(3L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeBitmap64ID(4L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeInt8uID(5L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeInt16uID(6L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeInt24uID(7L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeInt32uID(8L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeInt40uID(9L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeInt48uID(10L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeInt56uID(11L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeInt64uID(12L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeInt8sID(13L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeInt16sID(14L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeInt24sID(15L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeInt32sID(16L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeInt40sID(17L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeInt48sID(18L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeInt56sID(19L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeInt64sID(20L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeEnum8ID(21L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeEnum16ID(22L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeFloatSingleID(23L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeFloatDoubleID(24L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeOctetStringID(25L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeListInt8uID(26L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeListOctetStringID(27L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeListStructOctetStringID(28L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeLongOctetStringID(29L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeCharStringID(30L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeLongCharStringID(31L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeEpochUsID(32L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeEpochSID(33L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeVendorIdID(34L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeListNullablesAndOptionalsStructID(35L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeEnumAttrID(36L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeStructAttrID(37L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeRangeRestrictedInt8uID(38L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeRangeRestrictedInt8sID(39L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeRangeRestrictedInt16uID(40L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeRangeRestrictedInt16sID(41L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeListLongOctetStringID(42L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeListFabricScopedID(43L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeTimedWriteBooleanID(48L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeGeneralErrorBooleanID(49L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeClusterErrorBooleanID(50L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeUnsupportedID(255L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeNullableBooleanID(16384L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeNullableBitmap8ID(16385L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeNullableBitmap16ID(16386L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeNullableBitmap32ID(16387L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeNullableBitmap64ID(16388L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeNullableInt8uID(16389L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeNullableInt16uID(16390L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeNullableInt24uID(16391L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeNullableInt32uID(16392L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeNullableInt40uID(16393L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeNullableInt48uID(16394L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeNullableInt56uID(16395L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeNullableInt64uID(16396L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeNullableInt8sID(16397L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeNullableInt16sID(16398L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeNullableInt24sID(16399L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeNullableInt32sID(16400L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeNullableInt40sID(16401L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeNullableInt48sID(16402L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeNullableInt56sID(16403L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeNullableInt64sID(16404L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeNullableEnum8ID(16405L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeNullableEnum16ID(16406L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeNullableFloatSingleID(16407L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeNullableFloatDoubleID(16408L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeNullableOctetStringID(16409L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeNullableCharStringID(16414L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeNullableEnumAttrID(16420L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeNullableStructID(16421L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeNullableRangeRestrictedInt8uID(16422L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeNullableRangeRestrictedInt8sID(16423L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeNullableRangeRestrictedInt16uID(16424L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeNullableRangeRestrictedInt16sID(16425L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeWriteOnlyInt8uID(16426L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterUnitTestingAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The BarrierMovingState attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterBarrierControlAttributeBarrierMovingStateID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The BarrierSafetyStatus attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterBarrierControlAttributeBarrierSafetyStatusID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The BarrierCapabilities attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterBarrierControlAttributeBarrierCapabilitiesID(3L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The BarrierOpenEvents attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterBarrierControlAttributeBarrierOpenEventsID(4L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The BarrierCloseEvents attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterBarrierControlAttributeBarrierCloseEventsID(5L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The BarrierCommandOpenEvents attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterBarrierControlAttributeBarrierCommandOpenEventsID(6L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The BarrierCommandCloseEvents attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterBarrierControlAttributeBarrierCommandCloseEventsID(7L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The BarrierOpenPeriod attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterBarrierControlAttributeBarrierOpenPeriodID(8L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The BarrierClosePeriod attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterBarrierControlAttributeBarrierClosePeriodID(9L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The BarrierPosition attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterBarrierControlAttributeBarrierPositionID(10L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The GeneratedCommandList attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterBarrierControlAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The AcceptedCommandList attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterBarrierControlAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The AttributeList attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterBarrierControlAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The FeatureMap attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterBarrierControlAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The ClusterRevision attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterBarrierControlAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The ActiveText attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterBinaryInputBasicAttributeActiveTextID(4L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The Description attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterBinaryInputBasicAttributeDescriptionID(28L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The InactiveText attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterBinaryInputBasicAttributeInactiveTextID(46L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The OutOfService attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterBinaryInputBasicAttributeOutOfServiceID(81L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The Polarity attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterBinaryInputBasicAttributePolarityID(84L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The PresentValue attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterBinaryInputBasicAttributePresentValueID(85L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The Reliability attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterBinaryInputBasicAttributeReliabilityID(103L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The StatusFlags attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterBinaryInputBasicAttributeStatusFlagsID(111L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The ApplicationType attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterBinaryInputBasicAttributeApplicationTypeID(256L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The GeneratedCommandList attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterBinaryInputBasicAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The AcceptedCommandList attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterBinaryInputBasicAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The AttributeList attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterBinaryInputBasicAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The FeatureMap attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterBinaryInputBasicAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The ClusterRevision attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterBinaryInputBasicAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The MeasurementType attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeMeasurementTypeID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The DcVoltage attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeDcVoltageID(256L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The DcVoltageMin attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeDcVoltageMinID(257L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The DcVoltageMax attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeDcVoltageMaxID(258L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The DcCurrent attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeDcCurrentID(259L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The DcCurrentMin attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeDcCurrentMinID(260L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The DcCurrentMax attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeDcCurrentMaxID(261L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The DcPower attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeDcPowerID(262L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The DcPowerMin attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeDcPowerMinID(263L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The DcPowerMax attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeDcPowerMaxID(264L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The DcVoltageMultiplier attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeDcVoltageMultiplierID(512L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The DcVoltageDivisor attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeDcVoltageDivisorID(513L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The DcCurrentMultiplier attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeDcCurrentMultiplierID(514L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The DcCurrentDivisor attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeDcCurrentDivisorID(515L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The DcPowerMultiplier attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeDcPowerMultiplierID(516L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The DcPowerDivisor attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeDcPowerDivisorID(517L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The AcFrequency attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeAcFrequencyID(768L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The AcFrequencyMin attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeAcFrequencyMinID(769L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The AcFrequencyMax attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeAcFrequencyMaxID(770L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The NeutralCurrent attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeNeutralCurrentID(771L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The TotalActivePower attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeTotalActivePowerID(772L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The TotalReactivePower attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeTotalReactivePowerID(773L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The TotalApparentPower attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeTotalApparentPowerID(774L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The Measured1stHarmonicCurrent attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeMeasured1stHarmonicCurrentID(775L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The Measured3rdHarmonicCurrent attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeMeasured3rdHarmonicCurrentID(776L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The Measured5thHarmonicCurrent attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeMeasured5thHarmonicCurrentID(777L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The Measured7thHarmonicCurrent attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeMeasured7thHarmonicCurrentID(778L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The Measured9thHarmonicCurrent attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeMeasured9thHarmonicCurrentID(779L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The Measured11thHarmonicCurrent attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeMeasured11thHarmonicCurrentID(780L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The MeasuredPhase1stHarmonicCurrent attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeMeasuredPhase1stHarmonicCurrentID(781L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The MeasuredPhase3rdHarmonicCurrent attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeMeasuredPhase3rdHarmonicCurrentID(782L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The MeasuredPhase5thHarmonicCurrent attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeMeasuredPhase5thHarmonicCurrentID(783L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The MeasuredPhase7thHarmonicCurrent attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeMeasuredPhase7thHarmonicCurrentID(784L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The MeasuredPhase9thHarmonicCurrent attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeMeasuredPhase9thHarmonicCurrentID(785L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The MeasuredPhase11thHarmonicCurrent attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeMeasuredPhase11thHarmonicCurrentID(786L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The AcFrequencyMultiplier attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeAcFrequencyMultiplierID(1024L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The AcFrequencyDivisor attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeAcFrequencyDivisorID(1025L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The PowerMultiplier attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributePowerMultiplierID(1026L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The PowerDivisor attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributePowerDivisorID(1027L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The HarmonicCurrentMultiplier attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeHarmonicCurrentMultiplierID(1028L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The PhaseHarmonicCurrentMultiplier attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributePhaseHarmonicCurrentMultiplierID(1029L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The InstantaneousVoltage attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeInstantaneousVoltageID(1280L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The InstantaneousLineCurrent attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeInstantaneousLineCurrentID(1281L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The InstantaneousActiveCurrent attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeInstantaneousActiveCurrentID(1282L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The InstantaneousReactiveCurrent attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeInstantaneousReactiveCurrentID(1283L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The InstantaneousPower attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeInstantaneousPowerID(1284L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The RmsVoltage attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeRmsVoltageID(1285L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The RmsVoltageMin attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeRmsVoltageMinID(1286L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The RmsVoltageMax attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeRmsVoltageMaxID(1287L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The RmsCurrent attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeRmsCurrentID(1288L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The RmsCurrentMin attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeRmsCurrentMinID(1289L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The RmsCurrentMax attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeRmsCurrentMaxID(1290L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The ActivePower attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeActivePowerID(1291L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The ActivePowerMin attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeActivePowerMinID(1292L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The ActivePowerMax attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeActivePowerMaxID(1293L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The ReactivePower attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeReactivePowerID(1294L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The ApparentPower attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeApparentPowerID(1295L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The PowerFactor attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributePowerFactorID(1296L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The AverageRmsVoltageMeasurementPeriod attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeAverageRmsVoltageMeasurementPeriodID(1297L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The AverageRmsUnderVoltageCounter attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeAverageRmsUnderVoltageCounterID(1299L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The RmsExtremeOverVoltagePeriod attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeRmsExtremeOverVoltagePeriodID(1300L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The RmsExtremeUnderVoltagePeriod attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeRmsExtremeUnderVoltagePeriodID(1301L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The RmsVoltageSagPeriod attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeRmsVoltageSagPeriodID(1302L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The RmsVoltageSwellPeriod attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeRmsVoltageSwellPeriodID(1303L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The AcVoltageMultiplier attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeAcVoltageMultiplierID(1536L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The AcVoltageDivisor attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeAcVoltageDivisorID(1537L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The AcCurrentMultiplier attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeAcCurrentMultiplierID(1538L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The AcCurrentDivisor attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeAcCurrentDivisorID(1539L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The AcPowerMultiplier attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeAcPowerMultiplierID(1540L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The AcPowerDivisor attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeAcPowerDivisorID(1541L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The OverloadAlarmsMask attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeOverloadAlarmsMaskID(1792L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The VoltageOverload attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeVoltageOverloadID(1793L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The CurrentOverload attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeCurrentOverloadID(1794L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The AcOverloadAlarmsMask attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeAcOverloadAlarmsMaskID(2048L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The AcVoltageOverload attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeAcVoltageOverloadID(2049L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The AcCurrentOverload attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeAcCurrentOverloadID(2050L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The AcActivePowerOverload attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeAcActivePowerOverloadID(2051L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The AcReactivePowerOverload attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeAcReactivePowerOverloadID(2052L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The AverageRmsOverVoltage attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeAverageRmsOverVoltageID(2053L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The AverageRmsUnderVoltage attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeAverageRmsUnderVoltageID(2054L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The RmsExtremeOverVoltage attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeRmsExtremeOverVoltageID(2055L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The RmsExtremeUnderVoltage attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeRmsExtremeUnderVoltageID(2056L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The RmsVoltageSag attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeRmsVoltageSagID(2057L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The RmsVoltageSwell attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeRmsVoltageSwellID(2058L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The LineCurrentPhaseB attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeLineCurrentPhaseBID(2305L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The ActiveCurrentPhaseB attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeActiveCurrentPhaseBID(2306L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The ReactiveCurrentPhaseB attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeReactiveCurrentPhaseBID(2307L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The RmsVoltagePhaseB attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeRmsVoltagePhaseBID(2309L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The RmsVoltageMinPhaseB attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeRmsVoltageMinPhaseBID(2310L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The RmsVoltageMaxPhaseB attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeRmsVoltageMaxPhaseBID(2311L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The RmsCurrentPhaseB attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeRmsCurrentPhaseBID(2312L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The RmsCurrentMinPhaseB attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeRmsCurrentMinPhaseBID(2313L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The RmsCurrentMaxPhaseB attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeRmsCurrentMaxPhaseBID(2314L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The ActivePowerPhaseB attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeActivePowerPhaseBID(2315L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The ActivePowerMinPhaseB attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeActivePowerMinPhaseBID(2316L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The ActivePowerMaxPhaseB attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeActivePowerMaxPhaseBID(2317L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The ReactivePowerPhaseB attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeReactivePowerPhaseBID(2318L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The ApparentPowerPhaseB attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeApparentPowerPhaseBID(2319L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The PowerFactorPhaseB attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributePowerFactorPhaseBID(2320L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The AverageRmsVoltageMeasurementPeriodPhaseB attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeAverageRmsVoltageMeasurementPeriodPhaseBID(2321L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The AverageRmsOverVoltageCounterPhaseB attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeAverageRmsOverVoltageCounterPhaseBID(2322L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The AverageRmsUnderVoltageCounterPhaseB attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeAverageRmsUnderVoltageCounterPhaseBID(2323L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The RmsExtremeOverVoltagePeriodPhaseB attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeRmsExtremeOverVoltagePeriodPhaseBID(2324L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The RmsExtremeUnderVoltagePeriodPhaseB attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeRmsExtremeUnderVoltagePeriodPhaseBID(2325L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The RmsVoltageSagPeriodPhaseB attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeRmsVoltageSagPeriodPhaseBID(2326L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The RmsVoltageSwellPeriodPhaseB attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeRmsVoltageSwellPeriodPhaseBID(2327L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The LineCurrentPhaseC attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeLineCurrentPhaseCID(2561L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The ActiveCurrentPhaseC attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeActiveCurrentPhaseCID(2562L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The ReactiveCurrentPhaseC attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeReactiveCurrentPhaseCID(2563L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The RmsVoltagePhaseC attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeRmsVoltagePhaseCID(2565L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The RmsVoltageMinPhaseC attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeRmsVoltageMinPhaseCID(2566L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The RmsVoltageMaxPhaseC attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeRmsVoltageMaxPhaseCID(2567L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The RmsCurrentPhaseC attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeRmsCurrentPhaseCID(2568L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The RmsCurrentMinPhaseC attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeRmsCurrentMinPhaseCID(2569L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The RmsCurrentMaxPhaseC attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeRmsCurrentMaxPhaseCID(2570L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The ActivePowerPhaseC attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeActivePowerPhaseCID(2571L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The ActivePowerMinPhaseC attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeActivePowerMinPhaseCID(2572L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The ActivePowerMaxPhaseC attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeActivePowerMaxPhaseCID(2573L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The ReactivePowerPhaseC attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeReactivePowerPhaseCID(2574L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The ApparentPowerPhaseC attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeApparentPowerPhaseCID(2575L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The PowerFactorPhaseC attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributePowerFactorPhaseCID(2576L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The AverageRmsVoltageMeasurementPeriodPhaseC attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeAverageRmsVoltageMeasurementPeriodPhaseCID(2577L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The AverageRmsOverVoltageCounterPhaseC attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeAverageRmsOverVoltageCounterPhaseCID(2578L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The AverageRmsUnderVoltageCounterPhaseC attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeAverageRmsUnderVoltageCounterPhaseCID(2579L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The RmsExtremeOverVoltagePeriodPhaseC attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeRmsExtremeOverVoltagePeriodPhaseCID(2580L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The RmsExtremeUnderVoltagePeriodPhaseC attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeRmsExtremeUnderVoltagePeriodPhaseCID(2581L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The RmsVoltageSagPeriodPhaseC attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeRmsVoltageSagPeriodPhaseCID(2582L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The RmsVoltageSwellPeriodPhaseC attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeRmsVoltageSwellPeriodPhaseCID(2583L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The GeneratedCommandList attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The AcceptedCommandList attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The AttributeList attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The FeatureMap attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The ClusterRevision attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterElectricalMeasurementAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The SwitchType attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterOnOffSwitchConfigurationAttributeSwitchTypeID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The SwitchActions attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterOnOffSwitchConfigurationAttributeSwitchActionsID(16L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The GeneratedCommandList attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterOnOffSwitchConfigurationAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The AcceptedCommandList attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterOnOffSwitchConfigurationAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The AttributeList attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterOnOffSwitchConfigurationAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The FeatureMap attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterOnOffSwitchConfigurationAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     * @deprecated Deprecated in iOS 18.2. The ClusterRevision attribute will be removed
     */
    @Deprecated
    AttributeIDTypeClusterOnOffSwitchConfigurationAttributeClusterRevisionID(65533L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/MTRAttributeIDType/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/MTRAttributeIDType/*</name>*/ valueOf(long n) {
        for (/*<name>*/MTRAttributeIDType/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/MTRAttributeIDType/*</name>*/.class.getName());
    }
}
