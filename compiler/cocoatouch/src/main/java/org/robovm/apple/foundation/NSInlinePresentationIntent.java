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
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/NSInlinePresentationIntent/*</name>*/ extends Bits</*<name>*/NSInlinePresentationIntent/*</name>*/> {
    /*<values>*/
    public static final NSInlinePresentationIntent None = new NSInlinePresentationIntent(0L);
    public static final NSInlinePresentationIntent Emphasized = new NSInlinePresentationIntent(1L);
    public static final NSInlinePresentationIntent StronglyEmphasized = new NSInlinePresentationIntent(2L);
    public static final NSInlinePresentationIntent Code = new NSInlinePresentationIntent(4L);
    public static final NSInlinePresentationIntent Strikethrough = new NSInlinePresentationIntent(32L);
    public static final NSInlinePresentationIntent SoftBreak = new NSInlinePresentationIntent(64L);
    public static final NSInlinePresentationIntent LineBreak = new NSInlinePresentationIntent(128L);
    public static final NSInlinePresentationIntent InlineHTML = new NSInlinePresentationIntent(256L);
    public static final NSInlinePresentationIntent BlockHTML = new NSInlinePresentationIntent(512L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/NSInlinePresentationIntent/*</name>*/[] values = _values(/*<name>*/NSInlinePresentationIntent/*</name>*/.class);

    public /*<name>*/NSInlinePresentationIntent/*</name>*/(long value) { super(value); }
    private /*<name>*/NSInlinePresentationIntent/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/NSInlinePresentationIntent/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/NSInlinePresentationIntent/*</name>*/(value, mask);
    }
    protected /*<name>*/NSInlinePresentationIntent/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/NSInlinePresentationIntent/*</name>*/[] values() {
        return values.clone();
    }
}
