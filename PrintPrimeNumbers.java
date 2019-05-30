package PrintPrimeNumbers;
import java.util.Scanner;

public class PrintPrimeNumbers {
	public static void main(String arg[]){
		System.out.println("Enter a number ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count =primeCal(n);
		if(count==2) {
			print(n);
		}
		else
			System.out.println();
	}
	static int primeCal(int num){
		int count=0;
		for(int i=1;i<=num;i++){
			if(num%i==0){
				count++;	        
			}
		}
		return count;        
	} 
	static void print(int num) {
		int c=0;
		for(int j=1; j<=num ; j++) {
			c = primeCal(j);
			if(c==2) {
				System.out.print(j + " ");
			}	
		}
	}
}