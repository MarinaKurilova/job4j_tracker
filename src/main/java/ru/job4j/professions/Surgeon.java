package ru.job4j.professions;

public class Surgeon extends Doctor {
    private String saw;
    private String scalpel;

    public Surgeon(String s, boolean l, String saw, String scalpel) {
        super(s, l);
        this.saw = saw;
        this.scalpel = scalpel;
    }

    public Surgeon() {
        super();
    }

    public String getSaw() {
        return saw;
    }

    public String getScalpel() {
        return scalpel;
    }

    public Surgery operate(Diagnosis diagnosis) {
        return null;
    }

    public Advice ask(Traumatologist traumatologist) {
        return null;
    }
}
