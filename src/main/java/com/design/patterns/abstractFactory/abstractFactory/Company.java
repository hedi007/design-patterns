package com.design.patterns.abstractFactory.abstractFactory;

import com.design.patterns.abstractFactory.products.Gpu;
import com.design.patterns.abstractFactory.products.Monitor;

public abstract class Company {

    public abstract Gpu createGpu();

    public abstract Monitor createMonitor();
}
