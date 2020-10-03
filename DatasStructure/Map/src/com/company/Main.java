package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество пользователей: ");

        int count = scanner.nextInt();
        int number = 1;

        UserMap userMap = new UserMap();

        for (int i = 0; i < count; i++){
            //Вводим логин
            System.out.print("Введите имя " + number + "-го пользователя: ");
            String login = scanner.next();
            //Проверяем логин на совпадения
            userMap.checkName(login);

            System.out.print("Введите пароль " + number + "-го пользователя: ");
            number++;
            //Вводим пароль
            String pass = scanner.next();

            //Вводим данные в map
            userMap.setUser(login,pass);
        }

        System.out.print("Введите имя пользователя: ");

        String login = scanner.next();

        System.out.println("Пароль пользователя " +
                login + ": " + userMap.getPass(login));
    }
}
