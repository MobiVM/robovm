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
package org.robovm.apple.photos;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.imageio.*;
import org.robovm.apple.uniformtypeid.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("Photos") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PHFetchOptions/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PHFetchOptionsPtr extends Ptr<PHFetchOptions, PHFetchOptionsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PHFetchOptions.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public PHFetchOptions() {}
    protected PHFetchOptions(Handle h, long handle) { super(h, handle); }
    protected PHFetchOptions(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "predicate")
    public native NSPredicate getPredicate();
    @Property(selector = "setPredicate:")
    public native void setPredicate(NSPredicate v);
    @Property(selector = "sortDescriptors")
    public native NSArray<NSSortDescriptor> getSortDescriptors();
    @Property(selector = "setSortDescriptors:")
    public native void setSortDescriptors(NSArray<NSSortDescriptor> v);
    @Property(selector = "includeHiddenAssets")
    public native boolean includesHiddenAssets();
    @Property(selector = "setIncludeHiddenAssets:")
    public native void setIncludesHiddenAssets(boolean v);
    @Property(selector = "includeAllBurstAssets")
    public native boolean includesAllBurstAssets();
    @Property(selector = "setIncludeAllBurstAssets:")
    public native void setIncludesAllBurstAssets(boolean v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "includeAssetSourceTypes")
    public native PHAssetSourceType getIncludeAssetSourceTypes();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setIncludeAssetSourceTypes:")
    public native void setIncludeAssetSourceTypes(PHAssetSourceType v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "fetchLimit")
    public native @MachineSizedUInt long getFetchLimit();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setFetchLimit:")
    public native void setFetchLimit(@MachineSizedUInt long v);
    @Property(selector = "wantsIncrementalChangeDetails")
    public native boolean wantsIncrementalChangeDetails();
    @Property(selector = "setWantsIncrementalChangeDetails:")
    public native void setWantsIncrementalChangeDetails(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
