package com.epam.mjc.stage0;

public class Dog extends Animal{

    private static final String color = "brown";
    private static final int numberOfPaws = 4;
    private static final boolean hasFur = true;

    public Dog() {
        super(color, numberOfPaws, hasFur);
    }
}
