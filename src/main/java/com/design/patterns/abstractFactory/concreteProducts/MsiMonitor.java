package com.design.patterns.abstractFactory.concreteProducts;

import com.design.patterns.abstractFactory.products.Monitor;

public class MsiMonitor implements Monitor {
    @Override
    public void assemble() {
        System.out.println("Assembling msi Monitor");
    }
}
