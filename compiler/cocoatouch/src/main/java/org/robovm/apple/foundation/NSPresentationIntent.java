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
/**
 * @since Available in iOS 15.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Foundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/NSPresentationIntent/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding/*</implements>*/ {

    /*<ptr>*/public static class NSPresentationIntentPtr extends Ptr<NSPresentationIntent, NSPresentationIntentPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(NSPresentationIntent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected NSPresentationIntent() {}
    protected NSPresentationIntent(Handle h, long handle) { super(h, handle); }
    protected NSPresentationIntent(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public NSPresentationIntent(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "intentKind")
    public native NSPresentationIntentKind getIntentKind();
    @Property(selector = "parentIntent")
    public native NSPresentationIntent getParentIntent();
    @Property(selector = "identity")
    public native @MachineSizedSInt long getIdentity();
    @Property(selector = "ordinal")
    public native @MachineSizedSInt long getOrdinal();
    @Property(selector = "columnAlignments")
    public native NSArray<NSNumber> getColumnAlignments();
    @Property(selector = "columnCount")
    public native @MachineSizedSInt long getColumnCount();
    @Property(selector = "headerLevel")
    public native @MachineSizedSInt long getHeaderLevel();
    @Property(selector = "languageHint")
    public native String getLanguageHint();
    @Property(selector = "column")
    public native @MachineSizedSInt long getColumn();
    @Property(selector = "row")
    public native @MachineSizedSInt long getRow();
    @Property(selector = "indentationLevel")
    public native @MachineSizedSInt long getIndentationLevel();
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "isEquivalentToPresentationIntent:")
    public native boolean isEquivalentToPresentationIntent(NSPresentationIntent other);
    @Method(selector = "paragraphIntentWithIdentity:nestedInsideIntent:")
    public static native NSPresentationIntent createParagraphIntent(@MachineSizedSInt long identity, NSPresentationIntent parent);
    @Method(selector = "headerIntentWithIdentity:level:nestedInsideIntent:")
    public static native NSPresentationIntent createHeaderIntent(@MachineSizedSInt long identity, @MachineSizedSInt long level, NSPresentationIntent parent);
    @Method(selector = "codeBlockIntentWithIdentity:languageHint:nestedInsideIntent:")
    public static native NSPresentationIntent createCodeBlockIntent(@MachineSizedSInt long identity, String languageHint, NSPresentationIntent parent);
    @Method(selector = "thematicBreakIntentWithIdentity:nestedInsideIntent:")
    public static native NSPresentationIntent createThematicBreakIntent(@MachineSizedSInt long identity, NSPresentationIntent parent);
    @Method(selector = "orderedListIntentWithIdentity:nestedInsideIntent:")
    public static native NSPresentationIntent createOrderedListIntent(@MachineSizedSInt long identity, NSPresentationIntent parent);
    @Method(selector = "unorderedListIntentWithIdentity:nestedInsideIntent:")
    public static native NSPresentationIntent createUnorderedListIntent(@MachineSizedSInt long identity, NSPresentationIntent parent);
    @Method(selector = "listItemIntentWithIdentity:ordinal:nestedInsideIntent:")
    public static native NSPresentationIntent createListItemIntent(@MachineSizedSInt long identity, @MachineSizedSInt long ordinal, NSPresentationIntent parent);
    @Method(selector = "blockQuoteIntentWithIdentity:nestedInsideIntent:")
    public static native NSPresentationIntent createBlockQuoteIntent(@MachineSizedSInt long identity, NSPresentationIntent parent);
    @Method(selector = "tableIntentWithIdentity:columnCount:alignments:nestedInsideIntent:")
    public static native NSPresentationIntent createTableIntent(@MachineSizedSInt long identity, @MachineSizedSInt long columnCount, NSArray<NSNumber> alignments, NSPresentationIntent parent);
    @Method(selector = "tableHeaderRowIntentWithIdentity:nestedInsideIntent:")
    public static native NSPresentationIntent createTableHeaderRowIntent(@MachineSizedSInt long identity, NSPresentationIntent parent);
    @Method(selector = "tableRowIntentWithIdentity:row:nestedInsideIntent:")
    public static native NSPresentationIntent createTableRowIntent(@MachineSizedSInt long identity, @MachineSizedSInt long row, NSPresentationIntent parent);
    @Method(selector = "tableCellIntentWithIdentity:column:nestedInsideIntent:")
    public static native NSPresentationIntent createTableCellIntent(@MachineSizedSInt long identity, @MachineSizedSInt long column, NSPresentationIntent parent);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    /*</methods>*/
}
