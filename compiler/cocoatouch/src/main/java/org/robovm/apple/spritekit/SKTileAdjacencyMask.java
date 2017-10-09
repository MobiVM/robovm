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
package org.robovm.apple.spritekit;

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
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.glkit.*;
import org.robovm.apple.scenekit.*;
import org.robovm.apple.gameplaykit.*;
import org.robovm.apple.metal.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 10.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/SKTileAdjacencyMask/*</name>*/ extends Bits</*<name>*/SKTileAdjacencyMask/*</name>*/> {
    /*<values>*/
    public static final SKTileAdjacencyMask None = new SKTileAdjacencyMask(0L);
    public static final SKTileAdjacencyMask AdjacencyUp = new SKTileAdjacencyMask(1L);
    public static final SKTileAdjacencyMask AdjacencyUpperRight = new SKTileAdjacencyMask(2L);
    public static final SKTileAdjacencyMask AdjacencyRight = new SKTileAdjacencyMask(4L);
    public static final SKTileAdjacencyMask AdjacencyLowerRight = new SKTileAdjacencyMask(8L);
    public static final SKTileAdjacencyMask AdjacencyDown = new SKTileAdjacencyMask(16L);
    public static final SKTileAdjacencyMask AdjacencyLowerLeft = new SKTileAdjacencyMask(32L);
    public static final SKTileAdjacencyMask AdjacencyLeft = new SKTileAdjacencyMask(64L);
    public static final SKTileAdjacencyMask AdjacencyUpperLeft = new SKTileAdjacencyMask(128L);
    public static final SKTileAdjacencyMask AdjacencyAll = new SKTileAdjacencyMask(255L);
    public static final SKTileAdjacencyMask HexFlatAdjacencyUp = new SKTileAdjacencyMask(1L);
    public static final SKTileAdjacencyMask HexFlatAdjacencyUpperRight = new SKTileAdjacencyMask(2L);
    public static final SKTileAdjacencyMask HexFlatAdjacencyLowerRight = new SKTileAdjacencyMask(4L);
    public static final SKTileAdjacencyMask HexFlatAdjacencyDown = new SKTileAdjacencyMask(8L);
    public static final SKTileAdjacencyMask HexFlatAdjacencyLowerLeft = new SKTileAdjacencyMask(16L);
    public static final SKTileAdjacencyMask HexFlatAdjacencyUpperLeft = new SKTileAdjacencyMask(32L);
    public static final SKTileAdjacencyMask HexFlatAdjacencyAll = new SKTileAdjacencyMask(63L);
    public static final SKTileAdjacencyMask HexPointyAdjacencyUpperLeft = new SKTileAdjacencyMask(1L);
    public static final SKTileAdjacencyMask HexPointyAdjacencyUpperRight = new SKTileAdjacencyMask(2L);
    public static final SKTileAdjacencyMask HexPointyAdjacencyRight = new SKTileAdjacencyMask(4L);
    public static final SKTileAdjacencyMask HexPointyAdjacencyLowerRight = new SKTileAdjacencyMask(8L);
    public static final SKTileAdjacencyMask HexPointyAdjacencyLowerLeft = new SKTileAdjacencyMask(16L);
    public static final SKTileAdjacencyMask HexPointyAdjacencyLeft = new SKTileAdjacencyMask(32L);
    public static final SKTileAdjacencyMask HexPointyAdjacencyAdd = new SKTileAdjacencyMask(63L);
    public static final SKTileAdjacencyMask AdjacencyUpEdge = new SKTileAdjacencyMask(124L);
    public static final SKTileAdjacencyMask AdjacencyUpperRightEdge = new SKTileAdjacencyMask(112L);
    public static final SKTileAdjacencyMask AdjacencyRightEdge = new SKTileAdjacencyMask(241L);
    public static final SKTileAdjacencyMask AdjacencyLowerRightEdge = new SKTileAdjacencyMask(193L);
    public static final SKTileAdjacencyMask AdjacencyDownEdge = new SKTileAdjacencyMask(199L);
    public static final SKTileAdjacencyMask AdjacencyLowerLeftEdge = new SKTileAdjacencyMask(7L);
    public static final SKTileAdjacencyMask AdjacencyLeftEdge = new SKTileAdjacencyMask(31L);
    public static final SKTileAdjacencyMask AdjacencyUpperLeftEdge = new SKTileAdjacencyMask(28L);
    public static final SKTileAdjacencyMask AdjacencyUpperRightCorner = new SKTileAdjacencyMask(223L);
    public static final SKTileAdjacencyMask AdjacencyLowerRightCorner = new SKTileAdjacencyMask(127L);
    public static final SKTileAdjacencyMask AdjacencyLowerLeftCorner = new SKTileAdjacencyMask(253L);
    public static final SKTileAdjacencyMask AdjacencyUpperLeftCorner = new SKTileAdjacencyMask(247L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/SKTileAdjacencyMask/*</name>*/[] values = _values(/*<name>*/SKTileAdjacencyMask/*</name>*/.class);

    public /*<name>*/SKTileAdjacencyMask/*</name>*/(long value) { super(value); }
    private /*<name>*/SKTileAdjacencyMask/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/SKTileAdjacencyMask/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/SKTileAdjacencyMask/*</name>*/(value, mask);
    }
    protected /*<name>*/SKTileAdjacencyMask/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/SKTileAdjacencyMask/*</name>*/[] values() {
        return values.clone();
    }
}
