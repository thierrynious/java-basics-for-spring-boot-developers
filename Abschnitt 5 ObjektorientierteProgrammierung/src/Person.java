public class Person {

    // private: Nur innerhalb der Klasse sichtbar
    private String name;
    private int alter;

    // Zugriff auf private Daten erlauben

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isBlank())
            this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        if (alter > 0) {
            this.alter = alter;
        }
    }
}
