package JFo_4;
import java.util.Scanner;

public class JFo_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
        System.out.print("Digite uma temperatura em Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        
		double celsius = 5 / 9 * (fahrenheit - 32);
	    System.out.println("Sua temperatura em celsius é: " + celsius);
	    
	    System.out.println("\n");
	    System.out.println("Problema 2");
	   
        System.out.print("Digite o primeiro lado do seu triângulo: ");
        double width1 = input.nextDouble();
        
        System.out.print("Digite o segundo lado do seu triângulo: ");
        double width2 = input.nextDouble();
        
		double hipotenusa = Math.hypot(width1, width2);
	    System.out.println("O tamanho da hipotenusa é: " + hipotenusa);
	    
	    System.out.println("\n");
	    System.out.println("Problema 3");
	    
	    
	    input.close();
	}
	
	

}
