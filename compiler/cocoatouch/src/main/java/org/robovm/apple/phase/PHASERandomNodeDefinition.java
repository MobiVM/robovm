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
package org.robovm.apple.phase;

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
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.modelio.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 15.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("PHASE") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PHASERandomNodeDefinition/*</name>*/ 
    extends /*<extends>*/PHASESoundEventNodeDefinition/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PHASERandomNodeDefinitionPtr extends Ptr<PHASERandomNodeDefinition, PHASERandomNodeDefinitionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PHASERandomNodeDefinition.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PHASERandomNodeDefinition() {}
    protected PHASERandomNodeDefinition(Handle h, long handle) { super(h, handle); }
    protected PHASERandomNodeDefinition(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithIdentifier:")
    public PHASERandomNodeDefinition(String identifier) { super((SkipInit) null); initObject(init(identifier)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "uniqueSelectionQueueLength")
    public native @MachineSizedSInt long getUniqueSelectionQueueLength();
    @Property(selector = "setUniqueSelectionQueueLength:")
    public native void setUniqueSelectionQueueLength(@MachineSizedSInt long v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithIdentifier:")
    protected native @Pointer long init(String identifier);
    @Method(selector = "addSubtree:weight:")
    public native void addSubtree(PHASESoundEventNodeDefinition subtree, NSNumber weight);
    /*</methods>*/
}
