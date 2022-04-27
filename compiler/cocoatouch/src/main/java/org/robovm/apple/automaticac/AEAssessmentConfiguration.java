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
package org.robovm.apple.automaticac;

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
 * @since Available in iOS 13.4 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AutomaticAssessmentConfiguration") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AEAssessmentConfiguration/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AEAssessmentConfigurationPtr extends Ptr<AEAssessmentConfiguration, AEAssessmentConfigurationPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AEAssessmentConfiguration.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AEAssessmentConfiguration() {}
    protected AEAssessmentConfiguration(Handle h, long handle) { super(h, handle); }
    protected AEAssessmentConfiguration(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "autocorrectMode")
    public native AEAutocorrectMode getAutocorrectMode();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setAutocorrectMode:")
    public native void setAutocorrectMode(AEAutocorrectMode v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "allowsSpellCheck")
    public native boolean allowsSpellCheck();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setAllowsSpellCheck:")
    public native void setAllowsSpellCheck(boolean v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "allowsPredictiveKeyboard")
    public native boolean allowsPredictiveKeyboard();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setAllowsPredictiveKeyboard:")
    public native void setAllowsPredictiveKeyboard(boolean v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "allowsKeyboardShortcuts")
    public native boolean allowsKeyboardShortcuts();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setAllowsKeyboardShortcuts:")
    public native void setAllowsKeyboardShortcuts(boolean v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "allowsActivityContinuation")
    public native boolean allowsActivityContinuation();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setAllowsActivityContinuation:")
    public native void setAllowsActivityContinuation(boolean v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "allowsDictation")
    public native boolean allowsDictation();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setAllowsDictation:")
    public native void setAllowsDictation(boolean v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "allowsAccessibilitySpeech")
    public native boolean allowsAccessibilitySpeech();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setAllowsAccessibilitySpeech:")
    public native void setAllowsAccessibilitySpeech(boolean v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "allowsPasswordAutoFill")
    public native boolean allowsPasswordAutoFill();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setAllowsPasswordAutoFill:")
    public native void setAllowsPasswordAutoFill(boolean v);
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "allowsContinuousPathKeyboard")
    public native boolean allowsContinuousPathKeyboard();
    /**
     * @since Available in iOS 14.0 and later.
     */
    @Property(selector = "setAllowsContinuousPathKeyboard:")
    public native void setAllowsContinuousPathKeyboard(boolean v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    
    /*</methods>*/
}
