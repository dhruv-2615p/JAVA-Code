class Box {
    double width;
    double height;
    double depth;
    
    // Constructor used when all dimensions specified
    Box(double w, double h, double d){
        width = w;
        depth = d;
        height = h;
    }

    // Constructor used when no dimensions specified
    Box(){
        width = -1; // use -1 to to indicate an uninitialized box
        depth = -1;
        height = -1;
    }

    // Constructor used when cube is created
    Box(double len){
        width = depth = height = len;
    }

    // Compute and return volume
    double volume(){
        return width * height * depth;
    }
}

public class OverloadedCons{
    public static void main(String[] args) {
        // Create boxes using the various constructor
        Box myBox1 = new Box(10, 20, 15);
        Box myBox2 = new Box();
        Box myBox3 = new Box(7);

        // get volume of first box
        System.err.println("Volume of myBox1 is " + myBox1.volume());

        // get volume of first box
        System.err.println("Volume of myBox1 is " + myBox2.volume());

        // get volume of first box
        System.err.println("Volume of myBox1 is " + myBox3.volume());
    }
}