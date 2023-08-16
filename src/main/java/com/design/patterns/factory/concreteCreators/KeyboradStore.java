package com.design.patterns.factory.concreteCreators;

import com.design.patterns.factory.concreteProducts.Keyboard;
import com.design.patterns.factory.Product;
import com.design.patterns.factory.creator.Store;

public class KeyboradStore extends Store {
    @Override
    public Product createProduct() {
        return new Keyboard();
    }
}
