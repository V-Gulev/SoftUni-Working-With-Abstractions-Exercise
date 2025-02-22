package CardsWithPower_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cardRank = sc.nextLine();
        String cardSuit = sc.nextLine();
        int rank = RankPower.valueOf(cardRank).getPower();
        int suit = SuitPower.valueOf(cardSuit).getPower();
        int sum = rank + suit;
        System.out.printf("Card name: %s of %s; Card power: %d\n", cardRank, cardSuit, sum);
    }
}
