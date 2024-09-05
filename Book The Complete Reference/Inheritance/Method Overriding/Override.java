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
    void show() {
        // super.show();   // this show invoke A's show() if needed 
        System.err.println("k: " + k);
    }
}

public class Override {
    public static void main(String[] args) {
        B b = new B(1, 2, 3);
        b.show(); 
    }
}
