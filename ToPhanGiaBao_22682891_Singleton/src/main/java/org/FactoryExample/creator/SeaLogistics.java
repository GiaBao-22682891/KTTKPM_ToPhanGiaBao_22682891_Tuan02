package org.FactoryExample.creator;

import org.FactoryExample.concrete.Ship;
import org.FactoryExample.impl.Transport;
import org.FactoryExample.logic.Logistics;

public class SeaLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
