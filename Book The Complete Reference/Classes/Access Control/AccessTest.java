/** This cpde demonstrate the difference between public and private */
class Test {
    int a;
    public int b;
    private int c;

    // method to access c
    void setC(int i) {
        this.c = i;
    }

    int getC() {
        return c;
    }
}

public class AccessTest {
    public static void main(String[] args) {
        Test ob = new Test();

        // These are ok, and b may be accessed directly
        ob.a = 10;
        ob.b = 20;

        // this is not ok and will cause an error
        // // ob.c = 100; // Error

        // you can access through its method
        ob.setC(100); // ok

        System.err.println("a, b and c: " + ob.a + " " + ob.b + " " + ob.getC());
    }
}
