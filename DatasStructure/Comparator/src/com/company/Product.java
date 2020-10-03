package com.company;


public class Product implements Comparable<Product> {

    //В класс продукт добавить поле int count – количество. Создать два класса имплементирующих
    //интерфейс Comparator. Первый реализует метот сравнения по полю name, второй по полю count.
    //Произвести сортировку коллекции по цепочке, в начале по кол-ву, затем по названию.

        private int count;

        private String name;

        Product(String name, int count){
            this.name = name;
            this.count = count;
        }

        @Override
        public int compareTo(Product o) {
            return name.compareTo(o.getName());
        }

        String getName(){
            return name;
        }

        int getCount(){
            return count;
        }


}
