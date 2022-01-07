package behavioral_patterns.state.example1.document;

public interface DocumentState {
    void nextStatus(Document document);
    void previousStatus(Document document);
    String getStatusName();
}
