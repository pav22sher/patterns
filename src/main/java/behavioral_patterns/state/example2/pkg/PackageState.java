package behavioral_patterns.state.example2.pkg;

public interface  PackageState {
    void next(Package pkg);
    void prev(Package pkg);
    void printStatus();
}
