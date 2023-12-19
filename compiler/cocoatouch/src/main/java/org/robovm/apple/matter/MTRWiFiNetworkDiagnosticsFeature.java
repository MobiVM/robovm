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
 * @since Available in iOS 16.4 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
public final class /*<name>*/MTRWiFiNetworkDiagnosticsFeature/*</name>*/ extends Bits</*<name>*/MTRWiFiNetworkDiagnosticsFeature/*</name>*/> {
    /*<values>*/
    public static final MTRWiFiNetworkDiagnosticsFeature None = new MTRWiFiNetworkDiagnosticsFeature(0L);
    /**
     * @since Available in iOS 16.4 and later.
     */
    public static final MTRWiFiNetworkDiagnosticsFeature PacketCounts = new MTRWiFiNetworkDiagnosticsFeature(1L);
    /**
     * @since Available in iOS 16.4 and later.
     */
    public static final MTRWiFiNetworkDiagnosticsFeature ErrorCounts = new MTRWiFiNetworkDiagnosticsFeature(2L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/MTRWiFiNetworkDiagnosticsFeature/*</name>*/[] values = _values(/*<name>*/MTRWiFiNetworkDiagnosticsFeature/*</name>*/.class);

    public /*<name>*/MTRWiFiNetworkDiagnosticsFeature/*</name>*/(long value) { super(value); }
    private /*<name>*/MTRWiFiNetworkDiagnosticsFeature/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/MTRWiFiNetworkDiagnosticsFeature/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/MTRWiFiNetworkDiagnosticsFeature/*</name>*/(value, mask);
    }
    protected /*<name>*/MTRWiFiNetworkDiagnosticsFeature/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/MTRWiFiNetworkDiagnosticsFeature/*</name>*/[] values() {
        return values.clone();
    }
}
