package JFo_3;

import java.util.Scanner;

public class JavaLibs {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
        System.out.println("Bem vindo(a) jogo da história.");
        System.out.println("Criar uma história!");

        System.out.print("Digite um nome: ");
        String name = input.nextLine();

        System.out.print("Digite seu número preferido: ");
        int number = input.nextInt();
        input.nextLine();

        System.out.print("Digite seu atual salário: ");
        double decimal = input.nextDouble();
        input.nextLine();
        
        double conditional = decimal / number ;

        System.out.print("Nossa história!\n");
        System.out.print("Caminhando pelo parque, de longe você vê um homem mesterioso!\n");
        System.out.print("Chegando perto ele te chama para conversar!\n");
        System.out.printf("Logo você descobre que ele é um comerciante, vendendo maças do amor! E seu nome é %s.\n", name);
        System.out.print("Você se interessa e vai comprar uma, porém ele indaga sobre uma promoção.\n");
        System.out.print("A promoção é a seguinte: se o seu salário divido pelo seu número da sorte for menor que 100, você paga metade do preço, caso contrário paga o dobro!\n");
        System.out.print("Sem pensar muito, logo aceita.\n");
        System.out.print("Você fala e ele te dá a resposta\n");
        
        if (conditional < 100)
        {
        	System.out.print("Uhull o comerciante te vende a maça do amor pela metade do preço e você vai para casa feliz.\n");
        } else
        {
        	System.out.print("Ahh que azar, você paga o dobro e segue contente do mesmo jeito comendo sua maça do amor.\n");
        }
        System.out.print("Fim da história");
        
		input.close();

	}

}
