package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        SomeQueue queue = new SomeQueue();

        System.out.print("Введите количество людей: ");

        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {

            System.out.print("Имя: ");
            String name = scanner.next();

            System.out.print("Возраст: ");
            int old = scanner.nextInt();

            queue.sort(old, name);
        }

        for ( int i = 0; i < count; i++ ){
            System.out.println( queue.peoples.poll() );
        }

    }
}
