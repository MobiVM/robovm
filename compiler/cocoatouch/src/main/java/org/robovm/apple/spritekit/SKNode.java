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
import org.robovm.apple.coreanimation.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("SpriteKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SKNode/*</name>*/ 
    extends /*<extends>*/UIResponder/*</extends>*/ 
    /*<implements>*/implements NSSecureCoding, UIFocusItem/*</implements>*/ {

    /*<ptr>*/public static class SKNodePtr extends Ptr<SKNode, SKNodePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SKNode.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SKNode() {}
    @Deprecated protected SKNode(long handle) { super(handle); }
    protected SKNode(Handle h, long handle) { super(h, handle); }
    protected SKNode(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCoder:")
    public SKNode(NSCoder coder) { super((SkipInit) null); initObject(init(coder)); }
    public SKNode(String filename) { super((Handle) null, create(filename)); retain(getHandle()); }
    /**
     * @since Available in iOS 12.0 and later.
     */
    public SKNode(String filename, NSSet<?> classes) throws NSErrorException {
       this(filename, classes, new NSError.NSErrorPtr());
    }
    private SKNode(String filename, NSSet<?> classes, NSError.NSErrorPtr ptr) throws NSErrorException {
       super((Handle) null, create(filename, classes, ptr));
       retain(getHandle());
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
    }
    /*</constructors>*/
    public SKNode(File file) {
        this(file.getAbsolutePath());
    }
    /*<properties>*/
    @Property(selector = "frame")
    public native @ByVal CGRect getFrame();
    @Property(selector = "position")
    public native @ByVal CGPoint getPosition();
    @Property(selector = "setPosition:")
    public native void setPosition(@ByVal CGPoint v);
    @Property(selector = "zPosition")
    public native @MachineSizedFloat double getZPosition();
    @Property(selector = "setZPosition:")
    public native void setZPosition(@MachineSizedFloat double v);
    @Property(selector = "zRotation")
    public native @MachineSizedFloat double getZRotation();
    @Property(selector = "setZRotation:")
    public native void setZRotation(@MachineSizedFloat double v);
    @Property(selector = "xScale")
    public native @MachineSizedFloat double getXScale();
    @Property(selector = "setXScale:")
    public native void setXScale(@MachineSizedFloat double v);
    @Property(selector = "yScale")
    public native @MachineSizedFloat double getYScale();
    @Property(selector = "setYScale:")
    public native void setYScale(@MachineSizedFloat double v);
    @Property(selector = "speed")
    public native @MachineSizedFloat double getSpeed();
    @Property(selector = "setSpeed:")
    public native void setSpeed(@MachineSizedFloat double v);
    @Property(selector = "alpha")
    public native @MachineSizedFloat double getAlpha();
    @Property(selector = "setAlpha:")
    public native void setAlpha(@MachineSizedFloat double v);
    @Property(selector = "isPaused")
    public native boolean isPaused();
    @Property(selector = "setPaused:")
    public native void setPaused(boolean v);
    @Property(selector = "isHidden")
    public native boolean isHidden();
    @Property(selector = "setHidden:")
    public native void setHidden(boolean v);
    @Property(selector = "isUserInteractionEnabled")
    public native boolean isUserInteractionEnabled();
    @Property(selector = "setUserInteractionEnabled:")
    public native void setUserInteractionEnabled(boolean v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "focusBehavior")
    public native SKNodeFocusBehavior getFocusBehavior();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setFocusBehavior:")
    public native void setFocusBehavior(SKNodeFocusBehavior v);
    @Property(selector = "parent")
    public native SKNode getParent();
    @Property(selector = "children")
    public native NSArray<SKNode> getChildren();
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "setName:")
    public native void setName(String v);
    @Property(selector = "scene")
    public native SKScene getScene();
    @Property(selector = "physicsBody")
    public native SKPhysicsBody getPhysicsBody();
    @Property(selector = "setPhysicsBody:")
    public native void setPhysicsBody(SKPhysicsBody v);
    @Property(selector = "userData")
    public native NSMutableDictionary<?, ?> getUserData();
    @Property(selector = "setUserData:")
    public native void setUserData(NSMutableDictionary<?, ?> v);
    @Property(selector = "reachConstraints")
    public native SKReachConstraints getReachConstraints();
    @Property(selector = "setReachConstraints:")
    public native void setReachConstraints(SKReachConstraints v);
    @Property(selector = "constraints")
    public native NSArray<SKConstraint> getConstraints();
    @Property(selector = "setConstraints:")
    public native void setConstraints(NSArray<SKConstraint> v);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 10.0.
     */
    @Deprecated
    @Property(selector = "attributeValues")
    public native NSDictionary<NSString, SKAttributeValue> getAttributeValues();
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 10.0.
     */
    @Deprecated
    @Property(selector = "setAttributeValues:")
    public native void setAttributeValues(NSDictionary<NSString, SKAttributeValue> v);
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    @Property(selector = "canBecomeFocused")
    public native boolean canBecomeFocused();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "focusEffect")
    public native UIFocusEffect getFocusEffect();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "focusGroupPriority")
    public native @MachineSizedSInt long getFocusGroupPriority();
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Property(selector = "isTransparentFocusItem")
    public native boolean isTransparentFocusItem();
    @Property(selector = "preferredFocusEnvironments")
    public native @org.robovm.rt.bro.annotation.Marshaler(NSArray.AsListMarshaler.class) List<UIFocusEnvironment> getPreferredFocusEnvironments();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "parentFocusEnvironment")
    public native UIFocusEnvironment getParentFocusEnvironment();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "focusItemContainer")
    public native UIFocusItemContainer getFocusItemContainer();
    /**
     * @since Available in iOS 9.0 and later.
     * @deprecated Deprecated in iOS 10.0. Use preferredFocusEnvironments
     */
    @Deprecated
    @Property(selector = "preferredFocusedView")
    public native UIView getPreferredFocusedView();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "focusGroupIdentifier")
    public native String getFocusGroupIdentifier();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder coder);
    @Method(selector = "calculateAccumulatedFrame")
    public native @ByVal CGRect calculateAccumulatedFrame();
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 10.0.
     */
    @Deprecated
    @Method(selector = "valueForAttributeNamed:")
    public native SKAttributeValue valueForAttributeNamed(String key);
    /**
     * @since Available in iOS 10.0 and later.
     * @deprecated Deprecated in iOS 10.0.
     */
    @Deprecated
    @Method(selector = "setValue:forAttributeNamed:")
    public native void setValue(SKAttributeValue value, String key);
    @Method(selector = "setScale:")
    public native void setScale(@MachineSizedFloat double scale);
    @Method(selector = "addChild:")
    public native void addChild(SKNode node);
    @Method(selector = "insertChild:atIndex:")
    public native void insertChild(SKNode node, @MachineSizedSInt long index);
    @Method(selector = "removeChildrenInArray:")
    public native void removeChildren(NSArray<SKNode> nodes);
    @Method(selector = "removeAllChildren")
    public native void removeAllChildren();
    @Method(selector = "removeFromParent")
    public native void removeFromParent();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "moveToParent:")
    public native void moveToParent(SKNode parent);
    @Method(selector = "childNodeWithName:")
    public native SKNode getChild(String name);
    @Method(selector = "enumerateChildNodesWithName:usingBlock:")
    public native void enumerateChildNodes(String name, @Block VoidBlock2<SKNode, BooleanPtr> block);
    @Method(selector = "objectForKeyedSubscript:")
    public native NSArray<SKNode> findNodesByName(String name);
    @Method(selector = "inParentHierarchy:")
    public native boolean isInParentHierarchy(SKNode parent);
    @Method(selector = "runAction:")
    public native void runAction(SKAction action);
    @Method(selector = "runAction:completion:")
    public native void runAction(SKAction action, @Block Runnable block);
    @Method(selector = "runAction:withKey:")
    public native void runAction(SKAction action, String key);
    @Method(selector = "hasActions")
    public native boolean hasActions();
    @Method(selector = "actionForKey:")
    public native SKAction getAction(String key);
    @Method(selector = "removeActionForKey:")
    public native void removeAction(String key);
    @Method(selector = "removeAllActions")
    public native void removeAllActions();
    @Method(selector = "containsPoint:")
    public native boolean containsPoint(@ByVal CGPoint p);
    @Method(selector = "nodeAtPoint:")
    public native SKNode getNodeAtPoint(@ByVal CGPoint p);
    @Method(selector = "nodesAtPoint:")
    public native NSArray<SKNode> getNodesAtPoint(@ByVal CGPoint p);
    @Method(selector = "convertPoint:fromNode:")
    public native @ByVal CGPoint convertPointFromNode(@ByVal CGPoint point, SKNode node);
    @Method(selector = "convertPoint:toNode:")
    public native @ByVal CGPoint convertPointToNode(@ByVal CGPoint point, SKNode node);
    @Method(selector = "intersectsNode:")
    public native boolean intersectsNode(SKNode node);
    @Method(selector = "isEqualToNode:")
    public native boolean equalsTo(SKNode node);
    @Method(selector = "nodeWithFileNamed:")
    protected static native @Pointer long create(String filename);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "nodeWithFileNamed:securelyWithClasses:andError:")
    protected static native @Pointer long create(String filename, NSSet<?> classes, NSError.NSErrorPtr error);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "didHintFocusMovement:")
    public native void didHintFocusMovement(UIFocusMovementHint hint);
    @Method(selector = "setNeedsFocusUpdate")
    public native void setNeedsFocusUpdate();
    @Method(selector = "updateFocusIfNeeded")
    public native void updateFocusIfNeeded();
    @Method(selector = "shouldUpdateFocusInContext:")
    public native boolean shouldUpdateFocus(UIFocusUpdateContext context);
    @Method(selector = "didUpdateFocusInContext:withAnimationCoordinator:")
    public native void didUpdateFocus(UIFocusUpdateContext context, UIFocusAnimationCoordinator coordinator);
    /*</methods>*/
}
