package com.gmail.granovskiy.s;

public class Professor extends Human {
    //  field
    private String subject;

    //  constructor
    public Professor(int id, String firstName, String lastName, int age, int reputation, String subject) {
        super(id, firstName, lastName, age, reputation);
        this.subject = subject;
    }

    public Professor(String subject) {
        this.subject = subject;
    }

    public Professor() {
        super();
    }

    //  getters and setters
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    //  toString
    @Override
    public String toString() {
        return "Professor{" +
                "subject='" + subject + '\'' +
                '}';
    }

}
