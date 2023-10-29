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
package org.robovm.apple.metal;

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

/*</javadoc>*/
/*<annotations>*/@Library("Metal") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTLCompileOptions/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTLCompileOptionsPtr extends Ptr<MTLCompileOptions, MTLCompileOptionsPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTLCompileOptions.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTLCompileOptions() {}
    protected MTLCompileOptions(Handle h, long handle) { super(h, handle); }
    protected MTLCompileOptions(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "preprocessorMacros")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSDictionary.AsStringStringMapMarshaler.class) Map<String, String> getPreprocessorMacros();
    @Property(selector = "setPreprocessorMacros:")
    public native void setPreprocessorMacros(@org.robovm.rt.bro.annotation.Marshaler(NSDictionary.AsStringStringMapMarshaler.class) Map<String, String> v);
    @Property(selector = "fastMathEnabled")
    public native boolean isFastMathEnabled();
    @Property(selector = "setFastMathEnabled:")
    public native void setFastMathEnabled(boolean v);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "languageVersion")
    public native MTLLanguageVersion getLanguageVersion();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Property(selector = "setLanguageVersion:")
    public native void setLanguageVersion(MTLLanguageVersion v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "libraryType")
    public native MTLLibraryType getLibraryType();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setLibraryType:")
    public native void setLibraryType(MTLLibraryType v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "installName")
    public native String getInstallName();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setInstallName:")
    public native void setInstallName(String v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "libraries")
    public native NSArray<?> getLibraries();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setLibraries:")
    public native void setLibraries(NSArray<?> v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "preserveInvariance")
    public native boolean isPreserveInvariance();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setPreserveInvariance:")
    public native void setPreserveInvariance(boolean v);
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "optimizationLevel")
    public native MTLLibraryOptimizationLevel getOptimizationLevel();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Property(selector = "setOptimizationLevel:")
    public native void setOptimizationLevel(MTLLibraryOptimizationLevel v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "compileSymbolVisibility")
    public native MTLCompileSymbolVisibility getCompileSymbolVisibility();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setCompileSymbolVisibility:")
    public native void setCompileSymbolVisibility(MTLCompileSymbolVisibility v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "allowReferencingUndefinedSymbols")
    public native boolean isAllowReferencingUndefinedSymbols();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setAllowReferencingUndefinedSymbols:")
    public native void setAllowReferencingUndefinedSymbols(boolean v);
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "maxTotalThreadsPerThreadgroup")
    public native @MachineSizedUInt long getMaxTotalThreadsPerThreadgroup();
    /**
     * @since Available in iOS 16.4 and later.
     */
    @Property(selector = "setMaxTotalThreadsPerThreadgroup:")
    public native void setMaxTotalThreadsPerThreadgroup(@MachineSizedUInt long v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
