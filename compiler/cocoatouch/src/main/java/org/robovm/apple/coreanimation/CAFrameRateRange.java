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
package org.robovm.apple.coreanimation;

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
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.opengles.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.corevideo.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("QuartzCore")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CAFrameRateRange/*</name>*/ 
    extends /*<extends>*/Struct<CAFrameRateRange>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CAFrameRateRangePtr extends Ptr<CAFrameRateRange, CAFrameRateRangePtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(CAFrameRateRange.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CAFrameRateRange() {}
    public CAFrameRateRange(float minimum, float maximum, float preferred) {
        this.setMinimum(minimum);
        this.setMaximum(maximum);
        this.setPreferred(preferred);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native float getMinimum();
    @StructMember(0) public native CAFrameRateRange setMinimum(float minimum);
    @StructMember(1) public native float getMaximum();
    @StructMember(1) public native CAFrameRateRange setMaximum(float maximum);
    @StructMember(2) public native float getPreferred();
    @StructMember(2) public native CAFrameRateRange setPreferred(float preferred);
    /*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 15.0 and later.
     */
    @GlobalValue(symbol="CAFrameRateRangeDefault", optional=true)
    public static native @ByVal CAFrameRateRange getDefault();
    
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Bridge(symbol="CAFrameRateRangeMake", optional=true)
    public static native @ByVal CAFrameRateRange make(float minimum, float maximum, float preferred);
    /**
     * @since Available in iOS 15.0 and later.
     */
    public boolean isEqualToRange(CAFrameRateRange other) { return isEqualToRange(this, other); }
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Bridge(symbol="CAFrameRateRangeIsEqualToRange", optional=true)
    private static native boolean isEqualToRange(@ByVal CAFrameRateRange range, @ByVal CAFrameRateRange other);
    /*</methods>*/

    @Override
    public boolean equals(Object obj) {
        return obj instanceof CAFrameRateRange && isEqualToRange((CAFrameRateRange) obj);
    }
}
