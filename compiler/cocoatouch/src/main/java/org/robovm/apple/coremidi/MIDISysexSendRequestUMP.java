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
package org.robovm.apple.coremidi;

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
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MIDISysexSendRequestUMP/*</name>*/ 
    extends /*<extends>*/Struct<MIDISysexSendRequestUMP>/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MIDISysexSendRequestUMPPtr extends Ptr<MIDISysexSendRequestUMP, MIDISysexSendRequestUMPPtr> {}/*</ptr>*/
    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MIDISysexSendRequestUMP() {}
    public MIDISysexSendRequestUMP(MIDIEndpoint destination, IntPtr words, int wordsToSend, boolean complete, FunctionPtr completionProc, VoidPtr completionRefCon) {
        this.setDestination(destination);
        this.setWords(words);
        this.setWordsToSend(wordsToSend);
        this.setComplete(complete);
        this.setCompletionProc(completionProc);
        this.setCompletionRefCon(completionRefCon);
    }
    /*</constructors>*/
    /*<properties>*//*</properties>*/
    /*<members>*/
    @StructMember(0) public native MIDIEndpoint getDestination();
    @StructMember(0) public native MIDISysexSendRequestUMP setDestination(MIDIEndpoint destination);
    @StructMember(1) public native IntPtr getWords();
    @StructMember(1) public native MIDISysexSendRequestUMP setWords(IntPtr words);
    @StructMember(2) public native int getWordsToSend();
    @StructMember(2) public native MIDISysexSendRequestUMP setWordsToSend(int wordsToSend);
    @StructMember(3) public native boolean isComplete();
    @StructMember(3) public native MIDISysexSendRequestUMP setComplete(boolean complete);
    @StructMember(4) public native FunctionPtr getCompletionProc();
    @StructMember(4) public native MIDISysexSendRequestUMP setCompletionProc(FunctionPtr completionProc);
    @StructMember(5) public native VoidPtr getCompletionRefCon();
    @StructMember(5) public native MIDISysexSendRequestUMP setCompletionRefCon(VoidPtr completionRefCon);
    /*</members>*/
    /*<methods>*//*</methods>*/
}
