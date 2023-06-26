package JFo_8;

public class Team {
	private String name;
	private int win;
	private int lost;
	private int draw;
	private int golsScored;
	private int golsConceded;
	private int id;
	
	public Team(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public void setWin() {
		this.win += 1;
	}
	
	public void setLost() {
		this.lost += 1;
	}
	
	public void setDraw() {
		this.draw += 1;
	}
	
	public void setGolsScored(int golsScored) {
		this.golsScored += golsScored;
	}
	
	public void setGolsConceded(int golsConceded) {
		this.golsConceded += golsConceded;
	}
	
	public int id() {
		return id;
	}
	
	public String name() {
		return name;
	}
	
	@Override
	public String toString() {
		return String.format("Team %d\n"
				+ "Wins: %d, Losses: %d, Ties: %d\n"
				+ "Points Scored: %d, Points Allowed %d\n\n", id, win, lost, draw, golsScored, golsConceded);
	}
}
