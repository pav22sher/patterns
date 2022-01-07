package behavioral_patterns.memento.example1;

import behavioral_patterns.memento.example1.game.GameUtils;
import behavioral_patterns.memento.example1.game.Player;

public class Main {
    public static void main(String[] args) {
        GameUtils utils = new GameUtils();
        Player player = new Player();
        System.out.println(player.getHealth());
        utils.setMemento(player.getMemento());
        player.getHurt(30);
        System.out.println(player.getHealth());
        player.setMemento(utils.getMemento());
        System.out.println(player.getHealth());
    }
}
