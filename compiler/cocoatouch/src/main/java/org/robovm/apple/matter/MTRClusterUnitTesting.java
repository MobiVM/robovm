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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTRClusterUnitTesting/*</name>*/ 
    extends /*<extends>*/MTRCluster/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTRClusterUnitTestingPtr extends Ptr<MTRClusterUnitTesting, MTRClusterUnitTestingPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTRClusterUnitTesting.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MTRClusterUnitTesting() {}
    protected MTRClusterUnitTesting(Handle h, long handle) { super(h, handle); }
    protected MTRClusterUnitTesting(SkipInit skipInit) { super(skipInit); }
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "initWithDevice:endpointID:queue:")
    public MTRClusterUnitTesting(MTRDevice device, NSNumber endpointID, DispatchQueue queue) { super((SkipInit) null); initObject(init(device, endpointID, queue)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "initWithDevice:endpointID:queue:")
    protected native @Pointer long init(MTRDevice device, NSNumber endpointID, DispatchQueue queue);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "testWithParams:expectedValues:expectedValueInterval:completion:")
    public native void test(MTRUnitTestingClusterTestParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "testWithExpectedValues:expectedValueInterval:completion:")
    public native void test(NSArray<?> expectedValues, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "testNotHandledWithParams:expectedValues:expectedValueInterval:completion:")
    public native void testNotHandled(MTRUnitTestingClusterTestNotHandledParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "testNotHandledWithExpectedValues:expectedValueInterval:completion:")
    public native void testNotHandled(NSArray<?> expectedValues, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "testSpecificWithParams:expectedValues:expectedValueInterval:completion:")
    public native void testSpecific(MTRUnitTestingClusterTestSpecificParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock2<MTRUnitTestingClusterTestSpecificResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "testSpecificWithExpectedValues:expectedValueInterval:completion:")
    public native void testSpecific(NSArray<?> expectedValues, NSNumber expectedValueIntervalMs, @Block VoidBlock2<MTRUnitTestingClusterTestSpecificResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "testUnknownCommandWithParams:expectedValues:expectedValueInterval:completion:")
    public native void testUnknownCommand(MTRUnitTestingClusterTestUnknownCommandParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "testUnknownCommandWithExpectedValues:expectedValueInterval:completion:")
    public native void testUnknownCommand(NSArray<?> expectedValues, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "testAddArgumentsWithParams:expectedValues:expectedValueInterval:completion:")
    public native void testAddArguments(MTRUnitTestingClusterTestAddArgumentsParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock2<MTRUnitTestingClusterTestAddArgumentsResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "testSimpleArgumentRequestWithParams:expectedValues:expectedValueInterval:completion:")
    public native void testSimpleArgumentRequest(MTRUnitTestingClusterTestSimpleArgumentRequestParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock2<MTRUnitTestingClusterTestSimpleArgumentResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "testStructArrayArgumentRequestWithParams:expectedValues:expectedValueInterval:completion:")
    public native void testStructArrayArgumentRequest(MTRUnitTestingClusterTestStructArrayArgumentRequestParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock2<MTRUnitTestingClusterTestStructArrayArgumentResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "testStructArgumentRequestWithParams:expectedValues:expectedValueInterval:completion:")
    public native void testStructArgumentRequest(MTRUnitTestingClusterTestStructArgumentRequestParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock2<MTRUnitTestingClusterBooleanResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "testNestedStructArgumentRequestWithParams:expectedValues:expectedValueInterval:completion:")
    public native void testNestedStructArgumentRequest(MTRUnitTestingClusterTestNestedStructArgumentRequestParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock2<MTRUnitTestingClusterBooleanResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "testListStructArgumentRequestWithParams:expectedValues:expectedValueInterval:completion:")
    public native void testListStructArgumentRequest(MTRUnitTestingClusterTestListStructArgumentRequestParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock2<MTRUnitTestingClusterBooleanResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "testListInt8UArgumentRequestWithParams:expectedValues:expectedValueInterval:completion:")
    public native void testListInt8UArgumentRequest(MTRUnitTestingClusterTestListInt8UArgumentRequestParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock2<MTRUnitTestingClusterBooleanResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "testNestedStructListArgumentRequestWithParams:expectedValues:expectedValueInterval:completion:")
    public native void testNestedStructListArgumentRequest(MTRUnitTestingClusterTestNestedStructListArgumentRequestParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock2<MTRUnitTestingClusterBooleanResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "testListNestedStructListArgumentRequestWithParams:expectedValues:expectedValueInterval:completion:")
    public native void testListNestedStructListArgumentRequest(MTRUnitTestingClusterTestListNestedStructListArgumentRequestParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock2<MTRUnitTestingClusterBooleanResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "testListInt8UReverseRequestWithParams:expectedValues:expectedValueInterval:completion:")
    public native void testListInt8UReverseRequest(MTRUnitTestingClusterTestListInt8UReverseRequestParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock2<MTRUnitTestingClusterTestListInt8UReverseResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "testEnumsRequestWithParams:expectedValues:expectedValueInterval:completion:")
    public native void testEnumsRequest(MTRUnitTestingClusterTestEnumsRequestParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock2<MTRUnitTestingClusterTestEnumsResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "testNullableOptionalRequestWithParams:expectedValues:expectedValueInterval:completion:")
    public native void testNullableOptionalRequest(MTRUnitTestingClusterTestNullableOptionalRequestParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock2<MTRUnitTestingClusterTestNullableOptionalResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "testComplexNullableOptionalRequestWithParams:expectedValues:expectedValueInterval:completion:")
    public native void testComplexNullableOptionalRequest(MTRUnitTestingClusterTestComplexNullableOptionalRequestParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock2<MTRUnitTestingClusterTestComplexNullableOptionalResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "simpleStructEchoRequestWithParams:expectedValues:expectedValueInterval:completion:")
    public native void simpleStructEchoRequest(MTRUnitTestingClusterSimpleStructEchoRequestParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock2<MTRUnitTestingClusterSimpleStructResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "timedInvokeRequestWithParams:expectedValues:expectedValueInterval:completion:")
    public native void timedInvokeRequest(MTRUnitTestingClusterTimedInvokeRequestParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "timedInvokeRequestWithExpectedValues:expectedValueInterval:completion:")
    public native void timedInvokeRequest(NSArray<?> expectedValues, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "testSimpleOptionalArgumentRequestWithParams:expectedValues:expectedValueInterval:completion:")
    public native void testSimpleOptionalArgumentRequest(MTRUnitTestingClusterTestSimpleOptionalArgumentRequestParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock1<NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "testEmitTestEventRequestWithParams:expectedValues:expectedValueInterval:completion:")
    public native void testEmitTestEventRequest(MTRUnitTestingClusterTestEmitTestEventRequestParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock2<MTRUnitTestingClusterTestEmitTestEventResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "testEmitTestFabricScopedEventRequestWithParams:expectedValues:expectedValueInterval:completion:")
    public native void testEmitTestFabricScopedEventRequest(MTRUnitTestingClusterTestEmitTestFabricScopedEventRequestParams params, NSArray<?> expectedDataValueDictionaries, NSNumber expectedValueIntervalMs, @Block VoidBlock2<MTRUnitTestingClusterTestEmitTestFabricScopedEventResponseParams, NSError> completion);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeBooleanWithParams:")
    public native NSDictionary<NSString, ?> readAttributeBoolean(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeBooleanWithValue:expectedValueInterval:")
    public native void writeAttributeBoolean(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeBooleanWithValue:expectedValueInterval:params:")
    public native void writeAttributeBoolean(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeBitmap8WithParams:")
    public native NSDictionary<NSString, ?> readAttributeBitmap8(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeBitmap8WithValue:expectedValueInterval:")
    public native void writeAttributeBitmap8(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeBitmap8WithValue:expectedValueInterval:params:")
    public native void writeAttributeBitmap8(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeBitmap16WithParams:")
    public native NSDictionary<NSString, ?> readAttributeBitmap16(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeBitmap16WithValue:expectedValueInterval:")
    public native void writeAttributeBitmap16(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeBitmap16WithValue:expectedValueInterval:params:")
    public native void writeAttributeBitmap16(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeBitmap32WithParams:")
    public native NSDictionary<NSString, ?> readAttributeBitmap32(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeBitmap32WithValue:expectedValueInterval:")
    public native void writeAttributeBitmap32(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeBitmap32WithValue:expectedValueInterval:params:")
    public native void writeAttributeBitmap32(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeBitmap64WithParams:")
    public native NSDictionary<NSString, ?> readAttributeBitmap64(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeBitmap64WithValue:expectedValueInterval:")
    public native void writeAttributeBitmap64(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeBitmap64WithValue:expectedValueInterval:params:")
    public native void writeAttributeBitmap64(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeInt8uWithParams:")
    public native NSDictionary<NSString, ?> readAttributeInt8u(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeInt8uWithValue:expectedValueInterval:")
    public native void writeAttributeInt8u(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeInt8uWithValue:expectedValueInterval:params:")
    public native void writeAttributeInt8u(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeInt16uWithParams:")
    public native NSDictionary<NSString, ?> readAttributeInt16u(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeInt16uWithValue:expectedValueInterval:")
    public native void writeAttributeInt16u(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeInt16uWithValue:expectedValueInterval:params:")
    public native void writeAttributeInt16u(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeInt24uWithParams:")
    public native NSDictionary<NSString, ?> readAttributeInt24u(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeInt24uWithValue:expectedValueInterval:")
    public native void writeAttributeInt24u(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeInt24uWithValue:expectedValueInterval:params:")
    public native void writeAttributeInt24u(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeInt32uWithParams:")
    public native NSDictionary<NSString, ?> readAttributeInt32u(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeInt32uWithValue:expectedValueInterval:")
    public native void writeAttributeInt32u(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeInt32uWithValue:expectedValueInterval:params:")
    public native void writeAttributeInt32u(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeInt40uWithParams:")
    public native NSDictionary<NSString, ?> readAttributeInt40u(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeInt40uWithValue:expectedValueInterval:")
    public native void writeAttributeInt40u(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeInt40uWithValue:expectedValueInterval:params:")
    public native void writeAttributeInt40u(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeInt48uWithParams:")
    public native NSDictionary<NSString, ?> readAttributeInt48u(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeInt48uWithValue:expectedValueInterval:")
    public native void writeAttributeInt48u(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeInt48uWithValue:expectedValueInterval:params:")
    public native void writeAttributeInt48u(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeInt56uWithParams:")
    public native NSDictionary<NSString, ?> readAttributeInt56u(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeInt56uWithValue:expectedValueInterval:")
    public native void writeAttributeInt56u(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeInt56uWithValue:expectedValueInterval:params:")
    public native void writeAttributeInt56u(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeInt64uWithParams:")
    public native NSDictionary<NSString, ?> readAttributeInt64u(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeInt64uWithValue:expectedValueInterval:")
    public native void writeAttributeInt64u(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeInt64uWithValue:expectedValueInterval:params:")
    public native void writeAttributeInt64u(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeInt8sWithParams:")
    public native NSDictionary<NSString, ?> readAttributeInt8s(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeInt8sWithValue:expectedValueInterval:")
    public native void writeAttributeInt8s(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeInt8sWithValue:expectedValueInterval:params:")
    public native void writeAttributeInt8s(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeInt16sWithParams:")
    public native NSDictionary<NSString, ?> readAttributeInt16s(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeInt16sWithValue:expectedValueInterval:")
    public native void writeAttributeInt16s(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeInt16sWithValue:expectedValueInterval:params:")
    public native void writeAttributeInt16s(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeInt24sWithParams:")
    public native NSDictionary<NSString, ?> readAttributeInt24s(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeInt24sWithValue:expectedValueInterval:")
    public native void writeAttributeInt24s(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeInt24sWithValue:expectedValueInterval:params:")
    public native void writeAttributeInt24s(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeInt32sWithParams:")
    public native NSDictionary<NSString, ?> readAttributeInt32s(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeInt32sWithValue:expectedValueInterval:")
    public native void writeAttributeInt32s(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeInt32sWithValue:expectedValueInterval:params:")
    public native void writeAttributeInt32s(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeInt40sWithParams:")
    public native NSDictionary<NSString, ?> readAttributeInt40s(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeInt40sWithValue:expectedValueInterval:")
    public native void writeAttributeInt40s(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeInt40sWithValue:expectedValueInterval:params:")
    public native void writeAttributeInt40s(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeInt48sWithParams:")
    public native NSDictionary<NSString, ?> readAttributeInt48s(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeInt48sWithValue:expectedValueInterval:")
    public native void writeAttributeInt48s(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeInt48sWithValue:expectedValueInterval:params:")
    public native void writeAttributeInt48s(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeInt56sWithParams:")
    public native NSDictionary<NSString, ?> readAttributeInt56s(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeInt56sWithValue:expectedValueInterval:")
    public native void writeAttributeInt56s(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeInt56sWithValue:expectedValueInterval:params:")
    public native void writeAttributeInt56s(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeInt64sWithParams:")
    public native NSDictionary<NSString, ?> readAttributeInt64s(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeInt64sWithValue:expectedValueInterval:")
    public native void writeAttributeInt64s(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeInt64sWithValue:expectedValueInterval:params:")
    public native void writeAttributeInt64s(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeEnum8WithParams:")
    public native NSDictionary<NSString, ?> readAttributeEnum8(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeEnum8WithValue:expectedValueInterval:")
    public native void writeAttributeEnum8(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeEnum8WithValue:expectedValueInterval:params:")
    public native void writeAttributeEnum8(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeEnum16WithParams:")
    public native NSDictionary<NSString, ?> readAttributeEnum16(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeEnum16WithValue:expectedValueInterval:")
    public native void writeAttributeEnum16(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeEnum16WithValue:expectedValueInterval:params:")
    public native void writeAttributeEnum16(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeFloatSingleWithParams:")
    public native NSDictionary<NSString, ?> readAttributeFloatSingle(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeFloatSingleWithValue:expectedValueInterval:")
    public native void writeAttributeFloatSingle(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeFloatSingleWithValue:expectedValueInterval:params:")
    public native void writeAttributeFloatSingle(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeFloatDoubleWithParams:")
    public native NSDictionary<NSString, ?> readAttributeFloatDouble(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeFloatDoubleWithValue:expectedValueInterval:")
    public native void writeAttributeFloatDouble(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeFloatDoubleWithValue:expectedValueInterval:params:")
    public native void writeAttributeFloatDouble(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeOctetStringWithParams:")
    public native NSDictionary<NSString, ?> readAttributeOctetString(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeOctetStringWithValue:expectedValueInterval:")
    public native void writeAttributeOctetString(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeOctetStringWithValue:expectedValueInterval:params:")
    public native void writeAttributeOctetString(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeListInt8uWithParams:")
    public native NSDictionary<NSString, ?> readAttributeListInt8u(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeListInt8uWithValue:expectedValueInterval:")
    public native void writeAttributeListInt8u(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeListInt8uWithValue:expectedValueInterval:params:")
    public native void writeAttributeListInt8u(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeListOctetStringWithParams:")
    public native NSDictionary<NSString, ?> readAttributeListOctetString(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeListOctetStringWithValue:expectedValueInterval:")
    public native void writeAttributeListOctetString(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeListOctetStringWithValue:expectedValueInterval:params:")
    public native void writeAttributeListOctetString(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeListStructOctetStringWithParams:")
    public native NSDictionary<NSString, ?> readAttributeListStructOctetString(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeListStructOctetStringWithValue:expectedValueInterval:")
    public native void writeAttributeListStructOctetString(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeListStructOctetStringWithValue:expectedValueInterval:params:")
    public native void writeAttributeListStructOctetString(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeLongOctetStringWithParams:")
    public native NSDictionary<NSString, ?> readAttributeLongOctetString(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeLongOctetStringWithValue:expectedValueInterval:")
    public native void writeAttributeLongOctetString(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeLongOctetStringWithValue:expectedValueInterval:params:")
    public native void writeAttributeLongOctetString(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeCharStringWithParams:")
    public native NSDictionary<NSString, ?> readAttributeCharString(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeCharStringWithValue:expectedValueInterval:")
    public native void writeAttributeCharString(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeCharStringWithValue:expectedValueInterval:params:")
    public native void writeAttributeCharString(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeLongCharStringWithParams:")
    public native NSDictionary<NSString, ?> readAttributeLongCharString(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeLongCharStringWithValue:expectedValueInterval:")
    public native void writeAttributeLongCharString(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeLongCharStringWithValue:expectedValueInterval:params:")
    public native void writeAttributeLongCharString(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeEpochUsWithParams:")
    public native NSDictionary<NSString, ?> readAttributeEpochUs(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeEpochUsWithValue:expectedValueInterval:")
    public native void writeAttributeEpochUs(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeEpochUsWithValue:expectedValueInterval:params:")
    public native void writeAttributeEpochUs(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeEpochSWithParams:")
    public native NSDictionary<NSString, ?> readAttributeEpochS(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeEpochSWithValue:expectedValueInterval:")
    public native void writeAttributeEpochS(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeEpochSWithValue:expectedValueInterval:params:")
    public native void writeAttributeEpochS(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeVendorIdWithParams:")
    public native NSDictionary<NSString, ?> readAttributeVendorId(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeVendorIdWithValue:expectedValueInterval:")
    public native void writeAttributeVendorId(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeVendorIdWithValue:expectedValueInterval:params:")
    public native void writeAttributeVendorId(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeListNullablesAndOptionalsStructWithParams:")
    public native NSDictionary<NSString, ?> readAttributeListNullablesAndOptionalsStruct(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeListNullablesAndOptionalsStructWithValue:expectedValueInterval:")
    public native void writeAttributeListNullablesAndOptionalsStruct(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeListNullablesAndOptionalsStructWithValue:expectedValueInterval:params:")
    public native void writeAttributeListNullablesAndOptionalsStruct(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeEnumAttrWithParams:")
    public native NSDictionary<NSString, ?> readAttributeEnumAttr(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeEnumAttrWithValue:expectedValueInterval:")
    public native void writeAttributeEnumAttr(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeEnumAttrWithValue:expectedValueInterval:params:")
    public native void writeAttributeEnumAttr(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeStructAttrWithParams:")
    public native NSDictionary<NSString, ?> readAttributeStructAttr(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeStructAttrWithValue:expectedValueInterval:")
    public native void writeAttributeStructAttr(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeStructAttrWithValue:expectedValueInterval:params:")
    public native void writeAttributeStructAttr(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeRangeRestrictedInt8uWithParams:")
    public native NSDictionary<NSString, ?> readAttributeRangeRestrictedInt8u(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeRangeRestrictedInt8uWithValue:expectedValueInterval:")
    public native void writeAttributeRangeRestrictedInt8u(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeRangeRestrictedInt8uWithValue:expectedValueInterval:params:")
    public native void writeAttributeRangeRestrictedInt8u(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeRangeRestrictedInt8sWithParams:")
    public native NSDictionary<NSString, ?> readAttributeRangeRestrictedInt8s(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeRangeRestrictedInt8sWithValue:expectedValueInterval:")
    public native void writeAttributeRangeRestrictedInt8s(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeRangeRestrictedInt8sWithValue:expectedValueInterval:params:")
    public native void writeAttributeRangeRestrictedInt8s(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeRangeRestrictedInt16uWithParams:")
    public native NSDictionary<NSString, ?> readAttributeRangeRestrictedInt16u(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeRangeRestrictedInt16uWithValue:expectedValueInterval:")
    public native void writeAttributeRangeRestrictedInt16u(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeRangeRestrictedInt16uWithValue:expectedValueInterval:params:")
    public native void writeAttributeRangeRestrictedInt16u(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeRangeRestrictedInt16sWithParams:")
    public native NSDictionary<NSString, ?> readAttributeRangeRestrictedInt16s(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeRangeRestrictedInt16sWithValue:expectedValueInterval:")
    public native void writeAttributeRangeRestrictedInt16s(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeRangeRestrictedInt16sWithValue:expectedValueInterval:params:")
    public native void writeAttributeRangeRestrictedInt16s(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeListLongOctetStringWithParams:")
    public native NSDictionary<NSString, ?> readAttributeListLongOctetString(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeListLongOctetStringWithValue:expectedValueInterval:")
    public native void writeAttributeListLongOctetString(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeListLongOctetStringWithValue:expectedValueInterval:params:")
    public native void writeAttributeListLongOctetString(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeListFabricScopedWithParams:")
    public native NSDictionary<NSString, ?> readAttributeListFabricScoped(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeListFabricScopedWithValue:expectedValueInterval:")
    public native void writeAttributeListFabricScoped(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeListFabricScopedWithValue:expectedValueInterval:params:")
    public native void writeAttributeListFabricScoped(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeTimedWriteBooleanWithParams:")
    public native NSDictionary<NSString, ?> readAttributeTimedWriteBoolean(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeTimedWriteBooleanWithValue:expectedValueInterval:")
    public native void writeAttributeTimedWriteBoolean(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeTimedWriteBooleanWithValue:expectedValueInterval:params:")
    public native void writeAttributeTimedWriteBoolean(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeGeneralErrorBooleanWithParams:")
    public native NSDictionary<NSString, ?> readAttributeGeneralErrorBoolean(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeGeneralErrorBooleanWithValue:expectedValueInterval:")
    public native void writeAttributeGeneralErrorBoolean(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeGeneralErrorBooleanWithValue:expectedValueInterval:params:")
    public native void writeAttributeGeneralErrorBoolean(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeClusterErrorBooleanWithParams:")
    public native NSDictionary<NSString, ?> readAttributeClusterErrorBoolean(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeClusterErrorBooleanWithValue:expectedValueInterval:")
    public native void writeAttributeClusterErrorBoolean(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeClusterErrorBooleanWithValue:expectedValueInterval:params:")
    public native void writeAttributeClusterErrorBoolean(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeUnsupportedWithParams:")
    public native NSDictionary<NSString, ?> readAttributeUnsupported(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeUnsupportedWithValue:expectedValueInterval:")
    public native void writeAttributeUnsupported(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeUnsupportedWithValue:expectedValueInterval:params:")
    public native void writeAttributeUnsupported(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableBooleanWithParams:")
    public native NSDictionary<NSString, ?> readAttributeNullableBoolean(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableBooleanWithValue:expectedValueInterval:")
    public native void writeAttributeNullableBoolean(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableBooleanWithValue:expectedValueInterval:params:")
    public native void writeAttributeNullableBoolean(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableBitmap8WithParams:")
    public native NSDictionary<NSString, ?> readAttributeNullableBitmap8(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableBitmap8WithValue:expectedValueInterval:")
    public native void writeAttributeNullableBitmap8(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableBitmap8WithValue:expectedValueInterval:params:")
    public native void writeAttributeNullableBitmap8(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableBitmap16WithParams:")
    public native NSDictionary<NSString, ?> readAttributeNullableBitmap16(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableBitmap16WithValue:expectedValueInterval:")
    public native void writeAttributeNullableBitmap16(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableBitmap16WithValue:expectedValueInterval:params:")
    public native void writeAttributeNullableBitmap16(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableBitmap32WithParams:")
    public native NSDictionary<NSString, ?> readAttributeNullableBitmap32(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableBitmap32WithValue:expectedValueInterval:")
    public native void writeAttributeNullableBitmap32(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableBitmap32WithValue:expectedValueInterval:params:")
    public native void writeAttributeNullableBitmap32(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableBitmap64WithParams:")
    public native NSDictionary<NSString, ?> readAttributeNullableBitmap64(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableBitmap64WithValue:expectedValueInterval:")
    public native void writeAttributeNullableBitmap64(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableBitmap64WithValue:expectedValueInterval:params:")
    public native void writeAttributeNullableBitmap64(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableInt8uWithParams:")
    public native NSDictionary<NSString, ?> readAttributeNullableInt8u(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableInt8uWithValue:expectedValueInterval:")
    public native void writeAttributeNullableInt8u(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableInt8uWithValue:expectedValueInterval:params:")
    public native void writeAttributeNullableInt8u(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableInt16uWithParams:")
    public native NSDictionary<NSString, ?> readAttributeNullableInt16u(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableInt16uWithValue:expectedValueInterval:")
    public native void writeAttributeNullableInt16u(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableInt16uWithValue:expectedValueInterval:params:")
    public native void writeAttributeNullableInt16u(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableInt24uWithParams:")
    public native NSDictionary<NSString, ?> readAttributeNullableInt24u(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableInt24uWithValue:expectedValueInterval:")
    public native void writeAttributeNullableInt24u(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableInt24uWithValue:expectedValueInterval:params:")
    public native void writeAttributeNullableInt24u(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableInt32uWithParams:")
    public native NSDictionary<NSString, ?> readAttributeNullableInt32u(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableInt32uWithValue:expectedValueInterval:")
    public native void writeAttributeNullableInt32u(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableInt32uWithValue:expectedValueInterval:params:")
    public native void writeAttributeNullableInt32u(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableInt40uWithParams:")
    public native NSDictionary<NSString, ?> readAttributeNullableInt40u(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableInt40uWithValue:expectedValueInterval:")
    public native void writeAttributeNullableInt40u(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableInt40uWithValue:expectedValueInterval:params:")
    public native void writeAttributeNullableInt40u(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableInt48uWithParams:")
    public native NSDictionary<NSString, ?> readAttributeNullableInt48u(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableInt48uWithValue:expectedValueInterval:")
    public native void writeAttributeNullableInt48u(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableInt48uWithValue:expectedValueInterval:params:")
    public native void writeAttributeNullableInt48u(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableInt56uWithParams:")
    public native NSDictionary<NSString, ?> readAttributeNullableInt56u(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableInt56uWithValue:expectedValueInterval:")
    public native void writeAttributeNullableInt56u(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableInt56uWithValue:expectedValueInterval:params:")
    public native void writeAttributeNullableInt56u(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableInt64uWithParams:")
    public native NSDictionary<NSString, ?> readAttributeNullableInt64u(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableInt64uWithValue:expectedValueInterval:")
    public native void writeAttributeNullableInt64u(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableInt64uWithValue:expectedValueInterval:params:")
    public native void writeAttributeNullableInt64u(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableInt8sWithParams:")
    public native NSDictionary<NSString, ?> readAttributeNullableInt8s(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableInt8sWithValue:expectedValueInterval:")
    public native void writeAttributeNullableInt8s(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableInt8sWithValue:expectedValueInterval:params:")
    public native void writeAttributeNullableInt8s(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableInt16sWithParams:")
    public native NSDictionary<NSString, ?> readAttributeNullableInt16s(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableInt16sWithValue:expectedValueInterval:")
    public native void writeAttributeNullableInt16s(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableInt16sWithValue:expectedValueInterval:params:")
    public native void writeAttributeNullableInt16s(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableInt24sWithParams:")
    public native NSDictionary<NSString, ?> readAttributeNullableInt24s(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableInt24sWithValue:expectedValueInterval:")
    public native void writeAttributeNullableInt24s(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableInt24sWithValue:expectedValueInterval:params:")
    public native void writeAttributeNullableInt24s(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableInt32sWithParams:")
    public native NSDictionary<NSString, ?> readAttributeNullableInt32s(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableInt32sWithValue:expectedValueInterval:")
    public native void writeAttributeNullableInt32s(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableInt32sWithValue:expectedValueInterval:params:")
    public native void writeAttributeNullableInt32s(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableInt40sWithParams:")
    public native NSDictionary<NSString, ?> readAttributeNullableInt40s(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableInt40sWithValue:expectedValueInterval:")
    public native void writeAttributeNullableInt40s(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableInt40sWithValue:expectedValueInterval:params:")
    public native void writeAttributeNullableInt40s(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableInt48sWithParams:")
    public native NSDictionary<NSString, ?> readAttributeNullableInt48s(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableInt48sWithValue:expectedValueInterval:")
    public native void writeAttributeNullableInt48s(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableInt48sWithValue:expectedValueInterval:params:")
    public native void writeAttributeNullableInt48s(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableInt56sWithParams:")
    public native NSDictionary<NSString, ?> readAttributeNullableInt56s(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableInt56sWithValue:expectedValueInterval:")
    public native void writeAttributeNullableInt56s(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableInt56sWithValue:expectedValueInterval:params:")
    public native void writeAttributeNullableInt56s(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableInt64sWithParams:")
    public native NSDictionary<NSString, ?> readAttributeNullableInt64s(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableInt64sWithValue:expectedValueInterval:")
    public native void writeAttributeNullableInt64s(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableInt64sWithValue:expectedValueInterval:params:")
    public native void writeAttributeNullableInt64s(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableEnum8WithParams:")
    public native NSDictionary<NSString, ?> readAttributeNullableEnum8(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableEnum8WithValue:expectedValueInterval:")
    public native void writeAttributeNullableEnum8(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableEnum8WithValue:expectedValueInterval:params:")
    public native void writeAttributeNullableEnum8(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableEnum16WithParams:")
    public native NSDictionary<NSString, ?> readAttributeNullableEnum16(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableEnum16WithValue:expectedValueInterval:")
    public native void writeAttributeNullableEnum16(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableEnum16WithValue:expectedValueInterval:params:")
    public native void writeAttributeNullableEnum16(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableFloatSingleWithParams:")
    public native NSDictionary<NSString, ?> readAttributeNullableFloatSingle(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableFloatSingleWithValue:expectedValueInterval:")
    public native void writeAttributeNullableFloatSingle(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableFloatSingleWithValue:expectedValueInterval:params:")
    public native void writeAttributeNullableFloatSingle(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableFloatDoubleWithParams:")
    public native NSDictionary<NSString, ?> readAttributeNullableFloatDouble(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableFloatDoubleWithValue:expectedValueInterval:")
    public native void writeAttributeNullableFloatDouble(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableFloatDoubleWithValue:expectedValueInterval:params:")
    public native void writeAttributeNullableFloatDouble(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableOctetStringWithParams:")
    public native NSDictionary<NSString, ?> readAttributeNullableOctetString(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableOctetStringWithValue:expectedValueInterval:")
    public native void writeAttributeNullableOctetString(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableOctetStringWithValue:expectedValueInterval:params:")
    public native void writeAttributeNullableOctetString(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableCharStringWithParams:")
    public native NSDictionary<NSString, ?> readAttributeNullableCharString(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableCharStringWithValue:expectedValueInterval:")
    public native void writeAttributeNullableCharString(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableCharStringWithValue:expectedValueInterval:params:")
    public native void writeAttributeNullableCharString(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableEnumAttrWithParams:")
    public native NSDictionary<NSString, ?> readAttributeNullableEnumAttr(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableEnumAttrWithValue:expectedValueInterval:")
    public native void writeAttributeNullableEnumAttr(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableEnumAttrWithValue:expectedValueInterval:params:")
    public native void writeAttributeNullableEnumAttr(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableStructWithParams:")
    public native NSDictionary<NSString, ?> readAttributeNullableStruct(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableStructWithValue:expectedValueInterval:")
    public native void writeAttributeNullableStruct(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableStructWithValue:expectedValueInterval:params:")
    public native void writeAttributeNullableStruct(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableRangeRestrictedInt8uWithParams:")
    public native NSDictionary<NSString, ?> readAttributeNullableRangeRestrictedInt8u(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableRangeRestrictedInt8uWithValue:expectedValueInterval:")
    public native void writeAttributeNullableRangeRestrictedInt8u(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableRangeRestrictedInt8uWithValue:expectedValueInterval:params:")
    public native void writeAttributeNullableRangeRestrictedInt8u(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableRangeRestrictedInt8sWithParams:")
    public native NSDictionary<NSString, ?> readAttributeNullableRangeRestrictedInt8s(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableRangeRestrictedInt8sWithValue:expectedValueInterval:")
    public native void writeAttributeNullableRangeRestrictedInt8s(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableRangeRestrictedInt8sWithValue:expectedValueInterval:params:")
    public native void writeAttributeNullableRangeRestrictedInt8s(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableRangeRestrictedInt16uWithParams:")
    public native NSDictionary<NSString, ?> readAttributeNullableRangeRestrictedInt16u(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableRangeRestrictedInt16uWithValue:expectedValueInterval:")
    public native void writeAttributeNullableRangeRestrictedInt16u(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableRangeRestrictedInt16uWithValue:expectedValueInterval:params:")
    public native void writeAttributeNullableRangeRestrictedInt16u(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeNullableRangeRestrictedInt16sWithParams:")
    public native NSDictionary<NSString, ?> readAttributeNullableRangeRestrictedInt16s(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableRangeRestrictedInt16sWithValue:expectedValueInterval:")
    public native void writeAttributeNullableRangeRestrictedInt16s(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeNullableRangeRestrictedInt16sWithValue:expectedValueInterval:params:")
    public native void writeAttributeNullableRangeRestrictedInt16s(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeWriteOnlyInt8uWithParams:")
    public native NSDictionary<NSString, ?> readAttributeWriteOnlyInt8u(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeWriteOnlyInt8uWithValue:expectedValueInterval:")
    public native void writeAttributeWriteOnlyInt8u(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "writeAttributeWriteOnlyInt8uWithValue:expectedValueInterval:params:")
    public native void writeAttributeWriteOnlyInt8u(NSDictionary<NSString, ?> dataValueDictionary, NSNumber expectedValueIntervalMs, MTRWriteParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeGeneratedCommandListWithParams:")
    public native NSDictionary<NSString, ?> readAttributeGeneratedCommandList(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeAcceptedCommandListWithParams:")
    public native NSDictionary<NSString, ?> readAttributeAcceptedCommandList(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeAttributeListWithParams:")
    public native NSDictionary<NSString, ?> readAttributeAttributeList(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeFeatureMapWithParams:")
    public native NSDictionary<NSString, ?> readAttributeFeatureMap(MTRReadParams params);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Method(selector = "readAttributeClusterRevisionWithParams:")
    public native NSDictionary<NSString, ?> readAttributeClusterRevision(MTRReadParams params);
    /*</methods>*/
}
