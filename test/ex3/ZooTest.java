package ex3;

import static org.junit.Assert.*;

import org.junit.Test;

public class ZooTest {

	@Test
	public void testZoo() {
		
		Zoo zoo = new Zoo("Zoo Test");
		
		assertEquals("Zoo Test", zoo.getNom());
	
	}

	@Test
	public void testAddAnimal() {
		
		Zoo zoo = new Zoo("Zoo Test");
		Animal animal =  new Animal("Dragon", "REPTILE", Comportement.CARNIVORE);
		Zone zone = new Zone();
		zone.addAnimalToZone(animal);
		zoo.addAnimal(animal);
		
		//assertEquals("");
		
	}

}
