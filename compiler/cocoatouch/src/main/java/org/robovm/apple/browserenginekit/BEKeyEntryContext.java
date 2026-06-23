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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/BEKeyEntryContext/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class BEKeyEntryContextPtr extends Ptr<BEKeyEntryContext, BEKeyEntryContextPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(BEKeyEntryContext.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected BEKeyEntryContext() {}
    protected BEKeyEntryContext(Handle h, long handle) { super(h, handle); }
    protected BEKeyEntryContext(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithKeyEntry:")
    public BEKeyEntryContext(BEKeyEntry keyEntry) { super((SkipInit) null); initObject(init(keyEntry)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "keyEntry")
    public native BEKeyEntry getKeyEntry();
    @Property(selector = "isDocumentEditable")
    public native boolean isDocumentEditable();
    @Property(selector = "setDocumentEditable:")
    public native void setDocumentEditable(boolean v);
    @Property(selector = "shouldInsertCharacter")
    public native boolean shouldInsertCharacter();
    @Property(selector = "setShouldInsertCharacter:")
    public native void setShouldInsertCharacter(boolean v);
    @Property(selector = "shouldEvaluateForInputSystemHandling")
    public native boolean shouldEvaluateForInputSystemHandling();
    @Property(selector = "setShouldEvaluateForInputSystemHandling:")
    public native void setShouldEvaluateForInputSystemHandling(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithKeyEntry:")
    protected native @Pointer long init(BEKeyEntry keyEntry);
    /*</methods>*/
}
