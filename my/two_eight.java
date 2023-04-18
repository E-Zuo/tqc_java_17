/**
 * 
 */
package tqc_java_three;

/**
 * @author User
 *
 */
import java.util.Scanner;
public class two_eight {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=0;
		if(sc.hasNextInt()) a=sc.nextInt();
		if(!(a>=1&&a<=9)) a=0;
		if(a!=0)
		{
			for(int i=1;i<=a;i++)
			{
				for(int j=i;j>=1;j--)
				System.out.printf("%d*%d=%02d  ",i,j,i*j);
				System.out.println();
			}
		}
		else System.out.print("error");
		sc.close();
	}

}
