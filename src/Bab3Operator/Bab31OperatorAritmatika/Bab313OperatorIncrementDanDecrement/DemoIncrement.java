package Bab3Operator.Bab31OperatorAritmatika.Bab313OperatorIncrementDanDecrement;

public class DemoIncrement {

	public static void main(String[] args) {

		ClassIncrement ci = new ClassIncrement();
		
		ci.setA(5);
		
		System.out.println("Pre-Increment");
		System.out.println("a : " + ci.getA());
		System.out.println("++a : " + ci.preIncrement());
		System.out.println("a++ : " + ci.postIncrement());
	}

}
