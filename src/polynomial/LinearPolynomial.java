package polynomial;

public interface LinearPolynomial implements Polynomial{
	double a;
	double b;
	public double calculate(double x){
		return (a*x+b);
	}
	public int getDegree(){
		return 1;
	}
	public String toString(){
		return "y="+a+"x+("+b+")";
	}

}
