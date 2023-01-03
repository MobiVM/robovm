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
package org.robovm.apple.fileprovider;

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
import org.robovm.apple.uniformtypeid.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSFileProviderTestingOperationAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSFileProviderTestingOperation/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    @NotImplemented("type")
    public NSFileProviderTestingOperationType getType() { return null; }
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("asIngestion")
    public NSFileProviderTestingIngestion asIngestion() { return null; }
    @NotImplemented("asLookup")
    public NSFileProviderTestingLookup asLookup() { return null; }
    @NotImplemented("asCreation")
    public NSFileProviderTestingCreation asCreation() { return null; }
    @NotImplemented("asModification")
    public NSFileProviderTestingModification asModification() { return null; }
    @NotImplemented("asDeletion")
    public NSFileProviderTestingDeletion asDeletion() { return null; }
    @NotImplemented("asContentFetch")
    public NSFileProviderTestingContentFetch asContentFetch() { return null; }
    @NotImplemented("asChildrenEnumeration")
    public NSFileProviderTestingChildrenEnumeration asChildrenEnumeration() { return null; }
    @NotImplemented("asCollisionResolution")
    public NSFileProviderTestingCollisionResolution asCollisionResolution() { return null; }
    /*</methods>*/
}
