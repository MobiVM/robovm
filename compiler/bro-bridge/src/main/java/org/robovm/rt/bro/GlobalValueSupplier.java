package org.robovm.rt.bro;

import org.robovm.rt.bro.annotation.GlobalValue;

/**
 * Supplier interface for a {@link GlobalValue}
 */
public abstract class GlobalValueSupplier<T> {

    /**
     * Returns true if global value is available (e.g. there is no UnsatisfiedLinkError when accessing it)
     *
     * @return true if available
     */
    abstract public boolean isAvailable();

    /**
     * Returns the value of the {@link GlobalValue}.
     *
     * @return the value.
     */
    abstract public T value();
}
