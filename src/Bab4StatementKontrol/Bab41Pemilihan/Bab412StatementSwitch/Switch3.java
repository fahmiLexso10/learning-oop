package Bab4StatementKontrol.Bab41Pemilihan.Bab412StatementSwitch;

public class Switch3 {
	public static void main(String[] args) {

		//nothing break
		int a = 2;
		int b;
		
		switch (a) {
		case 1:
			b = a + 1;
		case 2:
			b = a + 2;
		case 3:
			b = a + 3;
		case 4:
			b = a + 4;
		case 5:
			b = a + 5;
		default:
			b = 0;
		}
		
		System.out.println("Nilai b = " + b);
	}

}
