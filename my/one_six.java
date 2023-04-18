/**
 * 
 */
package tqc_java_three;

/**
 * @author User
 *
 */
import java.util.Scanner;
public class one_six {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1=0, n2=0, n3=0, n4=0, s, b;
		if (sc.hasNextInt()) n1=sc.nextInt(); else sc.next();
		if (sc.hasNextInt()) n2=sc.nextInt(); else sc.next();
		if (sc.hasNextInt()) n3=sc.nextInt(); else sc.next();
		if (sc.hasNextInt()) n4=sc.nextInt();
		if (n1<0) n1=0;
		if (n2<0) n2=0;
		if (n3<0) n3=0;
		if (n4<0) n4=0;
		/*System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);*/
		b = Math.max(Math.max(n1, n2), Math.max(n3, n4));
		s = Math.min(Math.min(n1,n2),Math.min(n3,n4));
		System.out.println("smallest:" + s);
		System.out.print("largest:" + b);
		sc.close();
	}

}
