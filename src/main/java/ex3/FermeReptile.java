package ex3;

public class FermeReptile extends Zone {

	
	public double calculerKgsNourritureParJour(){
		return this.listAnimaux.size() * 0.1;
	}
}
