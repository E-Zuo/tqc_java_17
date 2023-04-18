import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.Scanner;

class Account {
	String name;
	double rate = 1;
	double balance;
	boolean isCD = true;
	int yearration;

	Account(String n) {
		name = n;
	}

        // TO DO

	void setRate(int r) {
		rate = r;
	}

	void deposit(int d) {
		// TO DO
	}

	void withdraw(int w) {
		// TO DO
	}

	double getBalance() {
		return balance;
	}

	double addInterest() {
		// TO DO
	}
}

class JPD06 {
	public static void main(String args[]) {
		try {

			String pathname = "read.txt";
			File f = new File(pathname);
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String line = "";

			String[] name = new String[9];
			String[] clas = new String[9];
			int[] number = new int[9];



			// TO DO



		} catch (Exception e) {
			System.out.print("error");
			return;
		}
	}
}