package JAVA20;

public class Complex {
	private double real;
	private double imag;
	
	public Complex(double r, double i) {
		real = r;
		imag = i;
	}
	
	double getReal() {
		return real;
	}
	
	double getImag() {
		return imag;
	}
	
	public Complex add(Complex C) {
		double resultReal = real + C.getReal();
		double resultImag = imag + C.getImag();
		return new Complex(resultReal, resultImag);
	}
}
