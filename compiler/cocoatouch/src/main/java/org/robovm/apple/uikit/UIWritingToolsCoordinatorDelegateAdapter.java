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
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIWritingToolsCoordinatorDelegateAdapter/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements UIWritingToolsCoordinatorDelegate/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("writingToolsCoordinator:requestsContextsForScope:completion:")
    public void requestsContexts(UIWritingToolsCoordinator writingToolsCoordinator, UIWritingToolsCoordinatorContextScope scope, @Block VoidBlock1<NSArray<UIWritingToolsCoordinatorContext>> completion) {}
    @NotImplemented("writingToolsCoordinator:replaceRange:inContext:proposedText:reason:animationParameters:completion:")
    public void replaceRange(UIWritingToolsCoordinator writingToolsCoordinator, @ByVal NSRange range, UIWritingToolsCoordinatorContext context, NSAttributedString replacementText, UIWritingToolsCoordinatorTextReplacementReason reason, UIWritingToolsCoordinatorAnimationParameters animationParameters, @Block VoidBlock1<NSAttributedString> completion) {}
    @NotImplemented("writingToolsCoordinator:selectRanges:inContext:completion:")
    public void selectRanges(UIWritingToolsCoordinator writingToolsCoordinator, NSArray<NSValue> ranges, UIWritingToolsCoordinatorContext context, @Block Runnable completion) {}
    @NotImplemented("writingToolsCoordinator:requestsBoundingBezierPathsForRange:inContext:completion:")
    public void requestsBoundingBezierPaths(UIWritingToolsCoordinator writingToolsCoordinator, @ByVal NSRange range, UIWritingToolsCoordinatorContext context, @Block VoidBlock1<NSArray<UIBezierPath>> completion) {}
    @NotImplemented("writingToolsCoordinator:requestsUnderlinePathsForRange:inContext:completion:")
    public void requestsUnderlinePaths(UIWritingToolsCoordinator writingToolsCoordinator, @ByVal NSRange range, UIWritingToolsCoordinatorContext context, @Block VoidBlock1<NSArray<UIBezierPath>> completion) {}
    @NotImplemented("writingToolsCoordinator:prepareForTextAnimation:forRange:inContext:completion:")
    public void prepareForTextAnimation(UIWritingToolsCoordinator writingToolsCoordinator, UIWritingToolsCoordinatorTextAnimation textAnimation, @ByVal NSRange range, UIWritingToolsCoordinatorContext context, @Block Runnable completion) {}
    @NotImplemented("writingToolsCoordinator:requestsPreviewForTextAnimation:ofRange:inContext:completion:")
    public void requestsPreviewForTextAnimation(UIWritingToolsCoordinator writingToolsCoordinator, UIWritingToolsCoordinatorTextAnimation textAnimation, @ByVal NSRange range, UIWritingToolsCoordinatorContext context, @Block VoidBlock1<UITargetedPreview> completion) {}
    @NotImplemented("writingToolsCoordinator:finishTextAnimation:forRange:inContext:completion:")
    public void finishTextAnimation(UIWritingToolsCoordinator writingToolsCoordinator, UIWritingToolsCoordinatorTextAnimation textAnimation, @ByVal NSRange range, UIWritingToolsCoordinatorContext context, @Block Runnable completion) {}
    @NotImplemented("writingToolsCoordinator:requestsSingleContainerSubrangesOfRange:inContext:completion:")
    public void requestsSingleContainerSubrangesOfRange(UIWritingToolsCoordinator writingToolsCoordinator, @ByVal NSRange range, UIWritingToolsCoordinatorContext context, @Block VoidBlock1<NSArray<NSValue>> completion) {}
    @NotImplemented("writingToolsCoordinator:requestsDecorationContainerViewForRange:inContext:completion:")
    public void requestsDecorationContainerView(UIWritingToolsCoordinator writingToolsCoordinator, @ByVal NSRange range, UIWritingToolsCoordinatorContext context, @Block VoidBlock1<UIView> completion) {}
    @NotImplemented("writingToolsCoordinator:willChangeToState:completion:")
    public void willChangeToState(UIWritingToolsCoordinator writingToolsCoordinator, UIWritingToolsCoordinatorState newState, @Block Runnable completion) {}
    /**
     * @since Available in iOS 18.2 and later.
     * @deprecated Deprecated in iOS 18.4. In iOS 18.4 and later and visionOS 2.4 and later, UIWritingToolsCoordinator automatically determines the location of the character at the specified point in your view's coordinate system and no longer calls this method.
     */
    @Deprecated
    @NotImplemented("writingToolsCoordinator:requestsRangeInContextWithIdentifierForPoint:completion:")
    public void requestsRangeInContext(UIWritingToolsCoordinator writingToolsCoordinator, @ByVal CGPoint point, @Block("(@ByVal,)") VoidBlock2<NSRange, NSUUID> completion) {}
    /*</methods>*/
}
