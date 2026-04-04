public class ThreadEigenschaften {
    public static void main(String[] args) {
        //Thread mit Namen und Priorität erstellen
        Thread t = new Thread(()->{
            System.out.println("Thread-Name: "+Thread.currentThread().getName());
            System.out.println("Thread-ID: "+Thread.currentThread().getId());
            System.out.println("Thread-Zustand: "+Thread.currentThread().getState());

            try{
                //Thread pausiert für eine Sekunde
                Thread.sleep(3000);
            }catch(InterruptedException e){
                System.out.println("Thread wurde unterbrochen. ");
            }
        });

        //Namen und Priorität setzen
        t.setName("Worker-Thread");
        t.setPriority(Thread.MAX_PRIORITY);
        t.start();

        //Unterbrechung demonstrieren
        try{
            Thread.sleep(2000);
            t.interrupt();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
