${package}

import org.robovm.apple.foundation.NSObject;
import org.robovm.objc.annotation.Block;
import org.robovm.rt.Signals;
import org.robovm.rt.VM;

/**
 * Class that implements MainClass protocol/Interace
 * This class will be exposed by ${appName}_instance() call in objc world
 * Use it as Facade to get access to other Framework functionalities
 */
public class ${mainClass}Impl extends NSObject implements Api.${mainClass} {
    /**
     * singleton that will keep reference to Framework main class
     */
    private static ${mainClass}Impl frameworkInstance = new ${mainClass}Impl();

    /**
     * IMPORTANT: keep this method as it is. As when libframeworksupport is used this metthod will be called
     * right after VM initialization to provide
     */
    public static NSObject instantiate() {
        return frameworkInstance;
    }

    /**
     * IMPORTANT NOTE: avoid givinig method a name that begins with “alloc”, “new”, “copy”, or “mutableCopy”
     * (for example newCalculator) as ARC at native side will consider this object to be owned by native code
     * and will not retain it. If object is not retained anywhere at Java side this will cause EXC_BAD_ACCESS as
     * not retained Java objects are subject for Garbage Collection. if such prefixes are higly required these objects
     * MUST be extra retained before returning it from such method. E.g.
     * calc = new CalculatorImpl();
     * calc.reatain();
     * return calc;
     */
    @Override
    public Api.Calculator createCalculator() {
        return new CalculatorImpl();
    }

    @Override
    public void sayHello() {
        System.out.println("Hello world from RoboVM framework");
    }

    @Override
    public String roboVmVersion() {
        return VM.vmVersion();
    }

    @Override
    public void installSignals(@Block Runnable installer) {
        Signals.installSignals(installer::run);
    }
}
