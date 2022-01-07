package behavioral_patterns.command.example2.file;

public class TextFileOperationExecutor {
    public void executeOperation(TextFileOperation operation) {
        operation.execute();
    }
}
