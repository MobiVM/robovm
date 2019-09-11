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
package org.robovm.apple.contacts;

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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Contacts") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CNChangeHistoryFetchRequest/*</name>*/ 
    extends /*<extends>*/CNFetchRequest/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class CNChangeHistoryFetchRequestPtr extends Ptr<CNChangeHistoryFetchRequest, CNChangeHistoryFetchRequestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CNChangeHistoryFetchRequest.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CNChangeHistoryFetchRequest() {}
    protected CNChangeHistoryFetchRequest(Handle h, long handle) { super(h, handle); }
    protected CNChangeHistoryFetchRequest(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public CNChangeHistoryFetchRequest(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "startingToken")
    public native NSData getStartingToken();
    @Property(selector = "setStartingToken:")
    public native void setStartingToken(NSData v);
    @Property(selector = "additionalContactKeyDescriptors")
    public native NSArray<NSObject> getAdditionalContactKeyDescriptors();
    @Property(selector = "setAdditionalContactKeyDescriptors:")
    public native void setAdditionalContactKeyDescriptors(NSArray<NSObject> v);
    @Property(selector = "shouldUnifyResults")
    public native boolean shouldUnifyResults();
    @Property(selector = "setShouldUnifyResults:")
    public native void setShouldUnifyResults(boolean v);
    @Property(selector = "mutableObjects")
    public native boolean isMutableObjects();
    @Property(selector = "setMutableObjects:")
    public native void setMutableObjects(boolean v);
    @Property(selector = "includeGroupChanges")
    public native boolean isIncludeGroupChanges();
    @Property(selector = "setIncludeGroupChanges:")
    public native void setIncludeGroupChanges(boolean v);
    @Property(selector = "excludedTransactionAuthors")
    public native NSArray<NSString> getExcludedTransactionAuthors();
    @Property(selector = "setExcludedTransactionAuthors:")
    public native void setExcludedTransactionAuthors(NSArray<NSString> v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
