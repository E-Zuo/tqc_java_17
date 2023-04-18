/**
 * @author E-Zuo from github
 *
 */
import java.util.Scanner;
public class one_seven {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=0,c=0;
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()) a=sc.nextInt(); else sc.next();
		if (sc.hasNextInt()) b=sc.nextInt(); else sc.next();
		if (sc.hasNextInt()) c=sc.nextInt();
		if (a<0) a=0; else if(a>100) a=100;
		if (b<0) b=0; else if(b>100) b=100;
		if (c<0) c=0; else if(c>100) c=100;
		if ((a+b+c)/3==100) System.out.print("full mark:100");
		else if ((a+b+c)/3>=60) System.out.print("pass:" + ((a+b+c)/3));
		else System.out.print("failed:" + ((a+b+c)/3));
		sc.close();
	}

}
