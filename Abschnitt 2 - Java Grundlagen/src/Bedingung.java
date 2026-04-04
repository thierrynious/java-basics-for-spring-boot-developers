/**
 * Dieses Beispiel zeigt verschiedene bedingte Anweisungen in Java.
 */
public class Bedingung {

    public static void main(String[] args) {

        int zahl = 10;

        // if-Anweisung: prüft, ob Zahl positiv ist
        if(zahl >0){
            System.out.println("zahl ist positiv");
        }

        // if-else-Anweisungen: prüft, ob Zahl gerade oder ungerade ist
        if(zahl%3==0){
            System.out.println("Zahl ist gerade");
        }else {
            System.out.println("Zahl ist ungerade");
        }

        // Ternäre Operator: Kompakte Form von if-else
        String ergebnis = (zahl>0)?"positiv":"nicht positiv";
        System.out.println("Ternär geprüft: Die Zahl ist "+ergebnis);

        //switch-Anweisung: Wochentag ausgeben
        int wochentag = 4;

        switch (wochentag){
            case 1:
                System.out.println("Montag");
                break;
                case 2:
                    System.out.println("Dienstag");
                    break;
                    case 3:
                        System.out.println("Mittwoch");
                        break;
                        case 4:
                            System.out.println("Donnerstag");
                            break;
                            case 5:
                                System.out.println("Freitag");
                                break;
                                case 6:
                                    System.out.println("Samstag");
                                    break;
                                    case 7:
                                        System.out.println("Sonstag");
                                        break;
                                        default:
                                            System.out.println("Ungültiger Tag");

        }

        String tag = switch (wochentag){
            case 1 ->"Montag";
             case 2 -> "Dienstag";
             case 3 -> "Mittwoch";
            default -> "Unbekannt";

        };
        System.out.println("Tag(modern):" +tag);
    }
}
