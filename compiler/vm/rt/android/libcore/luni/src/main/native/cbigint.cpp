/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

#include <string.h>
#include "cbigint.h"

#define HIGH_IN_U64(u64) ((u64) >> 32)
#define LOW_IN_U64(u64) ((u64) & 0x00000000FFFFFFFFLL)

#define TEN_E1 (0xALL)
#define TEN_E2 (0x64LL)
#define TEN_E3 (0x3E8LL)
#define TEN_E4 (0x2710LL)
#define TEN_E5 (0x186A0LL)
#define TEN_E6 (0xF4240LL)
#define TEN_E7 (0x989680LL)
#define TEN_E8 (0x5F5E100LL)
#define TEN_E9 (0x3B9ACA00LL)
#define TEN_E19 (0x8AC7230489E80000LL)

#define TIMES_TEN(x) (((x) << 3) + ((x) << 1))
#define bitSection(x, mask, shift) (((x) & (mask)) >> (shift))
#define CREATE_DOUBLE_BITS(normalizedM, e) (((normalizedM) & MANTISSA_MASK) | ((static_cast<uint64_t>((e) + E_OFFSET)) << 52))

#define MANTISSA_MASK (0x000FFFFFFFFFFFFFLL)
#define EXPONENT_MASK (0x7FF0000000000000LL)
#define NORMAL_MASK (0x0010000000000000LL)
#define SIGN_MASK (0x8000000000000000LL)

#define E_OFFSET (1075)

#define FLOAT_MANTISSA_MASK (0x007FFFFF)
#define FLOAT_EXPONENT_MASK (0x7F800000)
#define FLOAT_NORMAL_MASK   (0x00800000)
#define FLOAT_E_OFFSET (150)

int32_t
simpleAddHighPrecision (uint64_t * arg1, int32_t length, uint64_t arg2)
{
  /* assumes length > 0 */
  int32_t index = 1;

  *arg1 += arg2;
  if (arg2 <= *arg1)
    return 0;
  else if (length == 1)
    return 1;

  while (++arg1[index] == 0 && ++index < length) {
  }

  return index == length;
}

int32_t
addHighPrecision (uint64_t * arg1, int32_t length1, uint64_t * arg2, int32_t length2)
{
  /* addition is limited by length of arg1 as it this function is
   * storing the result in arg1 */
  /* fix for cc (GCC) 3.2 20020903 (Red Hat Linux 8.0 3.2-7): code generated does not
   * do the temp1 + temp2 + carry addition correct.  carry is 64 bit because gcc has
   * subtle issues when you mix 64 / 32 bit maths. */
  uint64_t temp1, temp2, temp3;     /* temporary variables to help the SH-4, and gcc */
  uint64_t carry;
  int32_t index;

  if (length1 == 0 || length2 == 0)
    {
      return 0;
    }
  else if (length1 < length2)
    {
      length2 = length1;
    }

  carry = 0;
  index = 0;
  do
    {
      temp1 = arg1[index];
      temp2 = arg2[index];
      temp3 = temp1 + temp2;
      arg1[index] = temp3 + carry;
      if (arg2[index] < arg1[index])
        carry = 0;
      else if (arg2[index] != arg1[index])
        carry = 1;
    }
  while (++index < length2);
  if (!carry)
    return 0;
  else if (index == length1)
    return 1;

  while (++arg1[index] == 0 && ++index < length1) {
  }

  return index == length1;
}

void
subtractHighPrecision (uint64_t * arg1, int32_t length1, uint64_t * arg2, int32_t length2)
{
  /* assumes arg1 > arg2 */
  int32_t index;
  for (index = 0; index < length1; ++index)
    arg1[index] = ~arg1[index];
  simpleAddHighPrecision (arg1, length1, 1);

  while (length2 > 0 && arg2[length2 - 1] == 0)
    --length2;

  addHighPrecision (arg1, length1, arg2, length2);

  for (index = 0; index < length1; ++index)
    arg1[index] = ~arg1[index];
  simpleAddHighPrecision (arg1, length1, 1);
}

static uint32_t simpleMultiplyHighPrecision(uint64_t* arg1, int32_t length, uint64_t arg2) {
  /* assumes arg2 only holds 32 bits of information */
  uint64_t product;
  int32_t index;

  index = 0;
  product = 0;

  do
    {
      product =
        HIGH_IN_U64 (product) + arg2 * LOW_U32_FROM_PTR (arg1 + index);
      LOW_U32_FROM_PTR (arg1 + index) = LOW_U32_FROM_VAR (product);
      product =
        HIGH_IN_U64 (product) + arg2 * HIGH_U32_FROM_PTR (arg1 + index);
      HIGH_U32_FROM_PTR (arg1 + index) = LOW_U32_FROM_VAR (product);
    }
  while (++index < length);

  return HIGH_U32_FROM_VAR (product);
}

static void
simpleMultiplyAddHighPrecision (uint64_t * arg1, int32_t length, uint64_t arg2,
                                uint32_t * result)
{
  /* Assumes result can hold the product and arg2 only holds 32 bits
     of information */
  uint64_t product;
  int32_t index, resultIndex;

  index = resultIndex = 0;
  product = 0;

  do
    {
      product =
        HIGH_IN_U64 (product) + result[resultIndex] +
        arg2 * LOW_U32_FROM_PTR (arg1 + index);
      result[resultIndex] = LOW_U32_FROM_VAR (product);
      ++resultIndex;
      product =
        HIGH_IN_U64 (product) + result[resultIndex] +
        arg2 * HIGH_U32_FROM_PTR (arg1 + index);
      result[resultIndex] = LOW_U32_FROM_VAR (product);
      ++resultIndex;
    }
  while (++index < length);

  result[resultIndex] += HIGH_U32_FROM_VAR (product);
  if (result[resultIndex] < HIGH_U32_FROM_VAR (product))
    {
      /* must be careful with ++ operator and macro expansion */
      ++resultIndex;
      while (++result[resultIndex] == 0)
        ++resultIndex;
    }
}

void
multiplyHighPrecision (uint64_t * arg1, int32_t length1, uint64_t * arg2, int32_t length2,
                       uint64_t * result, int32_t length)
{
  /* assumes result is large enough to hold product */
  uint64_t* temp;
  uint32_t* resultIn32;
  int32_t count, index;

  if (length1 < length2)
    {
      temp = arg1;
      arg1 = arg2;
      arg2 = temp;
      count = length1;
      length1 = length2;
      length2 = count;
    }

  memset (result, 0, sizeof (uint64_t) * length);

  /* length1 > length2 */
  resultIn32 = reinterpret_cast<uint32_t*>(result);
  index = -1;
  for (count = 0; count < length2; ++count)
    {
      simpleMultiplyAddHighPrecision (arg1, length1, LOW_IN_U64 (arg2[count]),
                                      resultIn32 + (++index));
      simpleMultiplyAddHighPrecision(arg1, length1, HIGH_IN_U64(arg2[count]), resultIn32 + (++index));
    }
}

uint32_t
simpleAppendDecimalDigitHighPrecision (uint64_t * arg1, int32_t length, uint64_t digit)
{
  /* assumes digit is less than 32 bits */
  uint64_t arg;
  int32_t index = 0;

  digit <<= 32;
  do
    {
      arg = LOW_IN_U64 (arg1[index]);
      digit = HIGH_IN_U64 (digit) + TIMES_TEN (arg);
      LOW_U32_FROM_PTR (arg1 + index) = LOW_U32_FROM_VAR (digit);

      arg = HIGH_IN_U64 (arg1[index]);
      digit = HIGH_IN_U64 (digit) + TIMES_TEN (arg);
      HIGH_U32_FROM_PTR (arg1 + index) = LOW_U32_FROM_VAR (digit);
    }
  while (++index < length);

  return HIGH_U32_FROM_VAR (digit);
}

void
simpleShiftLeftHighPrecision (uint64_t * arg1, int32_t length, int32_t arg2)
{
  /* assumes length > 0 */
  int32_t index, offset;
  if (arg2 >= 64)
    {
      offset = arg2 >> 6;
      index = length;

      while (--index - offset >= 0)
        arg1[index] = arg1[index - offset];
      do
        {
          arg1[index] = 0;
        }
      while (--index >= 0);

      arg2 &= 0x3F;
    }

  if (arg2 == 0)
    return;
  while (--length > 0)
    {
      arg1[length] = arg1[length] << arg2 | arg1[length - 1] >> (64 - arg2);
    }
  *arg1 <<= arg2;
}

int32_t
highestSetBit (uint64_t * y)
{
  uint32_t x;
  int32_t result;

  if (*y == 0)
    return 0;

  if (*y & 0xFFFFFFFF00000000LL)
    {
      x = HIGH_U32_FROM_PTR (y);
      result = 32;
    }
  else
    {
      x = LOW_U32_FROM_PTR (y);
      result = 0;
    }

  if (x & 0xFFFF0000)
    {
      x = bitSection (x, 0xFFFF0000, 16);
      result += 16;
    }
  if (x & 0xFF00)
    {
      x = bitSection (x, 0xFF00, 8);
      result += 8;
    }
  if (x & 0xF0)
    {
      x = bitSection (x, 0xF0, 4);
      result += 4;
    }
  if (x > 0x7)
    return result + 4;
  else if (x > 0x3)
    return result + 3;
  else if (x > 0x1)
    return result + 2;
  else
    return result + 1;
}

int32_t
lowestSetBit (uint64_t * y)
{
  uint32_t x;
  int32_t result;

  if (*y == 0)
    return 0;

  if (*y & 0x00000000FFFFFFFFLL)
    {
      x = LOW_U32_FROM_PTR (y);
      result = 0;
    }
  else
    {
      x = HIGH_U32_FROM_PTR (y);
      result = 32;
    }

  if (!(x & 0xFFFF))
    {
      x = bitSection (x, 0xFFFF0000, 16);
      result += 16;
    }
  if (!(x & 0xFF))
    {
      x = bitSection (x, 0xFF00, 8);
      result += 8;
    }
  if (!(x & 0xF))
    {
      x = bitSection (x, 0xF0, 4);
      result += 4;
    }

  if (x & 0x1)
    return result + 1;
  else if (x & 0x2)
    return result + 2;
  else if (x & 0x4)
    return result + 3;
  else
    return result + 4;
}

int32_t
highestSetBitHighPrecision (uint64_t * arg, int32_t length)
{
  int32_t highBit;

  while (--length >= 0)
    {
      highBit = highestSetBit (arg + length);
      if (highBit)
        return highBit + 64 * length;
    }

  return 0;
}

int32_t
lowestSetBitHighPrecision (uint64_t * arg, int32_t length)
{
  int32_t lowBit, index = -1;

  while (++index < length)
    {
      lowBit = lowestSetBit (arg + index);
      if (lowBit)
        return lowBit + 64 * index;
    }

  return 0;
}

int32_t
compareHighPrecision (uint64_t * arg1, int32_t length1, uint64_t * arg2, int32_t length2)
{
  while (--length1 >= 0 && arg1[length1] == 0) {
  }
  while (--length2 >= 0 && arg2[length2] == 0) {
  }

  if (length1 > length2)
    return 1;
  else if (length1 < length2)
    return -1;
  else if (length1 > -1)
    {
      do
        {
          if (arg1[length1] > arg2[length1])
            return 1;
          else if (arg1[length1] < arg2[length1])
            return -1;
        }
      while (--length1 >= 0);
    }

  return 0;
}

jdouble
toDoubleHighPrecision (uint64_t * arg, int32_t length)
{
  int32_t highBit;
  uint64_t mantissa, test64;
  uint32_t test;
  jdouble result;

  while (length > 0 && arg[length - 1] == 0)
    --length;

  if (length == 0)
    result = 0.0;
  else if (length > 16)
    {
      DOUBLE_TO_LONGBITS (result) = EXPONENT_MASK;
    }
  else if (length == 1)
    {
      highBit = highestSetBit (arg);
      if (highBit <= 53)
        {
          highBit = 53 - highBit;
          mantissa = *arg << highBit;
          DOUBLE_TO_LONGBITS (result) =
            CREATE_DOUBLE_BITS (mantissa, -highBit);
        }
      else
        {
          highBit -= 53;
          mantissa = *arg >> highBit;
          DOUBLE_TO_LONGBITS (result) =
            CREATE_DOUBLE_BITS (mantissa, highBit);

          /* perform rounding, round to even in case of tie */
          test = (LOW_U32_FROM_PTR (arg) << (11 - highBit)) & 0x7FF;
          if (test > 0x400 || ((test == 0x400) && (mantissa & 1)))
            DOUBLE_TO_LONGBITS (result) = DOUBLE_TO_LONGBITS (result) + 1;
        }
    }
  else
    {
      highBit = highestSetBit (arg + (--length));
      if (highBit <= 53)
        {
          highBit = 53 - highBit;
          if (highBit > 0)
            {
              mantissa =
                (arg[length] << highBit) | (arg[length - 1] >>
                                            (64 - highBit));
            }
          else
            {
              mantissa = arg[length];
            }
          DOUBLE_TO_LONGBITS (result) =
            CREATE_DOUBLE_BITS (mantissa, length * 64 - highBit);

          /* perform rounding, round to even in case of tie */
          test64 = arg[--length] << highBit;
          if (test64 > SIGN_MASK || ((test64 == SIGN_MASK) && (mantissa & 1)))
            DOUBLE_TO_LONGBITS (result) = DOUBLE_TO_LONGBITS (result) + 1;
          else if (test64 == SIGN_MASK)
            {
              while (--length >= 0)
                {
                  if (arg[length] != 0)
                    {
                      DOUBLE_TO_LONGBITS (result) =
                        DOUBLE_TO_LONGBITS (result) + 1;
                      break;
                    }
                }
            }
        }
      else
        {
          highBit -= 53;
          mantissa = arg[length] >> highBit;
          DOUBLE_TO_LONGBITS (result) =
            CREATE_DOUBLE_BITS (mantissa, length * 64 + highBit);

          /* perform rounding, round to even in case of tie */
          test = (LOW_U32_FROM_PTR (arg + length) << (11 - highBit)) & 0x7FF;
          if (test > 0x400 || ((test == 0x400) && (mantissa & 1)))
            DOUBLE_TO_LONGBITS (result) = DOUBLE_TO_LONGBITS (result) + 1;
          else if (test == 0x400)
            {
              do
                {
                  if (arg[--length] != 0)
                    {
                      DOUBLE_TO_LONGBITS (result) =
                        DOUBLE_TO_LONGBITS (result) + 1;
                      break;
                    }
                }
              while (length > 0);
            }
        }
    }

  return result;
}

static uint64_t simpleMultiplyHighPrecision64(uint64_t* arg1, int32_t length, uint64_t arg2);

int32_t
timesTenToTheEHighPrecision (uint64_t * result, int32_t length, jint e)
{
  /* assumes result can hold value */
  uint64_t overflow;
  int exp10 = e;

  if (e == 0)
    return length;

  /* bad O(n) way of doing it, but simple */
  /*
     do {
     overflow = simpleAppendDecimalDigitHighPrecision(result, length, 0);
     if (overflow)
     result[length++] = overflow;
     } while (--e);
   */
  /* Replace the current implementaion which performs a
   * "multiplication" by 10 e number of times with an actual
   * multiplication. 10e19 is the largest exponent to the power of ten
   * that will fit in a 64-bit integer, and 10e9 is the largest exponent to
   * the power of ten that will fit in a 64-bit integer. Not sure where the
   * break-even point is between an actual multiplication and a
   * simpleAappendDecimalDigit() so just pick 10e3 as that point for
   * now.
   */
  while (exp10 >= 19)
    {
      overflow = simpleMultiplyHighPrecision64 (result, length, TEN_E19);
      if (overflow)
        result[length++] = overflow;
      exp10 -= 19;
    }
  while (exp10 >= 9)
    {
      overflow = simpleMultiplyHighPrecision (result, length, TEN_E9);
      if (overflow)
        result[length++] = overflow;
      exp10 -= 9;
    }
  if (exp10 == 0)
    return length;
  else if (exp10 == 1)
    {
      overflow = simpleAppendDecimalDigitHighPrecision (result, length, 0);
      if (overflow)
        result[length++] = overflow;
    }
  else if (exp10 == 2)
    {
      overflow = simpleAppendDecimalDigitHighPrecision (result, length, 0);
      if (overflow)
        result[length++] = overflow;
      overflow = simpleAppendDecimalDigitHighPrecision (result, length, 0);
      if (overflow)
        result[length++] = overflow;
    }
  else if (exp10 == 3)
    {
      overflow = simpleMultiplyHighPrecision (result, length, TEN_E3);
      if (overflow)
        result[length++] = overflow;
    }
  else if (exp10 == 4)
    {
      overflow = simpleMultiplyHighPrecision (result, length, TEN_E4);
      if (overflow)
        result[length++] = overflow;
    }
  else if (exp10 == 5)
    {
      overflow = simpleMultiplyHighPrecision (result, length, TEN_E5);
      if (overflow)
        result[length++] = overflow;
    }
  else if (exp10 == 6)
    {
      overflow = simpleMultiplyHighPrecision (result, length, TEN_E6);
      if (overflow)
        result[length++] = overflow;
    }
  else if (exp10 == 7)
    {
      overflow = simpleMultiplyHighPrecision (result, length, TEN_E7);
      if (overflow)
        result[length++] = overflow;
    }
  else if (exp10 == 8)
    {
      overflow = simpleMultiplyHighPrecision (result, length, TEN_E8);
      if (overflow)
        result[length++] = overflow;
    }
  return length;
}

uint64_t
doubleMantissa (jdouble z)
{
  uint64_t m = DOUBLE_TO_LONGBITS (z);

  if ((m & EXPONENT_MASK) != 0)
    m = (m & MANTISSA_MASK) | NORMAL_MASK;
  else
    m = (m & MANTISSA_MASK);

  return m;
}

int32_t
doubleExponent (jdouble z)
{
  /* assumes positive double */
  int32_t k = HIGH_U32_FROM_VAR (z) >> 20;

  if (k)
    k -= E_OFFSET;
  else
    k = 1 - E_OFFSET;

  return k;
}

uint32_t floatMantissa(jfloat z) {
  uint32_t m = FLOAT_TO_INTBITS (z);

  if ((m & FLOAT_EXPONENT_MASK) != 0)
    m = (m & FLOAT_MANTISSA_MASK) | FLOAT_NORMAL_MASK;
  else
    m = (m & FLOAT_MANTISSA_MASK);

  return m;
}

int32_t
floatExponent (jfloat z)
{
  /* assumes positive float */
  int32_t k = FLOAT_TO_INTBITS (z) >> 23;
  if (k)
    k -= FLOAT_E_OFFSET;
  else
    k = 1 - FLOAT_E_OFFSET;

  return k;
}

/* Allow a 64-bit value in arg2 */
uint64_t
simpleMultiplyHighPrecision64 (uint64_t * arg1, int32_t length, uint64_t arg2)
{
  uint64_t intermediate, carry1, carry2, prod1, prod2, sum;
  uint64_t* pArg1;
  int32_t index;
  uint32_t buf32;

  index = 0;
  intermediate = 0;
  pArg1 = arg1 + index;
  carry1 = carry2 = 0;

  do
    {
      if ((*pArg1 != 0) || (intermediate != 0))
        {
          prod1 =
            static_cast<uint64_t>(LOW_U32_FROM_VAR (arg2)) * static_cast<uint64_t>(LOW_U32_FROM_PTR (pArg1));
          sum = intermediate + prod1;
          if ((sum < prod1) || (sum < intermediate))
            {
              carry1 = 1;
            }
          else
            {
              carry1 = 0;
            }
          prod1 =
            static_cast<uint64_t>(LOW_U32_FROM_VAR (arg2)) * static_cast<uint64_t>(HIGH_U32_FROM_PTR (pArg1));
          prod2 =
            static_cast<uint64_t>(HIGH_U32_FROM_VAR (arg2)) * static_cast<uint64_t>(LOW_U32_FROM_PTR (pArg1));
          intermediate = carry2 + HIGH_IN_U64 (sum) + prod1 + prod2;
          if ((intermediate < prod1) || (intermediate < prod2))
            {
              carry2 = 1;
            }
          else
            {
              carry2 = 0;
            }
          LOW_U32_FROM_PTR (pArg1) = LOW_U32_FROM_VAR (sum);
          buf32 = HIGH_U32_FROM_PTR (pArg1);
          HIGH_U32_FROM_PTR (pArg1) = LOW_U32_FROM_VAR (intermediate);
          intermediate = carry1 + HIGH_IN_U64 (intermediate)
            + static_cast<uint64_t>(HIGH_U32_FROM_VAR (arg2)) * static_cast<uint64_t>(buf32);
        }
      pArg1++;
    }
  while (++index < length);
  return intermediate;
}
