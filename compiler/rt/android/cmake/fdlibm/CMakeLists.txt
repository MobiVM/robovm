project(android-external-fdlibm)

set(LIB_PATH "${ANDROID_RT_PATH}/external/fdlibm")

# This is necessary to guarantee that the FDLIBM functions are in
# "IEEE spirit   i.e. to guarantee that the IEEE 754 core functions
# are used.
add_compile_options(-D_IEEE_LIBM)

# Disable GCC optimizations that interact badly with this crufty
# library (see their own admission in 'readme'). Without this, we
# fail StrictMath tests on x86.
add_compile_options(-fno-strict-aliasing)

# fdlibm expects __LITTLE_ENDIAN to be defined for little endian targets but
# clang defines __LITTLE_ENDIAN__.
if(DARWIN)
  add_definitions(-D__LITTLE_ENDIAN=__LITTLE_ENDIAN__)
endif()

# Disable warnings. We need a specific version of fdlibm and can't fix this upstream.
add_compile_options(-Wno-sign-compare)
add_compile_options(-Wno-dangling-else)
add_compile_options(-Wno-unknown-pragmas)
add_compile_options(-Wno-dangling-else)
add_compile_options(-Wno-logical-op-parentheses)
add_compile_options(-Wno-sometimes-uninitialized)

set(SRC
  ${LIB_PATH}/k_standard.c  
  ${LIB_PATH}/k_rem_pio2.c  
  ${LIB_PATH}/k_cos.c  
  ${LIB_PATH}/k_sin.c  
  ${LIB_PATH}/k_tan.c  
  ${LIB_PATH}/e_acos.c  
  ${LIB_PATH}/e_acosh.c  
  ${LIB_PATH}/e_asin.c  
  ${LIB_PATH}/e_atan2.c  
  ${LIB_PATH}/e_atanh.c  
  ${LIB_PATH}/e_cosh.c  
  ${LIB_PATH}/e_exp.c  
  ${LIB_PATH}/e_fmod.c  
  ${LIB_PATH}/e_gamma.c  
  ${LIB_PATH}/e_gamma_r.c  
  ${LIB_PATH}/e_hypot.c  
  ${LIB_PATH}/e_j0.c  
  ${LIB_PATH}/e_j1.c  
  ${LIB_PATH}/e_jn.c  
  ${LIB_PATH}/e_lgamma.c  
  ${LIB_PATH}/e_lgamma_r.c  
  ${LIB_PATH}/e_log.c  
  ${LIB_PATH}/e_log10.c  
  ${LIB_PATH}/e_pow.c  
  ${LIB_PATH}/e_rem_pio2.c  
  ${LIB_PATH}/e_remainder.c  
  ${LIB_PATH}/e_scalb.c  
  ${LIB_PATH}/e_sinh.c  
  ${LIB_PATH}/e_sqrt.c  
  ${LIB_PATH}/w_acos.c  
  ${LIB_PATH}/w_acosh.c  
  ${LIB_PATH}/w_asin.c  
  ${LIB_PATH}/w_atan2.c  
  ${LIB_PATH}/w_atanh.c  
  ${LIB_PATH}/w_cosh.c  
  ${LIB_PATH}/w_exp.c  
  ${LIB_PATH}/w_fmod.c  
  ${LIB_PATH}/w_gamma.c  
  ${LIB_PATH}/w_gamma_r.c  
  ${LIB_PATH}/w_hypot.c  
  ${LIB_PATH}/w_j0.c  
  ${LIB_PATH}/w_j1.c  
  ${LIB_PATH}/w_jn.c  
  ${LIB_PATH}/w_lgamma.c  
  ${LIB_PATH}/w_lgamma_r.c  
  ${LIB_PATH}/w_log.c  
  ${LIB_PATH}/w_log10.c  
  ${LIB_PATH}/w_pow.c  
  ${LIB_PATH}/w_remainder.c  
  ${LIB_PATH}/w_scalb.c  
  ${LIB_PATH}/w_sinh.c  
  ${LIB_PATH}/w_sqrt.c  
  ${LIB_PATH}/s_asinh.c  
  ${LIB_PATH}/s_atan.c  
  ${LIB_PATH}/s_cbrt.c  
  ${LIB_PATH}/s_ceil.c  
  ${LIB_PATH}/s_copysign.c  
  ${LIB_PATH}/s_cos.c  
  ${LIB_PATH}/s_erf.c  
  ${LIB_PATH}/s_expm1.c  
  ${LIB_PATH}/s_fabs.c  
  ${LIB_PATH}/s_finite.c  
  ${LIB_PATH}/s_floor.c  
  ${LIB_PATH}/s_frexp.c  
  ${LIB_PATH}/s_ilogb.c  
  ${LIB_PATH}/s_isnan.c  
  ${LIB_PATH}/s_ldexp.c  
  ${LIB_PATH}/s_lib_version.c  
  ${LIB_PATH}/s_log1p.c  
  ${LIB_PATH}/s_logb.c  
  ${LIB_PATH}/s_matherr.c  
  ${LIB_PATH}/s_modf.c  
  ${LIB_PATH}/s_nextafter.c  
  ${LIB_PATH}/s_rint.c  
  ${LIB_PATH}/s_scalbn.c  
  ${LIB_PATH}/s_signgam.c  
  ${LIB_PATH}/s_significand.c  
  ${LIB_PATH}/s_sin.c  
  ${LIB_PATH}/s_tan.c  
  ${LIB_PATH}/s_tanh.c  
)

add_library(android-external-fdlibm OBJECT ${SRC})
set(EXTERNAL_FDLIBM_OBJECTS $<TARGET_OBJECTS:android-external-fdlibm> PARENT_SCOPE)