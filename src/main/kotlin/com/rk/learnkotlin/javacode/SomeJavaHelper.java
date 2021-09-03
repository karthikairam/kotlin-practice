package com.rk.learnkotlin.javacode;

public class SomeJavaHelper {
    public boolean receive_booleanFromKotlin(final boolean flag) {
        System.out.println(flag);
        return flag;
    }

    public boolean receive_BooleanFromKotlin(final boolean flag) {
        System.out.println(flag);
        return flag;
    }

    public void receiveIntArrayFromKotlin(final int[] intArray) {
        for (int a : intArray) {
            System.out.println(a);
        }
    }
}
