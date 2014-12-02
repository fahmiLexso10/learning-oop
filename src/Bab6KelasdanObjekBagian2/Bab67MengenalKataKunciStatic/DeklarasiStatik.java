package Bab6KelasdanObjekBagian2.Bab67MengenalKataKunciStatic;

import Bab6KelasdanObjekBagian2.Bab67MengenalKataKunciStatic.DemoStatic2;

public class DeklarasiStatik {

	static int a;
	static int b;
	
	static void test() {
		int c = a + b;
		System.out.println("a + b = " + c);
	}
	
	public static void main(String[] args) {
		a = 10;
		b = 20;
		test();
	}

}
