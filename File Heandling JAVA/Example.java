import java.util.Comparator;

class xyz1{
    int c;

    xyz1(int cc){
        this.c = cc;
    }  
}

class xyz extends xyz1 implements Comparator<xyz>{

    int x;
    int y;

    public xyz(int x1, int y1, int x2) {
        super(x1);
        this.x = x2;
        this.y = y1;
    }

    @Override
    public int compare(xyz o1, xyz o2) {
        return o1.y - o2.y;
    }

}

public class Example {
    public static void main(String[] args) {
        
    }
}
