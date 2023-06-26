package JFo_7;
import java.util.Random;


public class Game {
	private int creditToPlay;
	String name;
	
	public Game(int creditToPlay, String name) {
		this.creditToPlay = creditToPlay;
		this.name = name;
	}
	
	public void playGame(CreditCard card) {
		if (card.balance() < creditToPlay) {
			throw new IllegalArgumentException("Operação inválida, tickets insuficientes!");
		}
		card.setBalance(card.balance() - creditToPlay);
		
		double doubleRandomNumber = Math.random() * 11;
		int ticketGain = (int)doubleRandomNumber;
		card.setTicket(card.ticket() + ticketGain);
		System.out.printf("Você ganhou, %d ticket(s) jogando o jogo %s.\n", ticketGain, name);
		
	}
	
}
