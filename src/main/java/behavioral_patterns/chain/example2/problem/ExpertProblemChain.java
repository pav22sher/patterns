package behavioral_patterns.chain.example2.problem;

public class ExpertProblemChain extends ProblemChain{
    @Override
    public void solveProblem(Problem problem) {
        ProblemLevel level = problem.getLevel();
        if(ProblemLevel.EXPERT == level) {
            System.out.println("Expert fix problem!");
        } else {
            chain.solveProblem(problem);
        }
    }
}
