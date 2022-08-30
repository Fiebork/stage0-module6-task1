package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        String returnString = "This animal is mostly " + color + ". It has " + numberOfPaws;
        if (numberOfPaws == 1) {
            returnString += " paw and ";
        } else {
            returnString += " paws and ";
        }
        if (hasFur) {
            returnString += "a fur.";
            return returnString;
        }
        returnString += "no fur.";
        return returnString;
    }

}
