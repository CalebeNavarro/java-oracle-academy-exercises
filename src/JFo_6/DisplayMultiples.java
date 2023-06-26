package JFo_6;

import java.util.Scanner;

public class DisplayMultiples {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
        System.out.print("Digite um número: ");
        int number = input.nextInt();
        
        int[] array;
        for (int i = 1; i <= 12; i++) {
        	System.out.printf("%d x %d = %d\n", number, i, number * i);
        }
        
        input.close();
	}

}
