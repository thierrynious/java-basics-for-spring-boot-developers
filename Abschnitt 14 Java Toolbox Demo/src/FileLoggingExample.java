import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class FileLoggingExample {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger("FileLogger");
        FileHandler fileHandler = new FileHandler("app.log");
        logger.addHandler(fileHandler);

        logger.info("Diese Nachricht wird in die Datei geschrieben.");
    }
}
