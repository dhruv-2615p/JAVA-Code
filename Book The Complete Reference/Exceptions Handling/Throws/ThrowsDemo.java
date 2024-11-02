
/* This code not complile */
/* 
public class ThrowsDemo {

    private static void throwsOne() {
        System.out.println("Inside thowsOne.");
        throw new IllegalAccessException("Demo");
    }

    public static void main(String[] args) {
        throwsOne();
    }
} */

public class ThrowsDemo{
    private static void thoesOne() throws IllegalAccessException{
        System.out.println("Inside thowsOne");
        throw new IllegalAccessException("demo");
    }

    public static void main(String[] args) {
        try {
            thoesOne();
        } catch (IllegalAccessException e) {
            System.out.println("Caught: " + e);
        }
    }
}
