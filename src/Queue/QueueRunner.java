package src.Queue;

/*
 * Queue is ADT (Abstract Data Type) and its features are being used.
 * Queue is FIFO (First In First Out).
 * Enqueue is used to add an element to the queue.
 * Dequeue is used to remove an element to the queue.
 */

public class QueueRunner {
    public static void main(String[] args) {
        QueueSample queueSample = new QueueSample();
        System.out.println("Is Empty : " + queueSample.isEmpty());
        queueSample.enQueue(5);
        queueSample.enQueue(2);
        queueSample.enQueue(7);
        queueSample.enQueue(3);

        queueSample.deQueue();
        queueSample.deQueue();
        queueSample.deQueue();
        queueSample.deQueue();
        queueSample.deQueue();

        queueSample.enQueue(9);
        queueSample.enQueue(1);
        queueSample.enQueue(6);
        queueSample.enQueue(8);
        queueSample.enQueue(0);
        queueSample.enQueue(10);


        System.out.println("Size :" + queueSample.size());
        queueSample.show();
        System.out.println("Is Full : " + queueSample.isFull());

    }
}
