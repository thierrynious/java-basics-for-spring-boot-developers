public class BedingungenDemo {

    public static void main(String[] args) {

        int zahl = 9;

        // if-Anweisung: prüft, ob zahl positiv ist
        if(zahl >0){
            System.out.println("Zahl ist positiv");
        }

        //if-else-Anweisung: prüft, ob Zahl gerade oder ungerade ist
        if(zahl%2==0){
            System.out.println("Zahl ist gerade");
        }else {
            System.out.println("Zahl ist ungerade");
        }

        // Ternäre Operatoren: Kompakte Form von if-else
        String ergebnis = (zahl>0)?"positiv":"nicht positiv";

        System.out.println(ergebnis);

        // Switch Anweisung: Wochentag ausgeben
        int wochentag = 8;

        switch(wochentag){
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
                                        System.out.println("Sonntag");
                                        break;
                                        default:
                                            System.out.println("Ungültiger Tag");
        }

    }
}
