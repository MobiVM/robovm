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
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 12.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class)/*</annotations>*/
public enum /*<name>*/INMediaItemType/*</name>*/ implements ValuedEnum {
    /*<values>*/
    Unknown(0L),
    Song(1L),
    Album(2L),
    Artist(3L),
    Genre(4L),
    Playlist(5L),
    PodcastShow(6L),
    PodcastEpisode(7L),
    PodcastPlaylist(8L),
    MusicStation(9L),
    AudioBook(10L),
    Movie(11L),
    TVShow(12L),
    TVShowEpisode(13L),
    MusicVideo(14L),
    /**
     * @since Available in iOS 13.0 and later.
     */
    PodcastStation(15L),
    /**
     * @since Available in iOS 13.0 and later.
     */
    RadioStation(16L),
    /**
     * @since Available in iOS 13.0 and later.
     */
    Station(17L),
    /**
     * @since Available in iOS 13.0 and later.
     */
    Music(18L),
    /**
     * @since Available in iOS 13.4 and later.
     */
    AlgorithmicRadioStation(19L),
    News(20L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/INMediaItemType/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/INMediaItemType/*</name>*/ valueOf(long n) {
        for (/*<name>*/INMediaItemType/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/INMediaItemType/*</name>*/.class.getName());
    }
}
