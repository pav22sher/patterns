package behavioral_patterns.strategy.example1;

import behavioral_patterns.strategy.example1.printer.ColorPrintingStrategy;
import behavioral_patterns.strategy.example1.printer.Document;
import behavioral_patterns.strategy.example1.printer.InvertedColorPrintingStrategy;
import behavioral_patterns.strategy.example1.printer.Printer;

public class Main {
    public static void main(String[] args) {
        Document document = new Document();
        Printer printer1 = new Printer(new ColorPrintingStrategy());
        printer1.print(document);
        Printer printer2 = new Printer(new InvertedColorPrintingStrategy());
        printer2.print(document);
    }
}
