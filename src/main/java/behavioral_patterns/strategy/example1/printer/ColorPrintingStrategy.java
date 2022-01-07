package behavioral_patterns.strategy.example1.printer;

public class ColorPrintingStrategy implements PrintingStrategy{
    @Override
    public void print(Document document) {
        System.out.println("Цветная печать");
    }
}
