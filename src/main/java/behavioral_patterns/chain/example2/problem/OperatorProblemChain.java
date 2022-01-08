package behavioral_patterns.chain.example2.problem;

public class OperatorProblemChain extends ProblemChain{
    @Override
    public void solveProblem(Problem problem) {
        ProblemLevel level = problem.getLevel();
        if(ProblemLevel.OPERATOR == level) {
            System.out.println("Operator fix problem!");
        } else {
            chain.solveProblem(problem);
        }
    }
}
