public class Person implements Comparable<Person> {

    String name;
    int alter;

    public Person(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    // Vergleich nach Name (natürliche Ordnung)
    @Override
    public int compareTo(Person other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", alter=" + alter +
                '}';
    }
}
