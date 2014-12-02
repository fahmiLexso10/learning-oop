package Bab4StatementKontrol.Bab41Pemilihan.Bab411StatementIf;

public class DuaKondisi2 {
	public static void main(String[] args) {

char ch = 'B';
		
		if ((ch == 'a')||(ch == 'A')||(ch == 'i')||
				(ch == 'I')||(ch == 'u')||(ch == 'U')||
				(ch == 'e')||(ch == 'E')||(ch == 'o')||(ch == 'O')) {
			System.out.println(ch + " adalah huruf vokal");
		}
		else {
			System.out.println(ch + " adalah huruf mati (konsonan)");
		}
	}

}
