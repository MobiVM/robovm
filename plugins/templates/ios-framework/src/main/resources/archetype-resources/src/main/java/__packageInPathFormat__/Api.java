${package}

import org.robovm.objc.ObjCProtocol;
import org.robovm.objc.annotation.Method;

/**
 * this class defines API SDK exports, API is exported as protocol as RoboVM creates objc classes during runtime
 * and these are not available during linking
 * fill free to define interfaces in other locations but it is just comfortable to keep all api in one file for small SDK.
 * things to consider:
 *   1. all interfaces shall extend ObjCProtocol
 *   2. all methods shall be annotated with @Mehthod otherwise they will not be registered as part of objc class
 *   3. if method has to return object from this api -- return protocol version of it
 *   4. it will be not possible to instantiate SDK classes with [[cls alloc] init] as there is no classe exposes
 *      compilation type to create new instance provide such api in SDK
 */
public final class Api {

    /**
     * this protocol is main class protocol that root entry point to SDK
     */
    interface ${mainClass} extends ObjCProtocol {

        /**
         * create Calculator class as it is not possible now to create instances from obj, e.g. [[Calculator alloc] init]
         * will not work
         * IMPORTANT NOTE: avoid givinig method a name that begins with “alloc”, “new”, “copy”, or “mutableCopy”
         * (for example newCalculator) as ARC at native side will consider this object to be owned by native code
         * and will not retain it. If object is not retained anywhere at Java side this will cause EXC_BAD_ACCESS as
         * not retained Java objects are subject for Garbage Collection. if such prefixes are higly required these objects
         * MUST be extra retained before returning it from such method. E.g.
         * calc = new CalculatorImpl();
         * calc.reatain();
         * return calc;
         */
        @Method Calculator createCalculator();

        /**
         * sample method implementation that take no params and returns nothing but prints hello to log
         */
        @Method void sayHello();

        /**
         * sample api that returns robovm version
         */
        @Method String roboVmVersion();
    }

    /**
     * this protocol defines another object that can be created by main framework class
     */
    interface Calculator extends ObjCProtocol {
        @Method int reset();
        @Method int add(int i);
        @Method int sub(int i);
        @Method int result();
    }
}
