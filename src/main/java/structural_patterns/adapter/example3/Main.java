package structural_patterns.adapter.example3;

public class Main {
    public static void main(String[] args) {
        CardReader cardReader = new CardReader(new MemoryCard());
        cardReader.connectWithUsbCable();
    }
}
