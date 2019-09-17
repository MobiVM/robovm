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
package org.robovm.apple.corehaptic;

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
import org.robovm.apple.avfoundation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/CHHapticAdvancedPatternPlayer/*</name>*/ 
    /*<implements>*/extends CHHapticPatternPlayer/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    @Property(selector = "loopEnabled")
    boolean isLoopEnabled();
    @Property(selector = "setLoopEnabled:")
    void setLoopEnabled(boolean v);
    @Property(selector = "loopEnd")
    double getLoopEnd();
    @Property(selector = "setLoopEnd:")
    void setLoopEnd(double v);
    @Property(selector = "playbackRate")
    float getPlaybackRate();
    @Property(selector = "setPlaybackRate:")
    void setPlaybackRate(float v);
    @Property(selector = "isMuted")
    boolean isMuted();
    @Property(selector = "setIsMuted:")
    void setIsMuted(boolean v);
    @Property(selector = "completionHandler")
    @Block VoidBlock1<NSError> getCompletionHandler();
    @Property(selector = "setCompletionHandler:")
    void setCompletionHandler(@Block VoidBlock1<NSError> v);
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "pauseAtTime:error:")
    boolean pause(double time, NSError.NSErrorPtr outError);
    @Method(selector = "resumeAtTime:error:")
    boolean resume(double time, NSError.NSErrorPtr outError);
    @Method(selector = "seekToOffset:error:")
    boolean seek(double offsetTime, NSError.NSErrorPtr outError);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
