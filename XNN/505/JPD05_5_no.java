import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class JPD05 {

	public static void main(String[] args) {

		try {
			String path = "read.txt";
			File f = new File(path);
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			String line = "";
			// TO DO




			Scanner sc = new Scanner(System.in);
			String input = sc.nextLine();
			sc.close();
			// TO DO
				//System.out.print("error");
				//System.exit(0);





		} catch (Exception e) {
			System.out.print("error");
			return;
		}
	}
}
