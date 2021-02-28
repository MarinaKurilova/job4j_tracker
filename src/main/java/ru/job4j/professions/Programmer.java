package ru.job4j.professions;

public class Programmer extends Engineer {
    private String language;
    private String computer;

    public Programmer(int c, String s, String language, String computer) {
        super(c, s);
        this.language = language;
        this.computer = computer;
    }

    public Programmer() {
        super();
    }

    public String getLanguage() {
        return language;
    }

    public String getComputer() {
        return computer;
    }

    public Programm write(Code code) { }

    public Report fix(Bug bug) { }

}
