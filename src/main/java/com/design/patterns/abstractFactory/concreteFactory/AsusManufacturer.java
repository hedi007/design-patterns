package com.design.patterns.abstractFactory.concreteFactory;

import com.design.patterns.abstractFactory.concreteProducts.AsusMonitor;
import com.design.patterns.abstractFactory.products.Monitor;
import com.design.patterns.abstractFactory.concreteProducts.AsusGpu;
import com.design.patterns.abstractFactory.abstractFactory.Company;
import com.design.patterns.abstractFactory.products.Gpu;

public class AsusManufacturer extends Company {
    @Override
    public Gpu createGpu() {
        return new AsusGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new AsusMonitor();
    }
}
