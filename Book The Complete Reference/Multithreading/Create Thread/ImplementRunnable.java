// create second thread
class NewThread implements Runnable {
    Thread t;

    NewThread() {
        // Create a new, second thread
        t = new Thread(this, "Demo Thread");
        System.out.println("Child thread: " + t);
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Child Thread: " + i);
                Thread.sleep(800);
            }
        } catch (InterruptedException e) {
            System.out.println("Chlid interupted.");
        }

        System.out.println("Exiting child thread.");
    }

}

public class ImplementRunnable {
    public static void main(String[] args) {
        NewThread nt = new NewThread(); // create new thread

        nt.t.start();

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main Thread: " + i);
                Thread.sleep(1300);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Main thread existing.");
    }
}
