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
package org.robovm.apple.corespotlight;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("CoreSpotlight") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CSLocalizedString/*</name>*/ 
    extends /*<extends>*/NSString/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CSLocalizedStringPtr extends Ptr<CSLocalizedString, CSLocalizedStringPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CSLocalizedString.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CSLocalizedString() {}
    protected CSLocalizedString(Handle h, long handle) { super(h, handle); }
    protected CSLocalizedString(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithLocalizedStrings:")
    public CSLocalizedString(NSDictionary<?, ?> localizedStrings) { super((SkipInit) null); initObject(init(localizedStrings)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithLocalizedStrings:")
    protected native @Pointer long init(NSDictionary<?, ?> localizedStrings);
    @Method(selector = "localizedString")
    public native String localizedString();
    /*</methods>*/
}
