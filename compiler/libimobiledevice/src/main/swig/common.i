%include <java.swg>
%include "enums.swg"
%javaconst(1);
SWIG_JAVABODY_METHODS(protected, protected, SWIGTYPE)

//
// workaround typedefs and typemaps for basic types
//
typedef jbyte uint8_t;     // defining these as header where these are included not added to run
typedef jlong uint64_t;
typedef jlong int64_t;
typedef jlong uint64_t;
typedef int uint32_t;
typedef int int32_t;
typedef short int16_t;
typedef short uint16_t;
// otherwise it will go into long
%typemap(jstype) unsigned "int"
%typemap(jtype) unsigned "int"
%typemap(jni) unsigned "jint"


//
// macro creates pointer wrapper class from scratch to give it proper naming and allow to have better control
//
%define REF_CLASS(TYPE, NAME)
  %typemap(jni) TYPE "jlong"
  %typemap(jtype) TYPE "long"
  %typemap(jstype) TYPE "NAME"
  %typemap(javain) TYPE "NAME.getCPtr($javainput)"
  %typemap(javaout) TYPE {
    long cPtr = $jnicall;
    return (cPtr == 0) ? null : new NAME(cPtr, $owner);
  }

  // no default constructor/destructor as it will produce lot of not required code at LLVM_wrap.c side
  %nodefault NAME;
  %typemap(javafinalize) struct NAME ""
  %typemap(javadestruct) struct NAME ""
  %typemap(javabody) struct NAME %{
  private transient long swigCPtr;

  protected $javaclassname(long cPtr, @SuppressWarnings("unused") boolean futureUse) {
    swigCPtr = cPtr;
  }

  protected $javaclassname() {
    swigCPtr = 0;
  }

  protected static long getCPtr($javaclassname obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public int hashCode() {
    return 31 + (int) (swigCPtr ^ (swigCPtr >>> 32));
  }

  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    $javaclassname other = ($javaclassname) obj;
    return swigCPtr == other.swigCPtr;
  }%}

  typedef struct NAME {} NAME;
%enddef


//
// Macro creates container for arrays
//
%define ARRAY_CLASS(TYPE,NAME)
  %{
    typedef struct NAME {
      TYPE value;
    } NAME;
  %}
  typedef struct NAME {
    TYPE value;
  } NAME;
  %extend NAME {
    NAME(int nelements) {
      return (NAME *) calloc(nelements,sizeof(TYPE));
    }
    ~NAME() {
      free(self);
    }
    TYPE get(int index) {
      return self[index].value;
    }
    void set(int index, TYPE value) {
      self[index].value = value;
    }
  };
%enddef


//
// Macro creates container for values returned by pointer
//
%define OUT_CLASS(TYPE, NAME, CLEANUP...)
  %{
    typedef struct NAME {
      TYPE value;
    } NAME;
  %}
  typedef struct NAME {
  %immutable;
    TYPE value;
  } NAME;
  %extend NAME {
    NAME() {
      return (NAME *) calloc(1,sizeof(TYPE));
    }
    ~NAME() {
      CLEANUP;
      free(self);
    }
  };
  %types(TYPE);
%enddef


//
// Macro for connecting pointers to wrapper classes
//
%define REF_PTR(TYPE, JAVATYPE)
  %typemap(jni) TYPE "jlong"
  %typemap(jtype) TYPE "long"
  %typemap(jstype) TYPE "JAVATYPE"
  %typemap(javain) TYPE "JAVATYPE.getCPtr($javainput)"
  %typemap(javaout) TYPE {
    long cPtr = $jnicall;
    return (cPtr == 0) ? null : new JAVATYPE(cPtr, $owner);
  }
%enddef


//
// Macro that used to connect pattern with array class
//
%define ARRAY_ARG(javatype, pattern)
  REF_PTR(pattern, javatype)
%enddef


//
// Macro that used to connect pattern with out container class
//
%define OUT_ARG(javatype, pattern)
  REF_PTR(pattern, javatype)
%enddef

//
// argc, argv into a single parameter of type String[]
//
%typemap(in) (int ARGC, char **ARGV) {
  int i = 0;
  $1 = (*jenv)->GetArrayLength(jenv, $input);
  $2 = (char **) malloc(($1+1)*sizeof(char *));
  /* make a copy of each string */
  for (i = 0; i<$1; i++) {
    jstring j_string = (jstring)(*jenv)->GetObjectArrayElement(jenv, $input, i);
    const char * c_string = (*jenv)->GetStringUTFChars(jenv, j_string, 0);
    $2[i] = malloc((strlen(c_string)+1)*sizeof(char));
    strcpy($2[i], c_string);
    (*jenv)->ReleaseStringUTFChars(jenv, j_string, c_string);
    (*jenv)->DeleteLocalRef(jenv, j_string);
  }
  $2[i] = 0;
}
%typemap(freearg) (int ARGC, char **ARGV) {
  int i;
  for (i=0; i<$1-1; i++)
    free($2[i]);
  free($2);
}
%typemap(jni) (int ARGC, char **ARGV) "jobjectArray"
%typemap(jtype) (int ARGC, char **ARGV) "String[]"
%typemap(jstype) (int ARGC, char **ARGV) "String[]"
%typemap(javain) (int ARGC, char **ARGV) "$javainput"

//
// Combine (char*, size_t) into a single parameter of type byte[]
//
%typemap(jtype) (char *ARRAY, size_t ARRAYSIZE) "byte[]"
%typemap(jstype) (char *ARRAY, size_t ARRAYSIZE) "byte[]"
%typemap(jni) (char *ARRAY, size_t ARRAYSIZE) "jbyteArray"
%typemap(javain) (char *ARRAY, size_t ARRAYSIZE) "$javainput"
%typemap(in, numinputs=1) (char *ARRAY, size_t ARRAYSIZE) {
  if (!$input) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, NULL);
    return $null;
  }
  $1 = (char*)JCALL2(GetByteArrayElements, jenv, $input, NULL);
  if (!$1) return $null;
  $2 = JCALL1(GetArrayLength, jenv, $input);
}
%typemap(freearg) (char *ARRAY, size_t ARRAYSIZE) {
  JCALL3(ReleaseByteArrayElements, jenv, $input, (jbyte *)$1, 0);
}


//
// Combine (char*, size_t) into a single parameter of type String
//
%typemap(jtype) (char *STRING, size_t STRINGSIZE) "String"
%typemap(jstype) (char *STRING, size_t STRINGSIZE) "String"
%typemap(jni) (char *STRING, size_t STRINGSIZE) "jstring"
%typemap(javain) (char *STRING, size_t STRINGSIZE) "$javainput"
%typemap(in, numinputs=1) (char *STRING, size_t STRINGSIZE) {
  if (!$input) {
    SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, NULL);
    return $null;
  }
  $1 = ($1_ltype) JCALL2(GetStringUTFChars, jenv, $input, NULL);
  if (!$1) return $null;
  $2 = strlen($1);
}
%typemap(freearg) (char *STRING, size_t STRINGSIZE) {
  JCALL2(ReleaseStringUTFChars, jenv, $input, $1);
}
