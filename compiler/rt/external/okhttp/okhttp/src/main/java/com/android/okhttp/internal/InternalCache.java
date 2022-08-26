/* GENERATED SOURCE. DO NOT MODIFY. */
/*
 * Copyright (C) 2013 Square, Inc.
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
package com.android.okhttp.internal;

import com.android.okhttp.Request;
import com.android.okhttp.Response;
import com.android.okhttp.internal.http.CacheRequest;
import com.android.okhttp.internal.http.CacheStrategy;
import java.io.IOException;

/**
 * OkHttp's internal cache interface. Applications shouldn't implement this:
 * instead use {@link com.android.okhttp.Cache}.
 * @hide This class is not part of the Android public SDK API
 */
public interface InternalCache {
  Response get(Request request) throws IOException;

  CacheRequest put(Response response) throws IOException;

  /**
   * Remove any cache entries for the supplied {@code request}. This is invoked
   * when the client invalidates the cache, such as when making POST requests.
   */
  void remove(Request request) throws IOException;

  /**
   * Handles a conditional request hit by updating the stored cache response
   * with the headers from {@code network}. The cached response body is not
   * updated. If the stored response has changed since {@code cached} was
   * returned, this does nothing.
   */
  void update(Response cached, Response network) throws IOException;

  /** Track an conditional GET that was satisfied by this cache. */
  void trackConditionalCacheHit();

  /** Track an HTTP response being satisfied with {@code cacheStrategy}. */
  void trackResponse(CacheStrategy cacheStrategy);
}
