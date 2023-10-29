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
package org.robovm.apple.photos;

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
import org.robovm.apple.uikit.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.imageio.*;
import org.robovm.apple.uniformtypeid.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 9.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/PHAssetSourceType/*</name>*/ extends Bits</*<name>*/PHAssetSourceType/*</name>*/> {
    /*<values>*/
    public static final PHAssetSourceType None = new PHAssetSourceType(0L);
    public static final PHAssetSourceType UserLibrary = new PHAssetSourceType(1L);
    public static final PHAssetSourceType CloudShared = new PHAssetSourceType(2L);
    public static final PHAssetSourceType iTunesSynced = new PHAssetSourceType(4L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/PHAssetSourceType/*</name>*/[] values = _values(/*<name>*/PHAssetSourceType/*</name>*/.class);

    public /*<name>*/PHAssetSourceType/*</name>*/(long value) { super(value); }
    private /*<name>*/PHAssetSourceType/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/PHAssetSourceType/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/PHAssetSourceType/*</name>*/(value, mask);
    }
    protected /*<name>*/PHAssetSourceType/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/PHAssetSourceType/*</name>*/[] values() {
        return values.clone();
    }
}
