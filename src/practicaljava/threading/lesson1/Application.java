package practicaljava.threading.lesson1;

class Task extends Thread {
        @Override
        public void run() {
            for(int i = 0; i < 50; i++) {
                System.out.println("Number: " + i);
            }
        }
}

public class Application {

    public static void main(String[] args) {
        Task taskRunner = new Task();
        taskRunner.start();

        System.out.println(taskRunner.getState().toString());
        System.out.println(taskRunner.getName());
        System.out.println("Hello Threads!");
        System.out.println(taskRunner.getState().toString());

    }
}
