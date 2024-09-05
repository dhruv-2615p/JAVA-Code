// Dynamic method dispatch
class A {
    void callme() {
        System.err.println("Inside A's callme method");
    }
}

class B extends A {
    // override callme()
    void callme() {
        System.err.println("Inside B's callme method");
    }
}

class C extends A {
    // override callme()
    void callme(){
        System.err.println("Inside C's callme method");
    }
}

public class Dispatch {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        A r; // obtain a reference of type A

        r = a;
        r.callme();

        r = b;
        r.callme();

        r = c;
        r.callme();
    }
}
