/**
 * BoxWithMethod
 * This program include methods in Box Class
 * public class must be define in it's own class
 */
class Box {

    double width;
    double height;
    double depth;

    Box(double width, double height, double depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // Display volume
    double volume(){
        return width * height * depth;
    }
}

/**
 * BoxWithMethod
 */
public class BoxWithMethod {

    public static void main(String[] args){
        Box myBox1 = new Box(10, 20, 15);
        Box myBox2 = new Box(3, 6, 9);
        double vol;

        // display volume of first box
        vol = myBox1.volume();
        System.out.println("Volume is: " + vol);
        
        // display volume of second box
        vol = myBox2.volume();
        System.out.println("Volume is: " + vol);
    }
}