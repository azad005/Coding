class MyThread extends Thread {
    MyThread(String name) {
        super(name);
    }
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(getName() + " - Count: " + i);
            Thread.yield();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrupted.");
            }
        }
    }
}

public class threadclass {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new MyThread("Thread 1"), t2 = new MyThread("Thread 2"), t3 = new MyThread("Thread 3");
        t1.start(); 
        t2.start(); 
        t3.start();
        t1.join(); 
        t2.join(); 
        t3.join();
        System.out.println("All threads finished execution.");
    }
}
