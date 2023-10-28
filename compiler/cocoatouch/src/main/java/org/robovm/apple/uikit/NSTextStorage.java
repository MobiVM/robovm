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
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSTextStorage/*</name>*/ 
    extends /*<extends>*/NSMutableAttributedString/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    public static class Notifications {
        /**
         * @since Available in iOS 7.0 and later.
         */
        public static NSObject observeWillProcessEditing(NSTextStorage object, final VoidBlock1<NSTextStorage> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(WillProcessEditingNotification(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.invoke((NSTextStorage) a.getObject());
                }
            });
        }
        /**
         * @since Available in iOS 7.0 and later.
         */
        public static NSObject observeDidProcessEditing(NSTextStorage object, final VoidBlock1<NSTextStorage> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(DidProcessEditingNotification(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.invoke((NSTextStorage) a.getObject());
                }
            });
        }
    }
    /*<ptr>*/public static class NSTextStoragePtr extends Ptr<NSTextStorage, NSTextStoragePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSTextStorage.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSTextStorage() {}
    protected NSTextStorage(Handle h, long handle) { super(h, handle); }
    protected NSTextStorage(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "layoutManagers")
    public native NSArray<NSLayoutManager> getLayoutManagers();
    @Property(selector = "editedMask")
    public native NSTextStorageEditActions getEditedMask();
    @Property(selector = "editedRange")
    public native @ByVal NSRange getEditedRange();
    @Property(selector = "changeInLength")
    public native @MachineSizedSInt long getChangeInLength();
    @Property(selector = "delegate")
    public native NSTextStorageDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(NSTextStorageDelegate v);
    @Property(selector = "fixesAttributesLazily")
    public native boolean fixesAttributesLazily();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "textStorageObserver")
    public native NSTextStorageObserving getTextStorageObserver();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "setTextStorageObserver:", strongRef = true)
    public native void setTextStorageObserver(NSTextStorageObserving v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    @Property(selector = "readableTypeIdentifiersForItemProvider")
    public static native NSArray<NSString> getReadableTypeIdentifiersForItemProvider();
    @Property(selector = "writableTypeIdentifiersForItemProvider")
    public static native NSArray<NSString> getWritableTypeIdentifiersForItemProvider0();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @GlobalValue(symbol="NSTextStorageWillProcessEditingNotification", optional=true)
    public static native NSString WillProcessEditingNotification();
    @GlobalValue(symbol="NSTextStorageDidProcessEditingNotification", optional=true)
    public static native NSString DidProcessEditingNotification();
    
    @Method(selector = "addLayoutManager:")
    public native void addLayoutManager(NSLayoutManager aLayoutManager);
    @Method(selector = "removeLayoutManager:")
    public native void removeLayoutManager(NSLayoutManager aLayoutManager);
    @Method(selector = "edited:range:changeInLength:")
    public native void edited(NSTextStorageEditActions editedMask, @ByVal NSRange editedRange, @MachineSizedSInt long delta);
    @Method(selector = "processEditing")
    public native void processEditing();
    @Method(selector = "invalidateAttributesInRange:")
    public native void invalidateAttributes(@ByVal NSRange range);
    @Method(selector = "ensureAttributesAreFixedInRange:")
    public native void ensureAttributesAreFixed(@ByVal NSRange range);
    public static NSTextStorage createProviderDataObject(NSData data, String typeIdentifier) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSTextStorage result = createProviderDataObject(data, typeIdentifier, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "objectWithItemProviderData:typeIdentifier:error:")
    private static native NSTextStorage createProviderDataObject(NSData data, String typeIdentifier, NSError.NSErrorPtr outError);
    @Method(selector = "itemProviderVisibilityForRepresentationWithTypeIdentifier:")
    public static native NSItemProviderRepresentationVisibility getItemProviderVisibility0(String typeIdentifier);
    /*</methods>*/
}
