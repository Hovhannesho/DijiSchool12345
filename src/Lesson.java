import model.Student;
import service.StudentService;

import java.util.Scanner;

public class Lesson {

    public static void main(String[] args) {

        StudentService studentService = new StudentService();

        boolean isActive = true;

        Student[] students = new Student[10];
        int index = 0;

        while (isActive) {
            System.out.println("1: Enter a new student");
            System.out.println("2: Older student between two students");
            System.out.println("3: Youngest student in the list");
            System.out.println("4: Print all girl students");
            System.out.println("5: Print youngest girl students");
            System.out.println("6: Exit");

            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();

            switch (number) {
                case 1:
                    students[index] = studentService.create();
                    if (index < students.length - 1)
                        index++;
                    break;
                case 2:
                    Student[] array2 = new Student[index];
                    for (int i = 0; i < array2.length; i++) {
                        array2[i] = students[i];
                    }
                    Student maxStudent = studentService.maxStudent(array2);
                    maxStudent.printInfo();
                    break;
                case 3:
                    if (index > 0) {
                        Student[] array3 = new Student[index];
                        for (int i = 0; i < index; i++) {
                            array3[i] = students[i];
                        }
                        studentService.getGirls(array3);
                        System.out.println("*******************");
                    } else {
                        System.out.println("The first create Student");
                    }
                    break;
                case 4:
                    Student[] array4 = new Student[index];
                    for (int i = 0; i < array4.length; i++) {
                        array4[i] = students[i];
                    }
                    Student minStudent = studentService.minStudent(array4);
                    minStudent.printInfo();
                    break;
                case 5:
                    if (index > 0) {
                        Student[] array5 = new Student[index];
                        for (int i = 0; i < index; i++) {
                            array5[i] = students[i];
                        }
                        studentService.minGirlStudent(array5);
                    } else {
                        System.out.println("The first create Student");
                    }
                    break;
                case 6:
                    isActive = false;
            }
        }
    }
}