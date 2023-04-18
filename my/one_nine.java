/**
 * 
 */
package tqc_java_three;

import java.util.Scanner;

/**
 * @author User
 *
 */
public class one_nine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a;
		//int b;
		//char c;
			a=sc.nextLine();
			if ((a.charAt(0)<48||a.charAt(0)>57&&
				a.charAt(0)<65||a.charAt(0)>90&&
				a.charAt(0)<97||a.charAt(0)>122)||
				(a.charAt(a.length()-1)<48||a.charAt(a.length()-1)>57&&
				a.charAt(a.length()-1)<65||a.charAt(a.length()-1)>90&&
				a.charAt(a.length()-1)<97||a.charAt(a.length()-1)>122))
				
				System.out.print("error");
			
			else
			{
				if (a.length()!=1)
				{
					char first,last;
					//System.out.println("test_one");
					first=a.charAt(0);
					if (first==57) System.out.print((char)48);
					else if (first==90) System.out.print((char)123);
					else if (first==122) System.out.print((char)91);
					else if (first>=48&&first<=56) System.out.print((char)(first+1));
					else if (first>=65&&first<=89) System.out.print((char)(first+33));
					else if (first>=97&&first<=121) System.out.print((char)(first-31));
					
					System.out.print(a.substring(1,a.length()-1));
					
					last=a.charAt(a.length()-1);
					
					if (last==57) System.out.print((char)48);
					else if (last==90) System.out.print((char)123);
					else if (last==122) System.out.print((char)91);
					else if (last>=48&&last<=56) System.out.print((char)(last+1));
					else if (last>=65&&last<=89) System.out.print((char)(last+33));
					else if (last>=97&&last<=121) System.out.print((char)(last-31));
					
					//if (a.charAt(0)>48&&a.charAt(0)<57) a=
				}
				else //System.out.print((char)(a.charAt(0)+1));
				{
					int sv=a.charAt(0);
					if (sv==57) System.out.print((char)48);
					else if (sv==90) System.out.print((char)123);
					else if (sv==122) System.out.print((char)91);
					else if (sv>=48&&sv<=56) System.out.print((char)(sv+1));
					else if (sv>=65&&sv<=89) System.out.print((char)(sv+33));
					else if (sv>=97&&sv<=121) System.out.print((char)(sv-31));
				}
			}
			sc.close();
	}

}
