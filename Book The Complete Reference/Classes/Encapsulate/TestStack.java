package Encapsulate;

class Stack {

    int stack[] = new int[10];
    int tos;

    // Initialize top of stack
    Stack(){
        tos = -1;
    }

    // Push an item onto the stack
    void push(int item){
        if(tos == 9)
            System.out.println("Stack Overflow");
        else
            stack[++tos] = item;
    }

    // Po an item from the stack
    int pop(){
        if(tos < 0){
            System.out.println("Stack Unnderflow");
            return 0;
        }
        else
            return stack[tos--];
    }
}

public class TestStack{
    public static void main(String[] args) {
        Stack myStack1 = new Stack();
        Stack myStack2 = new Stack();

        // push some numbers onto the stack
        for(int i = 0; i < 10; i++) myStack1.push(i);
        for(int i = 10; i < 20; i++) myStack2.push(i);

        // pop those numbers off the stack
        System.out.println("Stack in mystack1:");;
        for(int i = 0; i < 10; i++)
            System.out.println(myStack1.pop());
        
        System.out.println("Stack in mystack2:");
        for(int i = 0; i < 10; i++)
            System.out.println(myStack2.pop());
    }
}
