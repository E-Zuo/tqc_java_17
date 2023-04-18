import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class JPD05 {

	public static void main(String[] args) {

		try {
			String path = "read.txt";
			File f = new File(path);
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			// TO DO



			Scanner sc = new Scanner(System.in);
			int judge = sc.nextInt();
			sc.close();
			// TO DO






		} catch (Exception e) {
			System.out.print("error");
			return;
		}
	}

    //System.out.print("Delete:" +          + " " + delete);
}
