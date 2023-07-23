import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.NoSuchFileException;
import java.util.ArrayList;
import java.util.List;

/** Ex3.22 — Documentando exceções
 * @throws NoSuchFileException if the file does not exist
 * @throws DirectoryNotEmptyException if the file is a directory and
 * could not otherwise be deleted because the directory is not empty
 * @throws IOException if an I/O error occurs
 * @throws SecurityException in the case of the default provider,
 * and a security manager is installed, the {@link SecurityManager#checkDelete(String)}
 * method is invoked to check delete access to the file
 */

public class Notification {
    private final List<String> errors = new ArrayList<>();

    public void addError(final String message) {
        errors.add(message);
    }

    public boolean hasErrors() {
        return !errors.isEmpty();
    }

    public String errorMessage() {
        return errors.toString();
    }

    public List<String> getErrors() {
        return this.errors;
    }
}
