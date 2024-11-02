/** This program contain an error
 * 
 * A subclass must come before its supercalss in a serice of catch statements.
 * If not, unreachable code will be created and a compile-time error will result.
 * 
 */

public class SuperSubCatch {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 42 / a;
            a = b;
        } catch (Exception e) {
            System.out.println("Generic Exception catch.");
        }
        /* This catch is never reachaed because
         * 
         * ArithmeticException is a subclass of Exception. */

        /* catch (ArithmeticException e){
            System.out.println("This is never reached.");
        } */
    }
}
