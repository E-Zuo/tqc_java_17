import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class JPD05 {

	public static void main(String[] args) {

		try {
			String path = "read.txt";
			File f = new File(path);
			FileReader fw = new FileReader(f);
			BufferedReader br = new BufferedReader(fw);

			// TO DO





		} catch (Exception e) {
			System.out.print("error");
			return;
		}
	}
}
