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
package org.robovm.apple.sharedwithyou;

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
import org.robovm.apple.uniformtypeid.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 16.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("SharedWithYou") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SWCollaborationShareOptions/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class SWCollaborationShareOptionsPtr extends Ptr<SWCollaborationShareOptions, SWCollaborationShareOptionsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SWCollaborationShareOptions.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected SWCollaborationShareOptions() {}
    protected SWCollaborationShareOptions(Handle h, long handle) { super(h, handle); }
    protected SWCollaborationShareOptions(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithOptionsGroups:summary:")
    public SWCollaborationShareOptions(NSArray<SWCollaborationOptionsGroup> optionsGroups, String summary) { super((SkipInit) null); initObject(init(optionsGroups, summary)); }
    @Method(selector = "initWithOptionsGroups:")
    public SWCollaborationShareOptions(NSArray<SWCollaborationOptionsGroup> optionsGroups) { super((SkipInit) null); initObject(init(optionsGroups)); }
    @Method(selector = "initWithCoder:")
    public SWCollaborationShareOptions(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "optionsGroups")
    public native NSArray<SWCollaborationOptionsGroup> getOptionsGroups();
    @Property(selector = "setOptionsGroups:")
    public native void setOptionsGroups(NSArray<SWCollaborationOptionsGroup> v);
    @Property(selector = "summary")
    public native String getSummary();
    @Property(selector = "setSummary:")
    public native void setSummary(String v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithOptionsGroups:summary:")
    protected native @Pointer long init(NSArray<SWCollaborationOptionsGroup> optionsGroups, String summary);
    @Method(selector = "initWithOptionsGroups:")
    protected native @Pointer long init(NSArray<SWCollaborationOptionsGroup> optionsGroups);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    /*</methods>*/
}
