package structural_patterns.composite.example3;

import structural_patterns.composite.example3.component.container.Form;
import structural_patterns.composite.example3.component.field.NumberField;
import structural_patterns.composite.example3.component.field.TextField;

public class Main {
    public static void main(String[] args) {
        Form form = new Form();
        form.add(new TextField());
        form.add(new NumberField());
        System.out.println(form.check());
    }
}
