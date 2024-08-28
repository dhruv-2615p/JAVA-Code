// Show when constructors are executed

class A {
    A() {
        System.err.println("Inside A's constructor.");
    }
}

class B extends A {
    B() {
        System.err.println("Inside B's constructor.");
    }
}

class C extends B {
    C() {
        System.err.println("Inside C's constructor.");
    }
}

public class CallingCons {
    public static void main(String[] args) {
        C c = new C();
        System.err.println(c.toString());
    }
}
