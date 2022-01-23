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
package org.robovm.apple.carplay;

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
import org.robovm.apple.mapkit.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CarPlay") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CPMessageListItem/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements CPListTemplateItem/*</implements>*/ {

    /*<ptr>*/public static class CPMessageListItemPtr extends Ptr<CPMessageListItem, CPMessageListItemPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CPMessageListItem.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CPMessageListItem() {}
    protected CPMessageListItem(Handle h, long handle) { super(h, handle); }
    protected CPMessageListItem(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithConversationIdentifier:text:leadingConfiguration:trailingConfiguration:detailText:trailingText:")
    public static  CPMessageListItem createUsingConversationIdentifier(String conversationIdentifier, String text, CPMessageListItemLeadingConfiguration leadingConfiguration, CPMessageListItemTrailingConfiguration trailingConfiguration, String detailText, String trailingText) {
       CPMessageListItem res = new CPMessageListItem((SkipInit) null);
       res.initObject(res.initUsingConversationIdentifier(conversationIdentifier, text, leadingConfiguration, trailingConfiguration, detailText, trailingText));
       return res;
    }
    @Method(selector = "initWithFullName:phoneOrEmailAddress:leadingConfiguration:trailingConfiguration:detailText:trailingText:")
    public CPMessageListItem(String fullName, String phoneOrEmailAddress, CPMessageListItemLeadingConfiguration leadingConfiguration, CPMessageListItemTrailingConfiguration trailingConfiguration, String detailText, String trailingText) { super((SkipInit) null); initObject(init(fullName, phoneOrEmailAddress, leadingConfiguration, trailingConfiguration, detailText, trailingText)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "text")
    public native String getText();
    @Property(selector = "setText:")
    public native void setText(String v);
    @Property(selector = "conversationIdentifier")
    public native String getConversationIdentifier();
    @Property(selector = "setConversationIdentifier:")
    public native void setConversationIdentifier(String v);
    @Property(selector = "phoneOrEmailAddress")
    public native String getPhoneOrEmailAddress();
    @Property(selector = "setPhoneOrEmailAddress:")
    public native void setPhoneOrEmailAddress(String v);
    @Property(selector = "leadingConfiguration")
    public native CPMessageListItemLeadingConfiguration getLeadingConfiguration();
    @Property(selector = "setLeadingConfiguration:")
    public native void setLeadingConfiguration(CPMessageListItemLeadingConfiguration v);
    @Property(selector = "trailingConfiguration")
    public native CPMessageListItemTrailingConfiguration getTrailingConfiguration();
    @Property(selector = "setTrailingConfiguration:")
    public native void setTrailingConfiguration(CPMessageListItemTrailingConfiguration v);
    @Property(selector = "detailText")
    public native String getDetailText();
    @Property(selector = "setDetailText:")
    public native void setDetailText(String v);
    @Property(selector = "trailingText")
    public native String getTrailingText();
    @Property(selector = "setTrailingText:")
    public native void setTrailingText(String v);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "isEnabled")
    public native boolean isEnabled();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "setEnabled:")
    public native void setEnabled(boolean v);
    @Property(selector = "userInfo")
    public native NSObject getUserInfo();
    @Property(selector = "setUserInfo:")
    public native void setUserInfo(NSObject v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="CPMaximumMessageItemImageSize", optional=true)
    public static native @ByVal CGSize getMaximumImageSize();
    
    @Method(selector = "initWithConversationIdentifier:text:leadingConfiguration:trailingConfiguration:detailText:trailingText:")
    protected native @Pointer long initUsingConversationIdentifier(String conversationIdentifier, String text, CPMessageListItemLeadingConfiguration leadingConfiguration, CPMessageListItemTrailingConfiguration trailingConfiguration, String detailText, String trailingText);
    @Method(selector = "initWithFullName:phoneOrEmailAddress:leadingConfiguration:trailingConfiguration:detailText:trailingText:")
    protected native @Pointer long init(String fullName, String phoneOrEmailAddress, CPMessageListItemLeadingConfiguration leadingConfiguration, CPMessageListItemTrailingConfiguration trailingConfiguration, String detailText, String trailingText);
    /*</methods>*/
}
