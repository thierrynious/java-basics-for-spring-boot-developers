import java.util.concurrent.*;

public class ExecutorServiceKompakt {
    public static void main(String[] args)throws InterruptedException, ExecutionException {

        //Fixed Thread Pool mit Threads
        ExecutorService pool = Executors.newFixedThreadPool(2);

        //Runnable-Task ohne Rückgabewert
        pool.submit(() -> {
            System.out.println("Runnable-Task läuft im "+Thread.currentThread().getName());

            //Callable-Task mit Rückgabewert
            Future<String> result = pool.submit(() -> "Ergebnis aus Callable");
            try {
                System.out.println(result.get());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        });

        //Pool sauber beenden
        pool.shutdown();

        //ScheduledTask mit Verzögerung
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        scheduler.schedule(()-> System.out.println("Geplanter Task"),2,TimeUnit.SECONDS);
        scheduler.shutdown();
    }
}
