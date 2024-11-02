
public class ChainExcDemo {

    private static void demoproc(){

        // create exception
        NullPointerException e = new NullPointerException("top layer");

        // add a cause
        e.initCause(new ArithmeticException("cause"));

        throw e;
    }

    public static void main(String[] args) {
        try {
            demoproc();
        } catch (Exception e) {
            // display top level exception
            System.out.println("Caught: " + e);

            // display cause exception
            System.out.println("Original cause: " + e.getCause());
        }
    }
}
