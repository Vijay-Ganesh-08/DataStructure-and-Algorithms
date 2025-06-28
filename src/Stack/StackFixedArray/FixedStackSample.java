package src.Stack.StackFixedArray;

public class FixedStackSample {

    int[] stackArray = new int[5];
    int top = 0;

    public void push(int i) {
        if(top != stackArray.length){
            stackArray[top] = i;
            top++;
        } else {
            System.out.println("src.Stack is full");
        }
    }

    public int pop() {

        int data = 0;
        if(isEmpty()){
            System.out.println("src.Stack is Empty");
        } else {
            top--;
            data = stackArray[top];
            stackArray[top] = 0;
        }
        return data;
    }

    public int peek() {
        int data;
        data = stackArray[top-1];
        return data;
    }

    public boolean isEmpty() {
        return top == 0;
    }
    public boolean isFull() {
        return top == stackArray.length;
    }
    public int size() {
        return top;
    }

    public void show() {
        System.out.println();
        for(int n : stackArray) {
            System.out.print(n + " ");
        }
    }
}
