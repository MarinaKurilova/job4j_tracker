package ru.job4j.professions;

public class Builder extends Engineer {
    private String helmet;
    private String hammer;

    public Builder(int c, String s, String helmet, String hammer) {
    super(c, s);
    this.helmet = helmet;
    this.hammer = hammer;
    }

    public Builder() {
        super();
    }

    public String getHelmet() {
        return helmet;
    }

    public String getHammer() {
        return hammer;
    }

    public House build(Brick brick) {
        return null; }

    public Hole dig(Shovel shovel) {
        return null; }

}
