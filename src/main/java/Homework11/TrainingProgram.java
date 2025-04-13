package Homework11;

import java.util.List;

public class TrainingProgram {
    List<String> program;
    public TrainingProgram(List<String> programList) {
        this.program = programList;
    }

    public List<String> getProgram() {
        return program;
    }

    public void printProgramList() {
        for (String s : program) {
            System.out.println(s);
        }
    }

    public void setProgram(String program) {
        this.program.add(program);
    }
}
