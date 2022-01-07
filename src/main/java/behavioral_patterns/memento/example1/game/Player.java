package behavioral_patterns.memento.example1.game;

import lombok.Getter;

@Getter
public class Player {
    private int health = 100;

    public void getHurt(int hurt)
    {
        health -= hurt;
    }
    public void getCure(int cure)
    {
        health += cure;
    }
    public void setMemento(Memento memento)
    {
        health = memento.getHealth();
    }
    public Memento getMemento()
    {
        return new Memento(health);
    }
}
