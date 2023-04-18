/**
 * 
 */
package tqc_java_three;

/**
 * @author User
 *
 */
import java.util.Scanner;
public class two_three {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=0,b=0,c=0;
		if (sc.hasNextInt()) a=sc.nextInt(); else sc.next();
		if (sc.hasNextInt()) b=sc.nextInt(); else sc.next();
		if (sc.hasNextInt()) c=sc.nextInt();
		
		if (a>100) System.out.print("");
		else if (a>=85&&a<=100) System.out.println("A");
		else if (a>=60) System.out.println("B");
		else System.out.println("C");
		
		if (b>100) System.out.print("");
		else if (b>=85&&b<=100) System.out.println("A");
		else if (b>=60) System.out.println("B");
		else System.out.println("C");
		
		if (c>100) System.out.print("");
		else if (c>=85&&c<=100) System.out.println("A");
		else if (c>=60) System.out.println("B");
		else System.out.println("C");
		
		sc.close();
	}

}
