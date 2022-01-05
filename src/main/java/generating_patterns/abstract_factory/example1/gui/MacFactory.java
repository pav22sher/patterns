package generating_patterns.abstract_factory.example1.gui;

import generating_patterns.abstract_factory.example1.button.Button;
import generating_patterns.abstract_factory.example1.button.MacButton;
import generating_patterns.abstract_factory.example1.checkbox.Checkbox;
import generating_patterns.abstract_factory.example1.checkbox.MacCheckBox;

public class MacFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckBox();
    }
}
