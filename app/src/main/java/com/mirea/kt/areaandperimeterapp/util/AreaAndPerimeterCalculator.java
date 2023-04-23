package com.mirea.kt.areaandperimeterapp.util;

public class AreaAndPerimeterCalculator {

    public static double calcTriangleArea(double a, double b, double c) {
        if (!isCorrectTriangle(a, b, c)) {
            throw new IllegalArgumentException();
        }
        double semiPerimeter = calcTrianglePerimeter(a, b, c) / 2;
        double result = semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c);
        if (result < 0) {
            throw new ArithmeticException();
        }
        return Math.sqrt(result);
    }

    public static double calcTrianglePerimeter(double a, double b, double c) {
        if (!isCorrectTriangle(a, b, c)) {
            throw new IllegalArgumentException();
        }
        return a + b + c;
    }

    public static double calcRectangleArea(double a, double b) {
        if (!isCorrectRectangle(a, b)) {
            throw new IllegalArgumentException();
        }
        return a * b;
    }

    public static double calcRectanglePerimeter(double a, double b) {
        if (!isCorrectRectangle(a, b)) {
            throw new IllegalArgumentException();
        }
        return (a + b) * 2;
    }

    private static boolean isCorrectTriangle(double a, double b, double c) {
        return !(a <= 0) && !(b <= 0) && !(c <= 0);
    }

    private static boolean isCorrectRectangle(double a, double b) {
        return !(a <= 0) && !(b <= 0);
    }
}
