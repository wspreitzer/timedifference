package com.example.timedifference;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TimedifferenceApplicationTests {

	@Test
	void calculateTimeDifferenece_200() {
		double distance = 2500;
		int team = (int) distance / 60;
		int factor = (int) (team / 12);
		int extra = factor * 12;
		int single = (int) team + extra;
		double actual =  single - team;
		assertEquals(36.0, actual);
	}
}