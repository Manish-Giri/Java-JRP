package practicaljava.threading.lesson3;

public class SafeSequence {

    private int value = 0;

    public synchronized int getNext() {
        value++;
        return value;
    }
}
