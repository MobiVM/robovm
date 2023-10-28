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
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIPrintInteractionController/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UIPrintInteractionControllerPtr extends Ptr<UIPrintInteractionController, UIPrintInteractionControllerPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIPrintInteractionController.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UIPrintInteractionController() {}
    protected UIPrintInteractionController(Handle h, long handle) { super(h, handle); }
    protected UIPrintInteractionController(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "isPrintingAvailable")
    public static native boolean isPrintingAvailable();
    @Property(selector = "printableUTIs")
    public static native @org.robovm.rt.bro.annotation.Marshaler(NSSet.AsStringSetMarshaler.class) Set<String> getPrintableUTIs();
    @Property(selector = "sharedPrintController")
    public static native UIPrintInteractionController getSharedPrintController();
    @Property(selector = "printInfo")
    public native UIPrintInfo getPrintInfo();
    @Property(selector = "setPrintInfo:")
    public native void setPrintInfo(UIPrintInfo v);
    @Property(selector = "delegate")
    public native UIPrintInteractionControllerDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(UIPrintInteractionControllerDelegate v);
    /**
     * @deprecated Deprecated in iOS 10.0. Pages can be removed from the print preview, so page range is always shown.
     */
    @Deprecated
    @Property(selector = "showsPageRange")
    public native boolean showsPageRange();
    /**
     * @deprecated Deprecated in iOS 10.0. Pages can be removed from the print preview, so page range is always shown.
     */
    @Deprecated
    @Property(selector = "setShowsPageRange:")
    public native void setShowsPageRange(boolean v);
    @Property(selector = "showsNumberOfCopies")
    public native boolean showsNumberOfCopies();
    @Property(selector = "setShowsNumberOfCopies:")
    public native void setShowsNumberOfCopies(boolean v);
    @Property(selector = "showsPaperSelectionForLoadedPapers")
    public native boolean showsPaperSelectionForLoadedPapers();
    @Property(selector = "setShowsPaperSelectionForLoadedPapers:")
    public native void setShowsPaperSelectionForLoadedPapers(boolean v);
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "showsPaperOrientation")
    public native boolean showsPaperOrientation();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "setShowsPaperOrientation:")
    public native void setShowsPaperOrientation(boolean v);
    @Property(selector = "printPaper")
    public native UIPrintPaper getPrintPaper();
    @Property(selector = "printPageRenderer")
    public native UIPrintPageRenderer getPrintPageRenderer();
    @Property(selector = "setPrintPageRenderer:")
    public native void setPrintPageRenderer(UIPrintPageRenderer v);
    @Property(selector = "printFormatter")
    public native UIPrintFormatter getPrintFormatter();
    @Property(selector = "setPrintFormatter:")
    public native void setPrintFormatter(UIPrintFormatter v);
    @Property(selector = "printingItem")
    public native NSObject getPrintingItem();
    @Property(selector = "setPrintingItem:")
    public native void setPrintingItem(NSObject v);
    @Property(selector = "printingItems")
    public native NSArray<?> getPrintingItems();
    @Property(selector = "setPrintingItems:")
    public native void setPrintingItems(NSArray<?> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "presentAnimated:completionHandler:")
    public native boolean present(boolean animated, @Block VoidBlock3<UIPrintInteractionController, Boolean, NSError> completion);
    @Method(selector = "presentFromRect:inView:animated:completionHandler:")
    public native boolean presentFromRectInView(@ByVal CGRect rect, UIView view, boolean animated, @Block VoidBlock3<UIPrintInteractionController, Boolean, NSError> completion);
    @Method(selector = "presentFromBarButtonItem:animated:completionHandler:")
    public native boolean presentFromBarButtonItem(UIBarButtonItem item, boolean animated, @Block VoidBlock3<UIPrintInteractionController, Boolean, NSError> completion);
    @Method(selector = "printToPrinter:completionHandler:")
    public native boolean print(UIPrinter printer, @Block VoidBlock3<UIPrintInteractionController, Boolean, NSError> completion);
    @Method(selector = "dismissAnimated:")
    public native void dismiss(boolean animated);
    @Method(selector = "canPrintURL:")
    public static native boolean canPrint(NSURL url);
    @Method(selector = "canPrintData:")
    public static native boolean canPrint(NSData data);
    /*</methods>*/
}
