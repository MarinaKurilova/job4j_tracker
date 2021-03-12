package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class StartUI {
    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        Item item = new Item(1, "Task");
        Item item2 = new Item(2, "Question");
        Item item3 = new Item(3, "Task");
        tracker.add(item);
        tracker.add(item2);
        tracker.add(item3);
        System.out.println(tracker.findById(1));
        System.out.println(Arrays.toString(tracker.findByName("Task")));
    }
}
