package com.java.basic.hillel;

import java.sql.SQLOutput;

public class CalculationMain {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        float c = 10.5f;

        float result = a + b * c;
        float result2 = (a + b) * c;

        System.out.println("Result: " + result);
        System.out.println("Result2: " + result2);

        double result3 = 345667.124D * 34.3D;
        System.out.println("Result3: " + result3);
    }
}
