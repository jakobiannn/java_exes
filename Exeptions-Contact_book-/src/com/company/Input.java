package com.company;

import java.util.Scanner;

/**
 * Ввод данных в массив.
 */
class Input {

        private static final String ANSI_RESET = "\u001B[0m";
        private static final String ANSI_WHITE = "\u001B[30m";
        private static final String ANSI_RED_BACKGROUND = "\u001B[41m";


// Метод для определения количества непустых ячеек массива
         int howLong(String[] Arr) {
            int i = 0;
            for (String cont : Arr) {
                  if (cont != null) {
                        i++;
                  }
            }
        return i;
        }

void toFile() throws Exception {

        int arrlengh = howLong(Main.contactsArr);     // определяем длину непустого массива

        Scanner in = new Scanner(System.in);      //считываем данные

        System.out.println("Ведите Имя: ");
        String name = in.nextLine();              //чтобы не потерять имя, сохраним его в отдельную область

        System.out.println("Введите телефон: ");
        String phone = in.nextLine();

        for (int i = 0; i <= arrlengh; i++) { //проверим введеный номер и имя на совпадение с дргуими

            //если строки равны, выдадим ошибку и завершим программу
            if (Main.contactsArr[i] == null) {
                break;
            }

            if (Main.contactsArr[i].equals(name + " " + phone)) {

                throw (new Exception(ANSI_RED_BACKGROUND
                        + ANSI_WHITE
                        + "Контакт с таким именем уже существует!"
                        + ANSI_RESET));
                }
        }

        Main.contactsArr[arrlengh] = (name + " " + phone);   //если такого не имеется, присвоим его
    }
}
