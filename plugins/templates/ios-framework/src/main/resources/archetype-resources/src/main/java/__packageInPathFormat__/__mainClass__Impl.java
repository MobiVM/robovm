${package}

import org.robovm.apple.foundation.NSObject;
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

    @Override
    public Api.Calculator newCalculator() {
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
}
