package generating_patterns.abstract_factory.example1;

import generating_patterns.abstract_factory.example1.gui.MacFactory;
import generating_patterns.abstract_factory.example1.gui.WinFactory;

public class Main {
    public static void main(String[] args) {
        Application winApc = new Application(new WinFactory());
        winApc.paint();
        Application macApc = new Application(new MacFactory());
        macApc.paint();
    }
}
