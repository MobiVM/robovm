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
/**
 * @since Available in iOS 15.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSTextContentManager/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSTextElementProvider, NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class NSTextContentManagerPtr extends Ptr<NSTextContentManager, NSTextContentManagerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSTextContentManager.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSTextContentManager() {}
    protected NSTextContentManager(Handle h, long handle) { super(h, handle); }
    protected NSTextContentManager(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public NSTextContentManager(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native NSTextContentManagerDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(NSTextContentManagerDelegate v);
    @Property(selector = "textLayoutManagers")
    public native NSArray<NSTextLayoutManager> getTextLayoutManagers();
    @Property(selector = "primaryTextLayoutManager")
    public native NSTextLayoutManager getPrimaryTextLayoutManager();
    @Property(selector = "setPrimaryTextLayoutManager:")
    public native void setPrimaryTextLayoutManager(NSTextLayoutManager v);
    @Property(selector = "hasEditingTransaction")
    public native boolean hasEditingTransaction();
    @Property(selector = "automaticallySynchronizesTextLayoutManagers")
    public native boolean automaticallySynchronizesTextLayoutManagers();
    @Property(selector = "setAutomaticallySynchronizesTextLayoutManagers:")
    public native void setAutomaticallySynchronizesTextLayoutManagers(boolean v);
    @Property(selector = "automaticallySynchronizesToBackingStore")
    public native boolean automaticallySynchronizesToBackingStore();
    @Property(selector = "setAutomaticallySynchronizesToBackingStore:")
    public native void setAutomaticallySynchronizesToBackingStore(boolean v);
    @Property(selector = "documentRange")
    public native NSTextRange getDocumentRange();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    @Method(selector = "addTextLayoutManager:")
    public native void addTextLayoutManager(NSTextLayoutManager textLayoutManager);
    @Method(selector = "removeTextLayoutManager:")
    public native void removeTextLayoutManager(NSTextLayoutManager textLayoutManager);
    @Method(selector = "synchronizeTextLayoutManagers:")
    public native void synchronizeTextLayoutManagers(@Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "textElementsForRange:")
    public native NSArray<NSTextElement> textElementsForRange(NSTextRange range);
    @Method(selector = "performEditingTransactionUsingBlock:")
    public native void performEditingTransactionUsingBlock(@Block Runnable transaction);
    @Method(selector = "recordEditActionInRange:newTextRange:")
    public native void recordEditAction(NSTextRange originalTextRange, NSTextRange newTextRange);
    @Method(selector = "enumerateTextElementsFromLocation:options:usingBlock:")
    public native NSTextLocation enumerateTextElements(NSTextLocation textLocation, NSTextContentManagerEnumerationOptions options, @Block Block1<NSTextElement, Boolean> block);
    @Method(selector = "replaceContentsInRange:withTextElements:")
    public native void replaceContents(NSTextRange range, NSArray<NSTextElement> textElements);
    @Method(selector = "synchronizeToBackingStore:")
    public native void synchronizeToBackingStore(@Block VoidBlock1<NSError> completionHandler);
    @Method(selector = "locationFromLocation:withOffset:")
    public native NSTextLocation getLocationFromLocation(NSTextLocation location, @MachineSizedSInt long offset);
    @Method(selector = "offsetFromLocation:toLocation:")
    public native @MachineSizedSInt long getOffsetFromLocation(NSTextLocation from, NSTextLocation to);
    @Method(selector = "adjustedRangeFromRange:forEditingTextSelection:")
    public native NSTextRange adjustedRange(NSTextRange textRange, boolean forEditingTextSelection);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    /*</methods>*/
}
