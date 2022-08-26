/* GENERATED SOURCE. DO NOT MODIFY. */
package com.android.okhttp.internal;

import java.io.IOException;
import com.android.okhttp.okio.Buffer;
import com.android.okhttp.okio.ForwardingSink;
import com.android.okhttp.okio.Sink;

/** A sink that never throws IOExceptions, even if the underlying sink does. */
class FaultHidingSink extends ForwardingSink {
  private boolean hasErrors;

  public FaultHidingSink(Sink delegate) {
    super(delegate);
  }

  @Override public void write(Buffer source, long byteCount) throws IOException {
    if (hasErrors) {
      source.skip(byteCount);
      return;
    }
    try {
      super.write(source, byteCount);
    } catch (IOException e) {
      hasErrors = true;
      onException(e);
    }
  }

  @Override public void flush() throws IOException {
    if (hasErrors) return;
    try {
      super.flush();
    } catch (IOException e) {
      hasErrors = true;
      onException(e);
    }
  }

  @Override public void close() throws IOException {
    if (hasErrors) return;
    try {
      super.close();
    } catch (IOException e) {
      hasErrors = true;
      onException(e);
    }
  }

  protected void onException(IOException e) {
  }
}
