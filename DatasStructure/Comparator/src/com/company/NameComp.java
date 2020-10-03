package com.company;

import java.util.Comparator;

public class NameComp implements Comparator<Product> {

    @Override
    public int compare(Product product1, Product product2) {
        return product1.getName().length() - product2.getName().length();
    }
}
