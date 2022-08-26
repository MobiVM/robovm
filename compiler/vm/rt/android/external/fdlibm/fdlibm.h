
/* @(#)fdlibm.h 1.5 04/04/22 */
/*
 * ====================================================
 * Copyright (C) 2004 by Sun Microsystems, Inc. All rights reserved.
 *
 * Permission to use, copy, modify, and distribute this
 * software is freely granted, provided that this notice 
 * is preserved.
 * ====================================================
 */

#ifdef __cplusplus
extern "C" {
#endif

#ifndef __LITTLE_ENDIAN
/* Sometimes it's necessary to define __LITTLE_ENDIAN explicitly
   but these catch some common cases. */
#if defined(i386) || defined(i486) || \
	defined(intel) || defined(x86) || defined(i86pc) || \
	defined(__alpha) || defined(__osf__) || defined(__MIPSEL__)
#define __LITTLE_ENDIAN
#endif
#endif

#ifdef __LITTLE_ENDIAN
#define __HI(x) *(1+(int*)&x)
#define __LO(x) *(int*)&x
#define __HIp(x) *(1+(int*)x)
#define __LOp(x) *(int*)x
#else
#define __HI(x) *(int*)&x
#define __LO(x) *(1+(int*)&x)
#define __HIp(x) *(int*)x
#define __LOp(x) *(1+(int*)x)
#endif

#ifndef __P
#define __FDLIBM_P_DEFINED
#ifdef __STDC__
#define	__P(p)	p
#else
#define	__P(p)	()
#endif
#endif

/*
 * ANSI/POSIX
 */

extern int signgam;

#define	MAXFLOAT	((float)3.40282346638528860e+38)

enum fdversion {fdlibm_ieee = -1, fdlibm_svid, fdlibm_xopen, fdlibm_posix};

#define _LIB_VERSION_TYPE enum fdversion
#define _LIB_VERSION _fdlib_version  

/* if global variable _LIB_VERSION is not desirable, one may 
 * change the following to be a constant by: 
 *	#define _LIB_VERSION_TYPE const enum version
 * In that case, after one initializes the value _LIB_VERSION (see
 * s_lib_version.c) during compile time, it cannot be modified
 * in the middle of a program
 */ 
extern  _LIB_VERSION_TYPE  _LIB_VERSION;

#define _IEEE_  fdlibm_ieee
#define _SVID_  fdlibm_svid
#define _XOPEN_ fdlibm_xopen
#define _POSIX_ fdlibm_posix

struct exception {
	int type;
	char *name;
	double arg1;
	double arg2;
	double retval;
};

#define	HUGE		MAXFLOAT

/* 
 * set X_TLOSS = pi*2**52, which is possibly defined in <values.h>
 * (one may replace the following line by "#include <values.h>")
 */

#define X_TLOSS		1.41484755040568800000e+16 

#define	DOMAIN		1
#define	SING		2
#define	OVERFLOW	3
#define	UNDERFLOW	4
#define	TLOSS		5
#define	PLOSS		6

/*
 * ANSI/POSIX
 */
extern double ieee_acos __P((double));
extern double ieee_asin __P((double));
extern double ieee_atan __P((double));
extern double ieee_atan2 __P((double, double));
extern double ieee_cos __P((double));
extern double ieee_sin __P((double));
extern double ieee_tan __P((double));

extern double ieee_cosh __P((double));
extern double ieee_sinh __P((double));
extern double ieee_tanh __P((double));

extern double ieee_exp __P((double));
extern double ieee_frexp __P((double, int *));
extern double ieee_ldexp __P((double, int));
extern double ieee_log __P((double));
extern double ieee_log10 __P((double));
extern double ieee_modf __P((double, double *));

extern double ieee_pow __P((double, double));
extern double ieee_sqrt __P((double));

extern double ieee_ceil __P((double));
extern double ieee_fabs __P((double));
extern double ieee_floor __P((double));
extern double ieee_fmod __P((double, double));

extern double ieee_erf __P((double));
extern double ieee_erfc __P((double));
extern double ieee_gamma __P((double));
extern double ieee_hypot __P((double, double));
extern int ieee_isnan __P((double));
extern int ieee_finite __P((double));
extern double ieee_j0 __P((double));
extern double ieee_j1 __P((double));
extern double ieee_jn __P((int, double));
extern double ieee_lgamma __P((double));
extern double ieee_y0 __P((double));
extern double ieee_y1 __P((double));
extern double ieee_yn __P((int, double));

extern double acosh __P((double));
extern double asinh __P((double));
extern double atanh __P((double));
extern double ieee_cbrt __P((double));
extern double ieee_logb __P((double));
extern double ieee_nextafter __P((double, double));
extern double ieee_remainder __P((double, double));
#ifdef _SCALB_INT
extern double ieee_scalb __P((double, int));
#else
extern double ieee_scalb __P((double, double));
#endif

extern int ieee_matherr __P((struct exception *));

/*
 * IEEE Test Vector
 */
extern double ieee_significand __P((double));

/*
 * Functions callable from C, intended to support IEEE arithmetic.
 */
extern double ieee_copysign __P((double, double));
extern int ieee_ilogb __P((double));
extern double ieee_rint __P((double));
extern double ieee_scalbn __P((double, int));

/*
 * BSD math library entry points
 */
extern double ieee_expm1 __P((double));
extern double ieee_log1p __P((double));

/*
 * Reentrant version of gamma & lgamma; passes signgam back by reference
 * as the second argument; user must allocate space for signgam.
 */
#ifdef _REENTRANT
extern double ieee_gamma_r __P((double, int *));
extern double ieee_lgamma_r __P((double, int *));
#endif	/* _REENTRANT */

/* ieee style elementary functions */
extern double __ieee754_sqrt __P((double));			
extern double __ieee754_acos __P((double));			
extern double __ieee754_acosh __P((double));			
extern double __ieee754_log __P((double));			
extern double __ieee754_atanh __P((double));			
extern double __ieee754_asin __P((double));			
extern double __ieee754_atan2 __P((double,double));			
extern double __ieee754_exp __P((double));
extern double __ieee754_cosh __P((double));
extern double __ieee754_fmod __P((double,double));
extern double __ieee754_pow __P((double,double));
extern double __ieee754_lgamma_r __P((double,int *));
extern double __ieee754_gamma_r __P((double,int *));
extern double __ieee754_lgamma __P((double));
extern double __ieee754_gamma __P((double));
extern double __ieee754_log10 __P((double));
extern double __ieee754_sinh __P((double));
extern double __ieee754_hypot __P((double,double));
extern double __ieee754_j0 __P((double));
extern double __ieee754_j1 __P((double));
extern double __ieee754_y0 __P((double));
extern double __ieee754_y1 __P((double));
extern double __ieee754_jn __P((int,double));
extern double __ieee754_yn __P((int,double));
extern double __ieee754_remainder __P((double,double));
extern int    __ieee754_rem_pio2 __P((double,double*));
#ifdef _SCALB_INT
extern double __ieee754_scalb __P((double,int));
#else
extern double __ieee754_scalb __P((double,double));
#endif

/* fdlibm kernel function */
extern double __kernel_standard __P((double,double,int));	
extern double __kernel_sin __P((double,double,int));
extern double __kernel_cos __P((double,double));
extern double __kernel_tan __P((double,double,int));
extern int    __kernel_rem_pio2 __P((double*,double*,int,int,int,const int*));

#ifdef __FDLIBM_P_DEFINED
#undef __P
#endif

#ifdef __cplusplus
}; /* extern "C" */
#endif
