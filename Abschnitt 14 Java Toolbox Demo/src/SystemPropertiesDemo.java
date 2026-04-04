public class SystemPropertiesDemo {
    public static void main(String[] args) {

        //Speicherinformationen der JVM anzeigen
        Runtime rt = Runtime.getRuntime();
        System.out.println("Max Memory: " + rt.maxMemory());
        System.out.println("Total Memory: " + rt.totalMemory());
        System.out.println("Free Memory: " + rt.freeMemory());

        //Anzahl verfügbarer Prozessoren ausgeben
        System.out.println("Prozessoren: "+rt.availableProcessors());

        //System-Properties ausgeben
        System.out.println("Benutzerverzeichnis: "+System.getProperty("user.dir"));
        System.out.println("OS Name: "+System.getProperty("os.name"));

        //Eigene Properties setzen und abrufen
        System.setProperty("app.env","dev");
        System.out.println("App Env: "+System.getProperty("app.env"));
    }
}
