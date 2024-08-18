// Demonstrate method overloading
class OverloadDemo{
    void test(){
        System.err.println("No parameters");
    }

    // Overload test for one integer parameter.
    void test(int a){
        System.err.println(a);
    }

    // Overload test for two integer parameters.
    void test(int a, int b){
        System.err.println("a and b: " + a + " " + b);
    }

    // Overload test for double parameters.
    double test(double a){
        System.err.println("double a: " + a);
        return a * a;
    }
}

public class Overload {
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();

        // call all versions of test()
        ob.test();
        ob.test(0);
        ob.test(0, 1);
        double result = ob.test(15.26);
        System.err.println("Result of ob.test(15.26): " + result);
    }
}
