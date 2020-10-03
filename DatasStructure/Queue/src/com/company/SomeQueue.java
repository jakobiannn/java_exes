package com.company;

import java.util.ArrayDeque;
import java.util.Queue;


class SomeQueue {

    Queue<String> peoples = new ArrayDeque<>();

    void sort(int old , String name) {

        peoples.add(name);

        // проверяем на пенсионный возраст
        if (old >= 65) {

            // цикл для занесения пенсионера на первую позицию
            System.out.println( name + ' ' + peoples.peek() );
            while ( !name.equals( peoples.peek() ) ) {

                 /* если очередь не пустая, то "передвигаем" пенсионера
                     на первую позицию */
                    String bubble = peoples.remove();

                    peoples.add(bubble);
                }
            }
        }
    }
