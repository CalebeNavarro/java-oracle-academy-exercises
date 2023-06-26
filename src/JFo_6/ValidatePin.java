package JFo_6;
import java.util.Scanner;

public class ValidatePin {

	public static void main(String[] args) {
        int pinValid = 7845;

        System.out.print("Digite o PIN: ");
        Scanner input = new Scanner(System.in);
        int pin;

        do {
            System.out.print("Digite o PIN: ");
            pin = input.nextInt();

            if (pin != pinValid) {
                System.out.println("PIN inválido. Tente novamente.");
            }
        } while (pin != pinValid);
        System.out.println("PIN válido");


        input.close();
	}

}
