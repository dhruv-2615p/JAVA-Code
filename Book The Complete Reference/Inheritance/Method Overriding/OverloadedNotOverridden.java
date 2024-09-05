// Method overriding
class A {
    int i, j;

    A(int a, int b) {
        i = a;
        j = b;
    }

    // display i and j
    void show() {
        System.err.println("i and j: " + i + " " + j);
    }
}

class B extends A {
    int k;

    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    // display k overrides show () in A
    void show(String msg) {
        // super.show();   // this show invoke A's show() if needed 
        System.err.println(msg + k);
    }
}

public class OverloadedNotOverridden {
    public static void main(String[] args) {
        B b = new B(1, 2, 3);
        b.show("This is k: ");  // this call show() in B
        b.show();   // this call show() in A
    }
}
