package com.design.patterns.builder;

public interface Builder {

    Builder id(int id);
    Builder brand(String brand);
    Builder model(String model);
    Builder color(String color);
    Builder engine(String engine);
    Builder height(int height);
    Builder nbrOfDoors(int nbrOfDoors) ;
}
