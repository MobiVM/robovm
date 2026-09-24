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
package org.robovm.apple.videotoolbox;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.metal.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VTDecompressionOutputCallbackRecord/*</name>*/ 
    extends /*<extends>*/Struct<VTDecompressionOutputCallbackRecord>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class VTDecompressionOutputCallbackRecordPtr extends Ptr<VTDecompressionOutputCallbackRecord, VTDecompressionOutputCallbackRecordPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public VTDecompressionOutputCallbackRecord() {}
    public VTDecompressionOutputCallbackRecord(FunctionPtr decompressionOutputCallback, VoidPtr decompressionOutputRefCon) {
        this.setDecompressionOutputCallback(decompressionOutputCallback);
        this.setDecompressionOutputRefCon(decompressionOutputRefCon);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native FunctionPtr getDecompressionOutputCallback();
    @StructMember(0) public native VTDecompressionOutputCallbackRecord setDecompressionOutputCallback(FunctionPtr decompressionOutputCallback);
    @StructMember(1) public native VoidPtr getDecompressionOutputRefCon();
    @StructMember(1) public native VTDecompressionOutputCallbackRecord setDecompressionOutputRefCon(VoidPtr decompressionOutputRefCon);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
