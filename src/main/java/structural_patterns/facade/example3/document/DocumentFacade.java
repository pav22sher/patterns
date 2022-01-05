package structural_patterns.facade.example3.document;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DocumentFacade {
    private Document document;
    private SignDocumentService signDocumentService;
    private RejectDocumentService rejectDocumentService;
    public void accept() {
        signDocumentService.sign(document);
    }
    public void reject() {
        signDocumentService.sign(document);
        rejectDocumentService.reject(document);
    }
}
