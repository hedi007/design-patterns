package com.design.patterns.factory.concreteCreators;

import com.design.patterns.factory.concreteProducts.Mouse;
import com.design.patterns.factory.Product;
import com.design.patterns.factory.creator.Store;

public class MouseStore extends Store {
    @Override
    public Product createProduct() {
        return new Mouse();
    }
}
