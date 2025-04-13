package Homework11;

import lisson3.Array;

import java.util.List;

/**
 * 1. Класс Student содержит переменные: String firstName, lastName, group. А также, double averageMark, содержащую среднюю оценку.
 * 2. Создать метод getScholarship() для класса Student, который возвращает сумму стипендии. Если средняя оценка студента
 * равна 5, то сумма 2000 руб, иначе 1900. Переопределить этот метод в классе Aspirant.
 * Если средняя оценка аспиранта равна 5, то сумма 2500 руб, иначе 2200.
 */

public class Student {
    protected String firstName;
    protected String lastName;
    protected int group;
    protected double averageMark;

    public GradeBook gradeBook;


    public Student(String firstName, String lastName, int group, TrainingProgram subjectList) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        gradeBook = new GradeBook(subjectList);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getGroup() {
        return group;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public int getScholarship() {
        Double average = gradeBook.getAverageGrade();
        return average >= 5 ? 2000 : 1900;
    }
}
