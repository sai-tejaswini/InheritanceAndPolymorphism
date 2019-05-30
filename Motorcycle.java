package Motorcycle;

public class Motorcycle extends Engine {
	public String show() {
		return "who is a vehicle with pedals.";
	}
	Motorcycle(){
		String temp =  super.show();
		System.out.println("Hello I am a motorcycle , " + temp);
		String temp1 =  show();
		System.out.println("My ancestor is a cycle" + temp1);
	}
	public static void main(String args[]) {
		Motorcycle m = new Motorcycle();
	}
	
}