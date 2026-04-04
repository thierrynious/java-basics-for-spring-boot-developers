public class MyNumber implements Comparable<MyNumber>{

    private final int value;

    public MyNumber(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(MyNumber other) {
        return Integer.compare(this.value, other.value);
    }

    @Override
    public String toString() {
        return "MyNumber{" +
                "value=" + value +
                '}';
    }
}
