import java.time.*;
import java.time.format.DateTimeFormatter;

public class ZeitUndDatumDemo {

    public static void main(String[] args)throws Exception {

        //Aktuelles Datum und Zeit ermitteln
        LocalDate today = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.of(today, time);

        //Zeitraum berechnen
        LocalDate birthday = LocalDate.of(1990, 5, 20);
        Period age = Period.between(birthday, today);
        System.out.println("Alter: "+age.getYears()+" Jahre.");

        //Duration Beispiel
        Duration d = Duration.between(LocalTime.of(8,0),LocalTime.of(10,30));
        System.out.println("Dauer: "+d.toMinutes()+" Minuten.");

        //Zeit formatieren
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        String formatted = dateTime.format(formatter);
        System.out.println("Formatiertes Datum: "+formatted);


    }
}
