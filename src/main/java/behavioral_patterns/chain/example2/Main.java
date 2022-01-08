package behavioral_patterns.chain.example2;

import behavioral_patterns.chain.example2.problem.*;

public class Main {
    public static void main(String[] args) {
        RobotProblemChain robotChain = new RobotProblemChain();
        OperatorProblemChain operatorChain = new OperatorProblemChain();
        ExpertProblemChain expertChain = new ExpertProblemChain();
        robotChain.setNextChain(operatorChain);
        operatorChain.setNextChain(expertChain);
        robotChain.solveProblem(new Problem(ProblemLevel.ROBOT, "Not work!"));
        robotChain.solveProblem(new Problem(ProblemLevel.OPERATOR, "Not work!"));
        robotChain.solveProblem(new Problem(ProblemLevel.EXPERT, "Not work!"));
    }
}
