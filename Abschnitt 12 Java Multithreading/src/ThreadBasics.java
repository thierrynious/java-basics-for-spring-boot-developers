public class ThreadBasics {
    public static void main(String[] args) {
        //Main-Thread
        System.out.println("Main-Thread: " + Thread.currentThread().getName());

        //Klassicher Thread mit Runnable
        Runnable aufgabe = ()-> System.out.println("Läuft im Thread: "+Thread.currentThread().getName());
        Thread thread1 = new Thread(aufgabe);
        thread1.start();

        //Lambda direkt im Konstruktor
        new Thread(()-> System.out.println("Zweiter Thread aktiv")).start();

        //Virtualler Thread (ab java 21)
        //Thread.startVirtual(()-> System.out.println("Virtualler Thread läuft"));

        //Run statt start()->läuft im aktualler Thread, kein neuer
        Thread test = new Thread(()-> System.out.println("Wird NICHT parallel laufen"));
        test.run();
    }
}
