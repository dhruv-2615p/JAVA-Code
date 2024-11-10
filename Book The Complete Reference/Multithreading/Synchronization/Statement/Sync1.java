class Callme {
    void call(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
            // TODO: handle exception
        }
        System.out.println("]");
    }
}

class Caller implements Runnable {
    String msg;
    Thread t;
    Callme target;

    Caller(Callme target, String msg) {
        this.target = target;
        this.msg = msg;
        t = new Thread(this);
    }

    @Override
    public void run() {
        synchronized (target) {
            target.call(msg);
        }
    }

}

public class Sync1 {
    public static void main(String[] args) {
        Callme target = new Callme();
        Caller ob1 = new Caller(target, "Hello");
        Caller ob2 = new Caller(target, "Synchronized");
        Caller ob3 = new Caller(target, "World");

        // start the threads.
        ob1.t.start();
        ob2.t.start();
        ob3.t.start();

        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Mian thread interrupted.");
            // TODO: handle exception
        }
    }
}
