package ru.job4j.professions;

public class Doctor extends Profession {
    private String specialization;
    private boolean licence;

    public Doctor(String name, String surname, String birthday, int age, String s, boolean l) {
        super(name, surname, birthday, age);
        specialization = s;
        licence = l;
    }

    public Doctor(String s, boolean l) {
        super();
        specialization = s;
        licence = l;
    }

    public Doctor() {
        super();
    }

    public String getSpecialization() {
        return specialization;
    }

    public boolean haveLicence() {
        return licence;
    }

    public Diagnosis heal(Pacient pacient) { }

    public SickList write(Diagnosis diagnosis) { }
}
