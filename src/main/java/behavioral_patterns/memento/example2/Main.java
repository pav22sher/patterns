package behavioral_patterns.memento.example2;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Doc doc = new Doc();
        EditorHistory history = new EditorHistory();
        System.out.println(doc);
        doc.setText("Привет, мир!");
        doc.setColor(Color.GREEN);
        System.out.println(doc);
        history.push(doc.saveState());
        doc.setText("И снова привет!!!");
        doc.setColor(Color.BLACK);
        System.out.println(doc);
        doc.restoreState(history.pop());
        System.out.println(doc);
    }
}
