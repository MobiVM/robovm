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
    AttributeIDTypeClusterScenesAttributeSceneCountID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterScenesAttributeCurrentSceneID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterScenesAttributeCurrentGroupID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterScenesAttributeSceneValidID(3L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterScenesAttributeNameSupportID(4L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterScenesAttributeLastConfiguredByID(5L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterScenesAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterScenesAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterScenesAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterScenesAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterScenesAttributeClusterRevisionID(65533L),
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
    AttributeIDTypeClusterOnOffSwitchConfigurationAttributeSwitchTypeID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterOnOffSwitchConfigurationAttributeSwitchActionsID(16L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterOnOffSwitchConfigurationAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterOnOffSwitchConfigurationAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterOnOffSwitchConfigurationAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterOnOffSwitchConfigurationAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterOnOffSwitchConfigurationAttributeClusterRevisionID(65533L),
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
    AttributeIDTypeClusterBinaryInputBasicAttributeActiveTextID(4L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBinaryInputBasicAttributeDescriptionID(28L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBinaryInputBasicAttributeInactiveTextID(46L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBinaryInputBasicAttributeOutOfServiceID(81L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBinaryInputBasicAttributePolarityID(84L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBinaryInputBasicAttributePresentValueID(85L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBinaryInputBasicAttributeReliabilityID(103L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBinaryInputBasicAttributeStatusFlagsID(111L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBinaryInputBasicAttributeApplicationTypeID(256L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBinaryInputBasicAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBinaryInputBasicAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBinaryInputBasicAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBinaryInputBasicAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBinaryInputBasicAttributeClusterRevisionID(65533L),
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
    AttributeIDTypeClusterProxyConfigurationAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterProxyConfigurationAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterProxyConfigurationAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterProxyConfigurationAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterProxyConfigurationAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterProxyDiscoveryAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterProxyDiscoveryAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterProxyDiscoveryAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterProxyDiscoveryAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterProxyDiscoveryAttributeClusterRevisionID(65533L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterProxyValidAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterProxyValidAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterProxyValidAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterProxyValidAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterProxyValidAttributeClusterRevisionID(65533L),
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
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBarrierControlAttributeBarrierMovingStateID(1L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBarrierControlAttributeBarrierSafetyStatusID(2L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBarrierControlAttributeBarrierCapabilitiesID(3L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBarrierControlAttributeBarrierOpenEventsID(4L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBarrierControlAttributeBarrierCloseEventsID(5L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBarrierControlAttributeBarrierCommandOpenEventsID(6L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBarrierControlAttributeBarrierCommandCloseEventsID(7L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBarrierControlAttributeBarrierOpenPeriodID(8L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBarrierControlAttributeBarrierClosePeriodID(9L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBarrierControlAttributeBarrierPositionID(10L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBarrierControlAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBarrierControlAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBarrierControlAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBarrierControlAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterBarrierControlAttributeClusterRevisionID(65533L),
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
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterWakeOnLANAttributeMACAddressID(0L),
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
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeMeasurementTypeID(0L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeDcVoltageID(256L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeDcVoltageMinID(257L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeDcVoltageMaxID(258L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeDcCurrentID(259L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeDcCurrentMinID(260L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeDcCurrentMaxID(261L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeDcPowerID(262L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeDcPowerMinID(263L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeDcPowerMaxID(264L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeDcVoltageMultiplierID(512L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeDcVoltageDivisorID(513L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeDcCurrentMultiplierID(514L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeDcCurrentDivisorID(515L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeDcPowerMultiplierID(516L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeDcPowerDivisorID(517L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeAcFrequencyID(768L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeAcFrequencyMinID(769L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeAcFrequencyMaxID(770L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeNeutralCurrentID(771L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeTotalActivePowerID(772L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeTotalReactivePowerID(773L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeTotalApparentPowerID(774L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeMeasured1stHarmonicCurrentID(775L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeMeasured3rdHarmonicCurrentID(776L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeMeasured5thHarmonicCurrentID(777L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeMeasured7thHarmonicCurrentID(778L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeMeasured9thHarmonicCurrentID(779L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeMeasured11thHarmonicCurrentID(780L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeMeasuredPhase1stHarmonicCurrentID(781L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeMeasuredPhase3rdHarmonicCurrentID(782L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeMeasuredPhase5thHarmonicCurrentID(783L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeMeasuredPhase7thHarmonicCurrentID(784L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeMeasuredPhase9thHarmonicCurrentID(785L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeMeasuredPhase11thHarmonicCurrentID(786L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeAcFrequencyMultiplierID(1024L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeAcFrequencyDivisorID(1025L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributePowerMultiplierID(1026L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributePowerDivisorID(1027L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeHarmonicCurrentMultiplierID(1028L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributePhaseHarmonicCurrentMultiplierID(1029L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeInstantaneousVoltageID(1280L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeInstantaneousLineCurrentID(1281L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeInstantaneousActiveCurrentID(1282L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeInstantaneousReactiveCurrentID(1283L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeInstantaneousPowerID(1284L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeRmsVoltageID(1285L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeRmsVoltageMinID(1286L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeRmsVoltageMaxID(1287L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeRmsCurrentID(1288L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeRmsCurrentMinID(1289L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeRmsCurrentMaxID(1290L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeActivePowerID(1291L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeActivePowerMinID(1292L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeActivePowerMaxID(1293L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeReactivePowerID(1294L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeApparentPowerID(1295L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributePowerFactorID(1296L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeAverageRmsVoltageMeasurementPeriodID(1297L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeAverageRmsUnderVoltageCounterID(1299L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeRmsExtremeOverVoltagePeriodID(1300L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeRmsExtremeUnderVoltagePeriodID(1301L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeRmsVoltageSagPeriodID(1302L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeRmsVoltageSwellPeriodID(1303L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeAcVoltageMultiplierID(1536L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeAcVoltageDivisorID(1537L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeAcCurrentMultiplierID(1538L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeAcCurrentDivisorID(1539L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeAcPowerMultiplierID(1540L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeAcPowerDivisorID(1541L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeOverloadAlarmsMaskID(1792L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeVoltageOverloadID(1793L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeCurrentOverloadID(1794L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeAcOverloadAlarmsMaskID(2048L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeAcVoltageOverloadID(2049L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeAcCurrentOverloadID(2050L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeAcActivePowerOverloadID(2051L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeAcReactivePowerOverloadID(2052L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeAverageRmsOverVoltageID(2053L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeAverageRmsUnderVoltageID(2054L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeRmsExtremeOverVoltageID(2055L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeRmsExtremeUnderVoltageID(2056L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeRmsVoltageSagID(2057L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeRmsVoltageSwellID(2058L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeLineCurrentPhaseBID(2305L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeActiveCurrentPhaseBID(2306L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeReactiveCurrentPhaseBID(2307L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeRmsVoltagePhaseBID(2309L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeRmsVoltageMinPhaseBID(2310L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeRmsVoltageMaxPhaseBID(2311L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeRmsCurrentPhaseBID(2312L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeRmsCurrentMinPhaseBID(2313L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeRmsCurrentMaxPhaseBID(2314L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeActivePowerPhaseBID(2315L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeActivePowerMinPhaseBID(2316L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeActivePowerMaxPhaseBID(2317L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeReactivePowerPhaseBID(2318L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeApparentPowerPhaseBID(2319L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributePowerFactorPhaseBID(2320L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeAverageRmsVoltageMeasurementPeriodPhaseBID(2321L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeAverageRmsOverVoltageCounterPhaseBID(2322L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeAverageRmsUnderVoltageCounterPhaseBID(2323L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeRmsExtremeOverVoltagePeriodPhaseBID(2324L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeRmsExtremeUnderVoltagePeriodPhaseBID(2325L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeRmsVoltageSagPeriodPhaseBID(2326L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeRmsVoltageSwellPeriodPhaseBID(2327L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeLineCurrentPhaseCID(2561L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeActiveCurrentPhaseCID(2562L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeReactiveCurrentPhaseCID(2563L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeRmsVoltagePhaseCID(2565L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeRmsVoltageMinPhaseCID(2566L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeRmsVoltageMaxPhaseCID(2567L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeRmsCurrentPhaseCID(2568L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeRmsCurrentMinPhaseCID(2569L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeRmsCurrentMaxPhaseCID(2570L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeActivePowerPhaseCID(2571L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeActivePowerMinPhaseCID(2572L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeActivePowerMaxPhaseCID(2573L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeReactivePowerPhaseCID(2574L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeApparentPowerPhaseCID(2575L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributePowerFactorPhaseCID(2576L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeAverageRmsVoltageMeasurementPeriodPhaseCID(2577L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeAverageRmsOverVoltageCounterPhaseCID(2578L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeAverageRmsUnderVoltageCounterPhaseCID(2579L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeRmsExtremeOverVoltagePeriodPhaseCID(2580L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeRmsExtremeUnderVoltagePeriodPhaseCID(2581L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeRmsVoltageSagPeriodPhaseCID(2582L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeRmsVoltageSwellPeriodPhaseCID(2583L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterElectricalMeasurementAttributeClusterRevisionID(65533L),
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
     */
    AttributeIDTypeClusterFaultInjectionAttributeGeneratedCommandListID(65528L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterFaultInjectionAttributeAcceptedCommandListID(65529L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterFaultInjectionAttributeAttributeListID(65531L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterFaultInjectionAttributeFeatureMapID(65532L),
    /**
     * @since Available in iOS 16.4 and later.
     */
    AttributeIDTypeClusterFaultInjectionAttributeClusterRevisionID(65533L);
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
