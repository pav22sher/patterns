package behavioral_patterns.state.example1.document;

public enum DocumentStatus {
    NEW("новый"),
    SEND("отправлен"),
    DELIVERED("доставлен");

    private final String statusName;

    DocumentStatus(String statusName) {
        this.statusName = statusName;
    }

    public String getStatusName() {
        return statusName;
    }
}
