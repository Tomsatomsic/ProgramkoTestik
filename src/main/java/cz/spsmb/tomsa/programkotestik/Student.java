package cz.spsmb.tomsa.programkotestik;

import java.util.ArrayList;
import java.util.List;

public class Student extends Subject {


    private final List<Subject> subjects = new ArrayList<>();
    private String name;
    private String surname;


    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Student() {

    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String[] texts) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String[] texts) {
    }
}





