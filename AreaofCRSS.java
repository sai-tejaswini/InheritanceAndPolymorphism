package AreaofCRSS;
// 2. write a java program to find the area of circle, rectangle, square and sphere by using inheritance 
import java.util.Scanner;

public class AreaofCRSS extends Sphere {
	public static void main(String args[]) {
		AreaofCRSS a = new AreaofCRSS();
		Scanner sc = new Scanner(System.in);
		int r,l,b,s,rs;
		
		System.out.println("Enter radius of circle ");
		r = sc.nextInt();
		a.circle(r);
		
		System.out.println("Enter length of Rectangle ");
		l = sc.nextInt();
		System.out.println("Enter breadth of Rectangle ");
		b = sc.nextInt();
		a.rectangle(l,b);
		
		System.out.println("Enter side of Square ");
		s = sc.nextInt();
		a.square(s);
		
		System.out.println("Enter radius of Sphere ");
		rs = sc.nextInt();
		a.sphere(rs);
	}
}