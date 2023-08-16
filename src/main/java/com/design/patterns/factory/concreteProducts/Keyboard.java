package com.design.patterns.factory.concreteProducts;

import com.design.patterns.factory.Product;

public class Keyboard implements Product {
    boolean isGamer;
    boolean isQwerty;

    @Override
    public void prepare() {
        isGamer = true;
        isQwerty = true;
    }
}
