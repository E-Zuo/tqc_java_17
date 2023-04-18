/**
 * @author E-Zuo from github
 *
 */
import java.util.Scanner;
public class two_five {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=0,b=0,c=0,d=0,e=1;
		try
		{
			a=sc.nextInt();
			b=sc.nextInt();
			c=Math.min(a, b);
			d=Math.max(a, b);
			for(int i=c;i>=1;i--)
			{
				if(c%i==0 && d%i==0)
				{
					e=i;
					break;
				}
				//System.out.println(e);
			}
			System.out.print(e);
		}
		catch(Exception ex)
		{
			System.out.print("error");
		}
		/*System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);*/
		sc.close();
	}

}
