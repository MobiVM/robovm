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
package org.robovm.apple.corefoundation;

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
import org.robovm.apple.coreservices.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.uikit.*;
import org.robovm.apple.coretext.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("CoreFoundation") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/CFURLFileResourceType/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CFURLFileResourceType/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<CFString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/CFURLFileResourceType/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static CFURLFileResourceType toObject(Class<CFURLFileResourceType> cls, long handle, long flags) {
            CFString o = (CFString) CFType.Marshaler.toObject(CFString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return CFURLFileResourceType.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(CFURLFileResourceType o, long flags) {
            if (o == null) {
                return 0L;
            }
            return CFType.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<CFURLFileResourceType> toObject(Class<? extends CFType> cls, long handle, long flags) {
            CFArray o = (CFArray) CFType.Marshaler.toObject(CFArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<CFURLFileResourceType> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(CFURLFileResourceType.valueOf(o.get(i, CFString.class)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<CFURLFileResourceType> l, long flags) {
            if (l == null) {
                return 0L;
            }
            CFArray array = CFMutableArray.create();
            for (CFURLFileResourceType o : l) {
                array.add(o.value());
            }
            return CFType.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final CFURLFileResourceType NamedPipe = new CFURLFileResourceType("NamedPipe");
    public static final CFURLFileResourceType CharacterSpecial = new CFURLFileResourceType("CharacterSpecial");
    public static final CFURLFileResourceType Directory = new CFURLFileResourceType("Directory");
    public static final CFURLFileResourceType BlockSpecial = new CFURLFileResourceType("BlockSpecial");
    public static final CFURLFileResourceType Regular = new CFURLFileResourceType("Regular");
    public static final CFURLFileResourceType SymbolicLink = new CFURLFileResourceType("SymbolicLink");
    public static final CFURLFileResourceType Socket = new CFURLFileResourceType("Socket");
    public static final CFURLFileResourceType Unknown = new CFURLFileResourceType("Unknown");
    /*</constants>*/
    
    private static /*<name>*/CFURLFileResourceType/*</name>*/[] values = new /*<name>*/CFURLFileResourceType/*</name>*/[] {/*<value_list>*/NamedPipe, CharacterSpecial, Directory, BlockSpecial, Regular, SymbolicLink, Socket, Unknown/*</value_list>*/};
    
    /*<name>*/CFURLFileResourceType/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/CFURLFileResourceType/*</name>*/ valueOf(/*<type>*/CFString/*</type>*/ value) {
        for (/*<name>*/CFURLFileResourceType/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/CFURLFileResourceType/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("CoreFoundation") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="kCFURLFileResourceTypeNamedPipe", optional=true)
        public static native CFString NamedPipe();
        @GlobalValue(symbol="kCFURLFileResourceTypeCharacterSpecial", optional=true)
        public static native CFString CharacterSpecial();
        @GlobalValue(symbol="kCFURLFileResourceTypeDirectory", optional=true)
        public static native CFString Directory();
        @GlobalValue(symbol="kCFURLFileResourceTypeBlockSpecial", optional=true)
        public static native CFString BlockSpecial();
        @GlobalValue(symbol="kCFURLFileResourceTypeRegular", optional=true)
        public static native CFString Regular();
        @GlobalValue(symbol="kCFURLFileResourceTypeSymbolicLink", optional=true)
        public static native CFString SymbolicLink();
        @GlobalValue(symbol="kCFURLFileResourceTypeSocket", optional=true)
        public static native CFString Socket();
        @GlobalValue(symbol="kCFURLFileResourceTypeUnknown", optional=true)
        public static native CFString Unknown();
        /*</values>*/
    }
}
