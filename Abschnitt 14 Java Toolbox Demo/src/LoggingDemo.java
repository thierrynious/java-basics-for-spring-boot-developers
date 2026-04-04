    import java.io.IOException;
    import java.util.logging.*;

    public class LoggingDemo {

        public static void main(String[] args) throws IOException {

            //Logging einrichten
            Logger logger = Logger.getLogger("DemoLogger");
            logger.setLevel(Level.ALL);
            ConsoleHandler handler = new ConsoleHandler();
            handler.setLevel(Level.ALL);
            logger.addHandler(handler);

            //Logmeldungen auf verschiedene Leveln
            logger.info("Anwendung gestartet ");
            logger.warning("Dies ist eine Warnung");
            logger.severe("Dies ist eine schwerer Fehler!!!");

            //Optional: Log in Datei schreiben
            FileHandler fileHandler = new FileHandler("app.log");
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);
            logger.info("Diese Nachricht wird in Datei geloggt. ");


        }
    }
