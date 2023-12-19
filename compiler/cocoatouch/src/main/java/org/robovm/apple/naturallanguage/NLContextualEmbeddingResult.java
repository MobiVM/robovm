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
package org.robovm.apple.naturallanguage;

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
import org.robovm.apple.coreml.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 17.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("NaturalLanguage") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NLContextualEmbeddingResult/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NLContextualEmbeddingResultPtr extends Ptr<NLContextualEmbeddingResult, NLContextualEmbeddingResultPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NLContextualEmbeddingResult.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected NLContextualEmbeddingResult() {}
    protected NLContextualEmbeddingResult(Handle h, long handle) { super(h, handle); }
    protected NLContextualEmbeddingResult(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "string")
    public native String getString();
    @Property(selector = "language")
    public native NLLanguage getLanguage();
    @Property(selector = "sequenceLength")
    public native @MachineSizedUInt long getSequenceLength();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "enumerateTokenVectorsInRange:usingBlock:")
    public native void enumerateTokenVectors(@ByVal NSRange range, @Block("(,@ByVal,)") VoidBlock3<NSArray<NSNumber>, NSRange, BooleanPtr> block);
    @Method(selector = "tokenVectorAtIndex:tokenRange:")
    public native NSArray<NSNumber> getTokenVector(@MachineSizedUInt long characterIndex, NSRange tokenRange);
    /*</methods>*/
}
