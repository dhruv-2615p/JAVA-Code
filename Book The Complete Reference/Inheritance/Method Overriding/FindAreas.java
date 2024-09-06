// Using run time polymorphism

class Figure{
    double dim1;
    double dim2;

    Figure(double a, double b){
        dim1 = a;
        dim2 = b;
    }

    double area(){
        System.out.println("Area for Figure is undefined.");
        return 0;
    }
}

class Rectangle extends Figure{
    Rectangle(double a, double b) {
        super(a, b);
    }

    // override are for rectangle
    double area(){
        System.err.println("Inside Area for Rectangle.");
        return dim1 * dim2;
    }
}

class Triangle extends Figure{
    Triangle(double a, double b){
        super(a, b);
    }

    // override are for right triangle
    double area(){
        System.err.println("Inside Area for Triangle");
        return dim1 * dim2 / 2;
    }
}

public class FindAreas {
    public static void main(String[] args) {
        Figure f = new Figure(10, 10);
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);

        Figure figuref = r;
        System.err.println("Area is " + figuref.area());

        figuref = t;
        System.err.println("Area is " + figuref.area());

        figuref = f;
        System.err.println("Area is " + figuref.area());
    }
}
