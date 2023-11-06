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
import org.robovm.apple.symbols.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
/*<visibility>*/public final/*</visibility>*/ class /*<name>*/UIAccessibilityTraits/*</name>*/ 
    extends /*<extends>*/Bits<UIAccessibilityTraits>/*</extends>*/  {

    /*<bind>*/static { Bro.bind(UIAccessibilityTraits.class); }/*</bind>*/

    /*<values>*/
    public static final UIAccessibilityTraits None = new UIAccessibilityTraits(NoneValue());
    public static final UIAccessibilityTraits Button = new UIAccessibilityTraits(ButtonValue());
    public static final UIAccessibilityTraits Link = new UIAccessibilityTraits(LinkValue());
    /**
     * @since Available in iOS 6.0 and later.
     */
    public static final UIAccessibilityTraits Header = new UIAccessibilityTraits(HeaderValue());
    public static final UIAccessibilityTraits SearchField = new UIAccessibilityTraits(SearchFieldValue());
    public static final UIAccessibilityTraits Image = new UIAccessibilityTraits(ImageValue());
    public static final UIAccessibilityTraits Selected = new UIAccessibilityTraits(SelectedValue());
    public static final UIAccessibilityTraits PlaysSound = new UIAccessibilityTraits(PlaysSoundValue());
    public static final UIAccessibilityTraits StaticText = new UIAccessibilityTraits(StaticTextValue());
    public static final UIAccessibilityTraits SummaryElement = new UIAccessibilityTraits(SummaryElementValue());
    public static final UIAccessibilityTraits NotEnabled = new UIAccessibilityTraits(NotEnabledValue());
    public static final UIAccessibilityTraits UpdatesFrequently = new UIAccessibilityTraits(UpdatesFrequentlyValue());
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static final UIAccessibilityTraits StartsMediaSession = new UIAccessibilityTraits(StartsMediaSessionValue());
    /**
     * @since Available in iOS 4.0 and later.
     */
    public static final UIAccessibilityTraits Adjustable = new UIAccessibilityTraits(AdjustableValue());
    /**
     * @since Available in iOS 5.0 and later.
     */
    public static final UIAccessibilityTraits AllowsDirectInteraction = new UIAccessibilityTraits(AllowsDirectInteractionValue());
    /**
     * @since Available in iOS 5.0 and later.
     */
    public static final UIAccessibilityTraits CausesPageTurn = new UIAccessibilityTraits(CausesPageTurnValue());
    /**
     * @since Available in iOS 10.0 and later.
     */
    public static final UIAccessibilityTraits TabBarValue = new UIAccessibilityTraits(TabBarValue());
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final UIAccessibilityTraits ToggleButtonValue = new UIAccessibilityTraits(ToggleButtonValue());
    /**
     * @since Available in iOS 17.0 and later.
     */
    public static final UIAccessibilityTraits SupportsZoomValue = new UIAccessibilityTraits(SupportsZoomValue());

    /*</values>*/

    private static final /*<name>*/UIAccessibilityTraits/*</name>*/[] values = _values(/*<name>*/UIAccessibilityTraits/*</name>*/.class);

    public /*<name>*/UIAccessibilityTraits/*</name>*/(long value) { super(value); }
    private /*<name>*/UIAccessibilityTraits/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/UIAccessibilityTraits/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/UIAccessibilityTraits/*</name>*/(value, mask);
    }
    protected /*<name>*/UIAccessibilityTraits/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/UIAccessibilityTraits/*</name>*/[] values() {
        return values.clone();
    }
    
    /*<methods>*/
    @GlobalValue(symbol="UIAccessibilityTraitNone", optional=true)
    protected static native long NoneValue();
    @GlobalValue(symbol="UIAccessibilityTraitButton", optional=true)
    protected static native long ButtonValue();
    @GlobalValue(symbol="UIAccessibilityTraitLink", optional=true)
    protected static native long LinkValue();
    @GlobalValue(symbol="UIAccessibilityTraitHeader", optional=true)
    protected static native long HeaderValue();
    @GlobalValue(symbol="UIAccessibilityTraitSearchField", optional=true)
    protected static native long SearchFieldValue();
    @GlobalValue(symbol="UIAccessibilityTraitImage", optional=true)
    protected static native long ImageValue();
    @GlobalValue(symbol="UIAccessibilityTraitSelected", optional=true)
    protected static native long SelectedValue();
    @GlobalValue(symbol="UIAccessibilityTraitPlaysSound", optional=true)
    protected static native long PlaysSoundValue();
    @GlobalValue(symbol="UIAccessibilityTraitKeyboardKey", optional=true)
    protected static native long KeyboardKeyValue();
    @GlobalValue(symbol="UIAccessibilityTraitStaticText", optional=true)
    protected static native long StaticTextValue();
    @GlobalValue(symbol="UIAccessibilityTraitSummaryElement", optional=true)
    protected static native long SummaryElementValue();
    @GlobalValue(symbol="UIAccessibilityTraitNotEnabled", optional=true)
    protected static native long NotEnabledValue();
    @GlobalValue(symbol="UIAccessibilityTraitUpdatesFrequently", optional=true)
    protected static native long UpdatesFrequentlyValue();
    @GlobalValue(symbol="UIAccessibilityTraitStartsMediaSession", optional=true)
    protected static native long StartsMediaSessionValue();
    @GlobalValue(symbol="UIAccessibilityTraitAdjustable", optional=true)
    protected static native long AdjustableValue();
    @GlobalValue(symbol="UIAccessibilityTraitAllowsDirectInteraction", optional=true)
    protected static native long AllowsDirectInteractionValue();
    @GlobalValue(symbol="UIAccessibilityTraitCausesPageTurn", optional=true)
    protected static native long CausesPageTurnValue();
    /**
     * @since Available in iOS 10.0 and later.
     */
    @GlobalValue(symbol="UIAccessibilityTraitTabBar", optional=true)
    protected static native long TabBarValue();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @GlobalValue(symbol="UIAccessibilityTraitToggleButton", optional=true)
    protected static native long ToggleButtonValue();
    /**
     * @since Available in iOS 17.0 and later.
     */
    @GlobalValue(symbol="UIAccessibilityTraitSupportsZoom", optional=true)
    protected static native long SupportsZoomValue();
    /*</methods>*/
}
