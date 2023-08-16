package com.design.patterns.abstractFactory.concreteProducts;

import com.design.patterns.abstractFactory.products.Gpu;

public class MsiGpu implements Gpu {
    @Override
    public void assemble() {
        System.out.println("Assembling MSI GPU");
    }
}
