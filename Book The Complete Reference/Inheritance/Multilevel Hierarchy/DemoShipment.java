
// Extend BoxWeight to include shipping costs.

// Start with Box
class Box {
    private double width;
    private double depth;
    private double height;

    // clone obj
    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // All dimension are mention
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // No dimension are mention
    Box() {
        width = depth = height = -1;
    }

    // for cube
    Box(double len) {
        width = depth = height = len;
    }

    // volume of box
    double volume() {
        return width * depth * height;
    }
}

// Adding weight
class BoxWeight extends Box {
    double weight;

    // clone of obj
    BoxWeight(BoxWeight ob) {
        super(ob);
        weight = ob.weight;
    }

    // All dimention
    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    // No dimension
    BoxWeight() {
        super();
        weight = -1;
    }

    // cube
    BoxWeight(double len, double m) {
        super(len);
        weight = m;
    }
}

// add shipping cost
class Shipment extends BoxWeight {
    double cost;

    // clone of an obj
    Shipment(Shipment ob) {
        super(ob);
        cost = ob.cost;
    }

    // All dimension are there
    Shipment(double w, double d, double h, double m, double c) {
        super(w, h, d, m);
        cost = c;
    }

    // No dimension
    Shipment() {
        super();
        cost = -1;
    }

    // cube created
    Shipment(double len, double mass, double c) {
        super(len, mass);
        cost = c;
    }
}

public class DemoShipment {
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41);
        Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);

        System.out.println("Volume of shipment1 is " + shipment1.volume());
        System.out.println("Weight of shipment1 is " + shipment1.weight);
        System.out.println("Shipping cosst: $" + shipment1.cost + "\n");

        System.out.println("Volume of shipment2 is " + shipment2.volume());
        System.out.println("Weight of shipment2 is " + shipment2.weight);
        System.out.println("Shipping cost: $" + shipment2.cost);
    }
}
