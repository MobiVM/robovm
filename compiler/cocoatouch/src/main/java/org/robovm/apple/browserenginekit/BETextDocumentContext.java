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
package org.robovm.apple.browserenginekit;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.uniformtypeid.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.avfoundation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 17.4 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("BrowserEngineKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BETextDocumentContext/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class BETextDocumentContextPtr extends Ptr<BETextDocumentContext, BETextDocumentContextPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(BETextDocumentContext.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected BETextDocumentContext() {}
    protected BETextDocumentContext(Handle h, long handle) { super(h, handle); }
    protected BETextDocumentContext(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSelectedText:contextBefore:contextAfter:markedText:selectedRangeInMarkedText:")
    public BETextDocumentContext(String selectedText, String contextBefore, String contextAfter, String markedText, @ByVal NSRange selectedRangeInMarkedText) { super((SkipInit) null); initObject(init(selectedText, contextBefore, contextAfter, markedText, selectedRangeInMarkedText)); }
    @Method(selector = "initWithAttributedSelectedText:contextBefore:contextAfter:markedText:selectedRangeInMarkedText:")
    public BETextDocumentContext(NSAttributedString selectedText, NSAttributedString contextBefore, NSAttributedString contextAfter, NSAttributedString markedText, @ByVal NSRange selectedRangeInMarkedText) { super((SkipInit) null); initObject(init(selectedText, contextBefore, contextAfter, markedText, selectedRangeInMarkedText)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "autocorrectedRanges")
    public native NSArray<NSValue> getAutocorrectedRanges();
    @Property(selector = "setAutocorrectedRanges:")
    public native void setAutocorrectedRanges(NSArray<NSValue> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithSelectedText:contextBefore:contextAfter:markedText:selectedRangeInMarkedText:")
    protected native @Pointer long init(String selectedText, String contextBefore, String contextAfter, String markedText, @ByVal NSRange selectedRangeInMarkedText);
    @Method(selector = "initWithAttributedSelectedText:contextBefore:contextAfter:markedText:selectedRangeInMarkedText:")
    protected native @Pointer long init(NSAttributedString selectedText, NSAttributedString contextBefore, NSAttributedString contextAfter, NSAttributedString markedText, @ByVal NSRange selectedRangeInMarkedText);
    @Method(selector = "addTextRect:forCharacterRange:")
    public native void addText(@ByVal CGRect rect, @ByVal NSRange range);
    /*</methods>*/
}
