package PrintBetweenRange;
import java.util.Scanner;

public class PrintBetweenRange {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int f,l;
		System.out.println("Enter the string ");
		String a = sc.next();
		char[] c = a.toCharArray();
		System.out.println("Enter the range ");
		f = sc.nextInt();
		l = sc.nextInt();
		for(int i =f-1 ; i<l ; i++ ) {
			System.out.print(c[i] + " ");
		}
	}
}
