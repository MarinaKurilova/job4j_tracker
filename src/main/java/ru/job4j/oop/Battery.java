package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int capacity) {
        this.load = capacity;
    }

    public void exchange(Battery another) {
        another.load = another.load + this.load;
        this.load = 0;
    }
}
