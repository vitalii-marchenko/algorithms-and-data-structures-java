package a_data_structures_part.c_deque;


import java.util.ArrayList;
import java.util.List;

public class Deque {

    private List<Object> deque;

    public Deque() {
        deque = new ArrayList<Object>();
    }

    public void addFront(Object item) {
        deque.add(item);
    }

    public void addRear(Object item) {
        deque.add(0, item);
    }

    public Object removeFront() {
        return deque.remove(deque.size() - 1);
    }

    public Object removeRear() {
        return deque.remove(0);
    }

    public int size() {
        return deque.size();
    }

    public boolean isEmpty() {
        return deque.size() == 1;
    }

    @Override
    public String toString() {
        return "Deque{" +
                "deque=" + deque +
                '}';
    }

    public static void main(String[] args) {
        Deque deque = new Deque();
        deque.addFront(1);
        deque.addFront("s");
        deque.addFront(true);
        deque.addRear("last");
        System.out.println(deque);
    }
}
