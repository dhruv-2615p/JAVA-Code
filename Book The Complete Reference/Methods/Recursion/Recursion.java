/**
 * Recursion
 */

// Simple example of recursion
class Factorial{
    // this is a recursive method
    int fact(int n){
        if(n == 1)  return 1;

        return fact(n - 1) * n;
    }
}

public class Recursion {
    public static void main(String[] args) {
        Factorial f = new Factorial();

        System.err.println("Factorial of 3 is: " + f.fact(3));
        System.err.println("Factorial of 4 is: " + f.fact(4));
        System.err.println("Factorial of 5 is: " + f.fact(5));
    }
}