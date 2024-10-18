import java.util.*;

// A reverse comparator for strings
class MyComp implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {

        //? Reverse the comparision
        return o2.compareTo(o1);

    }

    // No need to override equals or the default methods
}

public class CompDemo {
    public static void main(String[] args) {
        // Create a tree set
        TreeSet<String> ts = new TreeSet<>(new MyComp());

        // Add ele
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        for(String ele : ts)
            System.out.print(ele + " ");

        System.out.println();
    }
}
