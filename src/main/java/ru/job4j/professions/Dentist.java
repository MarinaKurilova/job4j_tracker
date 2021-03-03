package ru.job4j.professions;

public class Dentist extends Doctor {
    private String drill;
    private String mirror;

    public Dentist(String s, boolean l, String drill, String mirror) {
        super(s, l);
        this.drill = drill;
        this.mirror = mirror;
    }

    public Dentist() {
        super();
    }

    public String getDrill() {
        return drill;
    }

    public String getMirror() {
        return mirror;
    }

    public Smile repair(Tooth tooth) {
        return null; }

    public TeethBraces put(Smile smile) {
        return null;
    }
}
