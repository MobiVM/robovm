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
package org.robovm.apple.mediaplayer;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MediaPlayer") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPMusicPlayerPlayParameters/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPMusicPlayerPlayParametersPtr extends Ptr<MPMusicPlayerPlayParameters, MPMusicPlayerPlayParametersPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPMusicPlayerPlayParameters.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPMusicPlayerPlayParameters() {}
    protected MPMusicPlayerPlayParameters(Handle h, long handle) { super(h, handle); }
    protected MPMusicPlayerPlayParameters(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDictionary:")
    public MPMusicPlayerPlayParameters(NSDictionary<NSString, ?> dictionary) { super((SkipInit) null); initObject(init(dictionary)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "dictionary")
    public native NSDictionary<NSString, ?> getDictionary();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDictionary:")
    protected native @Pointer long init(NSDictionary<NSString, ?> dictionary);
    /*</methods>*/
}
