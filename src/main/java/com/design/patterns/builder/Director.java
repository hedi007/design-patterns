package com.design.patterns.builder;

public class Director {

    public void buildCitroen(Builder builder) {
        builder.brand("Citroen")
                .color("Blue")
                .nbrOfDoors(4)
                .engine("1.6L")
                .height(115);
    }

    public void buildLambo(Builder builder) {
        builder.brand("Lamborghini")
                .model("Aventador")
                .color("Yellow")
                .height(120);
    }
}
