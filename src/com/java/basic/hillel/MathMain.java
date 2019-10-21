package com.java.basic.hillel;

public class MathMain {
    public static void main(String[] args) {
        int abs = Math.abs(-45);
        System.out.print(abs);

        double sqrt = Math.sqrt(25);
        System.out.print(sqrt);

        double x1 = 20.15;
        double result = Math.pow (1.1, x1) + Math.abs(Math.cos(Math.sqrt(Math.PI * x1))) - (3.0/ 8.0);
        System.out.print(result);

    }
}
