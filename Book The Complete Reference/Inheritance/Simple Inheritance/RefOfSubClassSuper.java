public class RefOfSubClassSuper {
    public static void main(String[] args) {
        BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
        Box plainBox = new Box();

        System.err.println("Volume of weightbox is " + weightbox.volume());
        System.err.println("Weight of weightbox is " + weightbox.weight + "\n");

        // assign BoxWeight reference to Box reference
        plainBox = weightbox;

        System.err.println("Volume of plainbox is " + plainBox.volume());
        /** Weight can not acess from plainBxox because type of it's is Box can only allow acess to such feild those are from super class (known by it) */
        // System.err.println("Weight of plain box is "+ plainBox.weight);
    }
}
