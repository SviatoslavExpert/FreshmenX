package com.gmail.granovskiy.s;

import java.util.Arrays;

public class Group {
    //  field
    private Student[] studentsArray = new Student[10];

    //  constructor
    public Group(Student[] studentsArray) {
        this.studentsArray = studentsArray;
    }

    public Group() {
        super();
    }

    //  getter and setter
    public Student[] getStudentsArray() {
        return studentsArray;
    }

    public void setStudentsArray(Student[] studentsArray) {
        this.studentsArray = studentsArray;
    }

    /* method addStudent  */
    public void addStudent(Student student) throws MyException {
		/*
		if (student == null) {
			throw new IllegalArgumentException("Null student");
		}
		*/
        for (int i = 0; i < studentsArray.length; i++) {
            if (studentsArray[i] == null) {
                studentsArray[i] = student;
                System.out.println(student.getLastName() + " is added to group.");
                return;
            }
        }
        throw new MyException();
    }

    //  method chooseLeader
    public void chooseLeader() {
        int score = 0;
        for (int i = 0; i < studentsArray.length; i++) {
            if (score < studentsArray[i].getReputation()) {
                score = studentsArray[i].getReputation();
            }
        }
        for (int i = 0; i < studentsArray.length; i++) {
            if (score == studentsArray[i].getReputation()) {
                System.out.println("This is the class Leader: " + studentsArray[i].getFirstName() + " " + studentsArray[i].getLastName() + ".");
            }
        }
    }

    //  method doRollCall
    int count = 0;

    public void doRollCall() {
        System.out.println("This is the presence/absence statistics: ");
        for (int i = 0; i < studentsArray.length; i++) {
            System.out.println(studentsArray[i].getLastName() + " : " + studentsArray[i].isPresent());
            if (studentsArray[i].isPresent() == true) {
                count++;
            }
        }
        System.out.println();
        System.out.println("There are " + count + " students present.");
        System.out.println("There are " + (studentsArray.length - count) + " students absent.");
    }

    //  toString method
    @Override
    public String toString() {
        return "Group{" +
                "studentsArray=" + Arrays.toString(studentsArray) +
                '}';
    }

}