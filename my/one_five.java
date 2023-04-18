/**
 * 
 */
package tqc_java_three;

/**
 * @author User
 *
 */
import java.util.Scanner;
public class one_five {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//String search = sc.nextLine();
		int first=0,last=0;
		String a;
		String dreams = "There are moments in life when you miss someone so much that "
				+ "you just want to pick them from your dreams and hug them for real! Dream what "
				+ "you want to dream;go where you want to go;be what you want to be,because you have "
				+ "only one life and one chance to do all the things you want to do";
		a=sc.nextLine();
		//System.out.print(dreams);
		first=dreams.indexOf(a);
		last=dreams.lastIndexOf(a);
		if(first==last)
		{
			if(first==-1)//can not find
			{
				System.out.println("first:" + (first+1));
				System.out.println("last:" + (last+1));
				System.out.print("capture:" + dreams.substring(0,0));
			}
			else//only find one
			{
				System.out.println("first:" + (first+1));
				System.out.println("last:" + 0);
				System.out.print("capture:" + dreams.substring(first));
			}
		}
		else
		{
		System.out.println("first:" + (first+1));
		System.out.println("last:" + (last+1));
		System.out.print("capture:" + dreams.substring(first,last+a.length()));
		}
		sc.close();
	}

}
