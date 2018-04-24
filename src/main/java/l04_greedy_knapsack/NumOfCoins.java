package l04_greedy_knapsack;


public class NumOfCoins {

    private int getNumOfCoins(int change) {
        int numOfCoinsNeeded = 0;
        while (change != 0) {
            if (change >= 25) {
                numOfCoinsNeeded += change / 25;
                change %= 25;
            } else if (change >= 10) {
                numOfCoinsNeeded += change / 10;
                change %= 10;
            } else if (change >= 5) {
                numOfCoinsNeeded += change / 5;
                change %= 5;
            } else {
                numOfCoinsNeeded += change;
                change %= 1;
            }
        }
        return numOfCoinsNeeded;
    }

    public static void main(String[] args) {
        System.out.println(new NumOfCoins().getNumOfCoins(3));
    }
}
