
class Demo {
    void excep() {

        System.out.println("Inside except.");
        throw new RuntimeException();
    }
}

class NotNessasaryThrows {
    public static void main(String[] args) {
        Demo d = new Demo();

        d.excep();

        
    }
}