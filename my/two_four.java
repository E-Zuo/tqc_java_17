/**
 * @author E-Zuo from github
 *
 */
import java.util.Scanner;
public class two_four {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=0,b=0;
		boolean f=true;
		if(sc.hasNextInt()) a=sc.nextInt(); else sc.next();
		if(sc.hasNextInt()) b=sc.nextInt();
		sc.close();
		//System.out.println(a);
		//System.out.println(b);
		//System.out.println(a>=1&&a<=100&&b>=1&&b<=100);
		if(a>=1&&a<=100&&b>=1&&b<=100)
		{
			if(a<2)
			{
				a=3;
				System.out.println("2");
			}
			for(;a<=b;a++)
			{
				for(int j=2;j<=a-1;j++)
				{
					if(a%j==0)
					{
						//System.out.println(a+"a");
						//System.out.println(j+"j");
						f=false;
						break;
					}
				}
				if (f) System.out.println(a);
				f=true;
			}
		}
		else System.out.println("error");
	}

}
