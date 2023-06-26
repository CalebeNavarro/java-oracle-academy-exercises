package JFo_4;

public class TestClass {
    public static void main(String[] args) {
    	
    	ComputeMethods compute = new ComputeMethods();
        
    	double fahrenheit = 100;
        double C = compute.fToC(fahrenheit );
        System.out.println("Em Celsius é de: " + C);

        double side1 = 2.43;
        double side2 = 3.43;
        double hypotenuse = compute.hypotenuse(side1, side2);
        System.out.println("Hipotenusa é de: " + hypotenuse);

        double first = 5.31; double second = 4.54;
        double soma = compute.roll(first, second);
        System.out.println("A soma das faces é " + soma);
    }
    
}