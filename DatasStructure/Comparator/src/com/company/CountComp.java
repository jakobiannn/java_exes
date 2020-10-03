package com.company;

import java.util.Comparator;

public class CountComp implements Comparator<Product> {

    @Override
    public int compare(Product product1, Product product2) {
        return product1.getCount() - product2.getCount();
    }

}
