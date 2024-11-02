public class Exc2 {
    public static void main(String[] args) {
        int d, a;

        try {
            d = 0;
            a = 42 / d;
            System.out.println("This will not be printed." + a);
        } 
        catch (ArithmeticException e) {
            System.out.println("Division by zero not allowed.");
        }

        System.out.println("After catch statement.");
    }
}
