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
package org.robovm.apple.metal;

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
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTLTextureSwizzleChannels/*</name>*/ 
    extends /*<extends>*/Struct<MTLTextureSwizzleChannels>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTLTextureSwizzleChannelsPtr extends Ptr<MTLTextureSwizzleChannels, MTLTextureSwizzleChannelsPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTLTextureSwizzleChannels() {}
    public MTLTextureSwizzleChannels(MTLTextureSwizzle red, MTLTextureSwizzle green, MTLTextureSwizzle blue, MTLTextureSwizzle alpha) {
        this.setRed(red);
        this.setGreen(green);
        this.setBlue(blue);
        this.setAlpha(alpha);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native MTLTextureSwizzle getRed();
    @StructMember(0) public native MTLTextureSwizzleChannels setRed(MTLTextureSwizzle red);
    @StructMember(1) public native MTLTextureSwizzle getGreen();
    @StructMember(1) public native MTLTextureSwizzleChannels setGreen(MTLTextureSwizzle green);
    @StructMember(2) public native MTLTextureSwizzle getBlue();
    @StructMember(2) public native MTLTextureSwizzleChannels setBlue(MTLTextureSwizzle blue);
    @StructMember(3) public native MTLTextureSwizzle getAlpha();
    @StructMember(3) public native MTLTextureSwizzleChannels setAlpha(MTLTextureSwizzle alpha);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
