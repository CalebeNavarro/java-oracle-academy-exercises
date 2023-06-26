package JFo_8;

public class Game {
	private int gameId;
	private int temperature;
	
	private int awayTeam;
	private int awayTeamScore;
	
	private int homeTeam;
	private int homeTeamScore;
	
	public Game(int temperature, int gameId ,int awayTeam, int awayTeamScore, int homeTeam, int homeTeamScore) {
		this.gameId = gameId;
		this.temperature = temperature;
		
		this.awayTeam = awayTeam;
		this.awayTeamScore = awayTeamScore;
		
		this.homeTeam = homeTeam;
		this.homeTeamScore =  homeTeamScore;
	}
	
	public int temperature() {
		return temperature;
	}
	
	@Override
	public String toString() {
		return String.format("Game #%d\n"
				+ "Temperature: %d\n"
				+ "Away Team: Team %d, %d\n"
				+ "Home Team: Team %d, %d\n", gameId, temperature, awayTeam, awayTeamScore, homeTeam, homeTeamScore);
	}
}
