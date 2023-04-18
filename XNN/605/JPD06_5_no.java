import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

interface Ilogin {
	public void login(                 );
}

interface Ilogout {

	public void logout();
}

class Staff {
	String name;
	Date logintime, logouttime, workdate, worktime;
}

// TO DO -class Manager

public class JPD06 {

	public static void main(String[] args) {
		Scanner sc = new java.util.Scanner(System.in);
		String n, d, t;

		try {
			String typein = sc.nextLine();
			sc.close();

			String[] getvalues = typein.split(" ");
			n = getvalues[0];
			d = getvalues[1];
			t = getvalues[2];
			// TO DO

		} catch (Exception e) {
			System.out.print("error");
			return;
		}
	}
}
