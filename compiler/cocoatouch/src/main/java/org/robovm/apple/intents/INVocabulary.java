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
package org.robovm.apple.intents;

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
import org.robovm.apple.eventkit.*;
import org.robovm.apple.corelocation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Intents") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INVocabulary/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class INVocabularyPtr extends Ptr<INVocabulary, INVocabularyPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(INVocabulary.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public INVocabulary() {}
    protected INVocabulary(Handle h, long handle) { super(h, handle); }
    protected INVocabulary(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "setVocabularyStrings:ofType:")
    public native void setVocabularyStrings(NSOrderedSet<NSString> vocabulary, INVocabularyStringType type);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "setVocabulary:ofType:")
    public native void setVocabulary(NSOrderedSet<?> vocabulary, INVocabularyStringType type);
    @Method(selector = "removeAllVocabularyStrings")
    public native void removeAllVocabularyStrings();
    @Method(selector = "sharedVocabulary")
    public static native INVocabulary sharedVocabulary();
    /*</methods>*/
}
