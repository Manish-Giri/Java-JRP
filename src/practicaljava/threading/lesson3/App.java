package practicaljava.threading.lesson3;


class SafeWorker extends Thread {

    private SafeSequence safeSequence = null;

    SafeWorker(SafeSequence safeSequence) {
        this.safeSequence = safeSequence;
    }

    public void run() {
        for(int i = 0; i < 100; i++) {

            System.out.println("Got value: " + safeSequence.getNext() + " by " + Thread.currentThread().getName());
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
public class App {

    public static void main(String[] args) {
        SafeSequence safeSequence = new SafeSequence();

        // first thread
        SafeWorker safeWorker1 = new SafeWorker(safeSequence);
        System.out.println("Starting thread 1");
        safeWorker1.start();

        // first thread
        SafeWorker safeWorker2 = new SafeWorker(safeSequence);
        System.out.println("Starting thread 2");
        safeWorker2.start();



    }

}
