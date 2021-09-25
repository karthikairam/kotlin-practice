package com.rk.learnkotlin.s9_java_interoperability;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Car {
    private String color;
    private String model;
    private int year;

    public Car(String color, String model, int year) {
        this.color = color;
        this.model = model;
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(@NotNull String color) {
        this.color = color;
    }

    public @Nullable String getModel() {
        return model;
    }

    public void setModel(@Nullable String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void variableMethod(int num, String... strings) {
        for (String string: strings) {
            System.out.println(string);
        }
    }

    public void wantsIntArray(int[] intArr) {
        for(int i : intArr) System.out.println(i);
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
