//
//  ${appName}.h
//  ${appName}
//
// Defines objc api for ${appName} implementation in RoboVM
//

#import <Foundation/Foundation.h>

//
// Calculator class
//
@interface Calculator
-(id)init;
-(id)initWithValue:(int)startValue;
-(int)reset;
-(int)add:(int) i;
-(int)sub:(int) i;
-(int)result;
@end

//
// ${appName}Demo class with basic API demonstration
//
@interface ${appName}Demo
-(id)init;
-(id)initWithText:(NSString*)text;
+(void)hello;
-(NSString*)roboVmVersion;
-(void)installSignals:(void(^)(void))installer;
@end
