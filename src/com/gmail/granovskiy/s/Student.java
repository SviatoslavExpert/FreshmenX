package com.gmail.granovskiy.s;

public class Student extends Human {
    //  field
    private boolean isPresent;

    //  constructor
    public Student(int id, String firstName, String lastName, int age, int reputation, boolean isPresent) {
        super(id, firstName, lastName, age, reputation);
        this.isPresent = isPresent;
    }

    public Student(boolean isPresent) {
        this.isPresent = isPresent;
    }

    public Student() {
        super();
    }

    //  getter and setter
    public boolean isPresent() {
        return isPresent;
    }

    public void setPresent(boolean present) {
        isPresent = present;
    }

    //  toString method
    @Override
    public String toString() {
        return "Student{" +
                "isPresent=" + isPresent + ", " + super.toString() +
                '}';
    }
}
