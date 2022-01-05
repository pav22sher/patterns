package generating_patterns.abstract_factory.example1.gui;

import generating_patterns.abstract_factory.example1.button.Button;
import generating_patterns.abstract_factory.example1.checkbox.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
