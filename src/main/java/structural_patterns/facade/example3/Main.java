package structural_patterns.facade.example3;

import structural_patterns.facade.example3.document.Document;
import structural_patterns.facade.example3.document.DocumentFacade;
import structural_patterns.facade.example3.document.RejectDocumentService;
import structural_patterns.facade.example3.document.SignDocumentService;

public class Main {
    public static void main(String[] args) {
        Document document = new Document();
        SignDocumentService signDocumentService = new SignDocumentService();
        RejectDocumentService rejectDocumentService = new RejectDocumentService();
        DocumentFacade facade = new DocumentFacade(document, signDocumentService, rejectDocumentService);
        facade.reject();
        System.out.println(document);
    }
}
