package week05Interface;

public class MultiplicationOperation implements MathOperation {

	@Override
	public double evaluate(double double1, double double2) {
		return double1 * double2;
	}

}
