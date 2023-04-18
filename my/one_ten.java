/**
 * @author E-Zuo from github
 *
 */
import java.text.DecimalFormat;
import java.util.Scanner;
public class one_ten {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 = 0, n5 = 0, n10 = 0;
		if (sc.hasNextInt()) n1=sc.nextInt(); else sc.next(); if(n1<0) n1=0;
		if (sc.hasNextInt()) n5=sc.nextInt()*5; else sc.next(); if(n5<0) n5=0;
		if (sc.hasNextInt()) n10=sc.nextInt()*10; if(n10<0) n10=0;
		DecimalFormat formatter = new DecimalFormat("#,###");
		System.out.print(formatter.format(n1+n5+n10));
		sc.close();
	}

}
