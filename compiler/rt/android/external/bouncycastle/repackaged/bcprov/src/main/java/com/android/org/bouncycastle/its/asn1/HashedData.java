/* GENERATED SOURCE. DO NOT MODIFY. */
package com.android.org.bouncycastle.its.asn1;

import com.android.org.bouncycastle.asn1.ASN1Choice;
import com.android.org.bouncycastle.asn1.ASN1Object;
import com.android.org.bouncycastle.asn1.ASN1OctetString;
import com.android.org.bouncycastle.asn1.ASN1Primitive;
import com.android.org.bouncycastle.asn1.DEROctetString;

/**
 * <pre>
 *     HashedData ::= CHOICE {
 *         sha256HashedData OCTET STRING (SIZE(32))
 *     }
 * </pre>
 * @hide This class is not part of the Android public SDK API
 */
public class HashedData
    extends ASN1Object
    implements ASN1Choice
{
    private ASN1OctetString hashData;

    public HashedData(byte[] digest)
    {
        this.hashData = new DEROctetString(digest);
    }

    private HashedData(ASN1OctetString hashData)
    {
        this.hashData = hashData;
    }

    public ASN1Primitive toASN1Primitive()
    {
        return hashData;
    }

    public ASN1OctetString getHashData()
    {
        return hashData;
    }

    public void setHashData(ASN1OctetString hashData)
    {
        this.hashData = hashData;
    }
}
