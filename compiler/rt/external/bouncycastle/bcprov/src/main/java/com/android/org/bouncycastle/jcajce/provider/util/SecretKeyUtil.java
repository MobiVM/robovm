/* GENERATED SOURCE. DO NOT MODIFY. */
package com.android.org.bouncycastle.jcajce.provider.util;

import java.util.HashMap;
import java.util.Map;

import com.android.org.bouncycastle.asn1.ASN1ObjectIdentifier;
import com.android.org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import com.android.org.bouncycastle.asn1.ntt.NTTObjectIdentifiers;
import com.android.org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import com.android.org.bouncycastle.util.Integers;

/**
 * @hide This class is not part of the Android public SDK API
 */
public class SecretKeyUtil
{
    private static Map keySizes = new HashMap();

    static
    {
        keySizes.put(PKCSObjectIdentifiers.des_EDE3_CBC.getId(), Integers.valueOf(192));

        keySizes.put(NISTObjectIdentifiers.id_aes128_CBC, Integers.valueOf(128));
        keySizes.put(NISTObjectIdentifiers.id_aes192_CBC, Integers.valueOf(192));
        keySizes.put(NISTObjectIdentifiers.id_aes256_CBC, Integers.valueOf(256));

        keySizes.put(NTTObjectIdentifiers.id_camellia128_cbc, Integers.valueOf(128));
        keySizes.put(NTTObjectIdentifiers.id_camellia192_cbc, Integers.valueOf(192));
        keySizes.put(NTTObjectIdentifiers.id_camellia256_cbc, Integers.valueOf(256));
    }

    public static int getKeySize(ASN1ObjectIdentifier oid)
    {
        Integer size = (Integer)keySizes.get(oid);

        if (size != null)
        {
            return size.intValue();
        }

        return -1;
    }
}
