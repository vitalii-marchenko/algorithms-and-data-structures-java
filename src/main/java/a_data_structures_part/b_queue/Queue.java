package a_data_structures_part.b_queue;


import java.util.ArrayList;
import java.util.List;

public class Queue {

    private List<Object> queue;

    public Queue() {
        queue = new ArrayList<Object>();
    }

    public void enqueue(Object item) {
        queue.add(item);
    }

    public Object dequeue() {
        return queue.remove(0);
    }

    public boolean isEmpty() {
        return queue.size() == 0;
    }

    public int size() {
        return queue.size();
    }

    @Override
    public String toString() {
        return "Queue{" +
                "queue=" + queue +
                '}';
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(3);
        queue.enqueue("Yo");
        queue.enqueue(false);
        System.out.println(queue);
        queue.dequeue();
        System.out.println(queue);
    }
}
