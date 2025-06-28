package src.StackDynamicArray;

/*
 * Dynamic Stack Array is similar to Fixed Stack Array and below are the differences
 * Expand the size of the array while pushing elements with *2 to current size
 * shrink the size of the array while popping elements with /2 to current size
 */

public class DynamicStackRunner {

    public static void main(String[] args) {
        DynamicStackSample stackSample = new DynamicStackSample();
        //Checking if Stack is empty
        System.out.println("\nIs Empty : " + stackSample.isEmpty());
        //Pushing the values in to Stack
        stackSample.push(10);
        stackSample.push(20);
        stackSample.push(30);
        stackSample.push(40);

        //Checking the size of the Stack
        System.out.println("\nSize : " + stackSample.size());
        stackSample.show();
        //Checking if Stack is full
        System.out.println("\nIs Full : " + stackSample.isFull());

        //Popping the values out to Stack
        System.out.println("\nPopped Value : " + stackSample.pop());
        stackSample.show();
        System.out.println("\nPopped Value : " + stackSample.pop());
        System.out.println("\nPopped Value : " + stackSample.pop());
        stackSample.show();
        //Peeking the values from Stack
        System.out.println("\nPeeked Value : " + stackSample.peek());
        stackSample.show();

        //Checking the size of the Stack
        System.out.println("\nSize : " + stackSample.size());
        stackSample.show();
        //Checking if Stack is empty
        System.out.println("\nIs Empty : " + stackSample.isEmpty());
    }
}
