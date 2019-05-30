package Adder;
import java.util.Scanner;

class Adder extends Arithmetic{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Arithmetic a = new Arithmetic();
		a.getName();
		System.out.println("Enter elements to add ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println(a.add(x, y));
		
	}
}
