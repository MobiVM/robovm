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
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/TCControlLayoutAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements TCControlLayout/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    @NotImplemented("anchor")
    public TCControlLayoutAnchor getAnchor() { return null; }
    @NotImplemented("setAnchor:")
    public void setAnchor(TCControlLayoutAnchor v) {}
    @NotImplemented("anchorCoordinateSystem")
    public TCControlLayoutAnchorCoordinateSystem getAnchorCoordinateSystem() { return null; }
    @NotImplemented("setAnchorCoordinateSystem:")
    public void setAnchorCoordinateSystem(TCControlLayoutAnchorCoordinateSystem v) {}
    @NotImplemented("offset")
    public @ByVal CGPoint getOffset() { return null; }
    @NotImplemented("setOffset:")
    public void setOffset(@ByVal CGPoint v) {}
    @NotImplemented("zIndex")
    public @MachineSizedSInt long getZIndex() { return 0; }
    @NotImplemented("setZIndex:")
    public void setZIndex(@MachineSizedSInt long v) {}
    @NotImplemented("size")
    public @ByVal CGSize getSize() { return null; }
    @NotImplemented("setSize:")
    public void setSize(@ByVal CGSize v) {}
    @NotImplemented("position")
    public @ByVal CGPoint getPosition() { return null; }
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
