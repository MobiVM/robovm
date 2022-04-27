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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class) @Library("Photos")/*</annotations>*/
public enum /*<name>*/PHPhotosError/*</name>*/ implements NSErrorCode {
    /*<values>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    InternalError(-1L),
    /**
     * @since Available in iOS 13.0 and later.
     */
    UserCancelled(3072L),
    /**
     * @since Available in iOS 13.0 and later.
     */
    LibraryVolumeOffline(3114L),
    /**
     * @since Available in iOS 13.0 and later.
     */
    RelinquishingLibraryBundleToWriter(3142L),
    /**
     * @since Available in iOS 13.0 and later.
     */
    SwitchingSystemPhotoLibrary(3143L),
    /**
     * @since Available in iOS 14.0 and later.
     */
    NetworkAccessRequired(3164L),
    /**
     * @since Available in iOS 15.0 and later.
     */
    IdentifierNotFound(3201L),
    /**
     * @since Available in iOS 15.0 and later.
     */
    MultipleIdentifiersFound(3202L),
    /**
     * @since Available in iOS 15.0 and later.
     */
    ChangeNotSupported(3300L),
    /**
     * @since Available in iOS 15.0 and later.
     */
    OperationInterrupted(3301L),
    /**
     * @since Available in iOS 15.0 and later.
     */
    InvalidResource(3302L),
    /**
     * @since Available in iOS 15.0 and later.
     */
    MissingResource(3303L),
    /**
     * @since Available in iOS 15.0 and later.
     */
    NotEnoughSpace(3305L),
    /**
     * @since Available in iOS 15.0 and later.
     */
    RequestNotSupportedForAsset(3306L),
    /**
     * @since Available in iOS 15.0 and later.
     */
    AccessRestricted(3310L),
    /**
     * @since Available in iOS 15.0 and later.
     */
    AccessUserDenied(3311L),
    /**
     * @since Available in iOS 15.4 and later.
     */
    LibraryInFileProviderSyncRoot(5423L),
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Deprecated in iOS 15.0. Use PHPhotosErrorInternalError
     */
    @Deprecated
    Invalid(-1L);
    /*</values>*/

    /*<bind>*/static { Bro.bind(PHPhotosError.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 13.0 and later.
     */
    @GlobalValue(symbol="PHPhotosErrorDomain", optional=true)
    public static native String getClassDomain();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @GlobalValue(symbol="PHLocalIdentifiersErrorKey", optional=true)
    public static native String getLocalIdentifiersErrorKey();
    /*</methods>*/

    private final long n;

    private /*<name>*/PHPhotosError/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/PHPhotosError/*</name>*/ valueOf(long n) {
        for (/*<name>*/PHPhotosError/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in "
            + /*<name>*/PHPhotosError/*</name>*/.class.getName());
    }

    // bind wrap to include it in compilation as long as nserror enum is used 
    static { Bro.bind(NSErrorWrap.class); }
    @StronglyLinked
    public static class NSErrorWrap extends NSError {
        protected NSErrorWrap(SkipInit skipInit) {super(skipInit);}

        @Override public NSErrorCode getErrorCode() {
             try {
                 return  /*<name>*/PHPhotosError/*</name>*/.valueOf(getCode());
             } catch (IllegalArgumentException e) {
                 return null;
             }
         }

        public static String getClassDomain() {
            /** must be incerted in value section */
            return /*<name>*/PHPhotosError/*</name>*/.getClassDomain();
        }
    }
}
