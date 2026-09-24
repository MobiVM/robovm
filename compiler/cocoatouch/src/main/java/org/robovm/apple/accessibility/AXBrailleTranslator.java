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
package org.robovm.apple.accessibility;

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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 26.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Accessibility") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AXBrailleTranslator/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AXBrailleTranslatorPtr extends Ptr<AXBrailleTranslator, AXBrailleTranslatorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AXBrailleTranslator.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AXBrailleTranslator() {}
    protected AXBrailleTranslator(Handle h, long handle) { super(h, handle); }
    protected AXBrailleTranslator(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithBrailleTable:")
    public AXBrailleTranslator(AXBrailleTable brailleTable) { super((SkipInit) null); initObject(init(brailleTable)); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithBrailleTable:")
    protected native @Pointer long init(AXBrailleTable brailleTable);
    @Method(selector = "translatePrintText:")
    public native AXBrailleTranslationResult translatePrintText(String printText);
    @Method(selector = "backTranslateBraille:")
    public native AXBrailleTranslationResult backTranslateBraille(String braille);
    /*</methods>*/
}
