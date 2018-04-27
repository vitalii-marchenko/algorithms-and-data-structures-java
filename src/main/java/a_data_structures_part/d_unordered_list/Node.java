package a_data_structures_part.d_unordered_list;


public class Node {

    private int data;
    private Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public Object getData() {
        return this.data;
    }

    public Node getNext() {
        return this.next;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
