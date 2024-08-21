
// Returning an object
class Test{
    int a;

    Test(int i){
        a = i;
    }

    Test incrByTen(){
        Test temp = new Test(a + 10);
        return temp;
    }
}

public class RetOb {
    public static void main(String[] args) {
        Test ob1 = new Test(2);
        Test ob2;

        ob2 = ob1.incrByTen();
        System.err.println("ob1.a: " + ob1.a);
        System.err.println("ob2.a: " + ob2.a);
        
        ob2 = ob2.incrByTen();
        System.err.println("ob2.a after second increase: " + ob2.a);
    }
}
