package generating_patterns.abstract_factory.example1.gui;

import generating_patterns.abstract_factory.example1.button.Button;
import generating_patterns.abstract_factory.example1.button.WinButton;
import generating_patterns.abstract_factory.example1.checkbox.Checkbox;
import generating_patterns.abstract_factory.example1.checkbox.WinCheckBox;

public class WinFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WinCheckBox();
    }
}
