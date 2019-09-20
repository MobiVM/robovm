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
package org.robovm.apple.cryptotokenkit;

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
import org.robovm.apple.security.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("CryptoTokenKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/TKSmartCardUserInteractionForPINOperation/*</name>*/ 
    extends /*<extends>*/TKSmartCardUserInteraction/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class TKSmartCardUserInteractionForPINOperationPtr extends Ptr<TKSmartCardUserInteractionForPINOperation, TKSmartCardUserInteractionForPINOperationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(TKSmartCardUserInteractionForPINOperation.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public TKSmartCardUserInteractionForPINOperation() {}
    protected TKSmartCardUserInteractionForPINOperation(Handle h, long handle) { super(h, handle); }
    protected TKSmartCardUserInteractionForPINOperation(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "PINCompletion")
    public native TKSmartCardPINCompletion getPINCompletion();
    @Property(selector = "setPINCompletion:")
    public native void setPINCompletion(TKSmartCardPINCompletion v);
    @Property(selector = "PINMessageIndices")
    public native NSArray<NSNumber> getPINMessageIndices();
    @Property(selector = "setPINMessageIndices:")
    public native void setPINMessageIndices(NSArray<NSNumber> v);
    @Property(selector = "locale")
    public native NSLocale getLocale();
    @Property(selector = "setLocale:")
    public native void setLocale(NSLocale v);
    @Property(selector = "resultSW")
    public native short getResultSW();
    @Property(selector = "setResultSW:")
    public native void setResultSW(short v);
    @Property(selector = "resultData")
    public native NSData getResultData();
    @Property(selector = "setResultData:")
    public native void setResultData(NSData v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
