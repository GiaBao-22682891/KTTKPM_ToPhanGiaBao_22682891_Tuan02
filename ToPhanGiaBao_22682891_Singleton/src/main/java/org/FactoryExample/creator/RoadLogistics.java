package org.FactoryExample.creator;

import org.FactoryExample.concrete.Truck;
import org.FactoryExample.impl.Transport;
import org.FactoryExample.logic.Logistics;

public class RoadLogistics extends Logistics {

    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
