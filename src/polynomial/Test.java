package polynomial;
import math.Polynomial;

public class Test {

	public static void main(String[ ] args){
		Polynomial[] polyArray=new LinearPolynomial[5];
		for (int i = 0; i < polyArray.length; i++) {
			polyArray[i]=new LinearPolynomial(i+1, i+4);
		}
		for (Polynomial polynomial : polyArray) {
			System.out.println(polynomial);
		}
		drawPolynomialTable(polyArray[polyArray.length-1]);
	}
	public static void drawPolynomialTable(Polynomial polynomial){
		for(double i=0; i<1; i+=0.1){
			System.out.println("y= "+polynomial.calculate(i)+" x"+ i);
		}
	}
}
