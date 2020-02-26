${package}

import org.robovm.apple.foundation.NSObject;
import org.robovm.objc.annotation.Block;
import org.robovm.objc.annotation.CustomClass;
import org.robovm.objc.annotation.Method;
import org.robovm.rt.Signals;
import org.robovm.rt.VM;

/**
 * Class that implements MainClass protocol/Interace
 * This class will be exposed by ${appName}_instance() call in objc world
 * Use it as Facade to get access to other Framework functionalities
 */
@CustomClass("${appName}Demo")
public class ${appName}Demo extends NSObject {
    /*
     * IMPORTANT NOTE: avoid giving method a name that begins with “alloc”, “new”, “copy”, or “mutableCopy”
     * (for example newCalculator) as ARC at native side will consider this object to be owned by native code
     * and will not retain it. If object is not retained anywhere at Java side this will cause EXC_BAD_ACCESS as
     * not retained Java objects are subject for Garbage Collection.
     * IF SUCH RENAMES STILL REQUIRED: these objects MUST be extra retained before returning it. E.g.
     * calc = new CalculatorImpl();
     * calc.retain();
     * return calc;
     */

    /**
     * mapping constructor to -(void)init selector
     * IMPORTANT: no minus sign !
     */
    @Method(selector = "init")
    public ${appName}Demo() {
        System.out.println("Default constructor was called!");
    }

    /**
     * secondary constructor with parameter.
     * mapped to -(void)initWithText:(NSString*)test selector
     * IMPORTANT: no minus sign in @Method annotation
     */
    @Method(selector = "initWithText:")
    public ${appName}Demo(String text) {
        System.out.println("Secondary constructor with " + text + " called!");
    }

    /**
     * class method example, while method name is sayHello it is mapped to `+(void)hello` selector
     * IMPORTANT: no plus sign in @Method annotation
     */
    @Method(selector = "hello")
    public static void sayHello() {
        System.out.println("Hello world from RoboVM framework");
    }

    @Method
    public String roboVmVersion() {
        return VM.vmVersion();
    }

    /**
     * Native conde shall install crash handlers in block passed here as parameter;
     * Otherwise java will not be receiving signals and will not be able to catch Null Pointer exceptions
     * in java code
     */
    @Method
    public void installSignals(@Block Runnable installer) {
        Signals.installSignals(installer::run);
    }
}
