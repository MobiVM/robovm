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
package org.robovm.apple.uikit;

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
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.cloudkit.*;
import org.robovm.apple.fileprovider.*;
import org.robovm.apple.intents.*;
import org.robovm.apple.usernotifications.*;
import org.robovm.apple.linkpresentation.*;
import org.robovm.apple.symbols.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/NSCollectionLayoutVisibleItem/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol, UIDynamicItem/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    @Property(selector = "alpha")
    @MachineSizedFloat double getAlpha();
    @Property(selector = "setAlpha:")
    void setAlpha(@MachineSizedFloat double v);
    @Property(selector = "zIndex")
    @MachineSizedSInt long getZIndex();
    @Property(selector = "setZIndex:")
    void setZIndex(@MachineSizedSInt long v);
    @Property(selector = "isHidden")
    boolean isHidden();
    @Property(selector = "setHidden:")
    void setHidden(boolean v);
    @Property(selector = "center")
    @ByVal CGPoint getCenter();
    @Property(selector = "setCenter:")
    void setCenter(@ByVal CGPoint v);
    @Property(selector = "transform")
    @ByVal CGAffineTransform getTransform();
    @Property(selector = "setTransform:")
    void setTransform(@ByVal CGAffineTransform v);
    @Property(selector = "transform3D")
    @ByVal CATransform3D getTransform3D();
    @Property(selector = "setTransform3D:")
    void setTransform3D(@ByVal CATransform3D v);
    @Property(selector = "name")
    String getName();
    @Property(selector = "indexPath")
    NSIndexPath getIndexPath();
    @Property(selector = "frame")
    @ByVal CGRect getFrame();
    @Property(selector = "bounds")
    @ByVal CGRect getBounds();
    @Property(selector = "representedElementCategory")
    UICollectionElementCategory getRepresentedElementCategory();
    @Property(selector = "representedElementKind")
    String getRepresentedElementKind();
    /*</properties>*/
    /*<methods>*/
    
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
