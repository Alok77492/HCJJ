// Thread to print numbers from 1 to 10
class AscendingThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

// Thread to print numbers from 10 to 1
class DescendingThread extends Thread {
    public void run() {
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

public class ThreadPriorityExample {
    public static void main(String[] args) {
        // Create thread instances
        AscendingThread t1 = new AscendingThread();
        DescendingThread t2 = new DescendingThread();

        // Set thread priorities (optional, can use default)
        t1.setPriority(Thread.NORM_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);

        // Start the threads
        t1.start();
        t2.start();
    }
}
