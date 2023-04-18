import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

abstract class Clerk {
	String name;
	double rate;
	double hours;
	double salary;
	boolean isManager;

	Clerk(String n, double r, double h, boolean i) {
		name = n;
		rate = r;
		hours = h;
		isManager = i;
	}

	abstract double salary();
}

class PartTime extends Clerk {
	PartTime(String n, double r, double h, boolean i) {
		super(n, r, h, i);
	}

	public double salary() {
		return hours * rate;
	}
}

class FullTime extends Clerk {
	FullTime(String n, double r, double h, boolean i) {
		super(n, r, h, i);
	}

	public double salary() {
		// TO DO
	}
}

public class JPD06 {
	public static void main(String argv[]) {

		try {
			String pathname = "read.txt";
			File f = new File(pathname);
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String line = "";

			String[] name = new String[7];
			String[] type = new String[7];
			int[] hour = new int[7];



			// TO DO



		} catch (Exception e) {
			System.out.print("error");
			return;
		}
	}
}