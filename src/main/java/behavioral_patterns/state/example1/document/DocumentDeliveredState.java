package behavioral_patterns.state.example1.document;

public class DocumentDeliveredState implements DocumentState{
    @Override
    public void nextStatus(Document document) {
        System.out.println("DocumentAccept nextDocumentStatus NOTHING happens");
    }

    @Override
    public void previousStatus(Document document) {
        document.setState(new DocumentSendState());
    }

    @Override
    public String getStatusName() {
        return DocumentStatus.DELIVERED.getStatusName();
    }
}
