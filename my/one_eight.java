/**
 * 
 */
package tqc_java_three;

import java.util.Scanner;

/**
 * @author User
 *
 */
public class one_eight {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a=0;
		Scanner sc = new Scanner(System.in);
		//if(sc.hasNextDouble()) a=sc.nextDouble();
		try {
			a=sc.nextDouble();
			System.out.printf("%.4f",2*Math.pow(a, 3)+3*a-1);
		}
		catch(Exception ex){
			System.out.printf("error");
		}
		sc.close();
	}

}
