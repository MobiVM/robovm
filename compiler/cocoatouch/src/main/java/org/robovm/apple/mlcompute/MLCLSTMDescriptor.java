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
package org.robovm.apple.mlcompute;

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
import org.robovm.apple.metal.*;
import org.robovm.apple.metalps.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MLCompute") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MLCLSTMDescriptor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MLCLSTMDescriptorPtr extends Ptr<MLCLSTMDescriptor, MLCLSTMDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MLCLSTMDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MLCLSTMDescriptor() {}
    protected MLCLSTMDescriptor(Handle h, long handle) { super(h, handle); }
    protected MLCLSTMDescriptor(SkipInit skipInit) { super(skipInit); }
    public MLCLSTMDescriptor(@MachineSizedUInt long inputSize, @MachineSizedUInt long hiddenSize, @MachineSizedUInt long layerCount) { super((Handle) null, create(inputSize, hiddenSize, layerCount)); retain(getHandle()); }
    public MLCLSTMDescriptor(@MachineSizedUInt long inputSize, @MachineSizedUInt long hiddenSize, @MachineSizedUInt long layerCount, boolean usesBiases, boolean isBidirectional, float dropout) { super((Handle) null, create(inputSize, hiddenSize, layerCount, usesBiases, isBidirectional, dropout)); retain(getHandle()); }
    public MLCLSTMDescriptor(@MachineSizedUInt long inputSize, @MachineSizedUInt long hiddenSize, @MachineSizedUInt long layerCount, boolean usesBiases, boolean batchFirst, boolean isBidirectional, float dropout) { super((Handle) null, create(inputSize, hiddenSize, layerCount, usesBiases, batchFirst, isBidirectional, dropout)); retain(getHandle()); }
    public MLCLSTMDescriptor(@MachineSizedUInt long inputSize, @MachineSizedUInt long hiddenSize, @MachineSizedUInt long layerCount, boolean usesBiases, boolean batchFirst, boolean isBidirectional, boolean returnsSequences, float dropout) { super((Handle) null, create(inputSize, hiddenSize, layerCount, usesBiases, batchFirst, isBidirectional, returnsSequences, dropout)); retain(getHandle()); }
    public MLCLSTMDescriptor(@MachineSizedUInt long inputSize, @MachineSizedUInt long hiddenSize, @MachineSizedUInt long layerCount, boolean usesBiases, boolean batchFirst, boolean isBidirectional, boolean returnsSequences, float dropout, MLCLSTMResultMode resultMode) { super((Handle) null, create(inputSize, hiddenSize, layerCount, usesBiases, batchFirst, isBidirectional, returnsSequences, dropout, resultMode)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "inputSize")
    public native @MachineSizedUInt long getInputSize();
    @Property(selector = "hiddenSize")
    public native @MachineSizedUInt long getHiddenSize();
    @Property(selector = "layerCount")
    public native @MachineSizedUInt long getLayerCount();
    @Property(selector = "usesBiases")
    public native boolean usesBiases();
    @Property(selector = "batchFirst")
    public native boolean isBatchFirst();
    @Property(selector = "isBidirectional")
    public native boolean isBidirectional();
    @Property(selector = "returnsSequences")
    public native boolean returnsSequences();
    @Property(selector = "dropout")
    public native float getDropout();
    @Property(selector = "resultMode")
    public native MLCLSTMResultMode getResultMode();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "descriptorWithInputSize:hiddenSize:layerCount:")
    protected static native @Pointer long create(@MachineSizedUInt long inputSize, @MachineSizedUInt long hiddenSize, @MachineSizedUInt long layerCount);
    @Method(selector = "descriptorWithInputSize:hiddenSize:layerCount:usesBiases:isBidirectional:dropout:")
    protected static native @Pointer long create(@MachineSizedUInt long inputSize, @MachineSizedUInt long hiddenSize, @MachineSizedUInt long layerCount, boolean usesBiases, boolean isBidirectional, float dropout);
    @Method(selector = "descriptorWithInputSize:hiddenSize:layerCount:usesBiases:batchFirst:isBidirectional:dropout:")
    protected static native @Pointer long create(@MachineSizedUInt long inputSize, @MachineSizedUInt long hiddenSize, @MachineSizedUInt long layerCount, boolean usesBiases, boolean batchFirst, boolean isBidirectional, float dropout);
    @Method(selector = "descriptorWithInputSize:hiddenSize:layerCount:usesBiases:batchFirst:isBidirectional:returnsSequences:dropout:")
    protected static native @Pointer long create(@MachineSizedUInt long inputSize, @MachineSizedUInt long hiddenSize, @MachineSizedUInt long layerCount, boolean usesBiases, boolean batchFirst, boolean isBidirectional, boolean returnsSequences, float dropout);
    @Method(selector = "descriptorWithInputSize:hiddenSize:layerCount:usesBiases:batchFirst:isBidirectional:returnsSequences:dropout:resultMode:")
    protected static native @Pointer long create(@MachineSizedUInt long inputSize, @MachineSizedUInt long hiddenSize, @MachineSizedUInt long layerCount, boolean usesBiases, boolean batchFirst, boolean isBidirectional, boolean returnsSequences, float dropout, MLCLSTMResultMode resultMode);
    /*</methods>*/
}
