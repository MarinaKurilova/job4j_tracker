package ru.job4j.professions;

public class Engineer extends Profession {
    private int category;
    private String sphere;

    public Engineer(String name, String surname, String birthday, int age, int c, String s) {
        super(name, surname, birthday, age);
        category = c;
        sphere = s;
    }

    public Engineer(int c, String s) {
        super();
        category = c;
        sphere = s;
    }

    public Engineer() {
        super();
    }

    public int getCategory() {
        return category;
    }

    public String getSphere() {
        return sphere;
    }

    public Scheme develop(Infomation info) {
        return null;
    }
}
