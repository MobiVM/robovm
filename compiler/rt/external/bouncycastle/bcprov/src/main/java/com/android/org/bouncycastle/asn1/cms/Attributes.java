/* GENERATED SOURCE. DO NOT MODIFY. */
package com.android.org.bouncycastle.asn1.cms;

import com.android.org.bouncycastle.asn1.ASN1EncodableVector;
import com.android.org.bouncycastle.asn1.ASN1Object;
import com.android.org.bouncycastle.asn1.ASN1Primitive;
import com.android.org.bouncycastle.asn1.ASN1Set;
import com.android.org.bouncycastle.asn1.ASN1TaggedObject;
import com.android.org.bouncycastle.asn1.DLSet;

/**
 * <a href="http://tools.ietf.org/html/rfc5652">RFC 5652</a> defines
 * 5 "SET OF Attribute" entities with 5 different names.
 * This is common implementation for them all:
 * <pre>
 *   SignedAttributes      ::= SET SIZE (1..MAX) OF Attribute
 *   UnsignedAttributes    ::= SET SIZE (1..MAX) OF Attribute
 *   UnprotectedAttributes ::= SET SIZE (1..MAX) OF Attribute
 *   AuthAttributes        ::= SET SIZE (1..MAX) OF Attribute
 *   UnauthAttributes      ::= SET SIZE (1..MAX) OF Attribute
 *
 * Attributes ::=
 *   SET SIZE(1..MAX) OF Attribute
 * </pre>
 * @hide This class is not part of the Android public SDK API
 */
public class Attributes
    extends ASN1Object
{
    private ASN1Set attributes;

    private Attributes(ASN1Set set)
    {
        attributes = set;
    }

    public Attributes(ASN1EncodableVector v)
    {
        attributes = new DLSet(v);
    }

    /**
     * Return an Attribute set object from the given object.
     * <p>
     * Accepted inputs:
     * <ul>
     * <li> null &rarr; null
     * <li> {@link Attributes} object
     * <li> {@link com.android.org.bouncycastle.asn1.ASN1Set#getInstance(java.lang.Object) ASN1Set} input formats with Attributes structure inside
     * </ul>
     *
     * @param obj the object we want converted.
     * @exception IllegalArgumentException if the object cannot be converted.
     */
    public static Attributes getInstance(Object obj)
    {
        if (obj instanceof Attributes)
        {
            return (Attributes)obj;
        }
        else if (obj != null)
        {
            return new Attributes(ASN1Set.getInstance(obj));
        }

        return null;
    }

    public static Attributes getInstance(
        ASN1TaggedObject obj,
        boolean explicit)
    {
        return getInstance(ASN1Set.getInstance(obj, explicit));
    }

    public Attribute[] getAttributes()
    {
        Attribute[] rv = new Attribute[attributes.size()];

        for (int i = 0; i != rv.length; i++)
        {
            rv[i] = Attribute.getInstance(attributes.getObjectAt(i));
        }

        return rv;
    }

    /** 
     * Produce an object suitable for an ASN1OutputStream.
     */
    public ASN1Primitive toASN1Primitive()
    {
        return attributes;
    }
}
