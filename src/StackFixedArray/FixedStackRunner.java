package src.StackFixedArray;

/*
 * Stack is ADT (Abstract Data Type) and its features are being used.
 * Stack is LIFO (Last In First Out).
 * Push is used to add
 * Pop is used to delete & read the first available element,
 * Peek is used to read the first available without removing/deleting
 * Top is used to indicate the first available element, when a new element is inserted top is updated accordingly.
 * Overflow error is thrown when you are trying to insert new element for the fixed length of stack which is full.
 * Underflow error is thrown when you are trying to access the element when the stack is empty.
 */

public class FixedStackRunner {

    public static void main(String[] args) {
        FixedStackSample stackSample = new FixedStackSample();
        //Checking if Stack is empty
        System.out.println("Is Empty : " + stackSample.isEmpty());
        //Pushing the values in to Stack
        stackSample.push(10);
        stackSample.push(20);
        stackSample.push(30);
        stackSample.push(40);
        stackSample.push(50);
        stackSample.push(60);
        stackSample.push(70);
        //Checking the size of the Stack
        System.out.println("Size : " + stackSample.size());
        stackSample.show();
        //Checking if Stack is full
        System.out.println();
        System.out.println("Is Full : " + stackSample.isFull());

        //Popping the values out to Stack
        System.out.println("Popped Value : " + stackSample.pop());
        System.out.println("Popped Value : " + stackSample.pop());
        System.out.println("Popped Value : " + stackSample.pop());
        //Peeking the values from Stack
        System.out.println("Peeked Value : " + stackSample.peek());
        //Checking the size of the Stack
        System.out.println("Size : " + stackSample.size());
        stackSample.show();
        //Checking if Stack is empty
        System.out.println("Is Empty : " + stackSample.isEmpty());
    }
}
