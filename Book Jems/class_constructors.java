public class class_constructors {
    public long idNum;
    public String name = "<Unnamed>";
    public class_constructors orbits = null;
    private static long nextId = 0;

    class_constructors () {
        idNum = nextId++;
    }

    class_constructors(String bodyName, class_constructors orbitAround) {
        this();
        name = bodyName;
        orbits = orbitAround;
    }
}
