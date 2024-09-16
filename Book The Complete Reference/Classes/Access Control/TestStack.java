// this class defines an integer stack thatc can hold 10 vaues
class Stack{
    /* Now, both stack and tos are private. This means that they can not be accidently or maliciously altered in a way that would be harmful to the stack */

    private int stack[] = new int[10];
    private int tos;

    // Initialize top-of stack
    Stack(){
        tos = -1;
    }

    // push an item onto the stack
    void push(int item){
        if(tos == 9)
            System.out.println("Stack is full.");
        else
            stack[++tos] = item;
    }

    // Pop an item from the stack
    int pop(){
        if (tos < 0) {
            System.out.println("Stack Underflow.");
            return 0;
        }
        else{
            return stack[tos--];
        }
    }
}

public class TestStack {
    public static void main(String[] args) {
        Stack myStack1 = new Stack();
        Stack myStack2 = new Stack();

        // push some numbers onto the stack
        for(int i = 0; i < 10; i++) myStack1.push(i);
        for(int i = 0; i < 20; i++) myStack2.push(i);

        // pop those numbers off the stack
        System.out.println("Stack in myStack1: ");
        for(int i = 0; i < 10; i++)
            System.out.println(myStack1.pop());

        System.out.println("Stack in myStack2: ");
        for(int i = 0; i < 10; i++)
            System.out.println(myStack2.pop());

        // these statements are not legal
        // // myStack1.tos = -2;
        // // myStack2.stack[3] = 100;
    }
}
