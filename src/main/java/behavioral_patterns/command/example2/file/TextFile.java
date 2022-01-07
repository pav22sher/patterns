package behavioral_patterns.command.example2.file;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TextFile {
    private String name;
    public void open() {
        System.out.println("Opening file " + name);
    }
    public void save() {
        System.out.println("Saving file " + name);
    }
}
