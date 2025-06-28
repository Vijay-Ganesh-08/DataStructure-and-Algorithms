package src.StackDynamicArray;

public class DynamicStackSample {

    int capacity = 2;
    int[] stackArray = new int[capacity];
    int top = 0;

    public void push(int i) {

        if (size() == capacity) {
            expand();
        }
        stackArray[top] = i;
        top++;
    }

    private void expand() {

        int len = size();
        int[] newArray = new int[len * 2];
        System.arraycopy(stackArray, 0, newArray, 0, len);
        stackArray = newArray;
        capacity *= 2;
    }

    public int pop() {

        int data = 0;
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        } else {
            top--;
            data = stackArray[top];
            stackArray[top] = 0;
            shrink();
        }
        return data;
    }

    public void shrink() {

        int len = size();

        if (len <= (capacity / 2) / 2) {
            capacity /= 2;
        }

        int[] newArray = new int[capacity];
        System.arraycopy(stackArray, 0, newArray, 0, len);
        stackArray = newArray;
//        capacity *= 2;
    }

    public int peek() {
        int data;
        data = stackArray[top - 1];
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
        for (int n : stackArray) {

            System.out.print(n + " ");
        }
    }
}
