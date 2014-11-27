package Bab3Operator.Bab31OperatorAritmatika.Bab312OperatorModulusSisaBagi;

public class ClassModulus {

	private int a, b, c, d;

	public ClassModulus(int a, int b, int c, int d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public int getC() {
		return c;
	}

	public int getD() {
		return d;
	}

	public int getAModulusB() {
		int modulusAB = a % b;
		return modulusAB;
	}

	public int getCModulusD() {
		int modulusCD = c % d;
		return modulusCD;
	}
}
