/**
 * @author E-Zuo from github
 *
 */
import java.util.Scanner;
public class two_six {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dreams = "There are moments in life when you miss someone so much that "
				+ "you just want to pick them from your dreams and hug them for real! Dream what "
				+ "you want to dream; go where you want to go; be what you want to be, because you have "
				+ "only one life and one chance to do all the things you want to do";

		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		int a=0;
		while(dreams.contains(s))
		{
			if (dreams.contains(s))
			{
				a++;
				dreams=dreams.replaceFirst(s, "");
				//System.out.print(dreams);
			}
		}
		System.out.print(a);
		sc.close();
		// TO DO
	}

}
