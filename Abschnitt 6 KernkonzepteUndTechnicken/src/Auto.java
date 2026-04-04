import java.util.Objects;

/**
 * Auto erbt automatisch von Object
 */
public class Auto {

    String name;
    int ps;

    public Auto(String name, int ps) {
        this.name = name;
        this.ps = ps;
    }

    // toString: Beschreibung des Objekts

    @Override
    public String toString() {
        return "Auto{" +
                "name='" + name + '\'' +
                ", ps=" + ps +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return ps == auto.ps && Objects.equals(name, auto.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ps);
    }
}
