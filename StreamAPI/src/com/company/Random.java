package com.company;

import java.util.ArrayList;
import java.util.List;

class Random {

    List<String> numbers = new ArrayList<>();

    private int rnd(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    String generate() {

        String s = new String();

        String bubble = new String();

        for (int i = 0; i <= rnd(60,99); i++) {

            bubble = String.valueOf(rnd(0, 9));

            s += bubble;

            numbers.add(bubble);
        }

        return s;
    }
}