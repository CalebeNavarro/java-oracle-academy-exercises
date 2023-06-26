package JFo_4;
import java.util.Scanner;


public class JFo_4_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
        System.out.print("Digite um nome composo: ");
        String name = input.nextLine();
        
        String[] arrOfStr = name.split(" ", 2);
        System.out.printf("Your name is: %s, %s.", arrOfStr[1], arrOfStr[0].substring(0,1));
        
        input.close();
	}

}
