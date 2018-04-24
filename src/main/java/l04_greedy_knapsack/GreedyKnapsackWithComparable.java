package l04_greedy_knapsack;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class GreedyKnapsackWithComparable {
    class Item implements Comparable<Item> {
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

        public int compareTo(Item o) {
            double r1 = (double) cost / weight;
            double r2 = (double) o.cost / o.weight;
            return -Double.compare(r1, r2);
        }
    }

    private void run() throws FileNotFoundException {
        Scanner input = new Scanner(new File("input.txt"));
        int n = input.nextInt();
        int bagCapacity = input.nextInt();
        Item[] items = new Item[n];
        for (int i = 0; i < n; i++) {
            items[i] = new Item(input.nextInt(),  input.nextInt());
        }

        Arrays.sort(items);

        double result = 0;
        for (Item item : items) {
            if (item.weight <= bagCapacity) {
                result += item.cost;
                bagCapacity -= item.weight;
            } else {
                result += (double) item.cost * bagCapacity / item.weight;
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) throws FileNotFoundException {
        long startTime = System.currentTimeMillis();
        new GreedyKnapsackWithComparable().run();
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime + " ms");
    }
}
