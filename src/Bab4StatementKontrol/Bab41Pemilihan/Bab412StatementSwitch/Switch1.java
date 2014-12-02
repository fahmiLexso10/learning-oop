package Bab4StatementKontrol.Bab41Pemilihan.Bab412StatementSwitch;

public class Switch1 {
	public static void main(String[] args) {

		int noHari = 5;

		switch (noHari) {
		case 1:
			System.out.println("Hari ke-" + noHari + " adalah hari Senin");
			break;
		case 2:
			System.out.println("Hari ke-" + noHari + " adalah hari Selasa");
			break;
		case 3:
			System.out.println("Hari ke-" + noHari + " adalah hari Rabu");
			break;
		case 4:
			System.out.println("Hari ke-" + noHari + " adalah hari Kamis");
			break;
		case 5:
			System.out.println("Hari ke-" + noHari + " adalah hari Jum\'at");
			break;
		case 6:
			System.out.println("Hari ke-" + noHari + " adalah hari Sabtu");
			break;
		case 7:
			System.out.println("Hari ke-" + noHari + " adalah hari Minggu");
			break;
		default:
			System.out.println("Tidak ada hari ke-" + noHari);
		}
	}

}
