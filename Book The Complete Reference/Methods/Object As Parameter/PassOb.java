
/**
 * Test
 */
class Test {
    int a, b;

    Test(int i, int j){
        a = i;
        b = j;
    }
    
    // Return true if o is equal to the ivoking object
    boolean equalTo(Test o){
        if(o.a == a && o.b == b)    return true;
        return false;
    }
}

public class PassOb {
    public static void main(String[] args) {
        Test ob1 = new Test(100, 200);
        Test ob2 = new Test(100, 200);
        Test ob3 = new Test(-1, -1);

        System.err.println("ob1 == ob2: " + ob1.equalTo(ob2));
        System.err.println("ob1 == ob3: " + ob1.equalTo(ob3));
    }
}
