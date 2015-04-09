import java.util.ArrayList;

/**
 * This class deals two hands of Cards, scores them, and determines the
 * winner. Ace is 1, Jack is 11, Queen is 12, and King is 13.
 *
 * Written as an assignment for AmplifyMOOC on 03-23-15 by Jesse Evers.
 */

public class Main {

    private static int handNum = 1;

    public static void main(String[] args) {

        ArrayList <Card> hand1 = new <Card> ArrayList();
        ArrayList <Card> hand2 = new <Card> ArrayList();

        Deck deck = new Deck();

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                hand1.add(deck.getTopCard());
            } else {
                hand2.add(deck.getTopCard());
            }
        }

        System.out.println(handInfo(hand1));
        System.out.println(handInfo(hand2));

        if (tallyPoints(hand2) >= tallyPoints(hand1)) {
            System.out.println("Hand 2 wins");
        } else {
            System.out.println("Hand 1 wins");
        }
    }


    public static int tallyPoints(ArrayList<Card> hand) {

        int total;

        total = 0;

        for (Card card: hand) {
            total += card.pointValue();
        }

        return total;
    }

    public static String handInfo(ArrayList <Card> hand) {

        String info;

        info = "";

        info += "Hand " + handNum + ": total points " + tallyPoints(hand) + "\n";
        for (Card card: hand) {
            info += card.toString() + "\n";
        }

        handNum++;

        if (handNum > 2) {
            handNum = 1;
        }

        return info;
    }
}