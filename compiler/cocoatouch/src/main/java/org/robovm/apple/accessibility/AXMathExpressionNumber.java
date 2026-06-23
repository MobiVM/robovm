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
package org.robovm.apple.accessibility;

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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 18.2 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Accessibility") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AXMathExpressionNumber/*</name>*/ 
    extends /*<extends>*/AXMathExpression/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AXMathExpressionNumberPtr extends Ptr<AXMathExpressionNumber, AXMathExpressionNumberPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AXMathExpressionNumber.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AXMathExpressionNumber() {}
    protected AXMathExpressionNumber(Handle h, long handle) { super(h, handle); }
    protected AXMathExpressionNumber(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithContent:")
    public AXMathExpressionNumber(String content) { super((SkipInit) null); initObject(init(content)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "content")
    public native String getContent();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithContent:")
    protected native @Pointer long init(String content);
    /*</methods>*/
}
