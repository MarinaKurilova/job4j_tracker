package ru.job4j.pojo;

import ru.job4j.oop.Product;

public class ShopDrop {
    public static Product[] leftShift(Product[] products, int index) {
        for (int i = 0; i < products.length - 1; i++) {
            if (index != products.length - 1) {
            products[index] = products[index + 1];
            }
            products[products.length - 1] = null;
        }
        return products;
    }
}
