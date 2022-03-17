package interval;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class intervalTest {

	@Test
	void test() {
		byte b = 127;
		short sh32767;
		int a = 7;
		long l = 1_000_000_000_000L;
		float f = 1e32f;
		double d = 1e100;
		char c = 'A';
		boolean bo = false;
		
		Interval myInterval = new Interval(10, 20);
		assertEquals(myInterval.getLowerBound(), 10);
		assertEquals(myInterval.getUpperBound(), 20);
		assertEquals(myInterval.getLength(), 10);
		
		myInterval.shift(100);
		assertEquals(myInterval.getLowerBound(), 110);
		assertEquals(myInterval.getUpperBound(), 120);
		assertEquals(myInterval.getLength(), 10);

	}

}
