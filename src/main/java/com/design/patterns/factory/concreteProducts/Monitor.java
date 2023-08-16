package com.design.patterns.factory.concreteProducts;

import com.design.patterns.factory.Product;

public class Monitor implements Product {
    private int refreshRate;
    private String norme;

    @Override
    public void prepare() {
        refreshRate = 144;
        norme = "HD";
    }
}
