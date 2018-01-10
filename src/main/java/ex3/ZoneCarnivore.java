package ex3;

public class ZoneCarnivore extends Zone {
	
	public double calculerKgsNourritureParJour(){
		return this.listAnimaux.size() * 10;
	}
}
