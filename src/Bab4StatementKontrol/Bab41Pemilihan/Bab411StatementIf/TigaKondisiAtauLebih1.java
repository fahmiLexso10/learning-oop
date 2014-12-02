package Bab4StatementKontrol.Bab41Pemilihan.Bab411StatementIf;

public class TigaKondisiAtauLebih1 {
	public static void main(String[] args) {

		int bilangan = 4;
		
		if (bilangan < 0) {
			System.out.println(bilangan + " merupakan bilangan NEGATIF");
		}
		else if (bilangan == 0){
			System.out.println("Nilai yang dimasukkan adalah NOL");
		}
		else {
			System.out.println(bilangan + " merupakan bilangan POSITIF");
		}
	}

}
