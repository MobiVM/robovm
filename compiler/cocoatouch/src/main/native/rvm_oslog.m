#include <os/log.h>
#include <stdio.h>

///
/// RoboVM wrapper arround 
///
@interface RvmOSLog: NSObject
@end
@implementation RvmOSLog
+(os_log_t) DISABLED { return OS_LOG_DISABLED; }
+(os_log_t) DEFAULT { return OS_LOG_DEFAULT; }
+(void) logPublic:(os_log_t) log withType:(os_log_type_t) type message:(const char*) msg {
    if (@available(iOS 10.0, macOS 10.12, *)) {
        os_log_with_type(log, type, "%{public}s", msg);
    }
}

+(void) logPrivate:(os_log_t) log withType:(os_log_type_t) type message:(const char*) msg {
    if (@available(iOS 10.0, macOS 10.12, *)) {
        os_log_with_type(log, type, "%{private}s", msg);
    }
}

@end
