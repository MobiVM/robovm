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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UITextDropProposal/*</name>*/ 
    extends /*<extends>*/UIDropProposal/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UITextDropProposalPtr extends Ptr<UITextDropProposal, UITextDropProposalPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UITextDropProposal.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UITextDropProposal() {}
    protected UITextDropProposal(Handle h, long handle) { super(h, handle); }
    protected UITextDropProposal(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDropOperation:")
    public UITextDropProposal(UIDropOperation operation) { super(operation); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "dropAction")
    public native UITextDropAction getDropAction();
    @Property(selector = "setDropAction:")
    public native void setDropAction(UITextDropAction v);
    @Property(selector = "dropProgressMode")
    public native UITextDropProgressMode getDropProgressMode();
    @Property(selector = "setDropProgressMode:")
    public native void setDropProgressMode(UITextDropProgressMode v);
    @Property(selector = "useFastSameViewOperations")
    public native boolean isUseFastSameViewOperations();
    @Property(selector = "setUseFastSameViewOperations:")
    public native void setUseFastSameViewOperations(boolean v);
    @Property(selector = "dropPerformer")
    public native UITextDropPerformer getDropPerformer();
    @Property(selector = "setDropPerformer:")
    public native void setDropPerformer(UITextDropPerformer v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
