package com.epam.mjc.stage0;

public class Bird extends Animal{

    private static final String color = "blue";
    private static final int numberOfPaws = 2;
    private static final boolean hasFur = false;

    public Bird() {
        super(color, numberOfPaws, hasFur);
    }

    @Override
    public String getDescription() {
        return "This animal is mostly blue. It has 2 paws and no fur. Moreover, it has 2 wings and can fly.";
    }
}
