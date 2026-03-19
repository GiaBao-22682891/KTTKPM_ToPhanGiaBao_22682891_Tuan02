package org.FactoryExample.logic;

import org.FactoryExample.impl.Transport;

public abstract class Logistics {
    protected abstract Transport createTransport();

    public void planDelivery() {
        Transport transport = createTransport();
        transport.deliver();
    }
}
