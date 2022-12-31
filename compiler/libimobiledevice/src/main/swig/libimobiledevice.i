%module LibIMobileDevice
%{
#include <libimobiledevice/afc.h>
#include <libimobiledevice/installation_proxy.h>
#include <libimobiledevice/mobile_image_mounter.h>
#include <libimobiledevice/debugserver.h>
%}

%include "common.i"
%include "fast_primitive_arrays.i"

%define CALLBACK(TYPE)
    %typemap(jni) TYPE "jlong"
    %typemap(jtype) TYPE "long"
    %typemap(jstype) TYPE "long"
    %typemap(javain) TYPE "$javainput"
%enddef
CALLBACK(instproxy_status_cb_t)
CALLBACK(idevice_event_cb_t)
CALLBACK(lockdownd_cu_pairing_cb_t)

// Map user_data passed to callbacks as int. We will pass in a
// callback id which is mapped to a callback object instance in Java.
%typemap(jni) void *user_data "jint"
%typemap(jtype) void *user_data "int"
%typemap(jstype) void *user_data "int"
%typemap(javain) void *user_data "$javainput"
%typemap(jni) void *cb_user_data "jint"
%typemap(jtype) void *cb_user_data "int"
%typemap(jstype) void *cb_user_data "int"
%typemap(javain) void *cb_user_data "$javainput"
// idevice_options is a bitmap, use it as int to combine options
%typemap(jni) enum idevice_options options "jint"
%typemap(jtype) enum idevice_options options "int"
%typemap(jstype) enum idevice_options options "int"
%typemap(javain) enum idevice_options options "$javainput"

//
// Registering pointers to structs
//
REF_CLASS(idevice_t, IDeviceRef)
REF_CLASS(idevice_connection_t, IDeviceConnectionRef)
REF_CLASS(lockdownd_client_t, LockdowndClientRef)
REF_CLASS(plist_t, PlistRef)
REF_CLASS(afc_client_t, AfcClientRef)
REF_CLASS(instproxy_client_t, InstproxyClientRef)
REF_CLASS(mobile_image_mounter_client_t, MobileImageMounterClientRef)
REF_CLASS(idevice_subscription_context_t, IDeviceSubscriptionContext)
REF_CLASS(void *conn_data, IDeviceInfoConnData)
// -- debug server
REF_CLASS(debugserver_client_t, DebugServerClientRef)


//
// registering wrappers for arrays
//
ARRAY_CLASS(char *, StringArray)
ARRAY_CLASS(jbyte, ByteArray)
ARRAY_CLASS(struct idevice_info*, IDeviceInfoArray)
ARRAY_ARG(IDeviceInfoArray, idevice_info_t *)

//
// Registering container classes that will be used to receive value by pointer
//
OUT_CLASS(jint, IntOut)
OUT_CLASS(jlong, LongOut)
OUT_CLASS(char *, StringOut)
OUT_CLASS(StringArray *, StringArrayOut)
OUT_CLASS(ByteArray *, ByteArrayOut)
OUT_CLASS(IDeviceInfoArray *, IDeviceInfoArrayOut, if (self->value) idevice_device_list_extended_free(self->value))
OUT_CLASS(idevice_t, IDeviceRefOut)
OUT_CLASS(idevice_connection_t, IDeviceConnectionRefOut)
OUT_CLASS(lockdownd_client_t, LockdowndClientRefOut)
OUT_CLASS(lockdownd_service_descriptor_t, LockdowndServiceDescriptorStructOut)
OUT_CLASS(afc_client_t, AfcClientRefOut)
OUT_CLASS(plist_t, PlistRefOut)
OUT_CLASS(instproxy_client_t, InstproxyClientRefOut)
OUT_CLASS(mobile_image_mounter_client_t, MobileImageMounterClientRefOut)
OUT_CLASS(idevice_subscription_context_t, IDeviceSubscriptionContextOut)
// -- debug server
OUT_CLASS(debugserver_client_t, DebugServerClientRefOut)

// turn pointer + length just to byte-array (check common.i)
%apply signed char[] {(const char *plist_bin)};
%apply signed char[] {(const char *data)};
%apply signed char[] {(char *data)};
%apply signed char[] {(const char *data)};
%apply signed char[] {(char *data)};
%apply signed char[] {(const char *signature)};
%apply signed char[] {(const char *sig)};
%apply signed char[] {(char* data)};

//
// Map pointer to container classes to receive value by pointer
//
OUT_ARG(IntOut, int *)
OUT_ARG(IntOut, uint32_t *)
OUT_ARG(LongOut, uint64_t *)
OUT_ARG(LongOut, int64_t *)
OUT_ARG(StringArray, char **appids)
OUT_ARG(StringArray, char **capabilities)
OUT_ARG(StringArrayOut, char ***devices)
OUT_ARG(StringArray, char **devices)
OUT_ARG(StringArrayOut, char ***classes)
OUT_ARG(StringArray, char **classes)
OUT_ARG(StringArrayOut, char ***device_information)
OUT_ARG(StringArrayOut, char ***directory_information)
OUT_ARG(StringArrayOut, char ***file_information)
OUT_ARG(StringOut, char **description)
OUT_ARG(StringOut, char **device_name)
OUT_ARG(StringOut, char **dictionary)
OUT_ARG(StringOut, char **name)
OUT_ARG(StringOut, char **path)
OUT_ARG(StringOut, char **session_id)
OUT_ARG(StringOut, char **type)
OUT_ARG(StringOut, char **udid)
OUT_ARG(StringOut, char **value)
OUT_ARG(StringOut, char **response)
OUT_ARG(ByteArrayOut, char **plist_bin)
OUT_ARG(ByteArrayOut, char **plist_xml)
OUT_ARG(IDeviceRefOut, idevice_t *device)
OUT_ARG(IDeviceConnectionRefOut, idevice_connection_t *connection)
OUT_ARG(LockdowndClientRefOut, lockdownd_client_t *client)
OUT_ARG(LockdowndServiceDescriptorStructOut, lockdownd_service_descriptor_t *service)
OUT_ARG(PlistRefOut, plist_t *)
OUT_ARG(AfcClientRefOut, afc_client_t *client)
OUT_ARG(InstproxyClientRefOut, instproxy_client_t *client)
OUT_ARG(MobileImageMounterClientRefOut, mobile_image_mounter_client_t *client)
OUT_ARG(IDeviceInfoArrayOut, idevice_info_t **devices)
OUT_ARG(IDeviceSubscriptionContextOut, idevice_subscription_context_t *context)
// -- debug server
OUT_ARG(DebugServerClientRefOut, debugserver_client_t *client)

%apply jboolean {uint8_t ssl_enabled};
%apply jboolean {uint8_t sslBypass};

%rename (IDeviceEvent) idevice_event_t;
%rename (IDeviceInfo) idevice_info;
%rename (IDeviceConnectiontype) idevice_connection_type;
%rename (IDeviceOptions) idevice_options;
%rename (IDeviceEventType) idevice_event_type;
%rename (LockdowndPairRecordStruct) lockdownd_pair_record;
%rename (LockdowndCuPairingCbType) lockdownd_cu_pairing_cb_type_t;
%rename (LockdowndServiceDescriptorStruct) lockdownd_service_descriptor;
%rename (AfcLockOperation) afc_lock_op_t;
%rename (AfcFileMode) afc_file_mode_t;
%rename (AfcLinkType) afc_link_type_t;
%rename (sslEnabled) ssl_enabled; 
%rename (connectionType) conn_type;
%rename (args) argc;
%rename (AfcError) afc_error_t;
%rename (IDeviceError) idevice_error_t;
%rename (InstProxyError) instproxy_error_t;
%rename (LockdowndError) lockdownd_error_t;
%rename (MobileImageMounterError) mobile_image_mounter_error_t;
%rename (DebugServerError) debugserver_error_t;



%ignore instproxy_client_options_add;
%ignore mobile_image_mounter_upload_image;
// debugserver -- hex encoding is done in java
%ignore debugserver_encode_string;
%ignore debugserver_decode_string;
// debugserver -- ignoring commands as all this happening in java
%ignore debugserver_command_t;
%ignore debugserver_client_send_command;
%ignore debugserver_client_set_environment_hex_encoded;
%ignore debugserver_command_new;
%ignore debugserver_command_free;
%ignore debugserver_client_set_argv;
%ignore debugserver_client_send_command;
%ignore debugserver_client_set_ack_mode;
%ignore debugserver_client_receive_response;
%ignore debugserver_client_set_receive_params;

// Map just enough of the plist.h functions to be able to convert to/from Java plists.
extern plist_t plist_new_dict(void);
extern void plist_free(plist_t plist);
extern void plist_to_bin(plist_t plist, char **plist_bin, uint32_t * length);
extern void plist_to_xml(plist_t plist, char **plist_xml, uint32_t * length);
extern void plist_from_bin(const char *plist_bin, uint32_t length, plist_t * plist);

extern void delete_StringOut_value(StringOut* s);
extern void delete_ByteArrayOut_value(ByteArrayOut* s);
extern void delete_StringArray_values(StringArray* s, int length);
extern void delete_StringArray_values_z(StringArray* s);

extern jlong get_global_instproxy_status_cb(void);
extern jlong get_global_idevice_event_cb(void);
extern mobile_image_mounter_error_t upload_image(mobile_image_mounter_client_t client, const char *image_path, const char *image_type, const char* sig, size_t sig_size);
%{
static JavaVM *vm = NULL;
static jclass class_Callbacks = NULL;
static jmethodID meth_callInstproxyCallback = NULL;
static jmethodID meth_callIDeviceEventCallback = NULL;
jint JNI_OnLoad(JavaVM *_vm, void *reserved) {
    vm = _vm;
    return JNI_VERSION_1_2;
}

void delete_StringOut_value(StringOut* s) {
	if (s && s->value) free(s->value);
}
void delete_ByteArrayOut_value(ByteArrayOut* s) {
	if (s && s->value) free(s->value);
}
void delete_StringArray_values(StringArray* s, int length) {
	int i;
	if (s) {
		for (i = 0; i < length; i++) {
	    	if (s[i].value) free(s[i].value);
	    }
	}
}
void delete_StringArray_values_z(StringArray* s) {
    int i;
    if (s) {
        for (i = 0; s[i].value; i++) {
            free(s[i].value);
        }
    }
}

SWIGEXPORT void JNICALL Java_org_robovm_libimobiledevice_binding_LibIMobileDeviceJNI_initNative(JNIEnv *env, jclass cls) {
    class_Callbacks = (*env)->FindClass(env, "org/robovm/libimobiledevice/Callbacks");
    if ((*env)->ExceptionCheck(env)) return;
    meth_callInstproxyCallback = (*env)->GetStaticMethodID(env, class_Callbacks, "callInstproxyCallback", "(Ljava/lang/String;[BI)V");
    if ((*env)->ExceptionCheck(env)) return;
    meth_callIDeviceEventCallback = (*env)->GetStaticMethodID(env, class_Callbacks, "callIDeviceEventCallback", "(ILjava/lang/String;)V");
    if ((*env)->ExceptionCheck(env)) return;
}
static void global_instproxy_status_cb(const char *operation, plist_t status, void *user_data) {
    char *plist_bin = NULL;
    uint32_t length = 0;
    plist_to_bin(status, &plist_bin, &length);

    JNIEnv *env;
    if ((*vm)->AttachCurrentThreadAsDaemon(vm, (void**) &env, NULL) != JNI_OK) {
        fprintf(stderr, "Failed to attach callback thread\n");
        abort();
    }
    jstring jop = (*env)->NewStringUTF(env, operation);
    jbyteArray jstatus = (*env)->NewByteArray(env, length);
    (*env)->SetByteArrayRegion(env, jstatus, 0, length, (const jbyte *) plist_bin);
    free(plist_bin);
    jint jid = *((jint*) &user_data);
    (*env)->CallStaticVoidMethod(env, class_Callbacks, meth_callInstproxyCallback, jop, jstatus, jid);
}
jlong get_global_instproxy_status_cb(void) {
    return (jlong) global_instproxy_status_cb;
}
static void global_idevice_event_cb(const idevice_event_t *event, void *user_data) {
    JNIEnv *env;
    if ((*vm)->AttachCurrentThreadAsDaemon(vm, (void**) &env, NULL) != JNI_OK) {
        fprintf(stderr, "Failed to attach callback thread\n");
        abort();
    }
    jint jeventType = event->event;
    jstring judid = (*env)->NewStringUTF(env, event->udid);
    (*env)->CallStaticVoidMethod(env, class_Callbacks, meth_callIDeviceEventCallback, jeventType, judid);
}
jlong get_global_idevice_event_cb(void) {
    return (jlong) global_idevice_event_cb;
}

static ssize_t upload_cb(void* buf, size_t size, void* userdata) {
    return fread(buf, 1, size, (FILE*) userdata);
}
mobile_image_mounter_error_t upload_image(mobile_image_mounter_client_t client, const char *image_path, const char *image_type, const char* sig, size_t sig_size) {
    FILE* f = fopen(image_path, "rb");
    if (!f) {
        return MOBILE_IMAGE_MOUNTER_E_UNKNOWN_ERROR;
    }
    struct stat fst;
    if (stat(image_path, &fst) != 0) {
        fclose(f);
        return MOBILE_IMAGE_MOUNTER_E_UNKNOWN_ERROR;
    }
    size_t image_size = fst.st_size;
    mobile_image_mounter_error_t err = mobile_image_mounter_upload_image(client, image_type, image_size, sig, sig_size, upload_cb, f);
    fclose(f);
    return err;
}
%}

%include "libimobiledevice/afc.h"
%include "libimobiledevice/installation_proxy.h"
%include "libimobiledevice/mobile_image_mounter.h"
%include "libimobiledevice/debugserver.h"

%pragma(java) jniclasscode=%{
  private static native void initNative();
  static {
    org.robovm.libimobiledevice.NativeLibrary.load();
    initNative();
  }
%}

%pragma(java) modulecode=%{
  public static PlistRef toPlistRef(long ptr) {
    return new PlistRef(ptr, false);
  }
%}
