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
package org.robovm.apple.coregraphics;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("CoreGraphics")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CGPDFStructureElement/*</name>*/ 
    extends /*<extends>*/CFType/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CGPDFStructureElementPtr extends Ptr<CGPDFStructureElement, CGPDFStructureElementPtr> {}/*</ptr>*/
    /*<bind>*/static { Bro.bind(CGPDFStructureElement.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected CGPDFStructureElement() {}
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 27.0 and later.
     */
    @Bridge(symbol="CGPDFStructureElementCreate", optional=true)
    public static native @org.robovm.rt.bro.annotation.Marshaler(CFType.NoRetainMarshaler.class) CGPDFStructureElement create(CGPDFTagType type);
    /**
     * @since Available in iOS 27.0 and later.
     */
    @Bridge(symbol="CGPDFStructureElementSetTitle", optional=true)
    public native void setTitle(String title);
    /**
     * @since Available in iOS 27.0 and later.
     */
    @Bridge(symbol="CGPDFStructureElementSetLanguageIdentifier", optional=true)
    public native void setLanguageIdentifier(String languageID);
    /**
     * @since Available in iOS 27.0 and later.
     */
    @Bridge(symbol="CGPDFStructureElementSetAlternativeText", optional=true)
    public native void setAlternativeText(String alternativeText);
    /**
     * @since Available in iOS 27.0 and later.
     */
    @Bridge(symbol="CGPDFStructureElementSetExpansionText", optional=true)
    public native void setExpansionText(String expansionText);
    /**
     * @since Available in iOS 27.0 and later.
     */
    @Bridge(symbol="CGPDFStructureElementSetActualText", optional=true)
    public native void setActualText(String actualText);
    /**
     * @since Available in iOS 27.0 and later.
     */
    @Bridge(symbol="CGPDFStructureElementAddStructureElement", optional=true)
    public native OSStatus addStructureElement(CGPDFStructureElement childStructureElement);
    /**
     * @since Available in iOS 27.0 and later.
     */
    @Bridge(symbol="CGPDFStructureElementAddMarkedContentItem", optional=true)
    public native OSStatus addMarkedContentItem(CGPDFMarkedContentItem markedContentItem);
    /*</methods>*/
}
