package service;

import model.Student;

import java.util.Scanner;

public class StudentService {

    public Student create() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name");
        String name = scanner.next();
        System.out.println("Enter surname");
        String surname = scanner.next();
        System.out.println("Enter year");
        int year = scanner.nextInt();
        System.out.println("Enter mark");
        double mark = scanner.nextDouble();
        System.out.println("Enter gender");
        char gender = scanner.next().charAt(0);
        System.out.println("Enter PHD");
        boolean isPHD = scanner.next().equals("Yes");

        return new Student(name, surname, year, mark, gender, isPHD);
    }

    public void print(Student student) {
        if (student.getGender() == 'F' || student.getGender() == 'f') {
            System.out.println(student.getName());
            System.out.println(student.getSurname());
        } else {
            System.out.println(student.isPHD());
        }
    }

    public Student maxStudent(Student[] students) {

        Student minStudent = students[0];

        for (int i = 1; i < students.length; i++) {
            if (students[i].getYear() < minStudent.getYear()) {
                minStudent = students[0];
            }
        }
        return minStudent;
    }

    public Student minStudent(Student[] students) {

        Student minStudent = students[0];

        for (Student student : students) {
            if (student.getYear() > minStudent.getYear()) {
                minStudent = student;
            }
        }
        return minStudent;
    }

    public void getGirls(Student[] students) {

        for (Student x : students) {
            if (x.getGender() == 'f' || x.getGender() == 'F') {
                x.printInfo();
            }
        }
    }

    public void minGirlStudent(Student[] students) {
        Student minGirl = null;

        for (int i = 0; i < students.length; i++) {

            if (students[i].getGender() == 'f' || students[i].getGender() == 'F') {

                if (minGirl == null) {
                    minGirl = students[i];
                } else {
                    if (students[i].getYear() > minGirl.getYear()) {
                        minGirl = students[i];
                    }
                }

            }
        }

        if (minGirl == null) {
            System.out.println("No girl found");
        } else {
            minGirl.printInfo();
        }

    }

}