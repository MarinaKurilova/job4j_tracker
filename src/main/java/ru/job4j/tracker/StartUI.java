package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Item item = new Item(1, "Task");
        tracker.add(item);
        System.out.println(tracker.findById(1));
    }
}
