/**
 * 
 */
package tqc_java_three;

/**
 * @author User
 *
 */
import java.util.Scanner;
public class two_one {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		double a=0,b=0;
		if (sc.hasNextDouble()) a=sc.nextDouble(); else sc.next();
		if (sc.hasNextDouble()) b=sc.nextDouble();
		if(a>b) String.format("%.f", a);
		if(a<b) System.out.print(f(a)+"<"+f(b));
		if(a==b) System.out.print(f(a)+"="+f(b));
		sc.close();
		//System.out.print(String.format("%f", a));
	}
	public static String f(double d)
	{
		if (d%1==0) return String.format("%.0f", d);
		else return String.format("%s", d);
	}
}
