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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PHASEEnvelope/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PHASEEnvelopePtr extends Ptr<PHASEEnvelope, PHASEEnvelopePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PHASEEnvelope.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected PHASEEnvelope() {}
    protected PHASEEnvelope(Handle h, long handle) { super(h, handle); }
    protected PHASEEnvelope(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithStartPoint:segments:")
    public PHASEEnvelope(@ByVal VectorDouble2 startPoint, NSArray<PHASEEnvelopeSegment> segments) { super((SkipInit) null); initObject(init(startPoint, segments)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "startPoint")
    public native @ByVal VectorDouble2 getStartPoint();
    @Property(selector = "segments")
    public native NSArray<PHASEEnvelopeSegment> getSegments();
    @Property(selector = "domain")
    public native PHASENumericPair getDomain();
    @Property(selector = "range")
    public native PHASENumericPair getRange();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithStartPoint:segments:")
    protected native @Pointer long init(@ByVal VectorDouble2 startPoint, NSArray<PHASEEnvelopeSegment> segments);
    @Method(selector = "evaluateForValue:")
    public native double evaluateForValue(double x);
    /*</methods>*/
}
