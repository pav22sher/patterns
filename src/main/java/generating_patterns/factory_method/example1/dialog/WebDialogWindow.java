package generating_patterns.factory_method.example1.dialog;

import generating_patterns.factory_method.example1.button.Button;
import generating_patterns.factory_method.example1.button.WebButton;

public class WebDialogWindow extends DialogWindow {
    @Override
    Button createButton() {
        return new WebButton();
    }
}
