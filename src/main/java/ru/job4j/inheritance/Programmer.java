package ru.job4j.inheritance;

public class Programmer extends Engineer{
    private String language;
    private String computer;

    public String getLanguage() {
        return language;
    }
    public String getComputer() {
        return computer;
    }
    public Programm write(Code code) {}
    public Report fix(Bug bug) {}

}
