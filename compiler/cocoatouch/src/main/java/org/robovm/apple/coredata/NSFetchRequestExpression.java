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
package org.robovm.apple.coredata;

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
import org.robovm.apple.corespotlight.*;
import org.robovm.apple.cloudkit.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("CoreData") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSFetchRequestExpression/*</name>*/ 
    extends /*<extends>*/NSExpression/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSFetchRequestExpressionPtr extends Ptr<NSFetchRequestExpression, NSFetchRequestExpressionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSFetchRequestExpression.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSFetchRequestExpression() {}
    protected NSFetchRequestExpression(Handle h, long handle) { super(h, handle); }
    protected NSFetchRequestExpression(SkipInit skipInit) { super(skipInit); }
    public NSFetchRequestExpression(NSExpression fetch, NSExpression context, boolean countFlag) { super((Handle) null, create(fetch, context, countFlag)); retain(getHandle()); }
    @Method(selector = "initWithExpressionType:")
    public NSFetchRequestExpression(NSExpressionType type) { super(type); }
    @Method(selector = "initWithCoder:")
    public NSFetchRequestExpression(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "requestExpression")
    public native NSExpression getRequestExpression();
    @Property(selector = "contextExpression")
    public native NSExpression getContextExpression();
    @Property(selector = "isCountOnlyRequest")
    public native boolean isCountOnlyRequest();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "expressionForFetch:context:countOnly:")
    protected static native @Pointer long create(NSExpression fetch, NSExpression context, boolean countFlag);
    @Method(selector = "expressionForConstantValue:")
    public static native NSExpression createForConstantValue(NSObject obj);
    @Method(selector = "expressionForEvaluatedObject")
    public static native NSExpression createForEvaluatedObject();
    @Method(selector = "expressionForVariable:")
    public static native NSExpression createForVariable(String string);
    @Method(selector = "expressionForKeyPath:")
    public static native NSExpression createForKeyPath(String keyPath);
    @Method(selector = "expressionForFunction:arguments:")
    public static native NSExpression createForFunction(String name, NSArray<?> parameters);
    @Method(selector = "expressionForAggregate:")
    public static native NSExpression createForAggregate(NSArray<NSExpression> subexpressions);
    @Method(selector = "expressionForUnionSet:with:")
    public static native NSExpression createForUnionSet(NSExpression left, NSExpression right);
    @Method(selector = "expressionForIntersectSet:with:")
    public static native NSExpression createForIntersectSet(NSExpression left, NSExpression right);
    @Method(selector = "expressionForMinusSet:with:")
    public static native NSExpression createForMinusSet(NSExpression left, NSExpression right);
    @Method(selector = "expressionForSubquery:usingIteratorVariable:predicate:")
    public static native NSExpression createForSubquery(NSExpression expression, String variable, NSPredicate predicate);
    @Method(selector = "expressionForFunction:selectorName:arguments:")
    public static native NSExpression createForFunction(NSExpression target, String name, NSArray<?> parameters);
    @Method(selector = "expressionForAnyKey")
    public static native NSExpression createForAnyKey();
    @Method(selector = "expressionForBlock:arguments:")
    public static native NSExpression createForBlock(@Block Block3<NSObject, NSArray<NSExpression>, NSMutableDictionary<?, ?>, NSObject> block, NSArray<NSExpression> arguments);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "expressionForConditional:trueExpression:falseExpression:")
    public static native NSExpression createForConditional(NSPredicate predicate, NSExpression trueExpression, NSExpression falseExpression);
    /*</methods>*/
}
