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
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIActivityItemsConfiguration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements UIActivityItemsConfigurationReading/*</implements>*/ {

    /*<ptr>*/public static class UIActivityItemsConfigurationPtr extends Ptr<UIActivityItemsConfiguration, UIActivityItemsConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIActivityItemsConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UIActivityItemsConfiguration() {}
    protected UIActivityItemsConfiguration(Handle h, long handle) { super(h, handle); }
    protected UIActivityItemsConfiguration(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithObjects:")
    public static  UIActivityItemsConfiguration createUsingObjects(NSArray<?> objects) {
       UIActivityItemsConfiguration res = new UIActivityItemsConfiguration((SkipInit) null);
       res.initObject(res.initWithObjects(objects));
       return res;
    }
    @Method(selector = "initWithItemProviders:")
    public static  UIActivityItemsConfiguration createUsingItemProviders(NSArray<NSItemProvider> itemProviders) {
       UIActivityItemsConfiguration res = new UIActivityItemsConfiguration((SkipInit) null);
       res.initObject(res.initWithItemProviders(itemProviders));
       return res;
    }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "localObject")
    public native NSObject getLocalObject();
    @Property(selector = "setLocalObject:")
    public native void setLocalObject(NSObject v);
    @Property(selector = "supportedInteractions")
    public native NSArray<NSString> getSupportedInteractions();
    @Property(selector = "setSupportedInteractions:")
    public native void setSupportedInteractions(NSArray<NSString> v);
    @Property(selector = "metadataProvider")
    public native @Block Block1<UIActivityItemsConfigurationMetadataKey, NSObject> getMetadataProvider();
    @Property(selector = "setMetadataProvider:")
    public native void setMetadataProvider(@Block Block1<UIActivityItemsConfigurationMetadataKey, NSObject> v);
    @Property(selector = "perItemMetadataProvider")
    public native @Block("(@MachineSizedSInt,)") Block2<Long, UIActivityItemsConfigurationMetadataKey, NSObject> getPerItemMetadataProvider();
    @Property(selector = "setPerItemMetadataProvider:")
    public native void setPerItemMetadataProvider(@Block("(@MachineSizedSInt,)") Block2<Long, UIActivityItemsConfigurationMetadataKey, NSObject> v);
    @Property(selector = "previewProvider")
    public native @Block("(@MachineSizedSInt,,@ByVal)") Block3<Long, UIActivityItemsConfigurationPreviewIntent, CGSize, NSItemProvider> getPreviewProvider();
    @Property(selector = "setPreviewProvider:")
    public native void setPreviewProvider(@Block("(@MachineSizedSInt,,@ByVal)") Block3<Long, UIActivityItemsConfigurationPreviewIntent, CGSize, NSItemProvider> v);
    @Property(selector = "applicationActivitiesProvider")
    public native @Block Block0<NSArray<UIActivity>> getApplicationActivitiesProvider();
    @Property(selector = "setApplicationActivitiesProvider:")
    public native void setApplicationActivitiesProvider(@Block Block0<NSArray<UIActivity>> v);
    @Property(selector = "itemProvidersForActivityItemsConfiguration")
    public native NSArray<NSItemProvider> getItemProvidersForActivityItemsConfiguration();
    @Property(selector = "applicationActivitiesForActivityItemsConfiguration")
    public native NSArray<UIActivity> getApplicationActivitiesForActivityItemsConfiguration();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithObjects:")
    protected native @Pointer long initWithObjects(NSArray<?> objects);
    @Method(selector = "initWithItemProviders:")
    protected native @Pointer long initWithItemProviders(NSArray<NSItemProvider> itemProviders);
    @Method(selector = "activityItemsConfigurationSupportsInteraction:")
    public native boolean activityItemsConfigurationSupportsInteraction(UIActivityItemsConfigurationInteraction interaction);
    @Method(selector = "activityItemsConfigurationMetadataForKey:")
    public native NSObject activityItemsConfigurationMetadataForKey(UIActivityItemsConfigurationMetadataKey key);
    @Method(selector = "activityItemsConfigurationMetadataForItemAtIndex:key:")
    public native NSObject getItem(@MachineSizedSInt long index, UIActivityItemsConfigurationMetadataKey key);
    @Method(selector = "activityItemsConfigurationPreviewForItemAtIndex:intent:suggestedSize:")
    public native NSItemProvider getPreview(@MachineSizedSInt long index, UIActivityItemsConfigurationPreviewIntent intent, @ByVal CGSize suggestedSize);
    /*</methods>*/
}
