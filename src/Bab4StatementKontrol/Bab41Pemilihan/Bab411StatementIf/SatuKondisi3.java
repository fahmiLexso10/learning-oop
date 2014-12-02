package Bab4StatementKontrol.Bab41Pemilihan.Bab411StatementIf;

public class SatuKondisi3 {
	public static void main(String[] args) {

		int tahun = 2008;
		
		if ((tahun % 4 == 0) && ((tahun % 100 != 0) || tahun % 400 == 0)) {
			System.out.println("Tahun " + tahun + " merupakan tahun kabisat");
		}
	}

}
