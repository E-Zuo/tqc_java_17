/**
 * @author E-Zuo from github
 *
 */
import java.util.Scanner;
public class two_nine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double a=0,b=0;
		try
		{
			a=sc.nextDouble();
			b=sc.nextDouble();
			if(a==0&&b==0) System.out.print("(0,0) origin");
			else if(a!=0&&b==0) System.out.print("("+f(a)+",0) X");
			else if(a==0&&b!=0) System.out.print("(0,"+f(b)+") Y");
			else if(a>0&&b>0) System.out.print("("+f(a)+","+f(b)+") 1");
			else if(a>0&&b<0) System.out.print("("+f(a)+","+f(b)+") 2");
			else if(a<0&&b<0) System.out.print("("+f(a)+","+f(b)+") 3");
			else if(a>0&&b<0) System.out.print("("+f(a)+","+f(b)+") 4");
			sc.close();
		}
		catch(Exception ex)
		{
			System.out.print("error");
		}
	}
	public static String f(double d)
	{
		if(d%1==0) return String.format("%.0f", d);
		else return String.format("%s", d);
	}
}
