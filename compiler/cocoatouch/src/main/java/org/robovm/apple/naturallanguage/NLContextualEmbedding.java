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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NLContextualEmbedding/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NLContextualEmbeddingPtr extends Ptr<NLContextualEmbedding, NLContextualEmbeddingPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NLContextualEmbedding.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected NLContextualEmbedding() {}
    protected NLContextualEmbedding(Handle h, long handle) { super(h, handle); }
    protected NLContextualEmbedding(SkipInit skipInit) { super(skipInit); }
    public NLContextualEmbedding(String modelIdentifier) { super((Handle) null, create(modelIdentifier)); retain(getHandle()); }
    public NLContextualEmbedding(NLLanguage language) { super((Handle) null, create(language)); retain(getHandle()); }
    public NLContextualEmbedding(NLScript script) { super((Handle) null, create(script)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "modelIdentifier")
    public native String getModelIdentifier();
    @Property(selector = "languages")
    public native NSArray<NSString> getLanguages();
    @Property(selector = "scripts")
    public native NSArray<NSString> getScripts();
    @Property(selector = "revision")
    public native @MachineSizedUInt long getRevision();
    @Property(selector = "dimension")
    public native @MachineSizedUInt long getDimension();
    @Property(selector = "maximumSequenceLength")
    public native @MachineSizedUInt long getMaximumSequenceLength();
    @Property(selector = "hasAvailableAssets")
    public native boolean hasAvailableAssets();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    public boolean load() throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = load(ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "loadWithError:")
    private native boolean load(NSError.NSErrorPtr error);
    @Method(selector = "unload")
    public native void unload();
    public NLContextualEmbeddingResult embeddingResult(String string, NLLanguage language) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NLContextualEmbeddingResult result = embeddingResult(string, language, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "embeddingResultForString:language:error:")
    private native NLContextualEmbeddingResult embeddingResult(String string, NLLanguage language, NSError.NSErrorPtr error);
    @Method(selector = "requestEmbeddingAssetsWithCompletionHandler:")
    public native void requestEmbeddingAssets(@Block VoidBlock2<NLContextualEmbeddingAssetsResult, NSError> completionHandler);
    @Method(selector = "contextualEmbeddingWithModelIdentifier:")
    protected static native @Pointer long create(String modelIdentifier);
    @Method(selector = "contextualEmbeddingsForValues:")
    public static native NSArray<NLContextualEmbedding> contextualEmbeddingsForValues(NSDictionary<NSString, ?> valuesDictionary);
    @Method(selector = "contextualEmbeddingWithLanguage:")
    protected static native @Pointer long create(NLLanguage language);
    @Method(selector = "contextualEmbeddingWithScript:")
    protected static native @Pointer long create(NLScript script);
    /*</methods>*/
}
