
// Primitive types passed by value
class Test {
    void meth(int i, int j) {
        i *= 2;
        j /= 2;
    }
}

public class CallByValue {
    public static void main(String[] args) {
        Test ob = new Test();

        int a = 15, b = 30;

        System.err.println("a and b before function call: " + a + " " + b);

        ob.meth(a, b);

        System.err.println("a and b after function call: " + a + " " + b);
    }
}
