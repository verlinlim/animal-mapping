package com.animalmapping;
import com.animalmapping.constants.Codes;
import com.animalmapping.models.Bird;
import com.animalmapping.models.Chicken;
import com.animalmapping.models.Duck;
import com.animalmapping.models.Parrot;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AnimalMappingApplicationTests {

	@Test
	void qnA1BirdCanSing() {
		Bird bird = new Bird();
		bird.sing();
	}
	
	@Test
	void qnA2DuckAndChicken() {
		Duck duck = new Duck();
		duck.sing();
		duck.swim();
		
		Chicken chicken = new Chicken();
		chicken.sing();
		chicken.fly();
	}
	
	@Test
	void qnA3Rooster() {		
		Chicken chicken = new Chicken();
		chicken.sing();

		Chicken rooster = new Chicken(Codes.gender_m);
		rooster.sing();
	}
	
	@Test
	void qnA4Parrot() {		
		Parrot parrotDog = new Parrot(Codes.animal_dog);
		parrotDog.sing();

		Parrot parrotCat = new Parrot(Codes.animal_cat);
		parrotCat.sing();
		
		Parrot parrotRooster = new Parrot(Codes.animal_rooster);
		parrotRooster.sing();
		
		Parrot parrot = new Parrot();
		parrot.sing();
	}


}
