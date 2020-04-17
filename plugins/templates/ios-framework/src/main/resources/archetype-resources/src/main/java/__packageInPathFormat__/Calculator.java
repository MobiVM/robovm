${package}

import org.robovm.apple.foundation.NSObject;
import org.robovm.objc.annotation.CustomClass;
import org.robovm.objc.annotation.Method;

/**
 * simple implementation of Calculator
 */
@CustomClass("Calculator")
public class Calculator extends NSObject {
    private int register;

    @Method(selector = "init")
    public Calculator() {
    }

    @Method(selector = "initWithValue:")
    public Calculator(int startValue) {
        register = startValue;
    }

    @Method
    public int reset() {
        return register = 0;
    }

    @Method
    public int add(int i) {
        return register += i;
    }

    @Method
    public int sub(int i) {
        return register -= i;
    }

    @Method
    public int result() {
        return register;
    }
}
