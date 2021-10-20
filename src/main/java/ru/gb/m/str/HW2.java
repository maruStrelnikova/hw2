package ru.gb.m.str;

public class HW2 {
    public static void main(String[] args) {
        sumOfNumber();
        determineTheNumber ();
        number();
        printText ("Some text", 3);
        System.out.println("findOutTheYear = " + findOutTheYear (1993));
        System.out.println("findOutTheYear = " + findOutTheYear(2006) );
        System.out.println("findOutTheYear = " + findOutTheYear(1992) );
        System.out.println("findOutTheYear = " + findOutTheYear(1560) );
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

    public static void determineTheNumber() {
        int a = 0;
        if (a >= 0) {
            System.out.println("Число а положительное");
        } else {
            System.out.println("Число а отрицательное");
        }
    }
    public static boolean number() {
        int a = -2;
        if (a >= 0) {
            return false;
        } else {
            return true;
        }

    }
    public static void printText(String text, int n) {
        for(int i = 0; i<n; i++){
            System.out.println( text);
        }
    }
    public static boolean findOutTheYear ( int year) {
        if (year %4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else if (year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}