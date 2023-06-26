package JFo_7;

public class CreditCard {
	private int balance = 0;
	private int ticket = 0;
	private int cardNumber;
	
	public CreditCard(int cardNumber) {
		if (cardNumber < 0) {
			throw new IllegalArgumentException("Número inválido!");
		}
		this.cardNumber = cardNumber;
	}
	
	public int balance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		if (balance < 0) {
			throw new IllegalArgumentException("Operação inválida, novo saldo é negativo!");
		}
		this.balance = balance;
	}
	
	public int ticket() {
		return ticket;
	}
	
	public void setTicket(int ticket) {
		if (ticket < 0) {
			throw new IllegalArgumentException("Número inválido!");
		}
		this.ticket = ticket;
	}
	
	public int cardNumber() {
		return cardNumber;
	}
	
	@Override
	public String toString()
	{
		return String.format("Saldo atual do cartão de crédito: %d. Saldo atual de tíquetes: %d", balance, ticket);
	}
	
}
