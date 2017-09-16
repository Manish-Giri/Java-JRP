package practicaljava.threading.lesson3;

public class UnsafeSequence {

    private int value = 0;

    public int getNext() {
        value++;
        return value;
    }
}
