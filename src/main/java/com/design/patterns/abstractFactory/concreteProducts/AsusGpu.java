package com.design.patterns.abstractFactory.concreteProducts;

import com.design.patterns.abstractFactory.products.Gpu;

public class AsusGpu implements Gpu {

    @Override
    public void assemble() {
        System.out.println("Assembling ASUS GPU");
    }
}
