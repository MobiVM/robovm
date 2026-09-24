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
package org.robovm.apple.backgroundassets;

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
 * @since Available in iOS 26.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/BAAssetPackStatus/*</name>*/ extends Bits</*<name>*/BAAssetPackStatus/*</name>*/> {
    /*<values>*/
    public static final BAAssetPackStatus None = new BAAssetPackStatus(0L);
    public static final BAAssetPackStatus DownloadAvailable = new BAAssetPackStatus(1L);
    public static final BAAssetPackStatus UpdateAvailable = new BAAssetPackStatus(2L);
    public static final BAAssetPackStatus UpToDate = new BAAssetPackStatus(4L);
    public static final BAAssetPackStatus OutOfDate = new BAAssetPackStatus(8L);
    public static final BAAssetPackStatus Obsolete = new BAAssetPackStatus(16L);
    public static final BAAssetPackStatus Downloading = new BAAssetPackStatus(32L);
    public static final BAAssetPackStatus Downloaded = new BAAssetPackStatus(64L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/BAAssetPackStatus/*</name>*/[] values = _values(/*<name>*/BAAssetPackStatus/*</name>*/.class);

    public /*<name>*/BAAssetPackStatus/*</name>*/(long value) { super(value); }
    private /*<name>*/BAAssetPackStatus/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/BAAssetPackStatus/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/BAAssetPackStatus/*</name>*/(value, mask);
    }
    protected /*<name>*/BAAssetPackStatus/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/BAAssetPackStatus/*</name>*/[] values() {
        return values.clone();
    }
}
