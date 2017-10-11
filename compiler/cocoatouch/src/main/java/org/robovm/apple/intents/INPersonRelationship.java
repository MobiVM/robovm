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
package org.robovm.apple.intents;

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
import org.robovm.apple.eventkit.*;
import org.robovm.apple.corelocation.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("Intents")/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/INPersonRelationship/*</name>*/ 
    extends /*<extends>*/CocoaUtility/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/static { Bro.bind(INPersonRelationship.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 10.2 and later.
     */
    @GlobalValue(symbol="INPersonRelationshipFather", optional=true)
    public static native NSString Father();
    /**
     * @since Available in iOS 10.2 and later.
     */
    @GlobalValue(symbol="INPersonRelationshipMother", optional=true)
    public static native NSString Mother();
    /**
     * @since Available in iOS 10.2 and later.
     */
    @GlobalValue(symbol="INPersonRelationshipParent", optional=true)
    public static native NSString Parent();
    /**
     * @since Available in iOS 10.2 and later.
     */
    @GlobalValue(symbol="INPersonRelationshipBrother", optional=true)
    public static native NSString Brother();
    /**
     * @since Available in iOS 10.2 and later.
     */
    @GlobalValue(symbol="INPersonRelationshipSister", optional=true)
    public static native NSString Sister();
    /**
     * @since Available in iOS 10.2 and later.
     */
    @GlobalValue(symbol="INPersonRelationshipChild", optional=true)
    public static native NSString Child();
    /**
     * @since Available in iOS 10.2 and later.
     */
    @GlobalValue(symbol="INPersonRelationshipFriend", optional=true)
    public static native NSString Friend();
    /**
     * @since Available in iOS 10.2 and later.
     */
    @GlobalValue(symbol="INPersonRelationshipSpouse", optional=true)
    public static native NSString Spouse();
    /**
     * @since Available in iOS 10.2 and later.
     */
    @GlobalValue(symbol="INPersonRelationshipPartner", optional=true)
    public static native NSString Partner();
    /**
     * @since Available in iOS 10.2 and later.
     */
    @GlobalValue(symbol="INPersonRelationshipAssistant", optional=true)
    public static native NSString Assistant();
    /**
     * @since Available in iOS 10.2 and later.
     */
    @GlobalValue(symbol="INPersonRelationshipManager", optional=true)
    public static native NSString Manager();
    /*</methods>*/
}
