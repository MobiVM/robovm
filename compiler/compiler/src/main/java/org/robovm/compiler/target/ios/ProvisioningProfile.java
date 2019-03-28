/*
 * Copyright (C) 2013 RoboVM AB
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/gpl-2.0.html>.
 */
package org.robovm.compiler.target.ios;

import com.dd.plist.NSArray;
import com.dd.plist.NSData;
import com.dd.plist.NSDate;
import com.dd.plist.NSDictionary;
import com.dd.plist.NSNumber;
import com.dd.plist.NSObject;
import com.dd.plist.PropertyListParser;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;
import org.bouncycastle.cms.CMSSignedData;
import org.xml.sax.SAXParseException;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Represents a provisioning profile.
 */
public class ProvisioningProfile implements Comparable<ProvisioningProfile> {
    
    public enum Type {
        Development, AppStore, AdHoc
    }
    
    private static final String HEX_DIGITS = "0123456789ABCDEF";

    private final Type type;
    private final File file;
    private final NSDictionary dict;
    private final String uuid;
    private final String name;
    private final String appIdName;
    private final String appIdPrefix;
    private final String appId;
    private final Date creationDate;
    private final Date expirationDate;
    private final NSDictionary entitlements;
    private final Set<String> certFingerprints = new TreeSet<>();
    
    ProvisioningProfile(File file, NSDictionary dict) {
        this.file = file;
        this.dict = dict;
        this.uuid = dict.objectForKey("UUID").toString();
        this.name = dict.objectForKey("Name").toString();
        this.appIdName = dict.objectForKey("AppIDName") != null 
                ? dict.objectForKey("AppIDName").toString() : null;
        this.appIdPrefix = ((NSArray) dict.objectForKey("ApplicationIdentifierPrefix"))
                .objectAtIndex(0).toString();
        this.creationDate = ((NSDate) dict.objectForKey("CreationDate")).getDate();
        this.expirationDate = ((NSDate) dict.objectForKey("ExpirationDate")).getDate();
        this.entitlements = (NSDictionary) dict.objectForKey("Entitlements");
        this.appId = this.entitlements.objectForKey("application-identifier").toString();
        
        for (NSObject o : ((NSArray) dict.objectForKey("DeveloperCertificates")).getArray()) {
            NSData data = (NSData) o;
            certFingerprints.add(getCertFingerprint(data.bytes()));
        }
        
        boolean getTaskAllow = ((NSNumber) entitlements.objectForKey("get-task-allow")).boolValue();
        NSArray provisionedDevices = (NSArray) dict.objectForKey("ProvisionedDevices");
        if (getTaskAllow) {
            type = Type.Development;
        } else if (provisionedDevices != null) {
            type = Type.AdHoc;
        } else {
            type = Type.AppStore;
        }
    }
    
    @Override
    public int compareTo(ProvisioningProfile o) {
        return this.name.compareToIgnoreCase(o.name);
    }
    
    private static String getCertFingerprint(byte[] certData) {
        try {
            CertificateFactory x509CertFact = CertificateFactory.getInstance("X.509");
            X509Certificate cert = (X509Certificate) x509CertFact.generateCertificate(new ByteArrayInputStream(certData));
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            return toHexString(md.digest(cert.getEncoded()));
        } catch (CertificateException e) {
            throw new RuntimeException(e);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
    
    private static String toHexString(byte bytes[]) {
        StringBuffer buf = new StringBuffer(bytes.length * 2);
        for (int i = 0; i < bytes.length; ++i) {
            buf.append(HEX_DIGITS.charAt((bytes[i] & 0xf0) >> 4));
            buf.append(HEX_DIGITS.charAt(bytes[i] & 0x0f));
        }
        return buf.toString();
    }
    
    public Type getType() {
        return type;
    }
    
    public File getFile() {
        return file;
    }

    public NSDictionary getDict() {
        return dict;
    }

    public String getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public String getAppIdName() {
        return appIdName;
    }

    public String getAppIdPrefix() {
        return appIdPrefix;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public NSDictionary getEntitlements() {
        return entitlements;
    }

    public Set<String> getCertFingerprints() {
        return certFingerprints;
    }

    private static ProvisioningProfile create(File file) {
        InputStream in = null;
        try {
            in = new BufferedInputStream(new FileInputStream(file));
            CMSSignedData data = new CMSSignedData(in);
            byte[] content = (byte[]) data.getSignedContent().getContent();
            NSDictionary dict;
            try {
                dict = (NSDictionary) PropertyListParser.parse(content);
            } catch (SAXParseException ignored) {
                // try to parse it by dropping restricted characters
                dict = (NSDictionary) PropertyListParser.parse(fixInvalidXmlChars(content));
            }
            return new ProvisioningProfile(file, dict);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            IOUtils.closeQuietly(in);
        }
    }
    
    public static List<ProvisioningProfile> list() {
        File dir = new File(new File(System.getProperty("user.home")), "Library/MobileDevice/Provisioning Profiles");
        if (!dir.exists() || !dir.isDirectory()) {
            return Collections.emptyList();
        }
        List<ProvisioningProfile> result = new ArrayList<ProvisioningProfile>();
        for (File f : dir.listFiles()) {
            if (f.getName().endsWith(".mobileprovision")) {
                try {
                    // it was wrapped in try-catch instead of just returning null by purpose. With idea to provide information
                    // about corrupted file to user.
                    ProvisioningProfile p = create(f);
                    if (p.expirationDate.after(new Date())) {
                        result.add(p);
                    }
                } catch (Exception ignored) {
                    // TODO: here we should do something about broken profile -- either create object marked as broken or log error
                }
            }
        }
        Collections.sort(result);
        return result;
    }

    public static ProvisioningProfile find(List<ProvisioningProfile> profiles, String search) {
        for (ProvisioningProfile p : profiles) {
            if (p.uuid.equals(search) || p.appIdPrefix.equals(search) || p.appIdName != null && p.appIdName.equals(search)
                    || p.name.equals(search)) {
                return p;
            }
        }        
        throw new IllegalArgumentException("No provisioning profile found matching '" + search + "'");
    }
    
    public static ProvisioningProfile find(List<ProvisioningProfile> profiles, SigningIdentity signingIdentity, String bundleId) {
        Pair<SigningIdentity, ProvisioningProfile> pair = find(profiles, Collections.singletonList(signingIdentity), bundleId, true);
        return pair.getRight();
    }


    public static Pair<SigningIdentity, ProvisioningProfile> find(List<ProvisioningProfile> profiles, List<SigningIdentity> identities,
                                                                   String bundleId) {
        return find(profiles, identities, bundleId, false);
    }

    private static Pair<SigningIdentity, ProvisioningProfile> find(List<ProvisioningProfile> profiles, List<SigningIdentity> identities,
                                                                   String bundleId, boolean exactIdentityMatch) {
        // get list of all available fingerprints into set for simple intersection match
        Set<String> knownFingerprints = new HashSet<>();
        for (SigningIdentity i : identities)
            knownFingerprints.add(i.getFingerprint());

        // looking for both direct and wildcard matches
        ProvisioningProfile longestWildCard = null;
        ProvisioningProfile exactProfile = null;

        // Try a direct match first
        for (ProvisioningProfile p : profiles) {
            String bundleIdWithPrefix = p.appIdPrefix + "." + bundleId;
            if (p.appId.equals(bundleIdWithPrefix)) {
                if(!Collections.disjoint(knownFingerprints, p.certFingerprints)) {
                    exactProfile = p;
                    break;
                }
            } else if (p.appId.endsWith(".*") && (longestWildCard == null || p.appId.length() > longestWildCard.appId.length()) &&
                    bundleIdWithPrefix.startsWith(p.appId.substring(0, p.appId.length() - 1))) {
                // its wildcard, and it longer than last found one (if any), and it (without * but with .) matches bundleId
                // check for certificate
                if(!Collections.disjoint(knownFingerprints, p.certFingerprints)) {
                    longestWildCard = p;
                }
            }
        }

        if (exactProfile == null)
            exactProfile = longestWildCard;
        if (exactProfile == null) {
            if (exactIdentityMatch) {
                // it was called for very specific identity and not for list with one item
                throw new IllegalArgumentException("No provisioning profile found "
                        + "matching signing identity '" + identities.get(0).getName()
                        + "' and app bundle ID '" + bundleId + "'");
            } else {
                throw new IllegalArgumentException("No provisioning profile and signing identity found that matches bundle ID '" + bundleId + "'");
            }
        }

        // now find identity that matches the profile
        for (SigningIdentity identity : identities) {
            if (exactProfile.certFingerprints.contains(identity.getFingerprint()))
                return new ImmutablePair<>(identity, exactProfile);
        }

        throw new Error("Shell never happen");
    }

    private static byte[] fixInvalidXmlChars(byte[] content) {
        // this supposed to fix invalid characters that sometimes are found in xml extracted from plist.
        // apple's parser handles them without issue but PropertyListParser will fails with SAXParserException
        // as XML is broken, check https://www.w3.org/TR/xml11/#NT-Char for restricted char list
        boolean broken = false;
        String str = new String(content);
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c >= 0x01 && c <= 0x8 || c == 0x0b || c == 0x0c || c >= 0x0e && c <= 0x1f || c >= 0x7f && c <=0x84 || c >= 0x86 && c <= 0x9f) {
                broken = true;
            } else {
                sb.append(c);
            }
        }

        if (broken)
            return sb.toString().getBytes();
        else
            return content;
    }

    @Override
    public String toString() {
        return "ProvisioningProfile [type=" + type + ", file=" + file
                + ", uuid=" + uuid + ", name=" + name + ", appIdName="
                + appIdName + ", appIdPrefix=" + appIdPrefix + ", appId="
                + appId + ", creationDate=" + creationDate
                + ", expirationDate=" + expirationDate + ", certFingerprints="
                + certFingerprints + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((uuid == null) ? 0 : uuid.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ProvisioningProfile other = (ProvisioningProfile) obj;
        if (uuid == null) {
            if (other.uuid != null)
                return false;
        } else if (!uuid.equals(other.uuid))
            return false;
        return true;
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println(list());
        } else if (args.length == 1) {
            System.out.println(find(list(), args[0]));
        } else {
            System.out.println(find(list(), SigningIdentity.find(SigningIdentity.list(), args[0]), args[1]));
        }
    }
}
