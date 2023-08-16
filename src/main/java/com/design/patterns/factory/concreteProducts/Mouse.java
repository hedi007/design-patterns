package com.design.patterns.factory.concreteProducts;

import com.design.patterns.factory.Product;

public class Mouse implements Product {
    boolean isRgb;
    int buttonNumber;

    @Override
    public void prepare() {
        isRgb = false;
        buttonNumber = 6;
    }
}
