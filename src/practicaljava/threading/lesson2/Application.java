package practicaljava.threading.lesson2;

class Task extends Thread {
    private String name;

    Task(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        Thread.currentThread().setName(name);
        for(int i = 0; i < 100; i++) {
            System.out.println("Number: " + i + " -- " + Thread.currentThread().getName());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Application {

    public static void main(String[] args) {

        Task task1 = new Task("Thread-A");
        task1.start();


        Task task2= new Task("Thread-B");
        task2.start();

        System.out.println("Hello Threads!");

    }
}
