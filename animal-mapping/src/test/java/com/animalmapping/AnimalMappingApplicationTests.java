package com.animalmapping;
import com.animalmapping.models.Bird;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AnimalMappingApplicationTests {

	@Test
	void qnA1BirdCanSing() {
		Bird bird = new Bird();
		bird.sing();
	}

}
