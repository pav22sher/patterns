package generating_patterns.factory_method.example1;

import generating_patterns.factory_method.example1.dialog.DialogWindow;
import generating_patterns.factory_method.example1.dialog.WebDialogWindow;
import generating_patterns.factory_method.example1.dialog.WindowsDialogWindow;


public class Main {
    public static void main(String[] args) {
        DialogWindow windowsDialogWindow = new WindowsDialogWindow();;
        windowsDialogWindow.render();
        DialogWindow webDialogWindow = new WebDialogWindow();;
        webDialogWindow.render();
    }
}
