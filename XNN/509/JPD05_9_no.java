import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class JPD05 {

	public static void main(String[] args) {

		try {
			int num = 22;
			String path = "read.txt";
			File f = new File(path);
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			// TO DO




		} catch (Exception ex) {
			System.out.print("error");
			return;
		}
	}
}
