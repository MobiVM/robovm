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
package org.robovm.apple.webkit;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.security.*;
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/WKAudiovisualMediaTypes/*</name>*/ extends Bits</*<name>*/WKAudiovisualMediaTypes/*</name>*/> {
    /*<values>*/
    public static final WKAudiovisualMediaTypes None = new WKAudiovisualMediaTypes(0L);
    public static final WKAudiovisualMediaTypes Audio = new WKAudiovisualMediaTypes(1L);
    public static final WKAudiovisualMediaTypes Video = new WKAudiovisualMediaTypes(2L);
    public static final WKAudiovisualMediaTypes All = new WKAudiovisualMediaTypes(Bro.IS_32BIT ? 0xffffffffL : 0xffffffffffffffffL);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/WKAudiovisualMediaTypes/*</name>*/[] values = _values(/*<name>*/WKAudiovisualMediaTypes/*</name>*/.class);

    public /*<name>*/WKAudiovisualMediaTypes/*</name>*/(long value) { super(value); }
    private /*<name>*/WKAudiovisualMediaTypes/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/WKAudiovisualMediaTypes/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/WKAudiovisualMediaTypes/*</name>*/(value, mask);
    }
    protected /*<name>*/WKAudiovisualMediaTypes/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/WKAudiovisualMediaTypes/*</name>*/[] values() {
        return values.clone();
    }
}
