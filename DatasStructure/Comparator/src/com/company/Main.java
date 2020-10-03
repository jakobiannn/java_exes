package com.company;

import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        CountComp CC = new CountComp();
        NameComp NC = new NameComp();


        System.out.println("Сортировка по количеству:");
        Set<Product> shop = new TreeSet<>(CC);

        shop.add(new Product("Зубная щетка",98));
        shop.add(new Product("Манго",30));
        shop.add(new Product("Весы",35));

        for (Product p: shop){
            System.out.println(p.getName() + " " + p.getCount() + " шт.");
        }


        System.out.println("Сортировка по имени:");
        Set<Product> shop2 = new TreeSet<>(NC);

        shop2.add(new Product("Весы",35));
        shop2.add(new Product("Зубная щетка",98));
        shop2.add(new Product("Манго",30));

        for (Product p: shop2){
            System.out.println(p.getName() + " " + p.getCount() + " шт.");
        }



    }
}
