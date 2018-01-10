package ex3; 

import java.util.ArrayList;
import java.util.List;

/**
 * @author ETY19
 *
 */
public class Zone {
	
	protected List<Animal> listAnimaux;

	/**
	 * 
	 */
	public Zone() {
		this.listAnimaux = new ArrayList<Animal>();
	}
	
	/**
	 * @param animal
	 */
	public void addAnimalToZone(Animal animal) {
		listAnimaux.add(animal);
	}
	
	/**
	 * 
	 */
	public void afficherListeAnimaux(){
		for (Animal animal: listAnimaux){ 
			System.out.println(animal.getNom() + "/" + animal.getComportement());
		}
	}
	
	public int compterAnimaux(){
		return this.listAnimaux.size();
	}
	
	/**
	 * @return
	 */
	public List<Animal> getListAnimaux() {
		return listAnimaux;
	}

	/**
	 * @param listAnimaux
	 */
	public void setListAnimaux(List<Animal> listAnimaux) {
		this.listAnimaux = listAnimaux;
	}
}
