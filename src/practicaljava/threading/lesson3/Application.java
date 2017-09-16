package practicaljava.threading.lesson3;

class Worker extends Thread {

    private UnsafeSequence unsafeSequence = null;

    Worker(UnsafeSequence unsafeSequence) {
        this.unsafeSequence = unsafeSequence;
    }

    public void run() {
        for(int i = 0; i < 100; i++) {

            System.out.println("Got value: " + unsafeSequence.getNext() + " by " + Thread.currentThread().getName());
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}

public class Application {

    public static void main(String[] args) {


        UnsafeSequence unsafeSequence = new UnsafeSequence();

        Worker workerOne = new Worker(unsafeSequence);
        System.out.println("Starting thread 1");
        workerOne.start();

        Worker workerTwo = new Worker(unsafeSequence);
        System.out.println("Starting thread 2");
        workerTwo.start();

    }

}
