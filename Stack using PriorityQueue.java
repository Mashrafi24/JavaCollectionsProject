import java.util.*;

public class StackUsingPriorityQueue {

    static class StackElement {
        int value;
        int priority;

        StackElement(int value, int priority) {
            this.value = value;
            this.priority = priority;
        }
    }

    public static void main(String[] args) {

        PriorityQueue<StackElement> stack =
                new PriorityQueue<>((a, b) -> b.priority - a.priority);

        int count = 0;

        stack.add(new StackElement(10, count++));
        stack.add(new StackElement(20, count++));
        stack.add(new StackElement(30, count++));

        System.out.println("Pop: " + stack.poll().value);
    }
}
