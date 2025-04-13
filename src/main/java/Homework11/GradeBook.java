package Homework11;

import java.util.*;

public class GradeBook {
    private List<GradeByDiscipline> gradeList;
    private TrainingProgram subjectList;

    public GradeBook(TrainingProgram subjectList) {
        this.subjectList = subjectList;
        this.gradeList = new ArrayList<>();
        for (String s : subjectList.getProgram()) {
            GradeByDiscipline discipline = new GradeByDiscipline(s);
            gradeList.add(discipline);
        }
    }

    public void setGradeForSubject(String subject,  Integer grade) {
        if(!subjectList.getProgram().contains(subject)) {
            System.out.printf("В журнале нет предмета %s", subject);
        }

        for (GradeByDiscipline discipline : gradeList) {
            if(discipline.getName().equals(subject)) {
                discipline.setGrade(grade);
            }
        }
    }

    public double getAverageGradeForSubject(String subject) {
        if(!subjectList.getProgram().contains(subject)) {
            System.out.printf("В журнале нет предмета %s", subject);
        }
        for (GradeByDiscipline discipline : gradeList) {
            if(discipline.getName().equals(subject)) {
                return discipline.getAverageGrade();
            }
        }

        return 0;
    }

    public double getAverageGrade() {
        Integer sum = 0;
        for (GradeByDiscipline discipline : gradeList) {
            sum += discipline.getAverageGrade();
        }
        return  sum / gradeList.size();
    }
}
