package com.design.patterns.abstractFactory.concreteFactory;

import com.design.patterns.abstractFactory.concreteProducts.MsiGpu;
import com.design.patterns.abstractFactory.concreteProducts.MsiMonitor;
import com.design.patterns.abstractFactory.abstractFactory.Company;
import com.design.patterns.abstractFactory.products.Gpu;
import com.design.patterns.abstractFactory.products.Monitor;

public class MsiManufacturer extends Company {
    @Override
    public Gpu createGpu() {
        return new MsiGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new MsiMonitor();
    }
}
