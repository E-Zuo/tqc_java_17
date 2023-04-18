/**
 * 
 */
package tqc_java_three;

/**
 * @author User
 *
 */
import java.util.Scanner;
public class two_seven {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		for(int i=0;i<=s.length()-1;i++)
		System.out.println("ASCII code for \'"+s.charAt(i)+ "\' is " +(int)s.charAt(i));
		sc.close();
	}

}
