package ex3;

import java.util.ArrayList;
import java.util.List;

import ex3.Animal;

/**Représente un Zoo
 * @author Zaccharie
 *
 */
public class Zoo {

	private String nom;
	
	protected List<Zone> listZones;
	
	public Zoo(String nom){
		this.nom = nom;
		listZones = new ArrayList<Zone>();
		listZones.add(new Aquarium());
		listZones.add(new FermeReptile());
		listZones.add(new SavaneAfricaine());
		listZones.add(new ZoneCarnivore());
	}
	
	/**Ajoute un animal dans la zone dédiée
	 * @param animal
	 */
	public void addAnimal(Animal animal){
		for(Zone zone : listZones){
			if(zone.acceptInZone(animal)){
				zone.addAnimalToZone(animal);
			}
		}
		
	}
	
	/**Affiche la liste des animaux du Zoo
	 * 
	 */
	public void afficherListeAnimaux(){
		for(Zone zone : listZones){
			zone.afficherListeAnimaux();
		}
	}

	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter for nom
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
