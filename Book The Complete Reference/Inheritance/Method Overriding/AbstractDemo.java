// A simple implementation of abstract
abstract class A {
    abstract void callme();

    // concrete method are still allowed in abstract classes
    void callmetoo() {
        System.out.println("This is concrete method.");
    }
}

class B extends A {
    void callme() {
        System.out.println("B's implementation of callme");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        B b = new B();

        b.callme();
        b.callmetoo();
    }
}
