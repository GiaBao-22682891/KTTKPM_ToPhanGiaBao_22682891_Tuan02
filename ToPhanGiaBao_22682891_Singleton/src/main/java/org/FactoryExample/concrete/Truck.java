package org.FactoryExample.concrete;

import org.FactoryExample.impl.Transport;

public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivered by Truck ");
    }
}
