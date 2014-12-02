package Bab4StatementKontrol.Bab41Pemilihan.Bab411StatementIf;

public class TigaKondisiAtauLebih2 {
	public static void main(String[] args) {

		char indeks;
		double nilaiUTS, nilaiUAS, nilaiAkhir;
		
		nilaiUTS = 75.0;
		nilaiUAS = 60.0;
		
		nilaiAkhir = (0.4 * nilaiUTS) + (0.6 * nilaiUAS);
		
		if (nilaiAkhir >= 80) {
			indeks = 'A';
		}
		else if (nilaiAkhir >= 70) {
			indeks = 'B';
		}
		else if (nilaiAkhir >= 50) {
			indeks = 'C';
		}
		else if (nilaiAkhir >= 30) {
			indeks = 'D';
		}
		else {
			indeks = 'E';
		}
		
		System.out.println("Nilai Akhir = " + nilaiAkhir);
		System.out.println("Indeks = " + indeks);
	}

}
