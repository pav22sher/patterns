package behavioral_patterns.state.example1;

import behavioral_patterns.state.example1.document.Document;
import behavioral_patterns.state.example1.document.DocumentNewState;

public class Main {
    public static void main(String[] args) {
        Document document = new Document();
        document.setState(new DocumentNewState());
        System.out.println(document.getStatusName());
        document.nextStatus();
        System.out.println(document.getStatusName());
        document.nextStatus();
        System.out.println(document.getStatusName());
        document.nextStatus();
        System.out.println(document.getStatusName());
        document.previousStatus();
        System.out.println(document.getStatusName());
    }
}
