package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private String saw;
    private String scalpel;

    public String getSaw() {
        return saw;
    }
    public String getScalpel() {
        return scalpel;
    }

    public Surgery operate(Diagnosis diagnosis) {}
    public Advice ask(Traumatologist traumatologist) {}
}
