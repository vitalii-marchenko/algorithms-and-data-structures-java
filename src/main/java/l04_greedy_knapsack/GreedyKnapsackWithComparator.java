package l04_greedy_knapsack;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class GreedyKnapsackWithComparator {

    class Item {
        int cost;
        int weight;

        public Item(int cost, int weight) {
            this.cost = cost;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "Item{" +
                    "cost=" + cost +
                    ", weight=" + weight +
                    '}';
        }
    }

    private void run() throws FileNotFoundException {
        Scanner input = new Scanner(new File("input.txt"));
        int n = input.nextInt();
        int W = input.nextInt();
        Item[] items = new Item[n];
        for (int i = 0; i < n; i++) {
            items[i] = new Item(input.nextInt(),  input.nextInt());
        }

        Arrays.sort(items, new Comparator<Item>() {
            public int compare(Item o1, Item o2) {
                double r1 = (double) o1.cost / o1.weight;
                double r2 = (double) o2.cost / o2.weight;
                return -Double.compare(r1, r2);
            }
        });

        for (int i = 0; i < n; i++) {
            System.out.println(items[i]);
        }

        double result = 0;
        for (Item item : items) {
            if (item.weight <= W) {
                result += item.cost;
                W -= item.weight;
            } else {
                result += (double) item.cost * W / item.weight;
                break;
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) throws FileNotFoundException {
        long startTime = System.currentTimeMillis();
        new GreedyKnapsackWithComparator().run();
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime + " ms");
    }
}
