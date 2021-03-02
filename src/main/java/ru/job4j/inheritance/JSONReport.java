package ru.job4j.inheritance;

public class JSONReport extends TextReport {
    @Override
    public String generate(String n, String b) {
        return  "{" + System.lineSeparator() + "\t" + "\"name\"" + " : " + n + ","
        + System.lineSeparator() + "\t" + "\"body\"" + " : " + b + System.lineSeparator() + "}";
    }
}
