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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CLSScoreItem/*</name>*/ 
    extends /*<extends>*/CLSActivityItem/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CLSScoreItemPtr extends Ptr<CLSScoreItem, CLSScoreItemPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CLSScoreItem.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CLSScoreItem() {}
    protected CLSScoreItem(Handle h, long handle) { super(h, handle); }
    protected CLSScoreItem(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithIdentifier:title:score:maxScore:")
    public CLSScoreItem(String identifier, String title, double score, double maxScore) { super((SkipInit) null); initObject(init(identifier, title, score, maxScore)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "score")
    public native double getScore();
    @Property(selector = "setScore:")
    public native void setScore(double v);
    @Property(selector = "maxScore")
    public native double getMaxScore();
    @Property(selector = "setMaxScore:")
    public native void setMaxScore(double v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithIdentifier:title:score:maxScore:")
    protected native @Pointer long init(String identifier, String title, double score, double maxScore);
    /*</methods>*/
}
