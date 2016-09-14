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

import org.robovm.apple.foundation.NSAttributedString;
import org.robovm.apple.foundation.NSObject;
import org.robovm.objc.annotation.NotImplemented;
import org.robovm.rt.bro.annotation.MachineSizedFloat;
import org.robovm.rt.bro.annotation.MachineSizedSInt;

public class UIPickerViewModel extends NSObject implements UIPickerViewDelegate, UIPickerViewDataSource {
    @NotImplemented("pickerView:widthForComponent:")
    public @MachineSizedFloat double getComponentWidth(UIPickerView pickerView, @MachineSizedSInt long component) { return 0; }
    @NotImplemented("pickerView:rowHeightForComponent:")
    public @MachineSizedFloat double getRowHeight(UIPickerView pickerView, @MachineSizedSInt long component) { return 0; }
    @NotImplemented("pickerView:titleForRow:forComponent:")
    public String getRowTitle(UIPickerView pickerView, @MachineSizedSInt long row, @MachineSizedSInt long component) { return null; }
    /**
     * @since Available in iOS 6.0 and later.
     */
    @NotImplemented("pickerView:attributedTitleForRow:forComponent:")
    public NSAttributedString getAttributedRowTitle(UIPickerView pickerView, @MachineSizedSInt long row, @MachineSizedSInt long component) { return null; }
    @NotImplemented("pickerView:viewForRow:forComponent:reusingView:")
    public UIView getRowView(UIPickerView pickerView, @MachineSizedSInt long row, @MachineSizedSInt long component, UIView view) { return null; }
    @NotImplemented("pickerView:didSelectRow:inComponent:")
    public void didSelectRow(UIPickerView pickerView, @MachineSizedSInt long row, @MachineSizedSInt long component) {}
    
    @NotImplemented("numberOfComponentsInPickerView:")
    public @MachineSizedSInt long getNumberOfComponents(UIPickerView pickerView) { return 0; }
    @NotImplemented("pickerView:numberOfRowsInComponent:")
    public @MachineSizedSInt long getNumberOfRows(UIPickerView pickerView, @MachineSizedSInt long component) { return 0; }
}
