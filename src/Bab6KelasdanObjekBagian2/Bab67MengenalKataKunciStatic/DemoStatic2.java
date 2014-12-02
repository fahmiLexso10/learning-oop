package Bab6KelasdanObjekBagian2.Bab67MengenalKataKunciStatic;

public class DemoStatic2 {

	static int a;
	static int b;
	
	static int c;

	// mendefinisikan blok static untuk inisialisasi nilai
	static {
		System.out.println("Blok static dipanggil...");
		a = 5;
		b = 6;
	}
	static {
		System.out.println("Blok static dipanggil lg...");
		c = 7;
	}

	static void test() {
		int c = a + b;
		System.out.println("a + b = " + c);
	}

	public static void main(String[] args) {
		test();
	}

}
