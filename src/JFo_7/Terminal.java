package JFo_7;

public class Terminal {
	private final int quotation = 2;
	
	public void convertMoneyIntoCredit(CreditCard card, int money) {
		int credit = money * quotation;
		card.setBalance(credit);
	}
	
	public void balanceCard(CreditCard card) {
		System.out.print(card.toString());
		System.out.print("\n");
	}
	
	public void replacement(CreditCard card1, CreditCard card2, int transferAmount) {
		int card1Balance = card1.ticket();
		card1.setTicket(card1Balance - transferAmount);
		card2.setTicket(card2.ticket() + transferAmount);
		System.out.printf("Operação realizada com sucesso.");
	}
	
	public void getAwards(CreditCard card, Award award) {
		if (card.ticket() < award.ticketToAward()) {
			throw new IllegalArgumentException("Operação inválida, ticket(s) insuficientes para compra do prêmio!");
		}
		if (award.quantity() < 0) {
			throw new IllegalArgumentException("No momento estamos sem esse prêmio, por favor selecione outro!");
		}
		card.setTicket(card.ticket() - award.ticketToAward());
		award.setQuantity(award.quantity() - 1);
		System.out.printf("Parabéns, você acabou de receber seu prêmio: %s\n", award.name);
		this.balanceCard(card);
		
		System.out.printf("Quantidade atual do prêmio: %d", award.quantity());
	}
}
