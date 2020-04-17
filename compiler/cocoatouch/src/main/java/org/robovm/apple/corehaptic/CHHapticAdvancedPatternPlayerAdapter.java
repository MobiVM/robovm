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
/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CHHapticAdvancedPatternPlayerAdapter/*</name>*/ 
    extends /*<extends>*/CHHapticPatternPlayerAdapter/*</extends>*/ 
    /*<implements>*/implements CHHapticAdvancedPatternPlayer/*</implements>*/ {

    /*<ptr>*/
    /*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*//*</constructors>*/
    /*<properties>*/
    @NotImplemented("loopEnabled")
    public boolean isLoopEnabled() { return false; }
    @NotImplemented("setLoopEnabled:")
    public void setLoopEnabled(boolean v) {}
    @NotImplemented("loopEnd")
    public double getLoopEnd() { return 0; }
    @NotImplemented("setLoopEnd:")
    public void setLoopEnd(double v) {}
    @NotImplemented("playbackRate")
    public float getPlaybackRate() { return 0; }
    @NotImplemented("setPlaybackRate:")
    public void setPlaybackRate(float v) {}
    @NotImplemented("isMuted")
    public boolean isMuted() { return false; }
    @NotImplemented("setIsMuted:")
    public void setIsMuted(boolean v) {}
    @NotImplemented("completionHandler")
    public @Block VoidBlock1<NSError> getCompletionHandler() { return null; }
    @NotImplemented("setCompletionHandler:")
    public void setCompletionHandler(@Block VoidBlock1<NSError> v) {}
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @NotImplemented("pauseAtTime:error:")
    public boolean pause(double time, NSError.NSErrorPtr outError) { return false; }
    @NotImplemented("resumeAtTime:error:")
    public boolean resume(double time, NSError.NSErrorPtr outError) { return false; }
    @NotImplemented("seekToOffset:error:")
    public boolean seek(double offsetTime, NSError.NSErrorPtr outError) { return false; }
    /*</methods>*/
}
