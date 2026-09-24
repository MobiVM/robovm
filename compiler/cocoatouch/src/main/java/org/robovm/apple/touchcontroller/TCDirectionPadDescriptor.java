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
package org.robovm.apple.touchcontroller;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.metalkit.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.gamecontroller.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 26.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("TouchController") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/TCDirectionPadDescriptor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class TCDirectionPadDescriptorPtr extends Ptr<TCDirectionPadDescriptor, TCDirectionPadDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(TCDirectionPadDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public TCDirectionPadDescriptor() {}
    protected TCDirectionPadDescriptor(Handle h, long handle) { super(h, handle); }
    protected TCDirectionPadDescriptor(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "compositeLabel")
    public native TCControlLabel getCompositeLabel();
    @Property(selector = "setCompositeLabel:")
    public native void setCompositeLabel(TCControlLabel v);
    @Property(selector = "upLabel")
    public native TCControlLabel getUpLabel();
    @Property(selector = "setUpLabel:")
    public native void setUpLabel(TCControlLabel v);
    @Property(selector = "downLabel")
    public native TCControlLabel getDownLabel();
    @Property(selector = "setDownLabel:")
    public native void setDownLabel(TCControlLabel v);
    @Property(selector = "leftLabel")
    public native TCControlLabel getLeftLabel();
    @Property(selector = "setLeftLabel:")
    public native void setLeftLabel(TCControlLabel v);
    @Property(selector = "rightLabel")
    public native TCControlLabel getRightLabel();
    @Property(selector = "setRightLabel:")
    public native void setRightLabel(TCControlLabel v);
    @Property(selector = "upContents")
    public native TCControlContents getUpContents();
    @Property(selector = "setUpContents:")
    public native void setUpContents(TCControlContents v);
    @Property(selector = "downContents")
    public native TCControlContents getDownContents();
    @Property(selector = "setDownContents:")
    public native void setDownContents(TCControlContents v);
    @Property(selector = "leftContents")
    public native TCControlContents getLeftContents();
    @Property(selector = "setLeftContents:")
    public native void setLeftContents(TCControlContents v);
    @Property(selector = "rightContents")
    public native TCControlContents getRightContents();
    @Property(selector = "setRightContents:")
    public native void setRightContents(TCControlContents v);
    @Property(selector = "anchor")
    public native TCControlLayoutAnchor getAnchor();
    @Property(selector = "setAnchor:")
    public native void setAnchor(TCControlLayoutAnchor v);
    @Property(selector = "anchorCoordinateSystem")
    public native TCControlLayoutAnchorCoordinateSystem getAnchorCoordinateSystem();
    @Property(selector = "setAnchorCoordinateSystem:")
    public native void setAnchorCoordinateSystem(TCControlLayoutAnchorCoordinateSystem v);
    @Property(selector = "offset")
    public native @ByVal CGPoint getOffset();
    @Property(selector = "setOffset:")
    public native void setOffset(@ByVal CGPoint v);
    @Property(selector = "zIndex")
    public native @MachineSizedSInt long getZIndex();
    @Property(selector = "setZIndex:")
    public native void setZIndex(@MachineSizedSInt long v);
    @Property(selector = "size")
    public native @ByVal CGSize getSize();
    @Property(selector = "setSize:")
    public native void setSize(@ByVal CGSize v);
    @Property(selector = "colliderShape")
    public native TCColliderShape getColliderShape();
    @Property(selector = "setColliderShape:")
    public native void setColliderShape(TCColliderShape v);
    @Property(selector = "highlightDuration")
    public native double getHighlightDuration();
    @Property(selector = "setHighlightDuration:")
    public native void setHighlightDuration(double v);
    @Property(selector = "isRadial")
    public native boolean isRadial();
    @Property(selector = "setRadial:")
    public native void setRadial(boolean v);
    @Property(selector = "isDigital")
    public native boolean isDigital();
    @Property(selector = "setDigital:")
    public native void setDigital(boolean v);
    @Property(selector = "inputIsMutuallyExclusive")
    public native boolean isMutuallyExclusiveInput();
    @Property(selector = "setMutuallyExclusiveInput:")
    public native void setMutuallyExclusiveInput(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
