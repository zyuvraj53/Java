package martingale;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Blackjack {

	public int standingPointPlayer;
	public static int standingPointDealer = 16;

	public int bet, noOfLosses, thresholdLosses = 3, bank;

	static int decks = 6;

	// initializing Shoe
	String[][] unshuffledShoe = new String[decks][52];

	public void initializeUnshuffledShoe() {
		for (int i = 0; i < decks; i++) {
			for (int j = 0; j < 52; j++) {
				unshuffledShoe[i][j] = Cards.DeckOfCards.get(j);
				if (Cards.DeckOfCards.get(j).charAt(1) == 'S' || Cards.DeckOfCards.get(j).charAt(1) == 'C')
					unshuffledShoe[i][j] += "B";
				else
					unshuffledShoe[i][j] += "R";
			}
		}
	}
	// Shoe initialization ends

	// Cards are arranged like this := (1st char = regular number,
	// 2nd char = Suites{Spades, Hearts, Diamonds, Clubs} - Highest To Lowest
	// Priority,
	// 3rd char = Colour
	// )

	/*
	 * ASB,2SB,3SB,4SB,5SB,6SB,7SB,8SB,9SB,10SR,JSB,QSB,KSB,
	 * AHR,2HR,3HR,4HR,5HR,6HR,7HR,8HR,9HR,10HR,JHR,QHR,KHR,
	 * ADR,2DR,3DR,4DR,5DR,6DR,7DR,8DR,9DR,10DR,JDR,QDR,KDR,
	 * ACB,2CB,3CB,4CB,5CB,6CB,7CB,8CB,9CB,10CR,JCB,QCB,KCB,
	 */

	// Combining all Unshuffled Decks into one:
	static String[] shoeBeta = new String[decks * 52];

	public void combineDecks() {
		int counter = 0;
		for (String[] strArr : unshuffledShoe)
			for (String s : strArr) {
				shoeBeta[counter] = s;
				counter++;
			}
	}

	public List<String> shoe = Arrays.asList(shoeBeta);// Changing ShoeBeta(Array of shoe) to shoe(List of shoe)

	// below, we are initializing the array for the money we have or the bets we can
	// make
	int[] bets = new int[10001];

	public void initializeBets() {
		for (int i = 1; i <= 10000; i++)
			bets[i] = i;
	}
	// we have done so that the 1st element contains $1 and the 10,000th element has
	// $10,000

	public void placeBets(int _bet) {
		// The bets are to be placed
		if (noOfLosses == 0) {
			bet = bets[_bet];
		} else if (noOfLosses > 0 && noOfLosses <= thresholdLosses) {
			bet = 2 * bet;
		} else {
			bet = bets[1];
		}

		bank -= bet;
	}

	public List<String> PlayerHand = new ArrayList<>();
	public List<String> DealerHand = new ArrayList<>();
	public List<String> tempCards = new ArrayList<>();

	public void dealHandPlayer() {
		PlayerHand.add(shoe.get(0));
		PlayerHand.add(shoe.get(1));
		tempCards.add(shoe.get(0));
		tempCards.add(shoe.get(1));
		shoe.remove(0);
		shoe.remove(1);
		shoe.addAll(tempCards);
	}

	public void dealHandDealer() {
		DealerHand.add(shoe.get(0));
		shoe.add(shoe.get(0));
		shoe.remove(0);
	}

	public List<String> getHandPlayer() {
		return PlayerHand;
	}

	public List<String> getHandDealer() {
		return DealerHand;
	}

	public ArrayList<Integer> valueOfAces(int noOfAces){
		ArrayList<Integer> arrayListOfSumsOfAces = new ArrayList<>();
		arrayListOfSumsOfAces.add(noOfAces);
		arrayListOfSumsOfAces.add((noOfAces - 1) + 11);
		
		return arrayListOfSumsOfAces;
	}
	
	public int getAcedValue(List<String> list) {
		int sum = 0;
		int noOfAces = 0;
		Iterator<String> iterator = list.iterator();
		
		//Counting the number of aces
		for(String s: list) {
			if("" + s.charAt(0) == "A") {
				noOfAces++;
			}
		}
		//Ended the counting of aces
		
		//Removing all the aces from the list
		while(iterator.hasNext()) {
			String s = iterator.next();
			if(s.charAt(0) + "" == "A") {
				list.remove(s);
			}
			
		}
		//Ended removing all the aces from the list
		
		//Getting the value of the list without the aces
		for(String s: list) {
			sum += Cards.CardsValue.get(s.charAt(0) + "");
		}
		//Ended getting the value of the list without the aces
		
		//Seeing which value is closes to 21
		int diff1 = 21 - (sum + valueOfAces(noOfAces).get(0));
		int diff2 = 21 - (sum + valueOfAces(noOfAces).get(1));
		
		if(diff1 < diff2) {
			return sum + valueOfAces(noOfAces).get(0);
		}else if(diff2 > diff1) {
			return sum+ valueOfAces(noOfAces).get(1);
		}
		
		return sum;
	}
	
	public int getSum(List<String> list) {
		int sum = 0;
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String s = iterator.next();
			if(!(list.contains("ASB") || list.contains("AHR") || list.contains("ADR") || list.contains("ACB"))) {
				int value = Cards.CardsValue.get("" + s.charAt(0));
				sum += value;	
			}else {
				sum += getAcedValue(list);
			}
			
		}

		return sum;
	}

	public void displayShoe() {
		int counter = 0;
		for (String s : shoe) {
			counter++;
			System.out.print("" + s + " ");
			if (counter % 13 == 0)
				System.out.println();
			if (counter % 52 == 0)
				System.out.println();
		}
	}

	public void randomizeShoe() {
		Collections.shuffle(shoe);
	}

	public void InitializeGame() {
		this.initializeUnshuffledShoe();
		this.combineDecks();
		this.randomizeShoe();
		this.displayShoe();
	}

	public static void main(String[] args) {
		Blackjack player1 = new Blackjack();
		player1.InitializeGame();
		
		player1.standingPointPlayer = 14;
		
		player1.dealHandPlayer();
		player1.dealHandDealer();
		List<String> currentHandPlayer = player1.getHandPlayer();
		List<String> currentHandDealer = player1.getHandDealer();
		int sumOfHandPlayer = player1.getSum(currentHandPlayer);
		int sumOfHandDealer = player1.getSum(currentHandDealer);
		while(true) {
			if(sumOfHandPlayer < player1.standingPointPlayer) {
				String currentCard = player1.hit();
				currentHandPlayer.add(currentCard);
				sumOfHandPlayer = player1.getSum(currentHandPlayer);
			}else if(sumOfHandPlayer >= player1.standingPointPlayer && sumOfHandPlayer < 21) {
				player1.standPlayer();
				
			}else if(sumofHandPlayer > 21) {
				player1.bustPlayer();
				shoe.push();
				break;
			}
			
			//Dealer's hand starts 
			currentHandDealer.add(player1.showCard());
			if(sumOfHandDealer < standingPointDealer) {
				String currentCard = player1.hit();
				currentHandDealer.add(currentCard);
				sumOfHandDealer = player1.getSum(currentHandDealer);
			}else if(sumOfHandDealer >= standingPointDealer && sumOfHandDealer < 21) {
				player1.standDealer();
			}else if(sumOfHandDealer > 21) {
				player1.bustDealer();
			}
		}
	}
}
