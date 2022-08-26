// Copyright (c) 2017, Google Inc.
//
// Permission to use, copy, modify, and/or distribute this software for any
// purpose with or without fee is hereby granted, provided that the above
// copyright notice and this permission notice appear in all copies.
//
// THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES
// WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
// MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY
// SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
// WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN ACTION
// OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF OR IN
// CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE. */

#include <openssl/cipher.h>

#include <gtest/gtest.h>

#include "../../crypto/internal.h"
#include "../../crypto/test/test_util.h"


struct CFBTestCase {
  uint8_t key[16];
  uint8_t iv[16];
  uint8_t plaintext[16*4];
  uint8_t ciphertext[16*4];
};

static const CFBTestCase kCFBTestCases[] = {
  {
    // This is the test case from
    // http://nvlpubs.nist.gov/nistpubs/Legacy/SP/nistspecialpublication800-38a.pdf,
    // section F.3.13.
    {0x2b, 0x7e, 0x15, 0x16, 0x28, 0xae, 0xd2, 0xa6, 0xab, 0xf7, 0x15, 0x88, 0x09, 0xcf, 0x4f, 0x3c},
    {0x00, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0a, 0x0b, 0x0c, 0x0d, 0x0e, 0x0f},
    {0x6b, 0xc1, 0xbe, 0xe2, 0x2e, 0x40, 0x9f, 0x96, 0xe9, 0x3d, 0x7e, 0x11, 0x73, 0x93, 0x17, 0x2a,
     0xae, 0x2d, 0x8a, 0x57, 0x1e, 0x03, 0xac, 0x9c, 0x9e, 0xb7, 0x6f, 0xac, 0x45, 0xaf, 0x8e, 0x51,
     0x30, 0xc8, 0x1c, 0x46, 0xa3, 0x5c, 0xe4, 0x11, 0xe5, 0xfb, 0xc1, 0x19, 0x1a, 0x0a, 0x52, 0xef,
     0xf6, 0x9f, 0x24, 0x45, 0xdf, 0x4f, 0x9b, 0x17, 0xad, 0x2b, 0x41, 0x7b, 0xe6, 0x6c, 0x37, 0x10},
    {0x3b, 0x3f, 0xd9, 0x2e, 0xb7, 0x2d, 0xad, 0x20, 0x33, 0x34, 0x49, 0xf8, 0xe8, 0x3c, 0xfb, 0x4a,
     0xc8, 0xa6, 0x45, 0x37, 0xa0, 0xb3, 0xa9, 0x3f, 0xcd, 0xe3, 0xcd, 0xad, 0x9f, 0x1c, 0xe5, 0x8b,
     0x26, 0x75, 0x1f, 0x67, 0xa3, 0xcb, 0xb1, 0x40, 0xb1, 0x80, 0x8c, 0xf1, 0x87, 0xa4, 0xf4, 0xdf,
     0xc0, 0x4b, 0x05, 0x35, 0x7c, 0x5d, 0x1c, 0x0e, 0xea, 0xc4, 0xc6, 0x6f, 0x9f, 0xf7, 0xf2, 0xe6},
  },
};

TEST(CFBTest, TestVectors) {
  unsigned test_num = 0;
  for (const auto &test : kCFBTestCases) {
    test_num++;
    SCOPED_TRACE(test_num);

    const size_t input_len = sizeof(test.plaintext);
    std::unique_ptr<uint8_t[]> out(new uint8_t[input_len]);

    for (size_t stride = 1; stride <= input_len; stride++) {
      bssl::ScopedEVP_CIPHER_CTX ctx;
      ASSERT_TRUE(EVP_EncryptInit_ex(ctx.get(), EVP_aes_128_cfb128(), nullptr,
                                     test.key, test.iv));

      size_t done = 0;
      while (done < input_len) {
        size_t todo = stride;
        if (todo > input_len - done) {
          todo = input_len - done;
        }

        int out_bytes;
        ASSERT_TRUE(EVP_EncryptUpdate(ctx.get(), out.get() + done, &out_bytes,
                                      test.plaintext + done, todo));
        ASSERT_EQ(static_cast<size_t>(out_bytes), todo);

        done += todo;
      }

      EXPECT_EQ(Bytes(test.ciphertext), Bytes(out.get(), input_len));
    }

    bssl::ScopedEVP_CIPHER_CTX decrypt_ctx;
    ASSERT_TRUE(EVP_DecryptInit_ex(decrypt_ctx.get(), EVP_aes_128_cfb128(),
                                   nullptr, test.key, test.iv));

    std::unique_ptr<uint8_t[]> plaintext(new uint8_t[input_len]);
    int num_bytes;
    ASSERT_TRUE(EVP_DecryptUpdate(decrypt_ctx.get(), plaintext.get(),
                                  &num_bytes, out.get(), input_len));
    EXPECT_EQ(static_cast<size_t>(num_bytes), input_len);
    EXPECT_EQ(Bytes(test.plaintext), Bytes(plaintext.get(), input_len));
  }
}
