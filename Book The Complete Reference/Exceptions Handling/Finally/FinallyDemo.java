
public class FinallyDemo {
    // Thows an exception out of the method
    private static void procA() {
        try {
            System.out.println("Inside procA");
            throw new RuntimeException("demo");
        } 
        finally{
            System.out.println("procA's finally");
        }
    }

    private static void procB(){
        try {
            System.out.println("Inside procB");
            return;
        } 
        finally{
            System.out.println("procB's finally");
        }
    }

    // Excecute a try block normally
    private static void procC(){
        try{
            System.out.println("inside procC");
        }
        finally{
            System.out.println("procC's finally");
        }
    }

    public static void main(String[] args) {
        try{
            procA();
        }
        catch (Exception e){
            System.out.println("Exception caught: " + e);
        }

        procB();
        procC();
    }
}
