package a_data_structures_part.d_linked_list.my_impl;

public class LinkedListImpl<T> {

    private Node head;

    public LinkedListImpl() {
        this.head = null;
    }

    public void add(T item) {
        Node tmp = new Node(item);
        tmp.setNext(this.head);
        this.head = tmp;
    }

    public int size() {
        Node current = this.head;
        int count = 0;
        while (current != null) {
            current = current.getNext();
            count++;
        }
        return count;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public static void main(String[] args) {
        LinkedListImpl<Integer> list = new LinkedListImpl<>();
        list.add(1);
        list.add(2);
        list.add(25);
        list.add(234);
        list.add(234);
        list.add(244);
        list.add(12);
    }
}
