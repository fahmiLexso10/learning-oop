package Bab3Operator.Bab31OperatorAritmatika.Bab313OperatorIncrementDanDecrement;

public class ClassIncrement {

	private int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	public int preIncrement() {
		return ++a;
	}
	
	public int postIncrement() {
		return a++;
	}
}
