package Bab3Operator.Bab31OperatorAritmatika.Bab312OperatorModulusSisaBagi;

public class DemoModulus {
	public static void main(String[] args) {

		ClassModulus cm = new ClassModulus(10, 3, 6, 2);
		
		System.out.println("Nilai a : " + cm.getA());
		System.out.println("Nilai b : " + cm.getB());
		System.out.println("Nilai c : " + cm.getC());
		System.out.println("Nilai d : " + cm.getD());
		System.out.println();
		
		System.out.println("Nilai modulus a%b : " + cm.getAModulusB());
		System.out.println("Nilai modulus c%d : " + cm.getCModulusD());
	}
}
