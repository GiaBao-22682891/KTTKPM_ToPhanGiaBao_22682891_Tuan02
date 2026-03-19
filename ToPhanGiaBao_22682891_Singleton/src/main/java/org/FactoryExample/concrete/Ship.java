package org.FactoryExample.concrete;

import org.FactoryExample.impl.Transport;

public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivered by Ship ");
    }
}

