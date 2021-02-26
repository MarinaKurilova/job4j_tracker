package ru.job4j.inheritance;

public class Builder extends Engineer{
    private String helmet;
    private String hammer;

    public String getHelmet() {
        return helmet;
    }
    public String getHammer() {
        return hammer;
    }
    public House build(Brick brick) {}
    public Hole dig(Shovel shovel) {}

}
