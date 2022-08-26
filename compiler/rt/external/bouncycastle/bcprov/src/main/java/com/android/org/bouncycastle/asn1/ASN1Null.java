/* GENERATED SOURCE. DO NOT MODIFY. */
/***************************************************************/
/******    DO NOT EDIT THIS CLASS bc-java SOURCE FILE     ******/
/***************************************************************/
package com.android.org.bouncycastle.asn1;

import java.io.IOException;

/**
 * A NULL object - use DERNull.INSTANCE for populating structures.
 * @hide This class is not part of the Android public SDK API
 */
@libcore.api.CorePlatformApi
public abstract class ASN1Null
    extends ASN1Primitive
{
    ASN1Null()
    {

    }

    /**
     * Return an instance of ASN.1 NULL from the passed in object.
     * <p>
     * Accepted inputs:
     * <ul>
     * <li> null &rarr; null
     * <li> {@link ASN1Null} object
     * <li> a byte[] containing ASN.1 NULL object
     * </ul>
     * </p>
     *
     * @param o object to be converted.
     * @return an instance of ASN1Null, or null.
     * @exception IllegalArgumentException if the object cannot be converted.
     */
    public static ASN1Null getInstance(Object o)
    {
        if (o instanceof ASN1Null)
        {
            return (ASN1Null)o;
        }

        if (o != null)
        {
            try
            {
                return ASN1Null.getInstance(ASN1Primitive.fromByteArray((byte[])o));
            }
            catch (IOException e)
            {
                throw new IllegalArgumentException("failed to construct NULL from byte[]: " + e.getMessage());
            }
            catch (ClassCastException e)
            {
                throw new IllegalArgumentException("unknown object in getInstance(): " + o.getClass().getName());
            }
        }

        return null;
    }

    @libcore.api.CorePlatformApi
    public int hashCode()
    {
        return -1;
    }

    boolean asn1Equals(
        ASN1Primitive o)
    {
        if (!(o instanceof ASN1Null))
        {
            return false;
        }
        
        return true;
    }

    abstract void encode(ASN1OutputStream out)
        throws IOException;

    public String toString()
    {
         return "NULL";
    }
}
