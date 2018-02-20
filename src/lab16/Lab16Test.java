package lab16;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Lab16Test {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testIsPrime() {
		boolean test = Lab16.isPrime(13);
		assertTrue(test);
	}

	@Test
	void testPrimeCounter() {
		int test = Lab16.getPrimes(2);
		int shouldBe = 3;
		assertEquals(shouldBe, test);
	}

}
