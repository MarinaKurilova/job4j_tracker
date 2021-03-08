package ru.job4j.oop;

public final class Product {
    private String name;
    private int count;

    public Product(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int price() {
        return count - discount();
    }

    public int discount() {
        return 0;
    }

    public String label() {
        return name + " " + price();
    }
}
