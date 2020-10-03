package com.company;

enum Color {
    ANSI_RED("\u001B[31m"),
    ANSI_GREEN("\u001B[32m"),
    ANSI_YELLOW("\u001B[33m"),
    ANSI_BLUE("\u001B[34m"),
    ANSI_PURPLE("\u001B[35m"),
    ANSI_CYAN("\u001B[36m"),
    ANSI_WHITE("\u001B[37m");


    private String color;
    Color(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }
}



class Utils{
    public static void print(String text){
        System.out.println(text);
    }

    public static void print(String text, Color color) {

        System.out.println(color.getColor() + text + "\u001B[0m");

    }
}

public class Main{

    private static int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    public static void main(String[] args) {
        String SomeColor;

        final int rnd = rnd(0,6);

        switch (rnd){
            case 0:
                Utils.print("This is RED",Color.ANSI_RED);
                break;
            case 1:
                Utils.print("This is GREEN",Color.ANSI_GREEN);
                break;
            case 2:
                Utils.print("This is YELLLOW",Color.ANSI_YELLOW);
                break;
            case 3:
                Utils.print("This is BLUE",Color.ANSI_BLUE);
                break;
            case 4:
                Utils.print("This is PURPLE",Color.ANSI_PURPLE);
                break;
            case 5:
                Utils.print("This is CYAN",Color.ANSI_CYAN);
                break;
            case 6:
                Utils.print("This is WHITE", Color.ANSI_WHITE);
                break;
        }

    }

}

