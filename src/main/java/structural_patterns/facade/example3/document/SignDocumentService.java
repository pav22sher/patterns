package structural_patterns.facade.example3.document;

import java.util.List;

public class SignDocumentService {
    public void sign(Document document) {
        document.setSign(true);
    }

    public void signGroup(List<Document> documents) {
        for(Document document: documents) {
            sign(document);
        }
    }
}
