import java.util.*;


public class QueueUsingPriorityQueue {

    static class QueueElement {
        int value;
        int priority;

        QueueElement(int value, int priority) {
            this.value = value;
            this.priority = priority;
        }
    }

    public static void main(String[] args) {

        PriorityQueue<QueueElement> queue =
                new PriorityQueue<>((a, b) -> a.priority - b.priority);

        int count = 0;

        queue.add(new QueueElement(10, count++));
        queue.add(new QueueElement(20, count++));
        queue.add(new QueueElement(30, count++));

        System.out.println("Dequeue: " + queue.poll().value);
    }
}
