package queue;

public class Main {
    public static void main(String args[]) {
        Queue myQueue = new Queue(1);

        myQueue.getFirst();
        myQueue.getLast();
        myQueue.getLength();

        myQueue.printQueue();

        myQueue.enqueue(2);

        myQueue.printQueue();

        myQueue.deQueue();

        myQueue.printQueue();
    }
}
