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
package org.robovm.apple.accessibility;

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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 26.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Accessibility") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AXBrailleTable/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSCoding/*</implements>*/ {

    /*<ptr>*/public static class AXBrailleTablePtr extends Ptr<AXBrailleTable, AXBrailleTablePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AXBrailleTable.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected AXBrailleTable() {}
    protected AXBrailleTable(Handle h, long handle) { super(h, handle); }
    protected AXBrailleTable(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithIdentifier:")
    public AXBrailleTable(String identifier) { super((SkipInit) null); initObject(init(identifier)); }
    @Method(selector = "initWithCoder:")
    public AXBrailleTable(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "identifier")
    public native String getIdentifier();
    @Property(selector = "localizedName")
    public native String getLocalizedName();
    @Property(selector = "providerIdentifier")
    public native String getProviderIdentifier();
    @Property(selector = "localizedProviderName")
    public native String getLocalizedProviderName();
    @Property(selector = "language")
    public native String getLanguage();
    @Property(selector = "locales")
    public native NSSet<NSLocale> getLocales();
    @Property(selector = "isEightDot")
    public native boolean isEightDot();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithIdentifier:")
    protected native @Pointer long init(String identifier);
    @Method(selector = "supportedLocales")
    public static native NSSet<NSLocale> supportedLocales();
    @Method(selector = "defaultTableForLocale:")
    public static native AXBrailleTable defaultTableForLocale(NSLocale locale);
    @Method(selector = "tablesForLocale:")
    public static native NSSet<AXBrailleTable> tablesForLocale(NSLocale locale);
    @Method(selector = "languageAgnosticTables")
    public static native NSSet<AXBrailleTable> languageAgnosticTables();
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
