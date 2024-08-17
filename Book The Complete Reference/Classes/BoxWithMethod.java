/**
 * BoxWithMethod
 * This program include methods in Box Class
 * public class must be define in it's own class
 */
class Box {

    double width;
    double height;
    double depth;

    Box(){
        width = 10;
        height = 10;
        depth = 10;
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
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        double vol;

        // display volume of first box
        vol = myBox1.volume();
        System.out.println("Volume is: " + vol);
        
        // display volume of second box
        vol = myBox2.volume();
        System.out.println("Volume is: " + vol);
    }
}