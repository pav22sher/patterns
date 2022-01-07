package behavioral_patterns.strategy.example2.auth;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class SecurityService {
    private AuthStrategy strategy;
    public void authenticate(){
        if(this.strategy == null) {
            System.out.println("No Authentication Strategy set.");
        }
        this.strategy.auth();
    }
}
