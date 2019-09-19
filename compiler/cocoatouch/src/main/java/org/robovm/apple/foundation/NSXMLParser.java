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
package org.robovm.apple.foundation;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.security.*;
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("Foundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSXMLParser/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class NSXMLParserPtr extends Ptr<NSXMLParser, NSXMLParserPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSXMLParser.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public NSXMLParser() {}
    protected NSXMLParser(Handle h, long handle) { super(h, handle); }
    protected NSXMLParser(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithContentsOfURL:")
    public NSXMLParser(NSURL url) { super((SkipInit) null); initObject(init(url)); }
    @Method(selector = "initWithData:")
    public NSXMLParser(NSData data) { super((SkipInit) null); initObject(init(data)); }
    @Method(selector = "initWithStream:")
    public NSXMLParser(NSInputStream stream) { super((SkipInit) null); initObject(init(stream)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native NSXMLParserDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(NSXMLParserDelegate v);
    @Property(selector = "shouldProcessNamespaces")
    public native boolean shouldProcessNamespaces();
    @Property(selector = "setShouldProcessNamespaces:")
    public native void setShouldProcessNamespaces(boolean v);
    @Property(selector = "shouldReportNamespacePrefixes")
    public native boolean shouldReportNamespacePrefixes();
    @Property(selector = "setShouldReportNamespacePrefixes:")
    public native void setShouldReportNamespacePrefixes(boolean v);
    @Property(selector = "externalEntityResolvingPolicy")
    public native NSXMLParserExternalEntityResolvingPolicy getExternalEntityResolvingPolicy();
    @Property(selector = "setExternalEntityResolvingPolicy:")
    public native void setExternalEntityResolvingPolicy(NSXMLParserExternalEntityResolvingPolicy v);
    @Property(selector = "allowedExternalEntityURLs")
    public native NSSet<NSURL> getAllowedExternalEntityURLs();
    @Property(selector = "setAllowedExternalEntityURLs:")
    public native void setAllowedExternalEntityURLs(NSSet<NSURL> v);
    @Property(selector = "parserError")
    public native NSError getParserError();
    @Property(selector = "shouldResolveExternalEntities")
    public native boolean shouldResolveExternalEntities();
    @Property(selector = "setShouldResolveExternalEntities:")
    public native void setShouldResolveExternalEntities(boolean v);
    @Property(selector = "publicID")
    public native String getPublicID();
    @Property(selector = "systemID")
    public native String getSystemID();
    @Property(selector = "lineNumber")
    public native @MachineSizedSInt long getLineNumber();
    @Property(selector = "columnNumber")
    public native @MachineSizedSInt long getColumnNumber();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithContentsOfURL:")
    protected native @Pointer long init(NSURL url);
    @Method(selector = "initWithData:")
    protected native @Pointer long init(NSData data);
    @Method(selector = "initWithStream:")
    protected native @Pointer long init(NSInputStream stream);
    @Method(selector = "parse")
    public native boolean parse();
    @Method(selector = "abortParsing")
    public native void abortParsing();
    /*</methods>*/
}
