// THis program uses inheritance to extends Box.
class Box{
    double width;
    double height;
    double depth;

    // Construct clone of an object
    Box(Box ob){ // pass object to constructore
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // Constructor used when all dimenstions specified
    Box(double width, double height, double depth){
        this.depth = depth;
        this.width = width;
        this.height = height;
    }

    Box(){
        width = -1;
        depth = -1;
        height = -1;
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

// Box is extended to include weight
class BoxWeight extends Box{
    double weight;

    // constructor for BoxWeight
    BoxWeight(double w, double d, double h, double m){
        width = w;
        depth = d;
        height = h;
        weight = m;
    }
}

public class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight myBox1 = new BoxWeight(10, 20, 15, 34.4);
        BoxWeight myBox2 = new BoxWeight(2, 3, 4, 0.076);

        System.err.println("Volume of myBox1 is " + myBox1.volume());
        System.err.println("Weight of myBox1 is " + myBox1.weight);
        System.err.println();

        System.err.println("Volume of myBox2 is " + myBox2.volume());
        System.err.println("Weight of myBox2 is " + myBox2.weight);
    }
}
