package ex3;

public class SavaneAfricaine extends Zone {
	
	public int calculerKgsNourritureParJour(){
		return this.listAnimaux.size() * 10;
	}
}
