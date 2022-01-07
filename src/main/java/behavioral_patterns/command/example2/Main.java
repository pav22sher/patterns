package behavioral_patterns.command.example2;

import behavioral_patterns.command.example2.file.TextFileOperationExecutor;

public class Main {
    public static void main(String[] args) {
        TextFileOperationExecutor executor = new TextFileOperationExecutor();
        executor.executeOperation(() -> System.out.println("Opening file file1.txt"));
        executor.executeOperation(() -> System.out.println("Saving file file1.txt"));
    }
}
