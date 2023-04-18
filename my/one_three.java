/**
 * @author E-Zuo from github
 *
 */
import java.util.Scanner;
public class one_three {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double a=0;
		if(sc.hasNextDouble())
		{
			a=sc.nextDouble();
			System.out.printf("%.4f",(a*a*Math.PI));
		}
		else
		{
			System.out.print("0.0000");
		}
		//System.out.print(Math.PI);
		sc.close();
	}

}
