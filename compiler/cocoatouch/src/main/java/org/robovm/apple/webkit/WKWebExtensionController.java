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
package org.robovm.apple.webkit;

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
import org.robovm.apple.security.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 18.4 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("WebKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/WKWebExtensionController/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class WKWebExtensionControllerPtr extends Ptr<WKWebExtensionController, WKWebExtensionControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(WKWebExtensionController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public WKWebExtensionController() {}
    protected WKWebExtensionController(Handle h, long handle) { super(h, handle); }
    protected WKWebExtensionController(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithConfiguration:")
    public WKWebExtensionController(WKWebExtensionControllerConfiguration configuration) { super((SkipInit) null); initObject(init(configuration)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native WKWebExtensionControllerDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(WKWebExtensionControllerDelegate v);
    @Property(selector = "configuration")
    public native WKWebExtensionControllerConfiguration getConfiguration();
    @Property(selector = "extensions")
    public native NSSet<WKWebExtension> getExtensions();
    @Property(selector = "extensionContexts")
    public native NSSet<WKWebExtensionContext> getExtensionContexts();
    @Property(selector = "allExtensionDataTypes")
    public static native NSSet<NSString> getAllExtensionDataTypes();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithConfiguration:")
    protected native @Pointer long init(WKWebExtensionControllerConfiguration configuration);
    public boolean loadExtensionContext(WKWebExtensionContext extensionContext) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = loadExtensionContext(extensionContext, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "loadExtensionContext:error:")
    private native boolean loadExtensionContext(WKWebExtensionContext extensionContext, NSError.NSErrorPtr error);
    public boolean unloadExtensionContext(WKWebExtensionContext extensionContext) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = unloadExtensionContext(extensionContext, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "unloadExtensionContext:error:")
    private native boolean unloadExtensionContext(WKWebExtensionContext extensionContext, NSError.NSErrorPtr error);
    @Method(selector = "extensionContextForExtension:")
    public native WKWebExtensionContext extensionContextForExtension(WKWebExtension extension);
    @Method(selector = "extensionContextForURL:")
    public native WKWebExtensionContext extensionContextForURL(NSURL URL);
    @Method(selector = "fetchDataRecordsOfTypes:completionHandler:")
    public native void fetchDataRecords(NSSet<NSString> dataTypes, @Block VoidBlock1<NSArray<WKWebExtensionDataRecord>> completionHandler);
    @Method(selector = "fetchDataRecordOfTypes:forExtensionContext:completionHandler:")
    public native void fetchDataRecord(NSSet<NSString> dataTypes, WKWebExtensionContext extensionContext, @Block VoidBlock1<WKWebExtensionDataRecord> completionHandler);
    @Method(selector = "removeDataOfTypes:fromDataRecords:completionHandler:")
    public native void removeData(NSSet<NSString> dataTypes, NSArray<WKWebExtensionDataRecord> dataRecords, @Block Runnable completionHandler);
    @Method(selector = "didOpenWindow:")
    public native void didOpenWindow(WKWebExtensionWindow newWindow);
    @Method(selector = "didCloseWindow:")
    public native void didCloseWindow(WKWebExtensionWindow closedWindow);
    @Method(selector = "didFocusWindow:")
    public native void didFocusWindow(WKWebExtensionWindow focusedWindow);
    @Method(selector = "didOpenTab:")
    public native void didOpenTab(WKWebExtensionTab newTab);
    @Method(selector = "didCloseTab:windowIsClosing:")
    public native void didCloseTab(WKWebExtensionTab closedTab, boolean windowIsClosing);
    @Method(selector = "didActivateTab:previousActiveTab:")
    public native void didActivateTab(WKWebExtensionTab activatedTab, WKWebExtensionTab previousTab);
    @Method(selector = "didSelectTabs:")
    public native void didSelectTabs(NSArray<?> selectedTabs);
    @Method(selector = "didDeselectTabs:")
    public native void didDeselectTabs(NSArray<?> deselectedTabs);
    @Method(selector = "didMoveTab:fromIndex:inWindow:")
    public native void didMoveTab(WKWebExtensionTab movedTab, @MachineSizedUInt long index, WKWebExtensionWindow oldWindow);
    @Method(selector = "didReplaceTab:withTab:")
    public native void didReplaceTab(WKWebExtensionTab oldTab, WKWebExtensionTab newTab);
    @Method(selector = "didChangeTabProperties:forTab:")
    public native void didChangeTabProperties(WKWebExtensionTabChangedProperties properties, WKWebExtensionTab changedTab);
    /*</methods>*/
}
