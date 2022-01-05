package generating_patterns.abstract_factory.example1;

import generating_patterns.abstract_factory.example1.button.Button;
import generating_patterns.abstract_factory.example1.checkbox.Checkbox;
import generating_patterns.abstract_factory.example1.gui.GUIFactory;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Application {
    private GUIFactory factory;
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        this.factory = factory;
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void paint(){
        button.paint();
        checkbox.paint();
    }
}
