/* GENERATED SOURCE. DO NOT MODIFY. */
package com.android.org.bouncycastle.jcajce.util;

import java.security.Provider;
import java.security.Security;

import com.android.org.bouncycastle.jce.provider.BouncyCastleProvider;

/**
 * A JCA/JCE helper that refers to the BC provider for all it's needs.
 * @hide This class is not part of the Android public SDK API
 */
public class BCJcaJceHelper
    extends ProviderJcaJceHelper
{
    private static volatile Provider bcProvider;

    private static synchronized Provider getBouncyCastleProvider()
    {
        final Provider system = Security.getProvider("BC");
        // Avoid using the old, deprecated system BC provider on Android.
        // See: https://android-developers.googleblog.com/2018/03/cryptography-changes-in-android-p.html
        if (system instanceof BouncyCastleProvider)
        {
            return system;
        }
        else if (bcProvider != null)
        {
            return bcProvider;
        }
        else
        {
            bcProvider = new BouncyCastleProvider();

            return bcProvider;
        }
    }

    public BCJcaJceHelper()
    {
        super(getBouncyCastleProvider());
    }
}
