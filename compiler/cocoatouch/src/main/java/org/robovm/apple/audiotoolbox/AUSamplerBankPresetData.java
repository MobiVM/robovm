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
package org.robovm.apple.audiotoolbox;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.coremidi.*;
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AUSamplerBankPresetData/*</name>*/ 
    extends /*<extends>*/Struct<AUSamplerBankPresetData>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AUSamplerBankPresetDataPtr extends Ptr<AUSamplerBankPresetData, AUSamplerBankPresetDataPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AUSamplerBankPresetData() {}
    public AUSamplerBankPresetData(NSURL bankURL, byte bankMSB, byte bankLSB, byte presetID, byte reserved) {
        this.setBankURL(bankURL);
        this.setBankMSB(bankMSB);
        this.setBankLSB(bankLSB);
        this.setPresetID(presetID);
        this.setReserved(reserved);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native NSURL getBankURL();
    @StructMember(0) public native AUSamplerBankPresetData setBankURL(NSURL bankURL);
    @StructMember(1) public native byte getBankMSB();
    @StructMember(1) public native AUSamplerBankPresetData setBankMSB(byte bankMSB);
    @StructMember(2) public native byte getBankLSB();
    @StructMember(2) public native AUSamplerBankPresetData setBankLSB(byte bankLSB);
    @StructMember(3) public native byte getPresetID();
    @StructMember(3) public native AUSamplerBankPresetData setPresetID(byte presetID);
    @StructMember(4) public native byte getReserved();
    @StructMember(4) public native AUSamplerBankPresetData setReserved(byte reserved);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
