
class RecTest{
    int values[];

    RecTest(int i){
        values = new int[i];
    }

    // display array -- recursively
    void printArray(int i){
        if(i == 0)  return;
        else    printArray(i - 1);
        System.err.println("["+ (i - 1) + "] " + values[i - 1]);
    }
}

public class Recursion2 {
    public static void main(String[] args) {
        int n = 10;
        RecTest ob = new RecTest(n);

        for(int i = 0; i < n; i++)     ob.values[i] = i;
        
        ob.printArray(n);
    }
}
