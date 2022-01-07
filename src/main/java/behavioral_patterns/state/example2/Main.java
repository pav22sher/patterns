package behavioral_patterns.state.example2;

import behavioral_patterns.state.example2.pkg.Package;

public class Main {
    public static void main(String[] args) {
        Package pkg = new Package();
        pkg.printStatus();
        pkg.nextState();
        pkg.printStatus();
        pkg.nextState();
        pkg.printStatus();
        pkg.previousState();
        pkg.printStatus();
    }
}
