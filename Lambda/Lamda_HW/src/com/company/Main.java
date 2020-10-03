package com.company;

public class Main {

    public static void main(String[] args) {

        Check check1 = (int number) -> number % 15 == 0;

        Check check2 = (int number) -> number > 0;

        Check check3 = (int number) -> {
            int current = 1;
            for (int i = 0; i <= number; i++) {
                current = current + current;
                if (current == number) {
                    return true;
                }
                if (current > number) {
                    break;
                }
            }
            return false;
        };

        if ( check1.isIt(24) ) {
            System.out.println("1");
        }

        if ( check2.isIt(24) ) {
            System.out.println("2");
        }

        if ( check3.isIt(30) ) {
            System.out.println("3");
        }

    }

}