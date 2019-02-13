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
package org.robovm.apple.avfoundation;

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
import org.robovm.apple.corefoundation.*;
import org.robovm.apple.dispatch.*;
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.mediatoolbox.*;
import org.robovm.apple.audiotoolbox.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 8.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVAudioEngine/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    public static class Notifications {
        /**
         * @since Available in iOS 8.0 and later.
         */
        public static NSObject observeConfigurationChange(AVAudioEngine object, final VoidBlock1<AVAudioEngine> block) {
            return NSNotificationCenter.getDefaultCenter().addObserver(ConfigurationChangeNotification(), object, NSOperationQueue.getMainQueue(), new VoidBlock1<NSNotification>() {
                @Override
                public void invoke(NSNotification a) {
                    block.invoke((AVAudioEngine)a.getObject());
                }
            });
        }
    }
    
    /*<ptr>*/public static class AVAudioEnginePtr extends Ptr<AVAudioEngine, AVAudioEnginePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVAudioEngine.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVAudioEngine() {}
    protected AVAudioEngine(Handle h, long handle) { super(h, handle); }
    protected AVAudioEngine(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @WeaklyLinked
    @Property(selector = "musicSequence")
    public native MusicSequence getMusicSequence();
    @WeaklyLinked
    @Property(selector = "setMusicSequence:")
    public native void setMusicSequence(MusicSequence v);
    @Property(selector = "outputNode")
    public native AVAudioOutputNode getOutputNode();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Property(selector = "inputNode")
    public native AVAudioInputNode getInputNode();
    @Property(selector = "mainMixerNode")
    public native AVAudioMixerNode getMainMixerNode();
    @Property(selector = "isRunning")
    public native boolean isRunning();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "isAutoShutdownEnabled")
    public native boolean isAutoShutdownEnabled();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "setAutoShutdownEnabled:")
    public native void setAutoShutdownEnabled(boolean v);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "manualRenderingBlock")
    public native @Block Block3<Integer, AudioBufferList, OSStatus.OSStatusPtr, AVAudioEngineManualRenderingStatus> getManualRenderingBlock();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "isInManualRenderingMode")
    public native boolean isInManualRenderingMode();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "manualRenderingMode")
    public native AVAudioEngineManualRenderingMode getManualRenderingMode();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "manualRenderingFormat")
    public native AVAudioFormat getManualRenderingFormat();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "manualRenderingMaximumFrameCount")
    public native int getManualRenderingMaximumFrameCount();
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Property(selector = "manualRenderingSampleTime")
    public native long getManualRenderingSampleTime();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalValue(symbol="AVAudioEngineConfigurationChangeNotification", optional=true)
    public static native NSString ConfigurationChangeNotification();
    
    @Method(selector = "attachNode:")
    public native void attachNode(AVAudioNode node);
    @Method(selector = "detachNode:")
    public native void detachNode(AVAudioNode node);
    @Method(selector = "connect:to:fromBus:toBus:format:")
    public native void connect(AVAudioNode node1, AVAudioNode node2, @MachineSizedUInt long bus1, @MachineSizedUInt long bus2, AVAudioFormat format);
    @Method(selector = "connect:to:format:")
    public native void connect(AVAudioNode node1, AVAudioNode node2, AVAudioFormat format);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "connect:toConnectionPoints:fromBus:format:")
    public native void connect(AVAudioNode sourceNode, NSArray<AVAudioConnectionPoint> destNodes, @MachineSizedUInt long sourceBus, AVAudioFormat format);
    @Method(selector = "disconnectNodeInput:bus:")
    public native void disconnectNodeInput(AVAudioNode node, @MachineSizedUInt long bus);
    @Method(selector = "disconnectNodeInput:")
    public native void disconnectNodeInput(AVAudioNode node);
    @Method(selector = "disconnectNodeOutput:bus:")
    public native void disconnectNodeOutput(AVAudioNode node, @MachineSizedUInt long bus);
    @Method(selector = "disconnectNodeOutput:")
    public native void disconnectNodeOutput(AVAudioNode node);
    @Method(selector = "prepare")
    public native void prepare();
    public boolean start() throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = start(ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "startAndReturnError:")
    private native boolean start(NSError.NSErrorPtr outError);
    @Method(selector = "pause")
    public native void pause();
    @Method(selector = "reset")
    public native void reset();
    @Method(selector = "stop")
    public native void stop();
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "inputConnectionPointForNode:inputBus:")
    public native AVAudioConnectionPoint getInputConnectionPoint(AVAudioNode node, @MachineSizedUInt long bus);
    /**
     * @since Available in iOS 9.0 and later.
     */
    @Method(selector = "outputConnectionPointsForNode:outputBus:")
    public native NSArray<AVAudioConnectionPoint> getOutputConnectionPoints(AVAudioNode node, @MachineSizedUInt long bus);
    /**
     * @since Available in iOS 11.0 and later.
     */
    public boolean enableManualRenderingMode(AVAudioEngineManualRenderingMode mode, AVAudioFormat pcmFormat, int maximumFrameCount) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = enableManualRenderingMode(mode, pcmFormat, maximumFrameCount, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "enableManualRenderingMode:format:maximumFrameCount:error:")
    private native boolean enableManualRenderingMode(AVAudioEngineManualRenderingMode mode, AVAudioFormat pcmFormat, int maximumFrameCount, NSError.NSErrorPtr outError);
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "disableManualRenderingMode")
    public native void disableManualRenderingMode();
    /**
     * @since Available in iOS 11.0 and later.
     */
    public AVAudioEngineManualRenderingStatus renderOffline(int numberOfFrames, AVAudioPCMBuffer buffer) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       AVAudioEngineManualRenderingStatus result = renderOffline(numberOfFrames, buffer, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 11.0 and later.
     */
    @Method(selector = "renderOffline:toBuffer:error:")
    private native AVAudioEngineManualRenderingStatus renderOffline(int numberOfFrames, AVAudioPCMBuffer buffer, NSError.NSErrorPtr outError);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "connectMIDI:to:format:block:")
    public native void connectMIDI(AVAudioNode sourceNode, AVAudioNode destinationNode, AVAudioFormat format, @Block("(,,@MachineSizedSInt,)") Block4<AUEventSampleTime, Byte, Long, BytePtr, OSStatus> tapBlock);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "connectMIDI:toNodes:format:block:")
    public native void connectMIDI(AVAudioNode sourceNode, NSArray<AVAudioNode> destinationNodes, AVAudioFormat format, @Block("(,,@MachineSizedSInt,)") Block4<AUEventSampleTime, Byte, Long, BytePtr, OSStatus> tapBlock);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "disconnectMIDI:from:")
    public native void disconnectMIDI(AVAudioNode sourceNode, AVAudioNode destinationNode);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "disconnectMIDI:fromNodes:")
    public native void disconnectMIDI(AVAudioNode sourceNode, NSArray<AVAudioNode> destinationNodes);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "disconnectMIDIInput:")
    public native void disconnectMIDIInput(AVAudioNode node);
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Method(selector = "disconnectMIDIOutput:")
    public native void disconnectMIDIOutput(AVAudioNode node);
    /*</methods>*/
}
