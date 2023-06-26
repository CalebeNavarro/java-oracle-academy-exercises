package JFo_7;

public class Fliperama {

	public static void main(String[] args) {
		Game pimbolimGame = new Game(2, "Pimbolim");
		Game sinucaGame = new Game(2, "Sinuca");
		
		Award garrafaAward = new Award("Garrafa", 4, 5);
		
		Terminal terminal = new Terminal();
				
		CreditCard card1 = new CreditCard(135);
		CreditCard card2 = new CreditCard(246);
		
		
		// Carregue os créditos em cada cartão.
		terminal.convertMoneyIntoCredit(card1, 2);
		terminal.convertMoneyIntoCredit(card2, 2);
		
		// ver infos
		terminal.balanceCard(card1);
		
		// Jogue um grupo de jogos usando dois cartões.
		sinucaGame.playGame(card1);
		terminal.balanceCard(card1);
		pimbolimGame.playGame(card1);
		terminal.balanceCard(card1);
		
		terminal.getAwards(card1, garrafaAward);
		
	}

}
