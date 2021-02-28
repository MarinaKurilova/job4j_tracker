package ru.job4j.inheritance;

public class JSONReport extends TextReport {
    public String generate(String n, String b) {
        n = "\"name\"";
        b = "\"body\"";
        return  "\"name\"" + " : " + n + "," + System.lineSeparator() + "\"body\"" + " : " + b;
    }
}
