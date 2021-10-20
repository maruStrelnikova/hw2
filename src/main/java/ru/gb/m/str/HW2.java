package ru.gb.m.str;

public class HW2 {
    public static void main(String[] args) {
        sumOfNumber();
        number ();
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

    public static void number() {
        int a = 0;
        if (a >= 0) {
            System.out.println("Число а положительное");
        } else {
            System.out.println("Число а отрицательное");
        }
    }
}