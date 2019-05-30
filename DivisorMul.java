package DivisorMul;
import java.util.Scanner;

public class DivisorMul implements  AdvancedArithmetic{
	public int divisor_sum(int n) {
		int sum = 0;
		int i=1;
		while(i<=n) {
			if((n%i) == 0 ) {
				sum += i;
			}
			i++;
		}
		return sum;
	}
	public static void main(String args[]) {
		DivisorMul dm = new DivisorMul();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		int n = sc.nextInt();
		int a = dm.divisor_sum(n);
		System.out.println(a);
	}
}
