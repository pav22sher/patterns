package behavioral_patterns.state.example1.document;

public class DocumentSendState implements DocumentState{
    @Override
    public void nextStatus(Document document) {
        document.setState(new DocumentDeliveredState());
    }

    @Override
    public void previousStatus(Document document) {
        document.setState(new DocumentNewState());
    }

    @Override
    public String getStatusName() {
        return DocumentStatus.SEND.getStatusName();
    }
}
