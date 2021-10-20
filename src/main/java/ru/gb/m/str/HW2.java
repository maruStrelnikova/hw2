package ru.gb.m.str;

public class HW2 {
    public static void main(String[] args) {
        sumOfNumber();
    }

    public static boolean sumOfNumber() {
        int a = 8;
        int b = 6;
        int result = (a + b);
        if (result >= 10 && result <= 20) {
            return true;
        } else {
            return false;
        }
    }
}

