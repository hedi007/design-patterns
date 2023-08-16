package com.design.patterns.factory.concreteCreators;

import com.design.patterns.factory.concreteProducts.Monitor;
import com.design.patterns.factory.Product;
import com.design.patterns.factory.creator.Store;

public class MonitorStore extends Store {
    @Override
    public Product createProduct() {
        return new Monitor();
    }
}
