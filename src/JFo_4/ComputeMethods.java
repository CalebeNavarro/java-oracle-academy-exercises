package JFo_4;

public class ComputeMethods {

    public double fToC(double fahrenheit){
        double result = 5.0 / 9.0 * (fahrenheit - 32);
        return result;
    }
    
    public double hypotenuse(double side1, double side2){
    	double hypotenuse = Math.hypot(side1, side2);
    	return hypotenuse;
    }
    
    public double roll(double first ,double second){
        double sum = first + second;
        return sum;
    }
}
