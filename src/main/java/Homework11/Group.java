package Homework11;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Group {
    private List<Student> students = new ArrayList<>();
    private int groupId;
    private TrainingProgram trainingProgram;

    public Group(int groupId, TrainingProgram trainingProgram) {
        this.groupId = groupId;
        this.trainingProgram = trainingProgram;
    }

    public void addStudentToGroup(String firstName, String lastName) {
        Student student = new Student(firstName, lastName, groupId, trainingProgram);
        this.students.add(student);
    }

    public void addAspirantToGroup(String firstName, String lastName) {
        Aspirant student = new Aspirant(firstName, lastName, groupId, trainingProgram);
        this.students.add(student);
    }

    public void checkOutTheSeminar(String subject) {
        if(!trainingProgram.getProgram().contains(subject)){
            System.out.println("Такого предмета нет в программе");
        }

        for (Student student : students) {
            student.gradeBook.setGradeForSubject(subject, ThreadLocalRandom.current().nextInt(2, 5));
        }
    }

    public void printScholarshipForGroup() {
        System.out.printf("\nДанные группы %s\n", groupId);
        for (Student student : students) {
            System.out.printf("Студент: %s %s\n", student.getFirstName(), student.getLastName());
            System.out.printf("Средняя оценка: %s\n", student.getAverageMark());
            System.out.printf("Степендия(руб): %s\n", student.getScholarship());
        }
    }
}
