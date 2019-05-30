package MyBook;
import java.util.Scanner;

class MyBook extends Book {
	
	public static void main(String args[]) {
		MyBook mb = new MyBook();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String s = sc.next();
		mb.setTitle(s);
		//String g = mb.getTitle();
		System.out.println("The title is " + mb.getTitle() );
	}

	@Override
	void setTitle(String s) {
		// TODO Auto-generated method stub
		title = s;
	}
}
