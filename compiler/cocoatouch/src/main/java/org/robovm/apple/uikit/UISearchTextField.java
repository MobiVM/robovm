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
import org.robovm.apple.usernotifications.*;
import org.robovm.apple.linkpresentation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UISearchTextField/*</name>*/ 
    extends /*<extends>*/UITextField/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UISearchTextFieldPtr extends Ptr<UISearchTextField, UISearchTextFieldPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UISearchTextField.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UISearchTextField() {}
    protected UISearchTextField(Handle h, long handle) { super(h, handle); }
    protected UISearchTextField(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:")
    public UISearchTextField(@ByVal CGRect frame) { super(frame); }
    @Method(selector = "initWithCoder:")
    public UISearchTextField(NSCoder coder) { super(coder); }
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Method(selector = "initWithFrame:primaryAction:")
    public UISearchTextField(@ByVal CGRect frame, UIAction primaryAction) { super(frame, primaryAction); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "tokens")
    public native NSArray<UISearchToken> getTokens();
    @Property(selector = "setTokens:")
    public native void setTokens(NSArray<UISearchToken> v);
    @Property(selector = "textualRange")
    public native UITextRange getTextualRange();
    @Property(selector = "tokenBackgroundColor")
    public native UIColor getTokenBackgroundColor();
    @Property(selector = "setTokenBackgroundColor:")
    public native void setTokenBackgroundColor(UIColor v);
    @Property(selector = "allowsDeletingTokens")
    public native boolean allowsDeletingTokens();
    @Property(selector = "setAllowsDeletingTokens:")
    public native void setAllowsDeletingTokens(boolean v);
    @Property(selector = "allowsCopyingTokens")
    public native boolean allowsCopyingTokens();
    @Property(selector = "setAllowsCopyingTokens:")
    public native void setAllowsCopyingTokens(boolean v);
    @WeaklyLinked
    @Property(selector = "layerClass")
    public static native Class<? extends CALayer> getLayerClass();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "insertToken:atIndex:")
    public native void insertToken(UISearchToken token, @MachineSizedSInt long tokenIndex);
    @Method(selector = "removeTokenAtIndex:")
    public native void removeTokenAtIndex(@MachineSizedSInt long tokenIndex);
    @Method(selector = "positionOfTokenAtIndex:")
    public native UITextPosition positionOfTokenAtIndex(@MachineSizedSInt long tokenIndex);
    @Method(selector = "tokensInRange:")
    public native NSArray<UISearchToken> tokensInRange(UITextRange textRange);
    @Method(selector = "replaceTextualPortionOfRange:withToken:atIndex:")
    public native void replaceTextualPortionOfRange(UITextRange textRange, UISearchToken token, @MachineSizedUInt long tokenIndex);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "userInterfaceLayoutDirectionForSemanticContentAttribute:")
    public static native UIUserInterfaceLayoutDirection getUserInterfaceLayoutDirection(UISemanticContentAttribute attribute);
    /**
     * @since Available in iOS 10.0 and later.
     */
    @Method(selector = "userInterfaceLayoutDirectionForSemanticContentAttribute:relativeToLayoutDirection:")
    public static native UIUserInterfaceLayoutDirection getUserInterfaceLayoutDirection(UISemanticContentAttribute semanticContentAttribute, UIUserInterfaceLayoutDirection layoutDirection);
    /*</methods>*/
}
