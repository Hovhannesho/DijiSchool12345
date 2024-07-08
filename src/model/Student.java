package model;

public class Student {

    private String name;
    private String surname;
    private int year;
    private double mark;
    private char gender;
    private boolean isPHD;

    public Student(String name, String surname, int year, double mark, char gender, boolean isPHD) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mark = mark;
        this.gender = gender;
        this.isPHD = isPHD;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public boolean isPHD() {
        return isPHD;
    }

    public void setPHD(boolean PHD) {
        isPHD = PHD;
    }


    public void printInfo() {
        System.out.println("name: " + name);
        System.out.println("surname: " + surname);
        System.out.println("year: " + year);
        System.out.println("mark: " + mark);
        if (gender == 'M' || gender == 'm') {
            System.out.println("gender: " + "Male");
        } else {
            System.out.println("gender: " + "Female");
        }
        System.out.println("isPHD: " + (isPHD ? "Yes" : "No"));
    }
}