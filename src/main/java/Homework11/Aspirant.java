package Homework11;

import java.util.List;

/**
 * Переопределить getScholarship в классе Aspirant.  Если средняя оценка аспиранта равна 5, то сумма 2500 руб, иначе 2200.
 */

public class Aspirant extends Student {


    public Aspirant(String firstName, String lastName, int group, TrainingProgram subjectList) {
        super(firstName, lastName, group, subjectList);
    }

    @Override
    public int getScholarship() {
        Double average = gradeBook.getAverageGrade();
        if (average == 0) {
            return 0;
        }
        return average >= 5 ? 2500 : 2200;
    }
}
