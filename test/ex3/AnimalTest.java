package ex3;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnimalTest {

	@Test
	public void testAnimal() {
		
		Animal animal = new Animal("Dragon", "REPTILE", Comportement.CARNIVORE);
		assertEquals("Dragon", animal.getNom());
		assertEquals("REPTILE", animal.getType());
		assertEquals(Comportement.CARNIVORE, animal.comportement);

	}

}
