/**
 * 
 */
package tqc_java_three;

/**
 * @author User
 *
 */
import java.util.Scanner;
public class one_two {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner sc= new Scanner(System.in);
		if(sc.hasNextInt())
		{
			a=sc.nextInt();
			if(a%2!=0)
			{
				a=0;
			}
		}
		else
		{
			a=0;
		}
		sc.nextLine();
		if(sc.hasNextInt())
		{
			b=sc.nextInt();
			if(b%2!=0)
			{
				b=0;
			}
		}
		else
		{
			b=0;
		}
		System.out.print(a+b);
		//System.out.print(c+" "+d);
		sc.close();
	}

}
