package DecimalToBinary;
import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the decimal number ");
		int n = sc.nextInt();
		String res = "";
		
		while(n>0) {
			res += n%2 ;
			n = n/2 ;
		}
		StringBuffer sol = new StringBuffer();
		sol.append(res);
		sol = sol.reverse();
		System.out.println(sol);	
	}
	
}
