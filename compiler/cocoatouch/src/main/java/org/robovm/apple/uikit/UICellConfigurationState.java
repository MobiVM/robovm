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
package org.robovm.apple.uikit;

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
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.cloudkit.*;
import org.robovm.apple.fileprovider.*;
import org.robovm.apple.intents.*;
import org.robovm.apple.usernotifications.*;
import org.robovm.apple.linkpresentation.*;
import org.robovm.apple.symbols.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UICellConfigurationState/*</name>*/ 
    extends /*<extends>*/UIViewConfigurationState/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UICellConfigurationStatePtr extends Ptr<UICellConfigurationState, UICellConfigurationStatePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UICellConfigurationState.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UICellConfigurationState() {}
    protected UICellConfigurationState(Handle h, long handle) { super(h, handle); }
    protected UICellConfigurationState(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithTraitCollection:")
    public UICellConfigurationState(UITraitCollection traitCollection) { super(traitCollection); }
    @Method(selector = "initWithCoder:")
    public UICellConfigurationState(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "isEditing")
    public native boolean isEditing();
    @Property(selector = "setEditing:")
    public native void setEditing(boolean v);
    @Property(selector = "isExpanded")
    public native boolean isExpanded();
    @Property(selector = "setExpanded:")
    public native void setExpanded(boolean v);
    @Property(selector = "isSwiped")
    public native boolean isSwiped();
    @Property(selector = "setSwiped:")
    public native void setSwiped(boolean v);
    @Property(selector = "isReordering")
    public native boolean isReordering();
    @Property(selector = "setReordering:")
    public native void setReordering(boolean v);
    @Property(selector = "cellDragState")
    public native UICellConfigurationDragState getCellDragState();
    @Property(selector = "setCellDragState:")
    public native void setCellDragState(UICellConfigurationDragState v);
    @Property(selector = "cellDropState")
    public native UICellConfigurationDropState getCellDropState();
    @Property(selector = "setCellDropState:")
    public native void setCellDropState(UICellConfigurationDropState v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
