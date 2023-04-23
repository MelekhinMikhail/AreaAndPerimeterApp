package com.mirea.kt.areaandperimeterapp.util;

public class Valid {

    public static boolean isValidNumber(String number) {
        if (number == null || number.isEmpty()) {
            return false;
        }
        double result;
        try {
            result = Double.parseDouble(number);
        } catch (NumberFormatException e) {
            return false;
        }
        return !(result <= 0);
    }
}
