import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<>();

        System.out.println("Initial size if a1: " + a1.size());

        // Add elemetnts to it
        a1.add("a");
        a1.add("b");
        a1.add("E");
        a1.add("B");
        a1.add("D");
        a1.add("F");
        a1.add(1, "A2");

        System.out.println("Size of a1 after addition: " + a1.size());
        System.out.println("Contents of a1: " + a1);
        a1.remove("F");
        a1.remove(2);

        System.out.println("Size of a1 after deletion: " + a1.size());
        System.out.println("Contents of a1: " + a1);
    }
}
