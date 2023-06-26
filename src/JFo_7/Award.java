package JFo_7;

public class Award {
	final String name;
	private int ticketToAward;
	private int quantity;
	
	public Award(String name, int ticketToAward, int quantity) {
		this.name = name;
		this.ticketToAward = ticketToAward;
		this.quantity = quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public int quantity() {
		return quantity;
	}
	
	public int ticketToAward() {
		return ticketToAward;
	}
}
