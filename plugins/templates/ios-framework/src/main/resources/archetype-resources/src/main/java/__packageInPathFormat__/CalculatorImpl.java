${package}

import org.robovm.apple.foundation.NSObject;

/**
 * simple implementation of Calculator api
 */
public class CalculatorImpl extends NSObject implements Api.Calculator {
    private int register;

    @Override
    public int reset() {
        return register = 0;
    }

    @Override
    public int add(int i) {
        return register += i;
    }

    @Override
    public int sub(int i) {
        return register -= i;
    }

    @Override
    public int result() {
        return register;
    }
}
