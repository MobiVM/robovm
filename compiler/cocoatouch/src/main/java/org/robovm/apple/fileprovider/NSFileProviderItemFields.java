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
package org.robovm.apple.fileprovider;

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
import org.robovm.apple.uniformtypeid.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 16.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/NSFileProviderItemFields/*</name>*/ extends Bits</*<name>*/NSFileProviderItemFields/*</name>*/> {
    /*<values>*/
    public static final NSFileProviderItemFields None = new NSFileProviderItemFields(0L);
    public static final NSFileProviderItemFields Contents = new NSFileProviderItemFields(1L);
    public static final NSFileProviderItemFields Filename = new NSFileProviderItemFields(2L);
    public static final NSFileProviderItemFields ParentItemIdentifier = new NSFileProviderItemFields(4L);
    public static final NSFileProviderItemFields LastUsedDate = new NSFileProviderItemFields(8L);
    public static final NSFileProviderItemFields TagData = new NSFileProviderItemFields(16L);
    public static final NSFileProviderItemFields FavoriteRank = new NSFileProviderItemFields(32L);
    public static final NSFileProviderItemFields CreationDate = new NSFileProviderItemFields(64L);
    public static final NSFileProviderItemFields ContentModificationDate = new NSFileProviderItemFields(128L);
    public static final NSFileProviderItemFields FileSystemFlags = new NSFileProviderItemFields(256L);
    public static final NSFileProviderItemFields ExtendedAttributes = new NSFileProviderItemFields(512L);
    /**
     * @since Available in iOS 16.0 and later.
     */
    public static final NSFileProviderItemFields TypeAndCreator = new NSFileProviderItemFields(1024L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/NSFileProviderItemFields/*</name>*/[] values = _values(/*<name>*/NSFileProviderItemFields/*</name>*/.class);

    public /*<name>*/NSFileProviderItemFields/*</name>*/(long value) { super(value); }
    private /*<name>*/NSFileProviderItemFields/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/NSFileProviderItemFields/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/NSFileProviderItemFields/*</name>*/(value, mask);
    }
    protected /*<name>*/NSFileProviderItemFields/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/NSFileProviderItemFields/*</name>*/[] values() {
        return values.clone();
    }
}
