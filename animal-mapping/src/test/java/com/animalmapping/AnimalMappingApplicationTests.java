package com.animalmapping;
import com.animalmapping.constants.Codes;
import com.animalmapping.interfaces.CanFly;
import com.animalmapping.interfaces.CanSing;
import com.animalmapping.interfaces.CanSwim;
import com.animalmapping.interfaces.CanWalk;
import com.animalmapping.models.Animal;
import com.animalmapping.models.Bird;
import com.animalmapping.models.Butterfly;
import com.animalmapping.models.Caterpillar;
import com.animalmapping.models.Chicken;
import com.animalmapping.models.ClownFish;
import com.animalmapping.models.Dolphin;
import com.animalmapping.models.Duck;
import com.animalmapping.models.Fish;
import com.animalmapping.models.Parrot;
import com.animalmapping.models.Shark;

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
	
	@Test
	void qnB1Fishes() {	
		Fish fish = new Fish();
		fish.swim();
		
	}
	
	@Test
	void qnB2SharkAndClownFish() {	
		Shark shark = new Shark();
		shark.getColour();
		shark.getSize();
		shark.eatFish();
		
		ClownFish clownFish = new ClownFish();
		clownFish.getColour();
		clownFish.getSize();
		clownFish.makeJokes();
		
	}
	@Test
	void qnB3Dolphins() {	
		Dolphin dolphin = new Dolphin();
		dolphin.swim();		
	}
	
	@Test
	void qnCButterflyAndCaterpillar() {	
		Caterpillar caterpillar = new Caterpillar();
		caterpillar.walk();	
		Butterfly butterfly = caterpillar.metamorphosis();
		butterfly.fly();
	}
	@Test
	void qnDCount() {	
		Animal[] animals= {
				new Parrot(),
				new Chicken(),
				new Chicken(Codes.gender_m),
				new Duck(),
				new Fish(),
				new Shark(),
				new ClownFish(),
				new Butterfly()
		};
	    int flyingAnimal = 0;
	    int walkingAnimal = 0;
	    int speakingAnimal = 0;
	    int swimingAnimal = 0;
		 
	        for (int i = 0; i < animals.length; i++) {
	            if (animals[i] instanceof CanFly) {
	                flyingAnimal += 1;
	            }
	            if (animals[i] instanceof CanWalk) {
	                walkingAnimal += 1;
	            }
	            if (animals[i] instanceof CanSing) {
	                speakingAnimal += 1;
	            }
	            if (animals[i] instanceof CanSwim) {
	                swimingAnimal += 1;
	            }
	        }
	}
	
	


}
