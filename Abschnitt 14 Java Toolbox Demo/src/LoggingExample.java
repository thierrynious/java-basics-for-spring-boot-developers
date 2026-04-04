import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingExample {

    private static final Logger log = Logger.getLogger(LoggingExample.class.getName());

    public static void main(String[] args) {

        log.info(()->String.format("Zeitstempel: %d", System.currentTimeMillis()));
    }
}
