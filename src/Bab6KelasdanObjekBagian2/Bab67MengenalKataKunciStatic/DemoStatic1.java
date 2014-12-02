package Bab6KelasdanObjekBagian2.Bab67MengenalKataKunciStatic;

public class DemoStatic1 {

	static int a = 5;
	static int b = 6;

	int x = 4; // data non-statik

	static void test() {
		int c = a + b;
		System.out.println("a + b = " + c);
	}

	public static void main(String[] args) {
		test();
	}

}
