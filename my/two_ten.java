/**
 * @author E-Zuo from github
 *
 */
import java.util.Scanner;
public class two_ten {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=0;
		try
		{
			a=sc.nextInt();
			if(a==0) System.out.print("error:DivideByZeroException");
			else System.out.print(25/a);
		}
		catch(Exception ex)
		{
			System.out.print("error");
		}
		sc.close();
	}

}
