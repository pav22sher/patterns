package behavioral_patterns.chain.example2.problem;

public abstract class ProblemChain {
    protected ProblemChain chain;
    public void setNextChain(ProblemChain chain) {
        this.chain = chain;
    }
    public abstract void solveProblem(Problem problem);
}
