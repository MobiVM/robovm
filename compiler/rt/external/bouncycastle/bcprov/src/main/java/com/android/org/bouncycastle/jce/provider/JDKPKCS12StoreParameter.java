/* GENERATED SOURCE. DO NOT MODIFY. */
package com.android.org.bouncycastle.jce.provider;

import java.io.OutputStream;
import java.security.KeyStore;
import java.security.KeyStore.LoadStoreParameter;
import java.security.KeyStore.ProtectionParameter;

/**
 * @deprecated use org.bouncycastle.jcajce.config.PKCS12StoreParameter
 * @hide This class is not part of the Android public SDK API
 */
public class JDKPKCS12StoreParameter implements LoadStoreParameter
{
    private OutputStream outputStream;
    private ProtectionParameter protectionParameter;
    private boolean useDEREncoding;

    public OutputStream getOutputStream()
    {
        return outputStream;
    }

    public ProtectionParameter getProtectionParameter()
    {
        return protectionParameter;
    }

    public boolean isUseDEREncoding()
    {
        return useDEREncoding;
    }

    public void setOutputStream(OutputStream outputStream)
    {
        this.outputStream = outputStream;
    }

    public void setPassword(char[] password)
    {
        this.protectionParameter = new KeyStore.PasswordProtection(password);
    }

    public void setProtectionParameter(ProtectionParameter protectionParameter)
    {
        this.protectionParameter = protectionParameter;
    }

    public void setUseDEREncoding(boolean useDEREncoding)
    {
        this.useDEREncoding = useDEREncoding;
    }
}
