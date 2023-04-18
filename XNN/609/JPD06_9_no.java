import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Scanner;

class Staff {
	String name = "";
	int leavehours = 0;
	boolean isleader = false;

	Staff(String n, int h) {
		name = n;
		leavehours = h;
	}
}

// TO DO -interface

class Manager extends Staff {
	Manager(String n, int h) {
		super(n, h);
		isleader = true;
	}
	// TO DO

}

// TO DO -class Worker

class JPD06 {
	public static void main(String args[]) {
		try {

			String pathname = "read.txt";
			File f = new File(pathname);
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);

			String line = "";
			String[] name = new String[29];
			String[] type = new String[29];
			String[] dates = new String[29];
			int[] hours = new int[29];




			// TO DO




                       
			// System.out.print("Manager" +        + "hr/Worker" +         + "hr");


		} catch (Exception e) {
			System.out.print("error");
			return;
		}
	}
}