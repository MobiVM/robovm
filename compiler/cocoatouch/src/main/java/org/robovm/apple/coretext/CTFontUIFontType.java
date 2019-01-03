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
    UIFontNone(-1L),
    UIFontUser(0L),
    UIFontUserFixedPitch(1L),
    UIFontSystem(2L),
    UIFontEmphasizedSystem(3L),
    UIFontSmallSystem(4L),
    UIFontSmallEmphasizedSystem(5L),
    UIFontMiniSystem(6L),
    UIFontMiniEmphasizedSystem(7L),
    UIFontViews(8L),
    UIFontApplication(9L),
    UIFontLabel(10L),
    UIFontMenuTitle(11L),
    UIFontMenuItem(12L),
    UIFontMenuItemMark(13L),
    UIFontMenuItemCmdKey(14L),
    UIFontWindowTitle(15L),
    UIFontPushButton(16L),
    UIFontUtilityWindowTitle(17L),
    UIFontAlertHeader(18L),
    UIFontSystemDetail(19L),
    UIFontEmphasizedSystemDetail(20L),
    UIFontToolbar(21L),
    UIFontSmallToolbar(22L),
    UIFontMessage(23L),
    UIFontPalette(24L),
    UIFontToolTip(25L),
    UIFontControlContent(26L),
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 9.0. Deprecated
     */
    @Deprecated
    NoFontType(-1L),
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 9.0. Deprecated
     */
    @Deprecated
    UserFontType(0L),
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 9.0. Deprecated
     */
    @Deprecated
    UserFixedPitchFontType(1L),
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 9.0. Deprecated
     */
    @Deprecated
    SystemFontType(2L),
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 9.0. Deprecated
     */
    @Deprecated
    EmphasizedSystemFontType(3L),
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 9.0. Deprecated
     */
    @Deprecated
    SmallSystemFontType(4L),
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 9.0. Deprecated
     */
    @Deprecated
    SmallEmphasizedSystemFontType(5L),
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 9.0. Deprecated
     */
    @Deprecated
    MiniSystemFontType(6L),
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 9.0. Deprecated
     */
    @Deprecated
    MiniEmphasizedSystemFontType(7L),
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 9.0. Deprecated
     */
    @Deprecated
    ViewsFontType(8L),
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 9.0. Deprecated
     */
    @Deprecated
    ApplicationFontType(9L),
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 9.0. Deprecated
     */
    @Deprecated
    LabelFontType(10L),
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 9.0. Deprecated
     */
    @Deprecated
    MenuTitleFontType(11L),
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 9.0. Deprecated
     */
    @Deprecated
    MenuItemFontType(12L),
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 9.0. Deprecated
     */
    @Deprecated
    MenuItemMarkFontType(13L),
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 9.0. Deprecated
     */
    @Deprecated
    MenuItemCmdKeyFontType(14L),
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 9.0. Deprecated
     */
    @Deprecated
    WindowTitleFontType(15L),
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 9.0. Deprecated
     */
    @Deprecated
    PushButtonFontType(16L),
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 9.0. Deprecated
     */
    @Deprecated
    UtilityWindowTitleFontType(17L),
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 9.0. Deprecated
     */
    @Deprecated
    AlertHeaderFontType(18L),
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 9.0. Deprecated
     */
    @Deprecated
    SystemDetailFontType(19L),
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 9.0. Deprecated
     */
    @Deprecated
    EmphasizedSystemDetailFontType(20L),
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 9.0. Deprecated
     */
    @Deprecated
    ToolbarFontType(21L),
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 9.0. Deprecated
     */
    @Deprecated
    SmallToolbarFontType(22L),
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 9.0. Deprecated
     */
    @Deprecated
    MessageFontType(23L),
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 9.0. Deprecated
     */
    @Deprecated
    PaletteFontType(24L),
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 9.0. Deprecated
     */
    @Deprecated
    ToolTipFontType(25L),
    /**
     * @since Available in iOS 3.2 and later.
     * @deprecated Deprecated in iOS 9.0. Deprecated
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
