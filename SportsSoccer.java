package SportsSoccer;

class SportsSoccer extends Soccer{
	public static void main(String args[]) {
		Sports sp1 = new Sports();
		Sports sp2 = new Soccer();
		System.out.println(sp1.getName());
		sp1.getNumberOfTeamMembers();
		System.out.println(sp2.getName());
		sp2.getNumberOfTeamMembers();	
	}
}