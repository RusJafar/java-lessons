package Homework11;

import java.util.ArrayList;
import java.util.Iterator;

public class GradeByDiscipline {
    private String name;
    private ArrayList<Integer> gradeList;

    public GradeByDiscipline(String name) {
        this.name = name;
        this.gradeList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(Integer gradeList) {
        this.gradeList.add(gradeList);
    }

    public void printGradeList() {
        Iterator it = gradeList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public Integer getAverageGrade() {
        if(gradeList.size() == 0) {
            return 0;
        }
        Integer sum = 0;
        for (Integer integer : gradeList) {
            sum += integer;
        }
        return sum / gradeList.size();
    }
}
