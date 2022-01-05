package generating_patterns.factory_method.example1.dialog;

import generating_patterns.factory_method.example1.button.Button;

public abstract class DialogWindow {
    public void render() {
        Button button = createButton();
        button.render();
    }
    abstract Button createButton();
}
