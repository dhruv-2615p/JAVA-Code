/* 
 * object[] toArray()
 * <T> T[] toArray(T array[])
 * default <T> T[] toArray(IntFunction<T[]> arrayGen)
 */

import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);

        System.out.println("Contents of a1: " + arr);

        Integer ia[] = new Integer[arr.size()];
        ia = arr.toArray(ia);

        int sum = 0;
        for(int i : ia) sum += i;
        System.out.println("Sum is "+ sum);
    }
}
