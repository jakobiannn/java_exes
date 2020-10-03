package com.company;

final class Utils {

    private Utils() {
        //not used
    }
    public static void print(final String text) {
        System.out.println(text);
    }

    static void print(final String text, final Color color) {

        System.out.println(color.getColor() + text + "\u001B[0m");

    }
}
