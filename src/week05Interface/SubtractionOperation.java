package week05Interface;

public class SubtractionOperation implements MathOperation {

	@Override
	public double evaluate(double double1, double double2) {
		return double1 - double2;
	}

}
