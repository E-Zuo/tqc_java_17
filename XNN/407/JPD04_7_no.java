import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;


public class JPD04 {

	public static void main(String[] args) {
		Random rand = new Random();
		int year = 0;
		try {
			Scanner sc = new Scanner(System.in);
			year = sc.nextInt();
			
            // TODO

		} catch (Exception ex) {
			System.out.print("error");
		}

        
		int minDay = (int); // Date of 1/1
		int maxDay = (int); // Date of 12/31
		long randomDay = minDay + rand.nextInt(maxDay - minDay);
        

		// TODO
		System.out.print();
	}
}