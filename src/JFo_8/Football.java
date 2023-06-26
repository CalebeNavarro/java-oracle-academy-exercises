package JFo_8;
import java.util.ArrayList;
import java.util.Scanner;

public class Football {

	public static void main(String[] args) {
		Season season = new Season();
		Team team1 = new Team("Corinthians", 1);
		Team team2 = new Team("Flamengo", 2);
		Team team3 = new Team("São Paulo", 3);
		Team team4 = new Team("Atlético Paranaense", 4);
		
		Scanner input = new Scanner(System.in);
		
        int temperature;

        int countTemperatureLessThanZero = 0;
        do {
            System.out.print("Digite a temperatura: ");
            temperature = input.nextInt();

            if (temperature <= 0) {
                System.out.println("Too cold to play.");
                countTemperatureLessThanZero++;
            } else {
            	countTemperatureLessThanZero = 0;
        		ArrayList<Integer> list = selectTwoGames();
                
        		Team[] arrayOfTeam = new Team[4];		
        		
        		arrayOfTeam[list.get(0)] = team1;
        		arrayOfTeam[list.get(1)] = team2;
        		arrayOfTeam[list.get(2)] = team3;
        		arrayOfTeam[list.get(3)] = team4;
        		
        		season.playAGame(arrayOfTeam[0], arrayOfTeam[1], temperature);
        		season.playAGame(arrayOfTeam[2], arrayOfTeam[3], temperature);
            }
        } while (countTemperatureLessThanZero < 3);
		
        System.out.print("\n");
        System.out.print("*********RESULTS*********\n");
        
		System.out.print(team1.toString());
		System.out.print(team2.toString());
		System.out.print(team3.toString());
		System.out.print(team4.toString());
		
		season.printAllGames();
		season.staticTemperature();
		input.close();
	}
	
	static ArrayList<Integer> selectTwoGames() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		do {
			double doubleRandomNumber = Math.random() * 4;
			int randomNumber = (int)doubleRandomNumber;

			boolean isHave = false;
		    for (int i = 0; i < list.size(); i++) {
		        if (list.get(i) == randomNumber) {
		        	isHave = true;
		        }
		      }
		    
		    if (!isHave) {
				list.add(randomNumber);
		    }
		} while (list.size() != 4);
		return list;
	}

}
