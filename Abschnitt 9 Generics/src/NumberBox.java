/**
 * Genereics - bounds
 * @param <T>
 */
public class NumberBox<T extends Number> {
    private T value;
    public void set(T value) {
        this.value = value;
    }

    public double getAsDouble() {
        return value.doubleValue(); // Zugriff auf Methoden von Number
    }
}
