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
package org.robovm.apple.corespotlight;

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
import org.robovm.apple.uniformtypeid.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 16.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreSpotlight") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CSUserQueryContext/*</name>*/ 
    extends /*<extends>*/CSSearchQueryContext/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class CSUserQueryContextPtr extends Ptr<CSUserQueryContext, CSUserQueryContextPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(CSUserQueryContext.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public CSUserQueryContext() {}
    protected CSUserQueryContext(Handle h, long handle) { super(h, handle); }
    protected CSUserQueryContext(SkipInit skipInit) { super(skipInit); }
    public CSUserQueryContext(CSSuggestion currentSuggestion) { super((Handle) null, create(currentSuggestion)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "enableRankedResults")
    public native boolean isEnableRankedResults();
    @Property(selector = "setEnableRankedResults:")
    public native void setEnableRankedResults(boolean v);
    @Property(selector = "maxResultCount")
    public native @MachineSizedSInt long getMaxResultCount();
    @Property(selector = "setMaxResultCount:")
    public native void setMaxResultCount(@MachineSizedSInt long v);
    @Property(selector = "maxSuggestionCount")
    public native @MachineSizedSInt long getMaxSuggestionCount();
    @Property(selector = "setMaxSuggestionCount:")
    public native void setMaxSuggestionCount(@MachineSizedSInt long v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "userQueryContext")
    public static native CSUserQueryContext userQueryContext();
    @Method(selector = "userQueryContextWithCurrentSuggestion:")
    protected static native @Pointer long create(CSSuggestion currentSuggestion);
    /*</methods>*/
}
