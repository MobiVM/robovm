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
 * @since Available in iOS 2.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIPickerView/*</name>*/ 
    extends /*<extends>*/UIView/*</extends>*/ 
    /*<implements>*/implements NSCoding/*</implements>*/ {

    /*<ptr>*/public static class UIPickerViewPtr extends Ptr<UIPickerView, UIPickerViewPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIPickerView.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UIPickerView() {}
    protected UIPickerView(Handle h, long handle) { super(h, handle); }
    protected UIPickerView(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithFrame:")
    public UIPickerView(@ByVal CGRect frame) { super(frame); }
    @Method(selector = "initWithCoder:")
    public UIPickerView(NSCoder decoder) { super(decoder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "dataSource")
    public native UIPickerViewDataSource getDataSource();
    @Property(selector = "setDataSource:", strongRef = true)
    public native void setDataSource(UIPickerViewDataSource v);
    @Property(selector = "delegate")
    public native UIPickerViewDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(UIPickerViewDelegate v);
    @Property(selector = "showsSelectionIndicator")
    public native boolean showsSelectionIndicator();
    @Property(selector = "setShowsSelectionIndicator:")
    public native void setShowsSelectionIndicator(boolean v);
    @Property(selector = "numberOfComponents")
    public native @MachineSizedSInt long getNumberOfComponents();
    /*</properties>*/
    /*<members>*//*</members>*/
    private UIPickerViewModel model;
    public void setModel(UIPickerViewModel model) {
        this.model = model;
        setDelegate(model);
        setDataSource(model);
    }
    public UIPickerViewModel getModel() {
        return model;
    }
    /*<methods>*/
    @Method(selector = "numberOfRowsInComponent:")
    public native @MachineSizedSInt long getNumberOfRows(@MachineSizedSInt long component);
    @Method(selector = "rowSizeForComponent:")
    public native @ByVal CGSize getRowSize(@MachineSizedSInt long component);
    @Method(selector = "viewForRow:forComponent:")
    public native UIView getViewForRow(@MachineSizedSInt long row, @MachineSizedSInt long component);
    @Method(selector = "reloadAllComponents")
    public native void reloadAllComponents();
    @Method(selector = "reloadComponent:")
    public native void reloadComponent(@MachineSizedSInt long component);
    @Method(selector = "selectRow:inComponent:animated:")
    public native void selectRow(@MachineSizedSInt long row, @MachineSizedSInt long component, boolean animated);
    @Method(selector = "selectedRowInComponent:")
    public native @MachineSizedSInt long getSelectedRow(@MachineSizedSInt long component);
    /*</methods>*/
}
