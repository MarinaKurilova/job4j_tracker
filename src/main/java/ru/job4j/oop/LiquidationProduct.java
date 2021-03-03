package ru.job4j.oop;

public final class LiquidationProduct {
    private final int price;
    private final Product product;

    public LiquidationProduct(String name, int price) {
        this.price = price;
        product = new Product(name, price());
    }

    public Product getProduct() {
        return product;
    }

    public int price() {
        return price - discount();
    }

    public int discount() {
        return 90;
    }
}
