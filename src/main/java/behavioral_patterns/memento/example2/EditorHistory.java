package behavioral_patterns.memento.example2;

import java.util.Stack;

public class EditorHistory {
    private final Stack<DocMemento> history = new Stack<>();
    public void push(DocMemento memento) {
        System.out.println("Сохранение документа.");
        history.push(memento);
    }
    public DocMemento pop() {
        System.out.println("Отмена последних действий.");
        return history.pop();
    }
}
