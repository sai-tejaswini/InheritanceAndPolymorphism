package Checkinstance;
import java.util.Scanner;

public class Checkinstance{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of instances ");
		int n = sc.nextInt();
		int s=0,r=0,h=0;
		String[] a = new String[n];
		Checkinstance[] ci = new Checkinstance[n];
		
		for(int i=0; i<n ; i++) {
			a[i] = sc.next();
			if(a[i].equals("Students")) {
				Students st =new Students();
				if(st instanceof Students)
					s++;
			}
			else if(a[i].equals("Rockstar")) {
				Rockstar rs = new Rockstar();
				if(rs instanceof Rockstar)
					r++;
			}
			else if(a[i].equals("Hacker")){
				Hacker hk = new Hacker();
				if(hk instanceof Hacker)
					h++;
			}
		}
		System.out.println("Student : " + s +"\nRockstar : " + r + "\nHacker : " + h);
	}
}