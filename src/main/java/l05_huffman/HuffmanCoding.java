package l05_huffman;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class HuffmanCoding {

    class Node implements Comparable<Node> {
        final int sum;

        public Node(int sum) {
            this.sum = sum;
        }

        public int compareTo(Node o) {
            return Integer.valueOf(sum).compareTo(o.sum);
        }
    }

    class InternalNode extends Node {

        Node left;
        Node right;

        public InternalNode(Node left, Node right) {
            super(left.sum + right.sum);
            this.left = left;
            this.right = right;
        }
    }

    class LeafNode extends Node {

        public LeafNode(char symbol, int count) {
            super(count);
            this.symbol = symbol;
        }

        char symbol;
    }

    private void run() throws FileNotFoundException {
        Scanner input = new Scanner(new File("input_huffman.txt"));
        String s = input.next();
        Map<Character, Integer> count = new HashMap<Character, Integer>();
        for (char c : s.toCharArray()) {
            if (count.containsKey(c)) {
                count.put(c, count.get(c) + 1);
            } else {
                count.put(c, 1);
            }
        }

        PriorityQueue<Node> priorityQueue = new PriorityQueue<Node>();



    }

    public static void main(String[] args) throws FileNotFoundException {
        long startTime = System.currentTimeMillis();
        new HuffmanCoding().run();
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime + " ms");
    }
}
