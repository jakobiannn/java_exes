package com.company;

public class Main {

    public static void main(String[] args) {

        Random word = new Random();
        String num = word.generate();

        System.out.println(num);

        int size = word.numbers.size();
        for (int i = 0; i < 10; i++) {

            String bubble = String.valueOf(i);

            int total = (int) word.numbers.stream().filter(bubble::equals).count();

            double percent = ((double) total / (double) size) * 100;
            System.out.println("Элемент " + i + " встречается "
                    + total + " раз. (" + percent + " %)");
        }
    }
}