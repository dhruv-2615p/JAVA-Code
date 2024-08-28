//Using super to overcome name hiding
class A{
    int i;
}

class B extends A{
    int i; // this i hide the i in A

    B(int  a, int b){
        super.i = a; // i in A
        this.i = b; // i in B
    }

    void show(){
        System.err.println("i in superclass: " + super.i);
        System.err.println("i in subclass: " + i);
    }
}

public class UseSuper {
    public static void main(String[] args) {
        B subOb = new B(1, 2);

        subOb.show();
    }
}