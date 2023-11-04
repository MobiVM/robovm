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
package org.robovm.apple.matter;

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
import org.robovm.apple.security.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 16.1 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsShortMarshaler.class)/*</annotations>*/
public final class /*<name>*/MTRActionsCommandBits/*</name>*/ extends Bits</*<name>*/MTRActionsCommandBits/*</name>*/> {
    /*<values>*/
    public static final MTRActionsCommandBits None = new MTRActionsCommandBits(0L);
    /**
     * @since Available in iOS 16.1 and later.
     */
    public static final MTRActionsCommandBits InstantAction = new MTRActionsCommandBits(1L);
    /**
     * @since Available in iOS 16.1 and later.
     */
    public static final MTRActionsCommandBits InstantActionWithTransition = new MTRActionsCommandBits(2L);
    /**
     * @since Available in iOS 16.1 and later.
     */
    public static final MTRActionsCommandBits StartAction = new MTRActionsCommandBits(4L);
    /**
     * @since Available in iOS 16.1 and later.
     */
    public static final MTRActionsCommandBits StartActionWithDuration = new MTRActionsCommandBits(8L);
    /**
     * @since Available in iOS 16.1 and later.
     */
    public static final MTRActionsCommandBits StopAction = new MTRActionsCommandBits(16L);
    /**
     * @since Available in iOS 16.1 and later.
     */
    public static final MTRActionsCommandBits PauseAction = new MTRActionsCommandBits(32L);
    /**
     * @since Available in iOS 16.1 and later.
     */
    public static final MTRActionsCommandBits PauseActionWithDuration = new MTRActionsCommandBits(64L);
    /**
     * @since Available in iOS 16.1 and later.
     */
    public static final MTRActionsCommandBits ResumeAction = new MTRActionsCommandBits(128L);
    /**
     * @since Available in iOS 16.1 and later.
     */
    public static final MTRActionsCommandBits EnableAction = new MTRActionsCommandBits(256L);
    /**
     * @since Available in iOS 16.1 and later.
     */
    public static final MTRActionsCommandBits EnableActionWithDuration = new MTRActionsCommandBits(512L);
    /**
     * @since Available in iOS 16.1 and later.
     */
    public static final MTRActionsCommandBits DisableAction = new MTRActionsCommandBits(1024L);
    /**
     * @since Available in iOS 16.1 and later.
     */
    public static final MTRActionsCommandBits DisableActionWithDuration = new MTRActionsCommandBits(2048L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/MTRActionsCommandBits/*</name>*/[] values = _values(/*<name>*/MTRActionsCommandBits/*</name>*/.class);

    public /*<name>*/MTRActionsCommandBits/*</name>*/(long value) { super(value); }
    private /*<name>*/MTRActionsCommandBits/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/MTRActionsCommandBits/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/MTRActionsCommandBits/*</name>*/(value, mask);
    }
    protected /*<name>*/MTRActionsCommandBits/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/MTRActionsCommandBits/*</name>*/[] values() {
        return values.clone();
    }
}
