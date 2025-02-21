// Demonstrate multiple catch statements.

public class MultipleCatches {
    public static void main(String[] args) {
        try {
            int a = args.length;
            System.out.println("a = " + a);

            int b = 42 / a;
            System.out.println(b);

            int c[] = { 1 };
            c[42] = 99;
        } 
        
        catch (ArithmeticException e) {
            System.out.println("Divide by 0: " + e);
        } 
        
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index oob: " + e);
        }

        System.out.println("After try/catch blockes.");
    }
}
