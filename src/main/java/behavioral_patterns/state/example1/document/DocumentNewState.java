package behavioral_patterns.state.example1.document;

public class DocumentNewState implements DocumentState{
    @Override
    public void nextStatus(Document document) {
        document.setState(new DocumentSendState());
    }

    @Override
    public void previousStatus(Document document) {
        System.out.println("DocumentNew previousDocumentStatus NOTHING happens");
    }

    @Override
    public String getStatusName() {
        return DocumentStatus.NEW.getStatusName();
    }
}
