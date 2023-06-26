package JFo_8;
import java.util.ArrayList;

public class Season {
	ArrayList<Game> list = new ArrayList<Game>();
	private int currentGameId = 0;
	
	public void playAGame(Team team1, Team team2, int temperature) {
		double doubleRandomNumberScored = Math.random() * (temperature / 5);
		int golsScoredTeam1 = (int)doubleRandomNumberScored;
		
		double doubleRandomNumberConceded = Math.random() * (temperature / 5);
		int golsScoredTeam2 = (int)doubleRandomNumberConceded;
		
		team1.setGolsScored(golsScoredTeam1);
		team1.setGolsConceded(golsScoredTeam2);
		
		team2.setGolsConceded(golsScoredTeam2);
		team2.setGolsScored(golsScoredTeam1);
		
		if (golsScoredTeam1 > golsScoredTeam2) {
			team1.setWin();
			team2.setLost();
		} else if (golsScoredTeam1 < golsScoredTeam2) {
			team1.setLost();
			team2.setWin();
		} else {
			team1.setDraw();
			team2.setDraw();
		}
		
		double doubleRandomTeam = Math.random() * 2;
		int randomNumberToAwayTeam = (int)doubleRandomTeam;
		
		int awayTeam;
		int homeTeam;
		if (randomNumberToAwayTeam == 1) {
			awayTeam = team1.id();
			homeTeam = team2.id();
		} else {
			homeTeam = team1.id();
			awayTeam = team2.id();
		}
		
		setCurrentIdGame(currentGameId + 1);
		Game game = new Game(temperature, currentGameId, awayTeam, golsScoredTeam1, homeTeam, golsScoredTeam2);
		list.add(game);
		
	}
	
	public void setCurrentIdGame(int currentGameId) {
		this.currentGameId = currentGameId;
	}
	
	public void printAllGames() {
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
			System.out.print("\n");
		}
	}

	public void staticTemperature() {
		int hottestTemperature = (int) Double.NEGATIVE_INFINITY;
		int sum = 0;
		
		for (int i = 0; i < list.size(); i++) {
			int currentTemperature = list.get(i).temperature();
			sum += currentTemperature;
			if (currentTemperature > hottestTemperature) {
				hottestTemperature = currentTemperature;
			}
		}
		System.out.printf("Hottest Temp: %d\n"
				+ "Average Temp: %d", hottestTemperature, sum / list.size());
	}
}
