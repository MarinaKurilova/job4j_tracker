package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private String drill;
    private String mirror;

    public String getDrill() {
        return drill;
    }
    public String getMirror() {
        return mirror;
    }
    public Smile repair(Tooth tooth) {}
    public TeethBraces put(Smile smile) {}
}
