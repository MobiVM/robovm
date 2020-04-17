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
package org.robovm.apple.security;

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
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("Security") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/SecAttrProtocol/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SecAttrProtocol/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<CFType>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/SecAttrProtocol/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static SecAttrProtocol toObject(Class<SecAttrProtocol> cls, long handle, long flags) {
            CFType o = (CFType) CFType.Marshaler.toObject(CFType.class, handle, flags);
            if (o == null) {
                return null;
            }
            return SecAttrProtocol.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(SecAttrProtocol o, long flags) {
            if (o == null) {
                return 0L;
            }
            return CFType.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @MarshalsPointer
        public static List<SecAttrProtocol> toObject(Class<? extends CFType> cls, long handle, long flags) {
            CFArray o = (CFArray) CFType.Marshaler.toObject(CFArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<SecAttrProtocol> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(SecAttrProtocol.valueOf(o.get(i, CFType.class)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<SecAttrProtocol> l, long flags) {
            if (l == null) {
                return 0L;
            }
            CFArray array = CFMutableArray.create();
            for (SecAttrProtocol o : l) {
                array.add(o.value());
            }
            return CFType.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    public static final SecAttrProtocol FTP = new SecAttrProtocol("FTP");
    public static final SecAttrProtocol FTPAccount = new SecAttrProtocol("FTPAccount");
    public static final SecAttrProtocol HTTP = new SecAttrProtocol("HTTP");
    public static final SecAttrProtocol IRC = new SecAttrProtocol("IRC");
    public static final SecAttrProtocol NNTP = new SecAttrProtocol("NNTP");
    public static final SecAttrProtocol POP3 = new SecAttrProtocol("POP3");
    public static final SecAttrProtocol SMTP = new SecAttrProtocol("SMTP");
    public static final SecAttrProtocol SOCKS = new SecAttrProtocol("SOCKS");
    public static final SecAttrProtocol IMAP = new SecAttrProtocol("IMAP");
    public static final SecAttrProtocol LDAP = new SecAttrProtocol("LDAP");
    public static final SecAttrProtocol AppleTalk = new SecAttrProtocol("AppleTalk");
    public static final SecAttrProtocol AFP = new SecAttrProtocol("AFP");
    public static final SecAttrProtocol Telnet = new SecAttrProtocol("Telnet");
    public static final SecAttrProtocol SSH = new SecAttrProtocol("SSH");
    public static final SecAttrProtocol FTPS = new SecAttrProtocol("FTPS");
    public static final SecAttrProtocol HTTPS = new SecAttrProtocol("HTTPS");
    public static final SecAttrProtocol HTTPProxy = new SecAttrProtocol("HTTPProxy");
    public static final SecAttrProtocol HTTPSProxy = new SecAttrProtocol("HTTPSProxy");
    public static final SecAttrProtocol FTPProxy = new SecAttrProtocol("FTPProxy");
    public static final SecAttrProtocol SMB = new SecAttrProtocol("SMB");
    public static final SecAttrProtocol RTSP = new SecAttrProtocol("RTSP");
    public static final SecAttrProtocol RTSPProxy = new SecAttrProtocol("RTSPProxy");
    public static final SecAttrProtocol DAAP = new SecAttrProtocol("DAAP");
    public static final SecAttrProtocol EPPC = new SecAttrProtocol("EPPC");
    public static final SecAttrProtocol IPP = new SecAttrProtocol("IPP");
    public static final SecAttrProtocol NNTPS = new SecAttrProtocol("NNTPS");
    public static final SecAttrProtocol LDAPS = new SecAttrProtocol("LDAPS");
    public static final SecAttrProtocol TelnetS = new SecAttrProtocol("TelnetS");
    public static final SecAttrProtocol IMAPS = new SecAttrProtocol("IMAPS");
    public static final SecAttrProtocol IRCS = new SecAttrProtocol("IRCS");
    public static final SecAttrProtocol POP3S = new SecAttrProtocol("POP3S");
    /*</constants>*/
    
    private static /*<name>*/SecAttrProtocol/*</name>*/[] values = new /*<name>*/SecAttrProtocol/*</name>*/[] {/*<value_list>*/FTP, FTPAccount, HTTP, IRC, NNTP, POP3, SMTP, SOCKS, IMAP, LDAP, AppleTalk, AFP, Telnet, SSH, FTPS, HTTPS, HTTPProxy, HTTPSProxy, FTPProxy, SMB, RTSP, RTSPProxy, DAAP, EPPC, IPP, NNTPS, LDAPS, TelnetS, IMAPS, IRCS, POP3S/*</value_list>*/};
    
    /*<name>*/SecAttrProtocol/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/SecAttrProtocol/*</name>*/ valueOf(/*<type>*/CFType/*</type>*/ value) {
        for (/*<name>*/SecAttrProtocol/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/SecAttrProtocol/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("Security") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        @GlobalValue(symbol="kSecAttrProtocolFTP", optional=true)
        public static native CFType FTP();
        @GlobalValue(symbol="kSecAttrProtocolFTPAccount", optional=true)
        public static native CFType FTPAccount();
        @GlobalValue(symbol="kSecAttrProtocolHTTP", optional=true)
        public static native CFType HTTP();
        @GlobalValue(symbol="kSecAttrProtocolIRC", optional=true)
        public static native CFType IRC();
        @GlobalValue(symbol="kSecAttrProtocolNNTP", optional=true)
        public static native CFType NNTP();
        @GlobalValue(symbol="kSecAttrProtocolPOP3", optional=true)
        public static native CFType POP3();
        @GlobalValue(symbol="kSecAttrProtocolSMTP", optional=true)
        public static native CFType SMTP();
        @GlobalValue(symbol="kSecAttrProtocolSOCKS", optional=true)
        public static native CFType SOCKS();
        @GlobalValue(symbol="kSecAttrProtocolIMAP", optional=true)
        public static native CFType IMAP();
        @GlobalValue(symbol="kSecAttrProtocolLDAP", optional=true)
        public static native CFType LDAP();
        @GlobalValue(symbol="kSecAttrProtocolAppleTalk", optional=true)
        public static native CFType AppleTalk();
        @GlobalValue(symbol="kSecAttrProtocolAFP", optional=true)
        public static native CFType AFP();
        @GlobalValue(symbol="kSecAttrProtocolTelnet", optional=true)
        public static native CFType Telnet();
        @GlobalValue(symbol="kSecAttrProtocolSSH", optional=true)
        public static native CFType SSH();
        @GlobalValue(symbol="kSecAttrProtocolFTPS", optional=true)
        public static native CFType FTPS();
        @GlobalValue(symbol="kSecAttrProtocolHTTPS", optional=true)
        public static native CFType HTTPS();
        @GlobalValue(symbol="kSecAttrProtocolHTTPProxy", optional=true)
        public static native CFType HTTPProxy();
        @GlobalValue(symbol="kSecAttrProtocolHTTPSProxy", optional=true)
        public static native CFType HTTPSProxy();
        @GlobalValue(symbol="kSecAttrProtocolFTPProxy", optional=true)
        public static native CFType FTPProxy();
        @GlobalValue(symbol="kSecAttrProtocolSMB", optional=true)
        public static native CFType SMB();
        @GlobalValue(symbol="kSecAttrProtocolRTSP", optional=true)
        public static native CFType RTSP();
        @GlobalValue(symbol="kSecAttrProtocolRTSPProxy", optional=true)
        public static native CFType RTSPProxy();
        @GlobalValue(symbol="kSecAttrProtocolDAAP", optional=true)
        public static native CFType DAAP();
        @GlobalValue(symbol="kSecAttrProtocolEPPC", optional=true)
        public static native CFType EPPC();
        @GlobalValue(symbol="kSecAttrProtocolIPP", optional=true)
        public static native CFType IPP();
        @GlobalValue(symbol="kSecAttrProtocolNNTPS", optional=true)
        public static native CFType NNTPS();
        @GlobalValue(symbol="kSecAttrProtocolLDAPS", optional=true)
        public static native CFType LDAPS();
        @GlobalValue(symbol="kSecAttrProtocolTelnetS", optional=true)
        public static native CFType TelnetS();
        @GlobalValue(symbol="kSecAttrProtocolIMAPS", optional=true)
        public static native CFType IMAPS();
        @GlobalValue(symbol="kSecAttrProtocolIRCS", optional=true)
        public static native CFType IRCS();
        @GlobalValue(symbol="kSecAttrProtocolPOP3S", optional=true)
        public static native CFType POP3S();
        /*</values>*/
    }
}
