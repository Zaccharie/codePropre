package ex3;

public class Aquarium extends Zone{
	
	public double calculerKgsNourritureParJour(){
		return this.listAnimaux.size() * 0.2;
	}
}
