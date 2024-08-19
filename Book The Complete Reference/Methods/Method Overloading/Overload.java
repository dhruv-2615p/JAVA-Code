// Demonstrate method overloading
class OverloadDemo{
    void test(){
        System.err.println("No parameters");
    }

    // // Overload test for one integer parameter.
    // void test(int a){
    //     System.err.println(a);
    // }

    // Overload test for two integer parameters.
    void test(int a, int b){
        System.err.println("a and b: " + a + " " + b);
    }

    // Overload test for double parameters.
    void test(double a){
        System.err.println("Inside test(double) a: " + a);
    }
}

public class Overload {
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        int i = 88;

        // call all versions of test()
        ob.test();
        ob.test(0, 1);

        ob.test(i);     // this will invoke test(double)
        ob.test(15.26);
    }
}
