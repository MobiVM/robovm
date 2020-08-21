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
package org.robovm.apple.coregraphics;

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
import org.robovm.apple.foundation.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("CoreGraphics")/*</annotations>*/
public enum /*<name>*/CGPDFTagType/*</name>*/ implements ValuedEnum {
    /*<values>*/
    Document(100L),
    Part(101L),
    Art(102L),
    Section(103L),
    Div(104L),
    BlockQuote(105L),
    Caption(106L),
    TOC(107L),
    TOCI(108L),
    Index(109L),
    NonStructure(110L),
    Private(111L),
    Paragraph(200L),
    Header(201L),
    Header1(202L),
    Header2(203L),
    Header3(204L),
    Header4(205L),
    Header5(206L),
    Header6(207L),
    List(300L),
    ListItem(301L),
    Label(302L),
    ListBody(303L),
    Table(400L),
    TableRow(401L),
    TableHeaderCell(402L),
    TableDataCell(403L),
    TableHeader(404L),
    TableBody(405L),
    TableFooter(406L),
    Span(500L),
    Quote(501L),
    Note(502L),
    Reference(503L),
    Bibliography(504L),
    Code(505L),
    Link(506L),
    Annotation(507L),
    Ruby(600L),
    RubyBaseText(601L),
    RubyAnnotationText(602L),
    RubyPunctuation(603L),
    Warichu(604L),
    WarichuText(605L),
    WarichuPunctiation(606L),
    Figure(700L),
    Formula(701L),
    Form(702L);
    /*</values>*/

    /*<bind>*/static { Bro.bind(CGPDFTagType.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    @Bridge(symbol="CGPDFTagTypeGetName", optional=true)
    public native @org.robovm.rt.bro.annotation.Marshaler(StringMarshalers.AsUtf8ZMarshaler.class) String getName();
    /*</methods>*/

    private final long n;

    private /*<name>*/CGPDFTagType/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/CGPDFTagType/*</name>*/ valueOf(long n) {
        for (/*<name>*/CGPDFTagType/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/CGPDFTagType/*</name>*/.class.getName());
    }
}
