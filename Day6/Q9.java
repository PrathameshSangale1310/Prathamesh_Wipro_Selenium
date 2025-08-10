//package Assignment6;
//
//enum Suit {
//    CLUBS, DIAMONDS, HEARTS, SPADES
//}
//
//enum Rank {
//    TWO, THREE, FOUR, FIVE, SIX, SEVEN,
//    EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE
//}
//
//package Assignment6;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//class Deck {
//    private final List<Card> cards;
//
//    public Deck() {
//        cards = new ArrayList<>();
//        for (Suit suit : Suit.values()) {
//            for (Rank rank : Rank.values()) {
//                cards.add(new Card(suit, rank));
//            }
//        }
//    }
//
//    public void shuffle() {
//        Collections.shuffle(cards);
//    }
//
//    public void printDeck() {
//        for (Card card : cards) {
//            System.out.println(card);
//        }
//    }
//}
//
//
//public class Q9 {
//	private final Suit suit;
//    private final Rank rank;
//
//    public Q9(Suit suit, Rank rank) {
//        this.suit = suit;
//        this.rank = rank;
//    }
//
//    
//    public String toString() {
//        return rank + " of " + suit;
//    }
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}
