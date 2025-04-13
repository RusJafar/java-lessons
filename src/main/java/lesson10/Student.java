package lesson10;

import java.util.Objects;

public class Student extends Man {
    protected String faculty;
    protected int trainingPeriod;
    protected int courseLevel;

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return trainingPeriod == student.trainingPeriod && courseLevel == student.courseLevel && Objects.equals(faculty, student.faculty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(faculty, trainingPeriod, courseLevel);
    }

    public String getFaculty() {
        return faculty;
    }

    public int getTrainingPeriod() {
        return trainingPeriod;
    }

    public int getCourseLevel() {
        return courseLevel;
    }
}
