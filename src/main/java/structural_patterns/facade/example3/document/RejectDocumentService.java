package structural_patterns.facade.example3.document;

import java.util.List;

public class RejectDocumentService {
    public void reject(Document document) {
        document.setReject(true);
    }
    public void rejectGroup(List<Document> documents) {
        for(Document document: documents) {
            reject(document);
        }
    }
}
