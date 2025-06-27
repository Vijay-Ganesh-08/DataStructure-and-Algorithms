package src.LinkedList;

public class LinkedListRunner {

    public static void main(String[] args) {
        SampleLinkedList list = new SampleLinkedList();
        list.insert(5);
        list.insert(3);
        list.insert(2);
        list.insert(1);
        list.insert(4);
        list.insertAtStart(10);
        list.insertAt(22,0);
        list.deleteAt(2);
        list.print();
    }
}
