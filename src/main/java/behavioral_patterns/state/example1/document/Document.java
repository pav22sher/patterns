package behavioral_patterns.state.example1.document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Document {
    private DocumentState state;

    public void nextStatus() {
        state.nextStatus(this);
    }

    public void previousStatus() {
        state.previousStatus(this);
    }

    public String getStatusName() {
        return state.getStatusName();
    }
}
