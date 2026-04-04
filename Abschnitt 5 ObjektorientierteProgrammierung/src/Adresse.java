public class Adresse {

    // final: Kann nach Konstruktion nicht mehr verändert werden
    private final String stadt;

    public Adresse(String stadt) {
        this.stadt = stadt;
    }

    public String getStadt() {
        return stadt;
    }
}
