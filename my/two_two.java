/**
 * @author E-Zuo from github
 *
 */
import java.util.Scanner;
public class two_two {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=0;
		try {
			a=sc.nextInt();
			// TO DO
			if (a%2==0)
			{
				System.out.print(a  + " is an even number.");
			}
			else
			{
				System.out.print(a  + " is an odd number.");
			}
		} catch (Exception e) {
			System.out.println("error");
		}
		sc.close();
	}

}
