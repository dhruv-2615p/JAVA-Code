/**
 * BoxWithMethod
 * This program include methods in Box Class
 * public class must be define in it's own class
 */
class Box {

    double width;
    double height;
    double depth;

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

        // assign values to myBox1's instance variables
        myBox1.width = 10;
        myBox1.depth = 20;
        myBox1.height = 15;

        /* assign different values to myBox2's instance variable */
        myBox2.width = 3;
        myBox2.depth = 6;
        myBox2.height = 9;

        // display volume of first box
        vol = myBox1.volume();
        System.out.println("Volume is: " + vol);
        
        // display volume of second box
        vol = myBox2.volume();
        System.out.println("Volume is: " + vol);
    }
}