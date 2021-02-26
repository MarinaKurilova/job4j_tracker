package ru.job4j.inheritance;

public class Engineer extends Profession {
    private int category;
    private String sphere;

    public int getCategory() {
        return category;
    }
    public String getSphere() {
        return sphere;
    }
    public Scheme develop(Infomation info){}
}
