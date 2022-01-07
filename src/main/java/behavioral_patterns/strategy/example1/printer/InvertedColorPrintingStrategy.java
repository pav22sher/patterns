package behavioral_patterns.strategy.example1.printer;

public class InvertedColorPrintingStrategy implements PrintingStrategy{
    @Override
    public void print(Document document) {
        System.out.println("Инвертировання цветная печать");
    }
}
