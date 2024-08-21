
// Object are passed through their reference
class Test {
    int a, b;

    Test(int i, int j) {
        a = i;
        b = j;
    }

    // pass an object
    void meth(Test ob) {
        ob.a *= 2;
        ob.b /= 2;
    }
}

public class PassObjRef {
    public static void main(String[] args) {
        Test ob = new Test(10, 20);

        System.err.println("ob.a and ob.b before call: " + ob.a + " " + ob.b);

        ob.meth(ob);

        System.err.println("ob.a and ob.b before call: " + ob.a + " " + ob.b);
    }
}
