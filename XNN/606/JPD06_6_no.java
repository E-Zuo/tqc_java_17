import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;

class Account {
	String name;
	double rate;
	double balance;

	Account(String s, double d) {
		name = s;
		rate = d;
	}
	// TO DO

}

class JPD06 {
	public static void main(String args[]) {
		try {
            String pathname = "read.txt";
			File f = new File(pathname);
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String line = "";

			String[] name = new String[5];
			String[] clas = new String[5];
			int[] number = new int[5];



			// TO DO




		} catch (Exception e) {
			System.out.print("error");
			return;
		}
	}
}