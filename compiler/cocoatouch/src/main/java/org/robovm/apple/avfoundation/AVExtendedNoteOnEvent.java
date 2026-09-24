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
import org.robovm.apple.coremidi.*;
import org.robovm.apple.uikit.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 16.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVExtendedNoteOnEvent/*</name>*/ 
    extends /*<extends>*/AVMusicEvent/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class AVExtendedNoteOnEventPtr extends Ptr<AVExtendedNoteOnEvent, AVExtendedNoteOnEventPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(AVExtendedNoteOnEvent.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public AVExtendedNoteOnEvent() {}
    protected AVExtendedNoteOnEvent(Handle h, long handle) { super(h, handle); }
    protected AVExtendedNoteOnEvent(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithMIDINote:velocity:groupID:duration:")
    public AVExtendedNoteOnEvent(float midiNote, float velocity, int groupID, double duration) { super((SkipInit) null); initObject(init(midiNote, velocity, groupID, duration)); }
    @Method(selector = "initWithMIDINote:velocity:instrumentID:groupID:duration:")
    public AVExtendedNoteOnEvent(float midiNote, float velocity, int instrumentID, int groupID, double duration) { super((SkipInit) null); initObject(init(midiNote, velocity, instrumentID, groupID, duration)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "midiNote")
    public native float getMidiNote();
    @Property(selector = "setMidiNote:")
    public native void setMidiNote(float v);
    @Property(selector = "velocity")
    public native float getVelocity();
    @Property(selector = "setVelocity:")
    public native void setVelocity(float v);
    @Property(selector = "instrumentID")
    public native int getInstrumentID();
    @Property(selector = "setInstrumentID:")
    public native void setInstrumentID(int v);
    @Property(selector = "groupID")
    public native int getGroupID();
    @Property(selector = "setGroupID:")
    public native void setGroupID(int v);
    @Property(selector = "duration")
    public native double getDuration();
    @Property(selector = "setDuration:")
    public native void setDuration(double v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 16.0 and later.
     */
    @GlobalValue(symbol="AVExtendedNoteOnEventDefaultInstrument", optional=true)
    public static native int DefaultInstrument();
    
    @Method(selector = "initWithMIDINote:velocity:groupID:duration:")
    protected native @Pointer long init(float midiNote, float velocity, int groupID, double duration);
    @Method(selector = "initWithMIDINote:velocity:instrumentID:groupID:duration:")
    protected native @Pointer long init(float midiNote, float velocity, int instrumentID, int groupID, double duration);
    /*</methods>*/
}
