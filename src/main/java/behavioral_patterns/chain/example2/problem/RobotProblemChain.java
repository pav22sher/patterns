package behavioral_patterns.chain.example2.problem;

public class RobotProblemChain extends ProblemChain{
    @Override
    public void solveProblem(Problem problem) {
        ProblemLevel level = problem.getLevel();
        if(ProblemLevel.ROBOT == level) {
            System.out.println("Robot fix problem!");
        } else {
            chain.solveProblem(problem);
        }
    }
}
