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
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UICollectionViewPlaceholder/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UICollectionViewPlaceholderPtr extends Ptr<UICollectionViewPlaceholder, UICollectionViewPlaceholderPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UICollectionViewPlaceholder.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UICollectionViewPlaceholder() {}
    protected UICollectionViewPlaceholder(Handle h, long handle) { super(h, handle); }
    protected UICollectionViewPlaceholder(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithInsertionIndexPath:reuseIdentifier:")
    public UICollectionViewPlaceholder(NSIndexPath insertionIndexPath, String reuseIdentifier) { super((SkipInit) null); initObject(init(insertionIndexPath, reuseIdentifier)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "cellUpdateHandler")
    public native @Block VoidBlock1<UICollectionViewCell> getCellUpdateHandler();
    @Property(selector = "setCellUpdateHandler:")
    public native void setCellUpdateHandler(@Block VoidBlock1<UICollectionViewCell> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithInsertionIndexPath:reuseIdentifier:")
    protected native @Pointer long init(NSIndexPath insertionIndexPath, String reuseIdentifier);
    /*</methods>*/
}
