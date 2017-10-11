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
package org.robovm.apple.corenfc;

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
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreNFC") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NFCISO15693ReadMultipleBlocksConfiguration/*</name>*/ 
    extends /*<extends>*/NFCTagCommandConfiguration/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NFCISO15693ReadMultipleBlocksConfigurationPtr extends Ptr<NFCISO15693ReadMultipleBlocksConfiguration, NFCISO15693ReadMultipleBlocksConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NFCISO15693ReadMultipleBlocksConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NFCISO15693ReadMultipleBlocksConfiguration() {}
    protected NFCISO15693ReadMultipleBlocksConfiguration(Handle h, long handle) { super(h, handle); }
    protected NFCISO15693ReadMultipleBlocksConfiguration(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithRange:chunkSize:")
    public NFCISO15693ReadMultipleBlocksConfiguration(@ByVal NSRange range, @MachineSizedUInt long chunkSize) { super((SkipInit) null); initObject(init(range, chunkSize)); }
    @Method(selector = "initWithRange:chunkSize:maximumRetries:retryInterval:")
    public NFCISO15693ReadMultipleBlocksConfiguration(@ByVal NSRange range, @MachineSizedUInt long chunkSize, @MachineSizedUInt long maximumRetries, double retryInterval) { super((SkipInit) null); initObject(init(range, chunkSize, maximumRetries, retryInterval)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "range")
    public native @ByVal NSRange getRange();
    @Property(selector = "setRange:")
    public native void setRange(@ByVal NSRange v);
    @Property(selector = "chunkSize")
    public native @MachineSizedUInt long getChunkSize();
    @Property(selector = "setChunkSize:")
    public native void setChunkSize(@MachineSizedUInt long v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithRange:chunkSize:")
    protected native @Pointer long init(@ByVal NSRange range, @MachineSizedUInt long chunkSize);
    @Method(selector = "initWithRange:chunkSize:maximumRetries:retryInterval:")
    protected native @Pointer long init(@ByVal NSRange range, @MachineSizedUInt long chunkSize, @MachineSizedUInt long maximumRetries, double retryInterval);
    /*</methods>*/
}
