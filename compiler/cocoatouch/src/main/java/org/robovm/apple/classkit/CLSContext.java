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
package org.robovm.apple.classkit;

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
/**
 * @since Available in iOS 11.3 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("ClassKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CLSContext/*</name>*/ 
    extends /*<extends>*/CLSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CLSContextPtr extends Ptr<CLSContext, CLSContextPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CLSContext.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CLSContext() {}
    protected CLSContext(Handle h, long handle) { super(h, handle); }
    protected CLSContext(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithType:identifier:title:")
    public CLSContext(CLSContextType type, String identifier, String title) { super((SkipInit) null); initObject(init(type, identifier, title)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "identifier")
    public native String getIdentifier();
    /**
     * @since Available in iOS 11.4 and later.
     */
    @Property(selector = "universalLinkURL")
    public native NSURL getUniversalLinkURL();
    /**
     * @since Available in iOS 11.4 and later.
     */
    @Property(selector = "setUniversalLinkURL:")
    public native void setUniversalLinkURL(NSURL v);
    @Property(selector = "type")
    public native CLSContextType getType();
    @Property(selector = "title")
    public native String getTitle();
    @Property(selector = "setTitle:")
    public native void setTitle(String v);
    @Property(selector = "displayOrder")
    public native @MachineSizedSInt long getDisplayOrder();
    @Property(selector = "setDisplayOrder:")
    public native void setDisplayOrder(@MachineSizedSInt long v);
    @Property(selector = "topic")
    public native String getTopic();
    @Property(selector = "setTopic:")
    public native void setTopic(String v);
    @Property(selector = "isActive")
    public native boolean isActive();
    @Property(selector = "parent")
    public native CLSContext getParent();
    @Property(selector = "currentActivity")
    public native CLSActivity getCurrentActivity();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithType:identifier:title:")
    protected native @Pointer long init(CLSContextType type, String identifier, String title);
    @Method(selector = "becomeActive")
    public native void becomeActive();
    @Method(selector = "resignActive")
    public native void resignActive();
    @Method(selector = "removeFromParent")
    public native void removeFromParent();
    @Method(selector = "addChildContext:")
    public native void addChildContext(CLSContext child);
    @Method(selector = "descendantMatchingIdentifierPath:completion:")
    public native void getDescendantMatchingIdentifierPath(NSArray<NSString> identifierPath, @Block VoidBlock2<CLSContext, NSError> completion);
    @Method(selector = "createNewActivity")
    public native CLSActivity createNewActivity();
    /*</methods>*/
}
