package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.function.Consumer;


/**
 * Реализация с
 * ArrayList
 */

class Stock<T> implements Iterable <T> {


    private ArrayList<T> storage = new ArrayList<>();


    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        for (int i = 0; storage.get(i) != null; i++){
            System.out.println(iterator());
        }
    }


    void putIn() throws Exception {

        Scanner scanner = new Scanner(System.in);

        //Выбираем количество товаров
        System.out.print("Введите кол-во наименований: ");

        int count = scanner.nextInt();
        int number = 1;

        //Записываем наименование товара и проверяем его на совпадение
        for (int i = 0; i < count; i++) {

            System.out.print("Введите имя товара № " + (number) + ": ");
            number++;

            String goods = scanner.next();

            for (T name: storage) {
                if (goods.equals(name)) {
                    throw (new Exception("Данное наименование уже присутствует"));
                }
            }
            this.storage.add((T) goods);
        }
    }

    //Выводим содержимое
    void print() {
        int i = 1;
        for (T name: storage) {
            System.out.println("Товар № " + i + ": "+ name);
            i++;
        }
    }


}
