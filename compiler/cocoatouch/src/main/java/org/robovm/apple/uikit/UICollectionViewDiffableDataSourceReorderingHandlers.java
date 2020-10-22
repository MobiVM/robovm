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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 14.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UICollectionViewDiffableDataSourceReorderingHandlers<SectionType extends NSObject, ItemType extends NSObject>/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class UICollectionViewDiffableDataSourceReorderingHandlersPtr<SectionType extends NSObject, ItemType extends NSObject> extends Ptr<UICollectionViewDiffableDataSourceReorderingHandlers<SectionType, ItemType>, UICollectionViewDiffableDataSourceReorderingHandlersPtr<SectionType, ItemType>> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UICollectionViewDiffableDataSourceReorderingHandlers.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public UICollectionViewDiffableDataSourceReorderingHandlers() {}
    protected UICollectionViewDiffableDataSourceReorderingHandlers(Handle h, long handle) { super(h, handle); }
    protected UICollectionViewDiffableDataSourceReorderingHandlers(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "canReorderItemHandler")
    public native @Block Block1<ItemType, Boolean> getCanReorderItemHandler();
    @Property(selector = "setCanReorderItemHandler:")
    public native void setCanReorderItemHandler(@Block Block1<ItemType, Boolean> v);
    @Property(selector = "willReorderHandler")
    public native @Block VoidBlock1<NSDiffableDataSourceTransaction<SectionType, ItemType>> getWillReorderHandler();
    @Property(selector = "setWillReorderHandler:")
    public native void setWillReorderHandler(@Block VoidBlock1<NSDiffableDataSourceTransaction<SectionType, ItemType>> v);
    @Property(selector = "didReorderHandler")
    public native @Block VoidBlock1<NSDiffableDataSourceTransaction<SectionType, ItemType>> getDidReorderHandler();
    @Property(selector = "setDidReorderHandler:")
    public native void setDidReorderHandler(@Block VoidBlock1<NSDiffableDataSourceTransaction<SectionType, ItemType>> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
