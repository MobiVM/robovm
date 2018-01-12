//
//  ${appName}.h
//  ${appName}
//
// Defines objc api for ${appName} implementation in RoboVM
//

#import <Foundation/Foundation.h>

//
// Calculator API -- everything is exposed as protocols
//
@protocol Calculator
-(int)reset;
-(int)add:(int) i;
-(int)sub:(int) i;
-(int)result;
@end

// and typedef NSObject<Calculator> to Calculator which makes to make code better readable
typedef NSObject<Calculator> Calculator;


//
// ${mainClass} of framework. it is entry point to framework.
//
@protocol ${mainClass}
-(Calculator *) newCalculator;
-(void) sayHello;
-(NSString*) roboVmVersion;
@end
typedef NSObject<${mainClass}> ${mainClass};

//
// macro that return instance of Framework's main class. On first access it also instantiate RoboVM
//
extern ${mainClass}* rvmInstantiateFramework(const char *className);
#define ${appName}_instance() rvmInstantiateFramework("${package}.${mainClass}Impl");
