/**
 * @author E-Zuo from github
 *
 */
import java.util.Scanner;
public class one_four {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		double a,b,c,d;
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		d=sc.nextDouble();
		System.out.printf("%.4f",Math.sqrt(Math.pow(a-c,2)+Math.pow(b-d,2)));
		sc.close();
	}

}
