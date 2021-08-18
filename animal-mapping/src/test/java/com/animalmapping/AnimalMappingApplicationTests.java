package com.animalmapping;
import com.animalmapping.models.Bird;
import com.animalmapping.models.Chicken;
import com.animalmapping.models.Duck;

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


}
