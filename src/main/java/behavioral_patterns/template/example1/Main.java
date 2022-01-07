package behavioral_patterns.template.example1;

import behavioral_patterns.template.example1.flag.NetherlandsFlag;
import behavioral_patterns.template.example1.flag.RussianFlag;
import behavioral_patterns.template.example1.flag.ThreeRowsFlag;

public class Main {
    public static void main(String[] args) {
        System.out.println("Рисуем флаг России:");
        ThreeRowsFlag russianFlag = new RussianFlag();
        russianFlag.drawFlag();

        System.out.println("\nРисуем флаг Нидерландов:");
        ThreeRowsFlag netherlandsFlag = new NetherlandsFlag();
        netherlandsFlag.drawFlag();
    }
}
