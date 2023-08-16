package com.design.patterns.abstractFactory.concreteFactory;

import com.design.patterns.abstractFactory.abstractFactory.Company;
import com.design.patterns.abstractFactory.concreteProducts.DellGpu;
import com.design.patterns.abstractFactory.concreteProducts.DellMonitor;
import com.design.patterns.abstractFactory.products.Gpu;
import com.design.patterns.abstractFactory.products.Monitor;

public class DellManufacturer extends Company {
    @Override
    public Gpu createGpu() {
        return new DellGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new DellMonitor();
    }
}
