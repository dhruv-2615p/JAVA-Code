/**
 * SimpleInheritance
 */

 // A simple inheritance
 // Create a superClass
class A{
    int i, j;

    void showij(){
        System.err.println("i and j: " + i + " " + j);
    }
}

class B extends A{
    int k;

    void showK(){
        System.err.println("k: " + k);
    }

    void sum(){
        System.err.println("i + j + k: " + (i + j + k));
    }
}

public class SimpleInheritance {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();

        // The superclass may be used by itself
        superOb.i = 10;
        superOb.j = 20;
        System.err.println("Contents of superOb: ");
        superOb.showij();

        /* The subclass has access to all public members of it's superclass */
        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;

        System.err.println("Contents of subOb: ");
        subOb.showij();
        subOb.showK();
        System.err.println();

        System.err.println("Sum of i, j and k in subOb: ");
        subOb.sum();
    }
}