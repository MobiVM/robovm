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
 * @since Available in iOS 18.2 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/UIWritingToolsCoordinatorDelegate/*</name>*/ 
    /*<implements>*/extends NSObjectProtocol/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "writingToolsCoordinator:requestsContextsForScope:completion:")
    void requestsContexts(UIWritingToolsCoordinator writingToolsCoordinator, UIWritingToolsCoordinatorContextScope scope, @Block VoidBlock1<NSArray<UIWritingToolsCoordinatorContext>> completion);
    @Method(selector = "writingToolsCoordinator:replaceRange:inContext:proposedText:reason:animationParameters:completion:")
    void replaceRange(UIWritingToolsCoordinator writingToolsCoordinator, @ByVal NSRange range, UIWritingToolsCoordinatorContext context, NSAttributedString replacementText, UIWritingToolsCoordinatorTextReplacementReason reason, UIWritingToolsCoordinatorAnimationParameters animationParameters, @Block VoidBlock1<NSAttributedString> completion);
    @Method(selector = "writingToolsCoordinator:selectRanges:inContext:completion:")
    void selectRanges(UIWritingToolsCoordinator writingToolsCoordinator, NSArray<NSValue> ranges, UIWritingToolsCoordinatorContext context, @Block Runnable completion);
    @Method(selector = "writingToolsCoordinator:requestsBoundingBezierPathsForRange:inContext:completion:")
    void requestsBoundingBezierPaths(UIWritingToolsCoordinator writingToolsCoordinator, @ByVal NSRange range, UIWritingToolsCoordinatorContext context, @Block VoidBlock1<NSArray<UIBezierPath>> completion);
    @Method(selector = "writingToolsCoordinator:requestsUnderlinePathsForRange:inContext:completion:")
    void requestsUnderlinePaths(UIWritingToolsCoordinator writingToolsCoordinator, @ByVal NSRange range, UIWritingToolsCoordinatorContext context, @Block VoidBlock1<NSArray<UIBezierPath>> completion);
    @Method(selector = "writingToolsCoordinator:prepareForTextAnimation:forRange:inContext:completion:")
    void prepareForTextAnimation(UIWritingToolsCoordinator writingToolsCoordinator, UIWritingToolsCoordinatorTextAnimation textAnimation, @ByVal NSRange range, UIWritingToolsCoordinatorContext context, @Block Runnable completion);
    @Method(selector = "writingToolsCoordinator:requestsPreviewForTextAnimation:ofRange:inContext:completion:")
    void requestsPreviewForTextAnimation(UIWritingToolsCoordinator writingToolsCoordinator, UIWritingToolsCoordinatorTextAnimation textAnimation, @ByVal NSRange range, UIWritingToolsCoordinatorContext context, @Block VoidBlock1<UITargetedPreview> completion);
    @Method(selector = "writingToolsCoordinator:finishTextAnimation:forRange:inContext:completion:")
    void finishTextAnimation(UIWritingToolsCoordinator writingToolsCoordinator, UIWritingToolsCoordinatorTextAnimation textAnimation, @ByVal NSRange range, UIWritingToolsCoordinatorContext context, @Block Runnable completion);
    @Method(selector = "writingToolsCoordinator:requestsSingleContainerSubrangesOfRange:inContext:completion:")
    void requestsSingleContainerSubrangesOfRange(UIWritingToolsCoordinator writingToolsCoordinator, @ByVal NSRange range, UIWritingToolsCoordinatorContext context, @Block VoidBlock1<NSArray<NSValue>> completion);
    @Method(selector = "writingToolsCoordinator:requestsDecorationContainerViewForRange:inContext:completion:")
    void requestsDecorationContainerView(UIWritingToolsCoordinator writingToolsCoordinator, @ByVal NSRange range, UIWritingToolsCoordinatorContext context, @Block VoidBlock1<UIView> completion);
    @Method(selector = "writingToolsCoordinator:willChangeToState:completion:")
    void willChangeToState(UIWritingToolsCoordinator writingToolsCoordinator, UIWritingToolsCoordinatorState newState, @Block Runnable completion);
    /**
     * @since Available in iOS 18.2 and later.
     * @deprecated Deprecated in iOS 18.4. In iOS 18.4 and later and visionOS 2.4 and later, UIWritingToolsCoordinator automatically determines the location of the character at the specified point in your view's coordinate system and no longer calls this method.
     */
    @Deprecated
    @Method(selector = "writingToolsCoordinator:requestsRangeInContextWithIdentifierForPoint:completion:")
    void requestsRangeInContext(UIWritingToolsCoordinator writingToolsCoordinator, @ByVal CGPoint point, @Block("(@ByVal,)") VoidBlock2<NSRange, NSUUID> completion);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
