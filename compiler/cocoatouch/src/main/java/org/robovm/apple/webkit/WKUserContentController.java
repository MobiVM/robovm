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

/*</javadoc>*/
/*<annotations>*/@Library("WebKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/WKUserContentController/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class WKUserContentControllerPtr extends Ptr<WKUserContentController, WKUserContentControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(WKUserContentController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public WKUserContentController() {}
    protected WKUserContentController(Handle h, long handle) { super(h, handle); }
    protected WKUserContentController(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public WKUserContentController(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "userScripts")
    public native NSArray<WKUserScript> getUserScripts();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "addUserScript:")
    public native void addUserScript(WKUserScript userScript);
    @Method(selector = "removeAllUserScripts")
    public native void removeAllUserScripts();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "addScriptMessageHandler:contentWorld:name:")
    public native void addScriptMessageHandler(WKScriptMessageHandler scriptMessageHandler, WKContentWorld world, String name);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "addScriptMessageHandlerWithReply:contentWorld:name:")
    public native void addScriptMessageHandler(WKScriptMessageHandlerWithReply scriptMessageHandlerWithReply, WKContentWorld contentWorld, String name);
    @Method(selector = "addScriptMessageHandler:name:")
    public native void addScriptMessageHandler(WKScriptMessageHandler scriptMessageHandler, String name);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "removeScriptMessageHandlerForName:contentWorld:")
    public native void removeScriptMessageHandler(String name, WKContentWorld contentWorld);
    @Method(selector = "removeScriptMessageHandlerForName:")
    public native void removeScriptMessageHandler(String name);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "removeAllScriptMessageHandlersFromContentWorld:")
    public native void removeAllScriptMessageHandlersFromContentWorld(WKContentWorld contentWorld);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "removeAllScriptMessageHandlers")
    public native void removeAllScriptMessageHandlers();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "addContentRuleList:")
    public native void addContentRuleList(WKContentRuleList contentRuleList);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "removeContentRuleList:")
    public native void removeContentRuleList(WKContentRuleList contentRuleList);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "removeAllContentRuleLists")
    public native void removeAllContentRuleLists();
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
