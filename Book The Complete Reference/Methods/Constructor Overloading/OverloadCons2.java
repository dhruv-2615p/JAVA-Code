
/**
 * Here box allows one object to initialize another.
 */
class Box {
    double width;
    double height;
    double depth;

    // This constructor takes an object of type Box.
    Box(Box ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // Constructore used when all dimensions specified
    Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    // Construcotre used when no dimensions specified
    Box(){
        width = -1;
        height = -1;
        depth = -1;
    }

    // Constructor used when cube is created
    Box(double len){
        width = height = depth = len;
    }

    // Compute and return volume
    double volume(){
        return width * height * depth;
    }
}

public class OverloadCons2 {
    public static void main(String[] args) {
        // Create boxes using the various costrucotrs
        Box myBox1 = new Box(10, 20, 15);
        Box myBox2 = new Box();
        Box myCube = new Box(7);
        Box myClone = new Box(myBox1);  // create copy of myBox1

        // get volume of first box
        System.err.println("Volume of myBox1 is " + myBox1.volume());

        // get volume of second box
        System.err.println("Volume of myBox2 is " + myBox2.volume());

        // get volume of cube box
        System.err.println("Volume of cubeis " + myCube.volume());

        // get volume of Clone
        System.err.println("Volume of clone is " + myClone.volume());
    }
}
