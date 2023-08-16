package com.design.patterns.factory.creator;

import com.design.patterns.factory.Product;

public abstract class Store {
    public Product orderProduct() {
        Product product = createProduct();
        product.prepare();
        return product;
    }

    public abstract Product createProduct();
}
