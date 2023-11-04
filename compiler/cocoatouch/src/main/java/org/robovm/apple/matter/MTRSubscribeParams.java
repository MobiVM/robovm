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
package org.robovm.apple.matter;

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
import org.robovm.apple.security.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("Matter") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRSubscribeParams/*</name>*/ 
    extends /*<extends>*/MTRReadParams/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRSubscribeParamsPtr extends Ptr<MTRSubscribeParams, MTRSubscribeParamsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRSubscribeParams.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTRSubscribeParams() {}
    protected MTRSubscribeParams(Handle h, long handle) { super(h, handle); }
    protected MTRSubscribeParams(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithMinInterval:maxInterval:")
    public MTRSubscribeParams(NSNumber minInterval, NSNumber maxInterval) { super((SkipInit) null); initObject(init(minInterval, maxInterval)); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "shouldReplaceExistingSubscriptions")
    public native boolean isReplaceExistingSubscriptions();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setReplaceExistingSubscriptions:")
    public native void setReplaceExistingSubscriptions(boolean v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "shouldResubscribeAutomatically")
    public native boolean isResubscribeAutomatically();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setResubscribeAutomatically:")
    public native void setResubscribeAutomatically(boolean v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "minInterval")
    public native NSNumber getMinInterval();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setMinInterval:")
    public native void setMinInterval(NSNumber v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "maxInterval")
    public native NSNumber getMaxInterval();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setMaxInterval:")
    public native void setMaxInterval(NSNumber v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "shouldReportEventsUrgently")
    public native boolean isReportEventsUrgently();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setReportEventsUrgently:")
    public native void setReportEventsUrgently(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithMinInterval:maxInterval:")
    protected native @Pointer long init(NSNumber minInterval, NSNumber maxInterval);
    /*</methods>*/
}
