package ru.job4j.inheritance;

public class Doctor extends Profession {
    private String specialization;
    private boolean licence;

    public String getSpecialization() {
        return specialization;
    }
    public boolean haveLicence() {
        return licence;
    }
    public Diagnosis heal(Pacient pacient){}
    public SickList write(Diagnosis diagnosis) {}
}
