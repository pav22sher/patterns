package behavioral_patterns.chain.example2.problem;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Problem {
    private ProblemLevel level;
    private String description;
}