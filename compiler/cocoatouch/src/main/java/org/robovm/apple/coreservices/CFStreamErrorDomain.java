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
package org.robovm.apple.coreservices;

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
/*<annotations>*/@Library("CFNetwork") @StronglyLinked/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/CFStreamErrorDomain/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<Integer>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/CFStreamErrorDomain/*</name>*/.class); }


    /*<constants>*/
    public static final CFStreamErrorDomain NetDB = new CFStreamErrorDomain("NetDB");
    public static final CFStreamErrorDomain SystemConfiguration = new CFStreamErrorDomain("SystemConfiguration");
    public static final CFStreamErrorDomain Mach = new CFStreamErrorDomain("Mach");
    public static final CFStreamErrorDomain NetServices = new CFStreamErrorDomain("NetServices");
    public static final CFStreamErrorDomain WinSock = new CFStreamErrorDomain("WinSock");
    public static final CFStreamErrorDomain FTP = new CFStreamErrorDomain("FTP");
    public static final CFStreamErrorDomain HTTP = new CFStreamErrorDomain("HTTP");
    /*</constants>*/
    
    private static /*<name>*/CFStreamErrorDomain/*</name>*/[] values = new /*<name>*/CFStreamErrorDomain/*</name>*/[] {/*<value_list>*/NetDB, SystemConfiguration, Mach, NetServices, WinSock, FTP, HTTP/*</value_list>*/};
    
    /*<name>*/CFStreamErrorDomain/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/CFStreamErrorDomain/*</name>*/ valueOf(/*<type>*/Integer/*</type>*/ value) {
        for (/*<name>*/CFStreamErrorDomain/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/CFStreamErrorDomain/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("CFNetwork") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="kCFStreamErrorDomainNetDB", optional=true)
        public static native int NetDB();
        @GlobalValue(symbol="kCFStreamErrorDomainSystemConfiguration", optional=true)
        public static native int SystemConfiguration();
        @GlobalValue(symbol="kCFStreamErrorDomainMach", optional=true)
        public static native int Mach();
        @GlobalValue(symbol="kCFStreamErrorDomainNetServices", optional=true)
        public static native int NetServices();
        @GlobalValue(symbol="kCFStreamErrorDomainWinSock", optional=true)
        public static native int WinSock();
        @GlobalValue(symbol="kCFStreamErrorDomainFTP", optional=true)
        public static native int FTP();
        @GlobalValue(symbol="kCFStreamErrorDomainHTTP", optional=true)
        public static native int HTTP();
        /*</values>*/
    }
}
