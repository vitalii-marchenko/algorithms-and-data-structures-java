package a_data_structures_part.d_unordered_list;


public class UnorderedList {

    Node head;

    public UnorderedList() {
        this.head = null;
    }

    public void add(Integer item) {
        Node temp = new Node(item);
        temp.setNext(head);
        head = temp;
    }

    public boolean isEmpty() {
        return this.head == null;
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

    public boolean search(Integer item) {
        Node current = this.head;
        while (current != null) {
            if (current.getData() == item) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    public void remove(Integer item) {
        Node current = this.head;
        Node prev = null;
        boolean found = false;
        while (!found) {
            if (current.getData() == item) {
                found = true;
            } else {
                prev = current;
                current = current.getNext();
            }
        }
        if (prev == null) {
            head = current.getNext();
        } else {
            prev.setNext(current.getNext());
        }
    }

    public void append(Integer item) {
        Node current = this.head;
        Node prev = null;
        while (current != null) {
            prev = current;
            current = current.getNext();
        }
        prev.setNext(new Node(item));
    }

    public void insert(Integer item, int index) {
        int i = 0;
        Node current = this.head;
        Node prev = null;
        while (i < index) {
            prev = current;
            current = current.getNext();
            i++;
        }
        Node myNode = new Node(item);

        if (prev == null) {
            head = myNode;
            myNode.setNext(current);

        } else {
            prev.setNext(myNode);
            myNode.setNext(current);
        }
    }

    public int index(int item) {
        int index = 0;
        Node current = this.head;
        while (current != null) {
            if (current.getData() == item) {
                return index;
            }
            index++;
            current = current.getNext();
        }
        return -1;
    }

    public int pop() {
        Node current = this.head;
        Node prev = null;
        while (current.getNext() != null) {
            prev = current;
            current = current.getNext();
        }

        if (prev == null) {
            this.head = null;
            return current.getData();
        } else {
            prev.setNext(null);
            return current.getData();
        }
    }

    public int pop(int pos) {
        Node curr = this.head;
        Node prev = null;
        for (int i = 0; i < pos; i++) {
            prev = curr;
            curr = curr.getNext();
        }
        if (prev == null) {
            int res = this.head.getData();
            this.head = curr.getNext();
            return res;
        }
        prev.setNext(curr.getNext());
        return curr.getData();
    }

    public static void main(String[] args) {
        UnorderedList unorderedList = new UnorderedList();
        unorderedList.isEmpty();
        unorderedList.add(33);
        unorderedList.add(45);
        unorderedList.add(48);
        unorderedList.add(55);
        unorderedList.add(1);
        unorderedList.add(12);
        unorderedList.pop(3);
        unorderedList.index(45);
        unorderedList.insert(999, 3);
        unorderedList.insert(777, 0);
        unorderedList.size();
        unorderedList.search(55);
        unorderedList.remove(55);
        unorderedList.append(888);
        unorderedList.size();
    }


}
