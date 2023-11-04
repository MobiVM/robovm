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
/**
 * @since Available in iOS 16.4 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Matter") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRBaseClusterUnitTesting/*</name>*/ 
    extends /*<extends>*/MTRCluster/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRBaseClusterUnitTestingPtr extends Ptr<MTRBaseClusterUnitTesting, MTRBaseClusterUnitTestingPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRBaseClusterUnitTesting.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MTRBaseClusterUnitTesting() {}
    protected MTRBaseClusterUnitTesting(Handle h, long handle) { super(h, handle); }
    protected MTRBaseClusterUnitTesting(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "initWithDevice:endpointID:queue:")
    public MTRBaseClusterUnitTesting(MTRBaseDevice device, NSNumber endpointID, DispatchQueue queue) { super((SkipInit) null); initObject(init(device, endpointID, queue)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "initWithDevice:endpointID:queue:")
    protected native @Pointer long init(MTRBaseDevice device, NSNumber endpointID, DispatchQueue queue);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "testWithParams:completion:")
    public native void test(MTRUnitTestingClusterTestParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "testWithCompletion:")
    public native void test(@Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "testNotHandledWithParams:completion:")
    public native void testNotHandled(MTRUnitTestingClusterTestNotHandledParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "testNotHandledWithCompletion:")
    public native void testNotHandled(@Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "testSpecificWithParams:completion:")
    public native void testSpecific(MTRUnitTestingClusterTestSpecificParams params, @Block VoidBlock2<MTRUnitTestingClusterTestSpecificResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "testSpecificWithCompletion:")
    public native void testSpecific(@Block VoidBlock2<MTRUnitTestingClusterTestSpecificResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "testUnknownCommandWithParams:completion:")
    public native void testUnknownCommand(MTRUnitTestingClusterTestUnknownCommandParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "testUnknownCommandWithCompletion:")
    public native void testUnknownCommand(@Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "testAddArgumentsWithParams:completion:")
    public native void testAddArguments(MTRUnitTestingClusterTestAddArgumentsParams params, @Block VoidBlock2<MTRUnitTestingClusterTestAddArgumentsResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "testSimpleArgumentRequestWithParams:completion:")
    public native void testSimpleArgumentRequest(MTRUnitTestingClusterTestSimpleArgumentRequestParams params, @Block VoidBlock2<MTRUnitTestingClusterTestSimpleArgumentResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "testStructArrayArgumentRequestWithParams:completion:")
    public native void testStructArrayArgumentRequest(MTRUnitTestingClusterTestStructArrayArgumentRequestParams params, @Block VoidBlock2<MTRUnitTestingClusterTestStructArrayArgumentResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "testStructArgumentRequestWithParams:completion:")
    public native void testStructArgumentRequest(MTRUnitTestingClusterTestStructArgumentRequestParams params, @Block VoidBlock2<MTRUnitTestingClusterBooleanResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "testNestedStructArgumentRequestWithParams:completion:")
    public native void testNestedStructArgumentRequest(MTRUnitTestingClusterTestNestedStructArgumentRequestParams params, @Block VoidBlock2<MTRUnitTestingClusterBooleanResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "testListStructArgumentRequestWithParams:completion:")
    public native void testListStructArgumentRequest(MTRUnitTestingClusterTestListStructArgumentRequestParams params, @Block VoidBlock2<MTRUnitTestingClusterBooleanResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "testListInt8UArgumentRequestWithParams:completion:")
    public native void testListInt8UArgumentRequest(MTRUnitTestingClusterTestListInt8UArgumentRequestParams params, @Block VoidBlock2<MTRUnitTestingClusterBooleanResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "testNestedStructListArgumentRequestWithParams:completion:")
    public native void testNestedStructListArgumentRequest(MTRUnitTestingClusterTestNestedStructListArgumentRequestParams params, @Block VoidBlock2<MTRUnitTestingClusterBooleanResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "testListNestedStructListArgumentRequestWithParams:completion:")
    public native void testListNestedStructListArgumentRequest(MTRUnitTestingClusterTestListNestedStructListArgumentRequestParams params, @Block VoidBlock2<MTRUnitTestingClusterBooleanResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "testListInt8UReverseRequestWithParams:completion:")
    public native void testListInt8UReverseRequest(MTRUnitTestingClusterTestListInt8UReverseRequestParams params, @Block VoidBlock2<MTRUnitTestingClusterTestListInt8UReverseResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "testEnumsRequestWithParams:completion:")
    public native void testEnumsRequest(MTRUnitTestingClusterTestEnumsRequestParams params, @Block VoidBlock2<MTRUnitTestingClusterTestEnumsResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "testNullableOptionalRequestWithParams:completion:")
    public native void testNullableOptionalRequest(MTRUnitTestingClusterTestNullableOptionalRequestParams params, @Block VoidBlock2<MTRUnitTestingClusterTestNullableOptionalResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "testComplexNullableOptionalRequestWithParams:completion:")
    public native void testComplexNullableOptionalRequest(MTRUnitTestingClusterTestComplexNullableOptionalRequestParams params, @Block VoidBlock2<MTRUnitTestingClusterTestComplexNullableOptionalResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "simpleStructEchoRequestWithParams:completion:")
    public native void simpleStructEchoRequest(MTRUnitTestingClusterSimpleStructEchoRequestParams params, @Block VoidBlock2<MTRUnitTestingClusterSimpleStructResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "timedInvokeRequestWithParams:completion:")
    public native void timedInvokeRequest(MTRUnitTestingClusterTimedInvokeRequestParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "timedInvokeRequestWithCompletion:")
    public native void timedInvokeRequest(@Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "testSimpleOptionalArgumentRequestWithParams:completion:")
    public native void testSimpleOptionalArgumentRequest(MTRUnitTestingClusterTestSimpleOptionalArgumentRequestParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "testEmitTestEventRequestWithParams:completion:")
    public native void testEmitTestEventRequest(MTRUnitTestingClusterTestEmitTestEventRequestParams params, @Block VoidBlock2<MTRUnitTestingClusterTestEmitTestEventResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "testEmitTestFabricScopedEventRequestWithParams:completion:")
    public native void testEmitTestFabricScopedEventRequest(MTRUnitTestingClusterTestEmitTestFabricScopedEventRequestParams params, @Block VoidBlock2<MTRUnitTestingClusterTestEmitTestFabricScopedEventResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeBooleanWithCompletion:")
    public native void readAttributeBoolean(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeBooleanWithValue:completion:")
    public native void writeAttributeBoolean(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeBooleanWithValue:params:completion:")
    public native void writeAttributeBoolean(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeBooleanWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeBoolean(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeBitmap8WithCompletion:")
    public native void readAttributeBitmap8(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeBitmap8WithValue:completion:")
    public native void writeAttributeBitmap8(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeBitmap8WithValue:params:completion:")
    public native void writeAttributeBitmap8(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeBitmap8WithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeBitmap8(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeBitmap16WithCompletion:")
    public native void readAttributeBitmap16(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeBitmap16WithValue:completion:")
    public native void writeAttributeBitmap16(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeBitmap16WithValue:params:completion:")
    public native void writeAttributeBitmap16(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeBitmap16WithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeBitmap16(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeBitmap32WithCompletion:")
    public native void readAttributeBitmap32(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeBitmap32WithValue:completion:")
    public native void writeAttributeBitmap32(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeBitmap32WithValue:params:completion:")
    public native void writeAttributeBitmap32(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeBitmap32WithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeBitmap32(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeBitmap64WithCompletion:")
    public native void readAttributeBitmap64(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeBitmap64WithValue:completion:")
    public native void writeAttributeBitmap64(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeBitmap64WithValue:params:completion:")
    public native void writeAttributeBitmap64(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeBitmap64WithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeBitmap64(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeInt8uWithCompletion:")
    public native void readAttributeInt8u(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeInt8uWithValue:completion:")
    public native void writeAttributeInt8u(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeInt8uWithValue:params:completion:")
    public native void writeAttributeInt8u(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeInt8uWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInt8u(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeInt16uWithCompletion:")
    public native void readAttributeInt16u(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeInt16uWithValue:completion:")
    public native void writeAttributeInt16u(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeInt16uWithValue:params:completion:")
    public native void writeAttributeInt16u(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeInt16uWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInt16u(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeInt24uWithCompletion:")
    public native void readAttributeInt24u(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeInt24uWithValue:completion:")
    public native void writeAttributeInt24u(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeInt24uWithValue:params:completion:")
    public native void writeAttributeInt24u(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeInt24uWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInt24u(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeInt32uWithCompletion:")
    public native void readAttributeInt32u(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeInt32uWithValue:completion:")
    public native void writeAttributeInt32u(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeInt32uWithValue:params:completion:")
    public native void writeAttributeInt32u(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeInt32uWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInt32u(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeInt40uWithCompletion:")
    public native void readAttributeInt40u(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeInt40uWithValue:completion:")
    public native void writeAttributeInt40u(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeInt40uWithValue:params:completion:")
    public native void writeAttributeInt40u(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeInt40uWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInt40u(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeInt48uWithCompletion:")
    public native void readAttributeInt48u(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeInt48uWithValue:completion:")
    public native void writeAttributeInt48u(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeInt48uWithValue:params:completion:")
    public native void writeAttributeInt48u(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeInt48uWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInt48u(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeInt56uWithCompletion:")
    public native void readAttributeInt56u(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeInt56uWithValue:completion:")
    public native void writeAttributeInt56u(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeInt56uWithValue:params:completion:")
    public native void writeAttributeInt56u(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeInt56uWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInt56u(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeInt64uWithCompletion:")
    public native void readAttributeInt64u(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeInt64uWithValue:completion:")
    public native void writeAttributeInt64u(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeInt64uWithValue:params:completion:")
    public native void writeAttributeInt64u(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeInt64uWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInt64u(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeInt8sWithCompletion:")
    public native void readAttributeInt8s(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeInt8sWithValue:completion:")
    public native void writeAttributeInt8s(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeInt8sWithValue:params:completion:")
    public native void writeAttributeInt8s(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeInt8sWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInt8s(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeInt16sWithCompletion:")
    public native void readAttributeInt16s(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeInt16sWithValue:completion:")
    public native void writeAttributeInt16s(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeInt16sWithValue:params:completion:")
    public native void writeAttributeInt16s(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeInt16sWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInt16s(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeInt24sWithCompletion:")
    public native void readAttributeInt24s(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeInt24sWithValue:completion:")
    public native void writeAttributeInt24s(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeInt24sWithValue:params:completion:")
    public native void writeAttributeInt24s(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeInt24sWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInt24s(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeInt32sWithCompletion:")
    public native void readAttributeInt32s(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeInt32sWithValue:completion:")
    public native void writeAttributeInt32s(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeInt32sWithValue:params:completion:")
    public native void writeAttributeInt32s(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeInt32sWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInt32s(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeInt40sWithCompletion:")
    public native void readAttributeInt40s(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeInt40sWithValue:completion:")
    public native void writeAttributeInt40s(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeInt40sWithValue:params:completion:")
    public native void writeAttributeInt40s(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeInt40sWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInt40s(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeInt48sWithCompletion:")
    public native void readAttributeInt48s(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeInt48sWithValue:completion:")
    public native void writeAttributeInt48s(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeInt48sWithValue:params:completion:")
    public native void writeAttributeInt48s(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeInt48sWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInt48s(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeInt56sWithCompletion:")
    public native void readAttributeInt56s(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeInt56sWithValue:completion:")
    public native void writeAttributeInt56s(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeInt56sWithValue:params:completion:")
    public native void writeAttributeInt56s(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeInt56sWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInt56s(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeInt64sWithCompletion:")
    public native void readAttributeInt64s(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeInt64sWithValue:completion:")
    public native void writeAttributeInt64s(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeInt64sWithValue:params:completion:")
    public native void writeAttributeInt64s(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeInt64sWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInt64s(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeEnum8WithCompletion:")
    public native void readAttributeEnum8(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeEnum8WithValue:completion:")
    public native void writeAttributeEnum8(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeEnum8WithValue:params:completion:")
    public native void writeAttributeEnum8(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeEnum8WithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeEnum8(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeEnum16WithCompletion:")
    public native void readAttributeEnum16(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeEnum16WithValue:completion:")
    public native void writeAttributeEnum16(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeEnum16WithValue:params:completion:")
    public native void writeAttributeEnum16(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeEnum16WithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeEnum16(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeFloatSingleWithCompletion:")
    public native void readAttributeFloatSingle(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeFloatSingleWithValue:completion:")
    public native void writeAttributeFloatSingle(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeFloatSingleWithValue:params:completion:")
    public native void writeAttributeFloatSingle(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeFloatSingleWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeFloatSingle(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeFloatDoubleWithCompletion:")
    public native void readAttributeFloatDouble(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeFloatDoubleWithValue:completion:")
    public native void writeAttributeFloatDouble(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeFloatDoubleWithValue:params:completion:")
    public native void writeAttributeFloatDouble(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeFloatDoubleWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeFloatDouble(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeOctetStringWithCompletion:")
    public native void readAttributeOctetString(@Block VoidBlock2<NSData, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeOctetStringWithValue:completion:")
    public native void writeAttributeOctetString(NSData value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeOctetStringWithValue:params:completion:")
    public native void writeAttributeOctetString(NSData value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeOctetStringWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeOctetString(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSData, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeListInt8uWithCompletion:")
    public native void readAttributeListInt8u(@Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeListInt8uWithValue:completion:")
    public native void writeAttributeListInt8u(NSArray<?> value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeListInt8uWithValue:params:completion:")
    public native void writeAttributeListInt8u(NSArray<?> value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeListInt8uWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeListInt8u(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSArray<?>, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeListOctetStringWithCompletion:")
    public native void readAttributeListOctetString(@Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeListOctetStringWithValue:completion:")
    public native void writeAttributeListOctetString(NSArray<?> value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeListOctetStringWithValue:params:completion:")
    public native void writeAttributeListOctetString(NSArray<?> value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeListOctetStringWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeListOctetString(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSArray<?>, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeListStructOctetStringWithCompletion:")
    public native void readAttributeListStructOctetString(@Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeListStructOctetStringWithValue:completion:")
    public native void writeAttributeListStructOctetString(NSArray<?> value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeListStructOctetStringWithValue:params:completion:")
    public native void writeAttributeListStructOctetString(NSArray<?> value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeListStructOctetStringWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeListStructOctetString(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSArray<?>, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeLongOctetStringWithCompletion:")
    public native void readAttributeLongOctetString(@Block VoidBlock2<NSData, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeLongOctetStringWithValue:completion:")
    public native void writeAttributeLongOctetString(NSData value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeLongOctetStringWithValue:params:completion:")
    public native void writeAttributeLongOctetString(NSData value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeLongOctetStringWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeLongOctetString(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSData, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeCharStringWithCompletion:")
    public native void readAttributeCharString(@Block VoidBlock2<NSString, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeCharStringWithValue:completion:")
    public native void writeAttributeCharString(String value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeCharStringWithValue:params:completion:")
    public native void writeAttributeCharString(String value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeCharStringWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeCharString(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSString, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeLongCharStringWithCompletion:")
    public native void readAttributeLongCharString(@Block VoidBlock2<NSString, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeLongCharStringWithValue:completion:")
    public native void writeAttributeLongCharString(String value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeLongCharStringWithValue:params:completion:")
    public native void writeAttributeLongCharString(String value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeLongCharStringWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeLongCharString(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSString, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeEpochUsWithCompletion:")
    public native void readAttributeEpochUs(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeEpochUsWithValue:completion:")
    public native void writeAttributeEpochUs(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeEpochUsWithValue:params:completion:")
    public native void writeAttributeEpochUs(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeEpochUsWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeEpochUs(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeEpochSWithCompletion:")
    public native void readAttributeEpochS(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeEpochSWithValue:completion:")
    public native void writeAttributeEpochS(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeEpochSWithValue:params:completion:")
    public native void writeAttributeEpochS(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeEpochSWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeEpochS(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeVendorIdWithCompletion:")
    public native void readAttributeVendorId(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeVendorIdWithValue:completion:")
    public native void writeAttributeVendorId(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeVendorIdWithValue:params:completion:")
    public native void writeAttributeVendorId(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeVendorIdWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeVendorId(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeListNullablesAndOptionalsStructWithCompletion:")
    public native void readAttributeListNullablesAndOptionalsStruct(@Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeListNullablesAndOptionalsStructWithValue:completion:")
    public native void writeAttributeListNullablesAndOptionalsStruct(NSArray<?> value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeListNullablesAndOptionalsStructWithValue:params:completion:")
    public native void writeAttributeListNullablesAndOptionalsStruct(NSArray<?> value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeListNullablesAndOptionalsStructWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeListNullablesAndOptionalsStruct(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSArray<?>, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeEnumAttrWithCompletion:")
    public native void readAttributeEnumAttr(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeEnumAttrWithValue:completion:")
    public native void writeAttributeEnumAttr(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeEnumAttrWithValue:params:completion:")
    public native void writeAttributeEnumAttr(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeEnumAttrWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeEnumAttr(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeStructAttrWithCompletion:")
    public native void readAttributeStructAttr(@Block VoidBlock2<MTRUnitTestingClusterSimpleStruct, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeStructAttrWithValue:completion:")
    public native void writeAttributeStructAttr(MTRUnitTestingClusterSimpleStruct value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeStructAttrWithValue:params:completion:")
    public native void writeAttributeStructAttr(MTRUnitTestingClusterSimpleStruct value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeStructAttrWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeStructAttr(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<MTRUnitTestingClusterSimpleStruct, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeRangeRestrictedInt8uWithCompletion:")
    public native void readAttributeRangeRestrictedInt8u(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeRangeRestrictedInt8uWithValue:completion:")
    public native void writeAttributeRangeRestrictedInt8u(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeRangeRestrictedInt8uWithValue:params:completion:")
    public native void writeAttributeRangeRestrictedInt8u(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeRangeRestrictedInt8uWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRangeRestrictedInt8u(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeRangeRestrictedInt8sWithCompletion:")
    public native void readAttributeRangeRestrictedInt8s(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeRangeRestrictedInt8sWithValue:completion:")
    public native void writeAttributeRangeRestrictedInt8s(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeRangeRestrictedInt8sWithValue:params:completion:")
    public native void writeAttributeRangeRestrictedInt8s(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeRangeRestrictedInt8sWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRangeRestrictedInt8s(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeRangeRestrictedInt16uWithCompletion:")
    public native void readAttributeRangeRestrictedInt16u(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeRangeRestrictedInt16uWithValue:completion:")
    public native void writeAttributeRangeRestrictedInt16u(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeRangeRestrictedInt16uWithValue:params:completion:")
    public native void writeAttributeRangeRestrictedInt16u(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeRangeRestrictedInt16uWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRangeRestrictedInt16u(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeRangeRestrictedInt16sWithCompletion:")
    public native void readAttributeRangeRestrictedInt16s(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeRangeRestrictedInt16sWithValue:completion:")
    public native void writeAttributeRangeRestrictedInt16s(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeRangeRestrictedInt16sWithValue:params:completion:")
    public native void writeAttributeRangeRestrictedInt16s(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeRangeRestrictedInt16sWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRangeRestrictedInt16s(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeListLongOctetStringWithCompletion:")
    public native void readAttributeListLongOctetString(@Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeListLongOctetStringWithValue:completion:")
    public native void writeAttributeListLongOctetString(NSArray<?> value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeListLongOctetStringWithValue:params:completion:")
    public native void writeAttributeListLongOctetString(NSArray<?> value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeListLongOctetStringWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeListLongOctetString(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSArray<?>, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeListFabricScopedWithParams:completion:")
    public native void readAttributeListFabricScoped(MTRReadParams params, @Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeListFabricScopedWithValue:completion:")
    public native void writeAttributeListFabricScoped(NSArray<?> value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeListFabricScopedWithValue:params:completion:")
    public native void writeAttributeListFabricScoped(NSArray<?> value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeListFabricScopedWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeListFabricScoped(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSArray<?>, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeTimedWriteBooleanWithCompletion:")
    public native void readAttributeTimedWriteBoolean(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeTimedWriteBooleanWithValue:completion:")
    public native void writeAttributeTimedWriteBoolean(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeTimedWriteBooleanWithValue:params:completion:")
    public native void writeAttributeTimedWriteBoolean(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeTimedWriteBooleanWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTimedWriteBoolean(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeGeneralErrorBooleanWithCompletion:")
    public native void readAttributeGeneralErrorBoolean(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeGeneralErrorBooleanWithValue:completion:")
    public native void writeAttributeGeneralErrorBoolean(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeGeneralErrorBooleanWithValue:params:completion:")
    public native void writeAttributeGeneralErrorBoolean(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeGeneralErrorBooleanWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeGeneralErrorBoolean(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeClusterErrorBooleanWithCompletion:")
    public native void readAttributeClusterErrorBoolean(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeClusterErrorBooleanWithValue:completion:")
    public native void writeAttributeClusterErrorBoolean(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeClusterErrorBooleanWithValue:params:completion:")
    public native void writeAttributeClusterErrorBoolean(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeClusterErrorBooleanWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeClusterErrorBoolean(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeUnsupportedWithCompletion:")
    public native void readAttributeUnsupported(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeUnsupportedWithValue:completion:")
    public native void writeAttributeUnsupported(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeUnsupportedWithValue:params:completion:")
    public native void writeAttributeUnsupported(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeUnsupportedWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeUnsupported(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableBooleanWithCompletion:")
    public native void readAttributeNullableBoolean(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableBooleanWithValue:completion:")
    public native void writeAttributeNullableBoolean(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableBooleanWithValue:params:completion:")
    public native void writeAttributeNullableBoolean(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeNullableBooleanWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableBoolean(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableBitmap8WithCompletion:")
    public native void readAttributeNullableBitmap8(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableBitmap8WithValue:completion:")
    public native void writeAttributeNullableBitmap8(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableBitmap8WithValue:params:completion:")
    public native void writeAttributeNullableBitmap8(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeNullableBitmap8WithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableBitmap8(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableBitmap16WithCompletion:")
    public native void readAttributeNullableBitmap16(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableBitmap16WithValue:completion:")
    public native void writeAttributeNullableBitmap16(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableBitmap16WithValue:params:completion:")
    public native void writeAttributeNullableBitmap16(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeNullableBitmap16WithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableBitmap16(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableBitmap32WithCompletion:")
    public native void readAttributeNullableBitmap32(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableBitmap32WithValue:completion:")
    public native void writeAttributeNullableBitmap32(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableBitmap32WithValue:params:completion:")
    public native void writeAttributeNullableBitmap32(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeNullableBitmap32WithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableBitmap32(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableBitmap64WithCompletion:")
    public native void readAttributeNullableBitmap64(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableBitmap64WithValue:completion:")
    public native void writeAttributeNullableBitmap64(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableBitmap64WithValue:params:completion:")
    public native void writeAttributeNullableBitmap64(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeNullableBitmap64WithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableBitmap64(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableInt8uWithCompletion:")
    public native void readAttributeNullableInt8u(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableInt8uWithValue:completion:")
    public native void writeAttributeNullableInt8u(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableInt8uWithValue:params:completion:")
    public native void writeAttributeNullableInt8u(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeNullableInt8uWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableInt8u(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableInt16uWithCompletion:")
    public native void readAttributeNullableInt16u(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableInt16uWithValue:completion:")
    public native void writeAttributeNullableInt16u(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableInt16uWithValue:params:completion:")
    public native void writeAttributeNullableInt16u(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeNullableInt16uWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableInt16u(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableInt24uWithCompletion:")
    public native void readAttributeNullableInt24u(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableInt24uWithValue:completion:")
    public native void writeAttributeNullableInt24u(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableInt24uWithValue:params:completion:")
    public native void writeAttributeNullableInt24u(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeNullableInt24uWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableInt24u(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableInt32uWithCompletion:")
    public native void readAttributeNullableInt32u(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableInt32uWithValue:completion:")
    public native void writeAttributeNullableInt32u(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableInt32uWithValue:params:completion:")
    public native void writeAttributeNullableInt32u(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeNullableInt32uWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableInt32u(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableInt40uWithCompletion:")
    public native void readAttributeNullableInt40u(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableInt40uWithValue:completion:")
    public native void writeAttributeNullableInt40u(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableInt40uWithValue:params:completion:")
    public native void writeAttributeNullableInt40u(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeNullableInt40uWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableInt40u(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableInt48uWithCompletion:")
    public native void readAttributeNullableInt48u(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableInt48uWithValue:completion:")
    public native void writeAttributeNullableInt48u(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableInt48uWithValue:params:completion:")
    public native void writeAttributeNullableInt48u(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeNullableInt48uWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableInt48u(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableInt56uWithCompletion:")
    public native void readAttributeNullableInt56u(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableInt56uWithValue:completion:")
    public native void writeAttributeNullableInt56u(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableInt56uWithValue:params:completion:")
    public native void writeAttributeNullableInt56u(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeNullableInt56uWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableInt56u(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableInt64uWithCompletion:")
    public native void readAttributeNullableInt64u(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableInt64uWithValue:completion:")
    public native void writeAttributeNullableInt64u(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableInt64uWithValue:params:completion:")
    public native void writeAttributeNullableInt64u(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeNullableInt64uWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableInt64u(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableInt8sWithCompletion:")
    public native void readAttributeNullableInt8s(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableInt8sWithValue:completion:")
    public native void writeAttributeNullableInt8s(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableInt8sWithValue:params:completion:")
    public native void writeAttributeNullableInt8s(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeNullableInt8sWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableInt8s(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableInt16sWithCompletion:")
    public native void readAttributeNullableInt16s(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableInt16sWithValue:completion:")
    public native void writeAttributeNullableInt16s(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableInt16sWithValue:params:completion:")
    public native void writeAttributeNullableInt16s(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeNullableInt16sWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableInt16s(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableInt24sWithCompletion:")
    public native void readAttributeNullableInt24s(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableInt24sWithValue:completion:")
    public native void writeAttributeNullableInt24s(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableInt24sWithValue:params:completion:")
    public native void writeAttributeNullableInt24s(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeNullableInt24sWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableInt24s(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableInt32sWithCompletion:")
    public native void readAttributeNullableInt32s(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableInt32sWithValue:completion:")
    public native void writeAttributeNullableInt32s(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableInt32sWithValue:params:completion:")
    public native void writeAttributeNullableInt32s(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeNullableInt32sWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableInt32s(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableInt40sWithCompletion:")
    public native void readAttributeNullableInt40s(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableInt40sWithValue:completion:")
    public native void writeAttributeNullableInt40s(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableInt40sWithValue:params:completion:")
    public native void writeAttributeNullableInt40s(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeNullableInt40sWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableInt40s(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableInt48sWithCompletion:")
    public native void readAttributeNullableInt48s(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableInt48sWithValue:completion:")
    public native void writeAttributeNullableInt48s(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableInt48sWithValue:params:completion:")
    public native void writeAttributeNullableInt48s(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeNullableInt48sWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableInt48s(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableInt56sWithCompletion:")
    public native void readAttributeNullableInt56s(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableInt56sWithValue:completion:")
    public native void writeAttributeNullableInt56s(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableInt56sWithValue:params:completion:")
    public native void writeAttributeNullableInt56s(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeNullableInt56sWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableInt56s(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableInt64sWithCompletion:")
    public native void readAttributeNullableInt64s(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableInt64sWithValue:completion:")
    public native void writeAttributeNullableInt64s(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableInt64sWithValue:params:completion:")
    public native void writeAttributeNullableInt64s(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeNullableInt64sWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableInt64s(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableEnum8WithCompletion:")
    public native void readAttributeNullableEnum8(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableEnum8WithValue:completion:")
    public native void writeAttributeNullableEnum8(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableEnum8WithValue:params:completion:")
    public native void writeAttributeNullableEnum8(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeNullableEnum8WithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableEnum8(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableEnum16WithCompletion:")
    public native void readAttributeNullableEnum16(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableEnum16WithValue:completion:")
    public native void writeAttributeNullableEnum16(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableEnum16WithValue:params:completion:")
    public native void writeAttributeNullableEnum16(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeNullableEnum16WithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableEnum16(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableFloatSingleWithCompletion:")
    public native void readAttributeNullableFloatSingle(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableFloatSingleWithValue:completion:")
    public native void writeAttributeNullableFloatSingle(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableFloatSingleWithValue:params:completion:")
    public native void writeAttributeNullableFloatSingle(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeNullableFloatSingleWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableFloatSingle(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableFloatDoubleWithCompletion:")
    public native void readAttributeNullableFloatDouble(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableFloatDoubleWithValue:completion:")
    public native void writeAttributeNullableFloatDouble(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableFloatDoubleWithValue:params:completion:")
    public native void writeAttributeNullableFloatDouble(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeNullableFloatDoubleWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableFloatDouble(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableOctetStringWithCompletion:")
    public native void readAttributeNullableOctetString(@Block VoidBlock2<NSData, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableOctetStringWithValue:completion:")
    public native void writeAttributeNullableOctetString(NSData value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableOctetStringWithValue:params:completion:")
    public native void writeAttributeNullableOctetString(NSData value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeNullableOctetStringWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableOctetString(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSData, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableCharStringWithCompletion:")
    public native void readAttributeNullableCharString(@Block VoidBlock2<NSString, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableCharStringWithValue:completion:")
    public native void writeAttributeNullableCharString(String value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableCharStringWithValue:params:completion:")
    public native void writeAttributeNullableCharString(String value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeNullableCharStringWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableCharString(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSString, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableEnumAttrWithCompletion:")
    public native void readAttributeNullableEnumAttr(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableEnumAttrWithValue:completion:")
    public native void writeAttributeNullableEnumAttr(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableEnumAttrWithValue:params:completion:")
    public native void writeAttributeNullableEnumAttr(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeNullableEnumAttrWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableEnumAttr(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableStructWithCompletion:")
    public native void readAttributeNullableStruct(@Block VoidBlock2<MTRUnitTestingClusterSimpleStruct, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableStructWithValue:completion:")
    public native void writeAttributeNullableStruct(MTRUnitTestingClusterSimpleStruct value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableStructWithValue:params:completion:")
    public native void writeAttributeNullableStruct(MTRUnitTestingClusterSimpleStruct value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeNullableStructWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableStruct(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<MTRUnitTestingClusterSimpleStruct, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableRangeRestrictedInt8uWithCompletion:")
    public native void readAttributeNullableRangeRestrictedInt8u(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableRangeRestrictedInt8uWithValue:completion:")
    public native void writeAttributeNullableRangeRestrictedInt8u(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableRangeRestrictedInt8uWithValue:params:completion:")
    public native void writeAttributeNullableRangeRestrictedInt8u(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeNullableRangeRestrictedInt8uWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableRangeRestrictedInt8u(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableRangeRestrictedInt8sWithCompletion:")
    public native void readAttributeNullableRangeRestrictedInt8s(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableRangeRestrictedInt8sWithValue:completion:")
    public native void writeAttributeNullableRangeRestrictedInt8s(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableRangeRestrictedInt8sWithValue:params:completion:")
    public native void writeAttributeNullableRangeRestrictedInt8s(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeNullableRangeRestrictedInt8sWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableRangeRestrictedInt8s(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableRangeRestrictedInt16uWithCompletion:")
    public native void readAttributeNullableRangeRestrictedInt16u(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableRangeRestrictedInt16uWithValue:completion:")
    public native void writeAttributeNullableRangeRestrictedInt16u(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableRangeRestrictedInt16uWithValue:params:completion:")
    public native void writeAttributeNullableRangeRestrictedInt16u(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeNullableRangeRestrictedInt16uWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableRangeRestrictedInt16u(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableRangeRestrictedInt16sWithCompletion:")
    public native void readAttributeNullableRangeRestrictedInt16s(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableRangeRestrictedInt16sWithValue:completion:")
    public native void writeAttributeNullableRangeRestrictedInt16s(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableRangeRestrictedInt16sWithValue:params:completion:")
    public native void writeAttributeNullableRangeRestrictedInt16s(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeNullableRangeRestrictedInt16sWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableRangeRestrictedInt16s(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeWriteOnlyInt8uWithCompletion:")
    public native void readAttributeWriteOnlyInt8u(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeWriteOnlyInt8uWithValue:completion:")
    public native void writeAttributeWriteOnlyInt8u(NSNumber value, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeWriteOnlyInt8uWithValue:params:completion:")
    public native void writeAttributeWriteOnlyInt8u(NSNumber value, MTRWriteParams params, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeWriteOnlyInt8uWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeWriteOnlyInt8u(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeGeneratedCommandListWithCompletion:")
    public native void readAttributeGeneratedCommandList(@Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeGeneratedCommandListWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeGeneratedCommandList(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSArray<?>, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeAcceptedCommandListWithCompletion:")
    public native void readAttributeAcceptedCommandList(@Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeAcceptedCommandListWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAcceptedCommandList(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSArray<?>, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeAttributeListWithCompletion:")
    public native void readAttributeAttributeList(@Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeAttributeListWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAttributeList(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSArray<?>, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeFeatureMapWithCompletion:")
    public native void readAttributeFeatureMap(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeFeatureMapWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeFeatureMap(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeClusterRevisionWithCompletion:")
    public native void readAttributeClusterRevision(@Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "subscribeAttributeClusterRevisionWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeClusterRevision(MTRSubscribeParams params, @Block Runnable subscriptionEstablished, @Block VoidBlock2<NSNumber, NSError> reportHandler);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeBooleanWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeBoolean(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeBitmap8WithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeBitmap8(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeBitmap16WithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeBitmap16(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeBitmap32WithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeBitmap32(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeBitmap64WithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeBitmap64(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeInt8uWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeInt8u(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeInt16uWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeInt16u(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeInt24uWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeInt24u(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeInt32uWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeInt32u(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeInt40uWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeInt40u(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeInt48uWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeInt48u(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeInt56uWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeInt56u(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeInt64uWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeInt64u(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeInt8sWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeInt8s(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeInt16sWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeInt16s(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeInt24sWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeInt24s(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeInt32sWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeInt32s(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeInt40sWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeInt40s(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeInt48sWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeInt48s(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeInt56sWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeInt56s(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeInt64sWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeInt64s(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeEnum8WithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeEnum8(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeEnum16WithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeEnum16(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeFloatSingleWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeFloatSingle(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeFloatDoubleWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeFloatDouble(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeOctetStringWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeOctetString(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSData, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeListInt8uWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeListInt8u(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeListOctetStringWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeListOctetString(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeListStructOctetStringWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeListStructOctetString(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeLongOctetStringWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeLongOctetString(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSData, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeCharStringWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeCharString(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSString, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeLongCharStringWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeLongCharString(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSString, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeEpochUsWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeEpochUs(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeEpochSWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeEpochS(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeVendorIdWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeVendorId(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeListNullablesAndOptionalsStructWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeListNullablesAndOptionalsStruct(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeEnumAttrWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeEnumAttr(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeStructAttrWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeStructAttr(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<MTRUnitTestingClusterSimpleStruct, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeRangeRestrictedInt8uWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRangeRestrictedInt8u(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeRangeRestrictedInt8sWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRangeRestrictedInt8s(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeRangeRestrictedInt16uWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRangeRestrictedInt16u(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeRangeRestrictedInt16sWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRangeRestrictedInt16s(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeListLongOctetStringWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeListLongOctetString(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeListFabricScopedWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeListFabricScoped(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeTimedWriteBooleanWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeTimedWriteBoolean(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeGeneralErrorBooleanWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeGeneralErrorBoolean(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeClusterErrorBooleanWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeClusterErrorBoolean(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeUnsupportedWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeUnsupported(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableBooleanWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableBoolean(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableBitmap8WithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableBitmap8(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableBitmap16WithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableBitmap16(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableBitmap32WithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableBitmap32(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableBitmap64WithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableBitmap64(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableInt8uWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableInt8u(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableInt16uWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableInt16u(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableInt24uWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableInt24u(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableInt32uWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableInt32u(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableInt40uWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableInt40u(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableInt48uWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableInt48u(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableInt56uWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableInt56u(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableInt64uWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableInt64u(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableInt8sWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableInt8s(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableInt16sWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableInt16s(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableInt24sWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableInt24s(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableInt32sWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableInt32s(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableInt40sWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableInt40s(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableInt48sWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableInt48s(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableInt56sWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableInt56s(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableInt64sWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableInt64s(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableEnum8WithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableEnum8(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableEnum16WithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableEnum16(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableFloatSingleWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableFloatSingle(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableFloatDoubleWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableFloatDouble(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableOctetStringWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableOctetString(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSData, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableCharStringWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableCharString(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSString, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableEnumAttrWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableEnumAttr(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableStructWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableStruct(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<MTRUnitTestingClusterSimpleStruct, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableRangeRestrictedInt8uWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableRangeRestrictedInt8u(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableRangeRestrictedInt8sWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableRangeRestrictedInt8s(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableRangeRestrictedInt16uWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableRangeRestrictedInt16u(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableRangeRestrictedInt16sWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableRangeRestrictedInt16s(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeWriteOnlyInt8uWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeWriteOnlyInt8u(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeGeneratedCommandListWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeGeneratedCommandList(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeAcceptedCommandListWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAcceptedCommandList(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeAttributeListWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAttributeList(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSArray<?>, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeFeatureMapWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeFeatureMap(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeClusterRevisionWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeClusterRevision(MTRClusterStateCacheContainer clusterStateCacheContainer, NSNumber endpoint, DispatchQueue queue, @Block VoidBlock2<NSNumber, NSError> completion);
    /*</methods>*/
}
