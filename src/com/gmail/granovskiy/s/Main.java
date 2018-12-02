package com.gmail.granovskiy.s;

public class Main {

    public static void main(String[] args) {
        // creating group object
        Group group = new Group();
        Professor professor = new Professor();

        /*  creating 10 objects of Student class using constructor  */
        Student student1 = new Student(1, "Mike", "Tomson", 22, 5, true);
        Student student2 = new Student(2, "Tina", "Dobson", 21, 5, false);
        Student student3 = new Student(3, "Lina", "Sheer", 22, 3, false);
        Student student4 = new Student(4, "Luka", "Beer", 21, 8, true);
        Student student5 = new Student(5, "Bob", "Lobster", 21, 9, true);
        Student student6 = new Student(6, "Tom", "Taheer", 21, 4, true);
        Student student7 = new Student(7, "Ted", "Liber", 20, 6, true);
        Student student8 = new Student(8, "Rick", "Trauben", 20, 2, true);
        Student student9 = new Student(9, "Rob", "Tratilaus", 20, 7, true);
        Student student10 = new Student(10, "Rick", "Macron", 20, 1, true);

        /*  try/catch and work with exception  */
        try {
            group.addStudent(student1);
            group.addStudent(student2);
            group.addStudent(student3);
            group.addStudent(student4);
            group.addStudent(student5);
            group.addStudent(student6);
            group.addStudent(student7);
            group.addStudent(student8);
            group.addStudent(student9);
            group.addStudent(student10);

        } catch (MyException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();
        System.out.println("Here is the original list of 10 students:");
        System.out.println(group);

        System.out.println();
        group.chooseLeader();

        System.out.println();
        group.doRollCall();

    }
}
