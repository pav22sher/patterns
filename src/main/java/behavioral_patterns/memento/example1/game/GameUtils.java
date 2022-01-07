package behavioral_patterns.memento.example1.game;

public class GameUtils {
    private Memento memento;
    public Memento getMemento() {
        return memento;
    }
    public void setMemento(Memento newMemento) {
        memento = newMemento;
    }
}
