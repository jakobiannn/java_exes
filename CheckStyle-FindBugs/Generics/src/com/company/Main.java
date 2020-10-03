package com.company;


public final class Main {

    private Main() {
        //not called
    }

    /**
     * @param args - main method arguments
     */
    public static void main(final String[] args) {

        //Checking methods correct

        Utils test = new Utils();

        final int check1 = 4;
        final int check2 = 2;
        final String check3 = "Hello";
        final float check4 = (float) 2.34;

        test.print(check1);
        test.random(check2, check3, check4);
    }
}
