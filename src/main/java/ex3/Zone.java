package ex3; 

import java.util.ArrayList;
import java.util.List;

/**Représente une zone
 * @author Zaccharie
 *
 */
public abstract class Zone {
	
	protected List<Animal> listAnimaux;

	/**
	 * 
	 */
	public Zone() {
		this.listAnimaux = new ArrayList<Animal>();
	}
	
	/**Ajoute animal à la liste d'animaux
	 * @param animal
	 */
	public void addAnimalToZone(Animal animal) {
		listAnimaux.add(animal);
	}
	
	/**Affiche la liste des animaux dans la console
	 * TODO utiliser Logging à la place de syso
	 */
	public void afficherListeAnimaux(){
		for (Animal animal: listAnimaux){ 
			System.out.println(animal.getNom() + "/" + animal.getComportement());
		}
	}
	
	
	/**Renvoie le nombre d'animaux contenu dans la liste d'animaux 
	 * @return int
	 */
	public int compterAnimaux(){
		return this.listAnimaux.size();
	}
	
	public boolean acceptInZone(Animal animal){
		return false;
	}
	
	public abstract double calculerKgsNourritureParJour();
	
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
