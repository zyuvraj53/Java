package martingale;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Cards {

	public static HashMap<String, Integer> CardsValue = new HashMap<>();
	
	static int[] A = {1, 11};
	
	static {
		
		for(int i = 2; i<= 9; i++) 
			CardsValue.put("" + i, i);
		
		CardsValue.put("K", 10);
		CardsValue.put("Q", 10);
		CardsValue.put("J", 10);
		
	}
	
	//Clubs, Diamonds, Hearts, Spades
	public static String[] DeckOfCardBeta =  {"AS", "2S", "3S", "4S", "5S", "6S", "7S", "8S", "9S", "10S", "JS", "QS", "KS", 
											  "AH", "2H", "3H", "4H", "5H", "6H", "7H", "8H", "9H", "10H", "JH", "QH", "KH",
											  "AD", "2D", "3D", "4D", "5D", "6D", "7D", "8D", "9D", "10D", "JD", "QD", "KD",
											  "AC", "2C", "3C", "4C", "5C", "6C", "7C", "8C", "9C", "10C", "JC", "QC", "KC"};
	
	public static List<String> DeckOfCards = Arrays.asList(DeckOfCardBeta);
		
}
