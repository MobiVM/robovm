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
package org.robovm.apple.coretext;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedUIntMarshaler.class)/*</annotations>*/
public enum /*<name>*/CTFontUIFontType/*</name>*/ implements ValuedEnum {
    /*<values>*/
    /**
     * @since Available in iOS 6.0 and later.
     */
    UIFontNone(-1L),
    /**
     * @since Available in iOS 6.0 and later.
     */
    UIFontUser(0L),
    /**
     * @since Available in iOS 6.0 and later.
     */
    UIFontUserFixedPitch(1L),
    /**
     * @since Available in iOS 6.0 and later.
     */
    UIFontSystem(2L),
    /**
     * @since Available in iOS 6.0 and later.
     */
    UIFontEmphasizedSystem(3L),
    /**
     * @since Available in iOS 6.0 and later.
     */
    UIFontSmallSystem(4L),
    /**
     * @since Available in iOS 6.0 and later.
     */
    UIFontSmallEmphasizedSystem(5L),
    /**
     * @since Available in iOS 6.0 and later.
     */
    UIFontMiniSystem(6L),
    /**
     * @since Available in iOS 6.0 and later.
     */
    UIFontMiniEmphasizedSystem(7L),
    /**
     * @since Available in iOS 6.0 and later.
     */
    UIFontViews(8L),
    /**
     * @since Available in iOS 6.0 and later.
     */
    UIFontApplication(9L),
    /**
     * @since Available in iOS 6.0 and later.
     */
    UIFontLabel(10L),
    /**
     * @since Available in iOS 6.0 and later.
     */
    UIFontMenuTitle(11L),
    /**
     * @since Available in iOS 6.0 and later.
     */
    UIFontMenuItem(12L),
    /**
     * @since Available in iOS 6.0 and later.
     */
    UIFontMenuItemMark(13L),
    /**
     * @since Available in iOS 6.0 and later.
     */
    UIFontMenuItemCmdKey(14L),
    /**
     * @since Available in iOS 6.0 and later.
     */
    UIFontWindowTitle(15L),
    /**
     * @since Available in iOS 6.0 and later.
     */
    UIFontPushButton(16L),
    /**
     * @since Available in iOS 6.0 and later.
     */
    UIFontUtilityWindowTitle(17L),
    /**
     * @since Available in iOS 6.0 and later.
     */
    UIFontAlertHeader(18L),
    /**
     * @since Available in iOS 6.0 and later.
     */
    UIFontSystemDetail(19L),
    /**
     * @since Available in iOS 6.0 and later.
     */
    UIFontEmphasizedSystemDetail(20L),
    /**
     * @since Available in iOS 6.0 and later.
     */
    UIFontToolbar(21L),
    /**
     * @since Available in iOS 6.0 and later.
     */
    UIFontSmallToolbar(22L),
    /**
     * @since Available in iOS 6.0 and later.
     */
    UIFontMessage(23L),
    /**
     * @since Available in iOS 6.0 and later.
     */
    UIFontPalette(24L),
    /**
     * @since Available in iOS 6.0 and later.
     */
    UIFontToolTip(25L),
    /**
     * @since Available in iOS 6.0 and later.
     */
    UIFontControlContent(26L),
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 9.0.
     */
    @Deprecated
    NoFontType(-1L),
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 9.0.
     */
    @Deprecated
    UserFontType(0L),
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 9.0.
     */
    @Deprecated
    UserFixedPitchFontType(1L),
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 9.0.
     */
    @Deprecated
    SystemFontType(2L),
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 9.0.
     */
    @Deprecated
    EmphasizedSystemFontType(3L),
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 9.0.
     */
    @Deprecated
    SmallSystemFontType(4L),
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 9.0.
     */
    @Deprecated
    SmallEmphasizedSystemFontType(5L),
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 9.0.
     */
    @Deprecated
    MiniSystemFontType(6L),
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 9.0.
     */
    @Deprecated
    MiniEmphasizedSystemFontType(7L),
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 9.0.
     */
    @Deprecated
    ViewsFontType(8L),
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 9.0.
     */
    @Deprecated
    ApplicationFontType(9L),
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 9.0.
     */
    @Deprecated
    LabelFontType(10L),
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 9.0.
     */
    @Deprecated
    MenuTitleFontType(11L),
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 9.0.
     */
    @Deprecated
    MenuItemFontType(12L),
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 9.0.
     */
    @Deprecated
    MenuItemMarkFontType(13L),
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 9.0.
     */
    @Deprecated
    MenuItemCmdKeyFontType(14L),
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 9.0.
     */
    @Deprecated
    WindowTitleFontType(15L),
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 9.0.
     */
    @Deprecated
    PushButtonFontType(16L),
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 9.0.
     */
    @Deprecated
    UtilityWindowTitleFontType(17L),
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 9.0.
     */
    @Deprecated
    AlertHeaderFontType(18L),
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 9.0.
     */
    @Deprecated
    SystemDetailFontType(19L),
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 9.0.
     */
    @Deprecated
    EmphasizedSystemDetailFontType(20L),
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 9.0.
     */
    @Deprecated
    ToolbarFontType(21L),
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 9.0.
     */
    @Deprecated
    SmallToolbarFontType(22L),
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 9.0.
     */
    @Deprecated
    MessageFontType(23L),
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 9.0.
     */
    @Deprecated
    PaletteFontType(24L),
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 9.0.
     */
    @Deprecated
    ToolTipFontType(25L),
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 9.0.
     */
    @Deprecated
    ControlContentFontType(26L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/CTFontUIFontType/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/CTFontUIFontType/*</name>*/ valueOf(long n) {
        for (/*<name>*/CTFontUIFontType/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/CTFontUIFontType/*</name>*/.class.getName());
    }
}
