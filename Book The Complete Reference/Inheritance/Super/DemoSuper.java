
class Box{
    private double width;
    private double height;
    private double depth;

    // constructor clone of an object
    Box(Box ob){
        width = ob.width;
        depth = ob.depth;
        height = ob.height;
    }

    // constructor used when all dimensions specified
    Box(double width, double depth, double height){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // constructor used when no dimension specified
    Box(){
        width = -1;
        height = -1;
        depth = -1;
    }

    // constructor used when cube is created
    Box(double ob){
        width = height = depth = ob;
    }

    // compute volume
    double volume(){
        return width * height * depth;
    }
}

class BoxWeight extends Box{
    double weight;

    // constructor clone of an object
    BoxWeight(BoxWeight ob){    // pass obj to constructor
        super(ob);
        weight = ob.weight;
    }

    // constructor used when all dimensions specified
    BoxWeight(double width, double depth, double height, double weight){
        super(width, depth, height);
        this.weight = weight;
    }

    // default constructor 
    BoxWeight (){
        super();
        weight = -1;
    }

    // constructor used when cube is create
    BoxWeight (double len, double m){
        super(len);
        weight = m;
    }
}

public class DemoSuper {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        BoxWeight mybox3 = new BoxWeight();
        BoxWeight mycube = new BoxWeight(3, 2);
        BoxWeight myclone = new BoxWeight(mybox1);

        System.err.println("Volume of mybox1 is " + mybox1.volume());
        System.err.println("Weight of mybox1 is " + mybox1.weight + "\n");

        System.err.println("Volume of mybox2 is " + mybox2.volume());
        System.err.println("Weight of mybox2 is " + mybox2.weight + "\n");

        System.err.println("Volume of mybox3 is " + mybox3.volume());
        System.err.println("Weight of mybox3 is " + mybox3.weight + "\n");

        System.err.println("Volume of myclone is " + myclone.volume());
        System.err.println("Weight of myclone is " + myclone.weight + "\n");

        System.err.println("Volume of mycube is " + mycube.volume());
        System.err.println("Weight of mycube is " + mycube.weight + "\n");
    }
}
