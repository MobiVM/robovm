/* GENERATED SOURCE. DO NOT MODIFY. */
package com.android.org.bouncycastle.jcajce.provider.asymmetric.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

import com.android.org.bouncycastle.asn1.ASN1Encodable;
import com.android.org.bouncycastle.asn1.ASN1InputStream;
import com.android.org.bouncycastle.asn1.ASN1ObjectIdentifier;
import com.android.org.bouncycastle.asn1.ASN1OutputStream;
import com.android.org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier;

/**
 * @hide This class is not part of the Android public SDK API
 */
public class PKCS12BagAttributeCarrierImpl
    implements PKCS12BagAttributeCarrier
{
    private Hashtable pkcs12Attributes;
    private Vector pkcs12Ordering;

    PKCS12BagAttributeCarrierImpl(Hashtable attributes, Vector ordering)
    {
        this.pkcs12Attributes = attributes;
        this.pkcs12Ordering = ordering;
    }

    public PKCS12BagAttributeCarrierImpl()
    {
        this(new Hashtable(), new Vector());
    }

    public void setBagAttribute(
        ASN1ObjectIdentifier oid,
        ASN1Encodable        attribute)
    {
        if (pkcs12Attributes.containsKey(oid))
        {                           // preserve original ordering
            pkcs12Attributes.put(oid, attribute);
        }
        else
        {
            pkcs12Attributes.put(oid, attribute);
            pkcs12Ordering.addElement(oid);
        }
    }

    public ASN1Encodable getBagAttribute(
        ASN1ObjectIdentifier oid)
    {
        return (ASN1Encodable)pkcs12Attributes.get(oid);
    }

    public Enumeration getBagAttributeKeys()
    {
        return pkcs12Ordering.elements();
    }

    int size()
    {
        return pkcs12Ordering.size();
    }

    Hashtable getAttributes()
    {
        return pkcs12Attributes;
    }

    Vector getOrdering()
    {
        return pkcs12Ordering;
    }

    public void writeObject(ObjectOutputStream out)
        throws IOException
    {
        if (pkcs12Ordering.size() == 0)
        {
            out.writeObject(new Hashtable());
            out.writeObject(new Vector());
        }
        else
        {
            ByteArrayOutputStream bOut = new ByteArrayOutputStream();
            ASN1OutputStream aOut = new ASN1OutputStream(bOut);

            Enumeration             e = this.getBagAttributeKeys();

            while (e.hasMoreElements())
            {
                ASN1ObjectIdentifier    oid = (ASN1ObjectIdentifier)e.nextElement();

                aOut.writeObject(oid);
                aOut.writeObject((ASN1Encodable)pkcs12Attributes.get(oid));
            }

            out.writeObject(bOut.toByteArray());
        }
    }

    public void readObject(ObjectInputStream in)
        throws IOException, ClassNotFoundException
    {
        Object obj = in.readObject();

        if (obj instanceof Hashtable)
        {
            this.pkcs12Attributes = (Hashtable)obj;
            this.pkcs12Ordering = (Vector)in.readObject();
        }
        else
        {
            ASN1InputStream aIn = new ASN1InputStream((byte[])obj);

            ASN1ObjectIdentifier    oid;

            while ((oid = (ASN1ObjectIdentifier)aIn.readObject()) != null)
            {
                this.setBagAttribute(oid, aIn.readObject());
            }
        }
    }
}
