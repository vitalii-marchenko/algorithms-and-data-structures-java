package a_data_structures_part.d_linked_list;

public class OrderedList {

    Node head = null;

    public OrderedList() {
        this.head = null;
    }

    public boolean search(int item) {
        Node current = this.head;
        boolean found = false;
        boolean stop = false;
         while ((current != null) && (!found) && (!stop)) {
             if (current.getData() == item) {
                 found = true;
             } else {
                 if (current.getData() > item) {
                     stop = true;
                 } else {
                     current = current.getNext();
                 }
             }
         }
         return found;
    }

    public void add(int item) {
        Node current = this.head;
        Node prev = null;
        boolean stop = false;
        while ((current != null) && (!stop)) {
            if (current.getData() > item) {
                stop = true;
            } else {
                prev = current;
                current = current.getNext();
            }
        }
        Node toAdd = new Node(item);
        if (prev == null) {
            toAdd.setNext(head);
            head = toAdd;
        } else {
            prev.setNext(toAdd);
            toAdd.setNext(current);
        }
    }

    public static void main(String[] args) {
        OrderedList orderedList = new OrderedList();
        orderedList.add(3);
        orderedList.add(8);
        orderedList.add(1);
        orderedList.add(0);
        orderedList.search(3);

    }

}
