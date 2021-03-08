package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Vasiliy Petrov");
        student.setGroup("MB1");
        student.setAdmission(new Date());

        System.out.println(student.getName() + " admitted to the group "
                + student.getGroup() + " in a " + student.getAdmission());
    }
}
