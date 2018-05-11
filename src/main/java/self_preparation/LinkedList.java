package self_preparation;

public class LinkedList {

    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void add(int data) {
        Node node = new Node(data);
        node.setNext(head);
        this.head = node;
    }

    public void add(int data, int index) throws Exception {
        if (size() + 1 < index) {
            throw new Exception("IndexOFOutBound");
        }
        Node nodeToAdd = new Node(data);
        Node current = this.head;
        Node previous = null;
        for (int i = 0; i < index; i++) {
            previous = current;
            current = current.getNext();
        }
        if (current == null) {
            head = nodeToAdd;
            nodeToAdd.setNext(current);
        }

        previous.setNext(nodeToAdd);
        nodeToAdd.setNext(current);



    }

    public int size() {
        int counter = 0;
        Node currentNode = this.head;
        while (currentNode != null) {
            currentNode = currentNode.getNext();
            counter++;
        }
        return counter;
    }

    public boolean contains(int data) {
        Node currentNode = this.head;
        while (currentNode != null) {
            if (currentNode.getData() == data) {
                return true;
            }
            currentNode = currentNode.getNext();
        }
        return false;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        System.out.println(list.size());
        list.add(5);
        list.add(20);
        System.out.println(list.size());
        System.out.println(list.contains(20));
        System.out.println(list.contains(21));

        String[] arr = {"ldjfsd", "fasdfsa", "1999====="};
        for (String word : arr) {
            if (word.contains("1999")) {
                System.out.println(word);
            }
        }
    }
}
