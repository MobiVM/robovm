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
package org.robovm.apple.uikit;

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
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.cloudkit.*;
import org.robovm.apple.fileprovider.*;
import org.robovm.apple.intents.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 4.2 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UITextInputMode/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    public static class Notifications {
        /**
         * @since Available in iOS 4.2 and later.
         */
        public static NSObject observeCurrentModeDidChange(final VoidBlock1<UITextInputMode> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(CurrentInputModeDidChange(), null, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.invoke((UITextInputMode) a.getObject());
                }
            });
        }
    }
    /*<ptr>*/public static class UITextInputModePtr extends Ptr<UITextInputMode, UITextInputModePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UITextInputMode.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UITextInputMode() {}
    protected UITextInputMode(Handle h, long handle) { super(h, handle); }
    protected UITextInputMode(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public UITextInputMode(NSCoder decoder) { super((SkipInit) null); initObject(init(decoder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "primaryLanguage")
    public native String getPrimaryLanguage();
    @Property(selector = "activeInputModes")
    public static native NSArray<UITextInputMode> getActiveInputModes();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 4.2 and later.
     */
    @GlobalValue(symbol="UITextInputCurrentInputModeDidChangeNotification", optional=true)
    public static native NSString CurrentInputModeDidChange();
    
    /**
     * @since Available in iOS 4.2 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @Method(selector = "currentInputMode")
    public static native UITextInputMode getCurrentInputMode();
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder decoder);
    /*</methods>*/
}
