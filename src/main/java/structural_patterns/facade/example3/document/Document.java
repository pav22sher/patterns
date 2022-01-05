package structural_patterns.facade.example3.document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Document {
    private boolean sign;
    private boolean reject;
}
