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
package org.robovm.apple.metalps;

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
import org.robovm.apple.metal.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSMatrixCopyOffsets/*</name>*/ 
    extends /*<extends>*/Struct<MPSMatrixCopyOffsets>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSMatrixCopyOffsetsPtr extends Ptr<MPSMatrixCopyOffsets, MPSMatrixCopyOffsetsPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSMatrixCopyOffsets() {}
    public MPSMatrixCopyOffsets(int sourceRowOffset, int sourceColumnOffset, int destinationRowOffset, int destinationColumnOffset) {
        this.setSourceRowOffset(sourceRowOffset);
        this.setSourceColumnOffset(sourceColumnOffset);
        this.setDestinationRowOffset(destinationRowOffset);
        this.setDestinationColumnOffset(destinationColumnOffset);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native int getSourceRowOffset();
    @StructMember(0) public native MPSMatrixCopyOffsets setSourceRowOffset(int sourceRowOffset);
    @StructMember(1) public native int getSourceColumnOffset();
    @StructMember(1) public native MPSMatrixCopyOffsets setSourceColumnOffset(int sourceColumnOffset);
    @StructMember(2) public native int getDestinationRowOffset();
    @StructMember(2) public native MPSMatrixCopyOffsets setDestinationRowOffset(int destinationRowOffset);
    @StructMember(3) public native int getDestinationColumnOffset();
    @StructMember(3) public native MPSMatrixCopyOffsets setDestinationColumnOffset(int destinationColumnOffset);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
