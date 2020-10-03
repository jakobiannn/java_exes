package com.company;

import java.io.IOException;


public class Main {
    private static final int limit = 200;            // Contacts limit
    static String[] contactsArr = new String[limit]; // array of contacts
    static String contactsFile = "Contacts.txt"; // File name

    public static void main(String[] args) throws Exception {

        TextOpt options = new TextOpt();

        try {
            options.read(contactsFile, Main.contactsArr); //Reading array
        } catch (IOException e) {
            System.out.println("Файл не найден.");
        }

        int number = 1; //Number of contact

        System.out.println("Список контактов: ");

        for (String info: Main.contactsArr) {
                if (info != null) {
                    System.out.println(number + ") " + info);
                    number++;
                }
            }

            Input put = new Input();

            put.toFile();                              //Rewrite array

            options.writeContacts(Main.contactsArr);   //Rewrite file



    }
}
