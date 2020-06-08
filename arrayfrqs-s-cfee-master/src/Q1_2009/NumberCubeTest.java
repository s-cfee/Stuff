package Q1_2009;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumberCubeTest {
	
	@Test
	// Ensure that the right # of array elements were created.
	void testGetCubeTossesCtor1() {
		int[] tosses = NumberCube.getCubeTosses(new NumberCube(), 5);
		assertEquals(5, tosses.length);
	}
	@Test
	// Ensure that all elements are between 1 and 6.
	void testGetCubeTossesCtor2() {
		int[] tosses = NumberCube.getCubeTosses(new NumberCube(), 5);
		boolean allInRange = true;
		for (int toss : tosses) {
			if (toss < 1 || toss > 6)
				allInRange = false;
		}
		assertTrue(allInRange);
	}
	@Test
	// test values shown in problem.
	void testGetLongestRun1() {
		int[] values = {1,5,5,4,3,1,2,2,2,2,6,1,3,3,5,5,5,5};
		// call getLongestRun
		int index = NumberCube.getLongestRun(values);
		boolean isRightIndex = (index == 6) || (index == 14);
		assertTrue(isRightIndex);
	}
	@Test
	// test to ensure that if there is not a run, -1 is returned..
	void testGetLongestRun2() {
		int[] values = {1,5,4,3,1,2,6,1,3,5};
		// call getLongestRun
		int index = NumberCube.getLongestRun(values);
		assertEquals(-1, index);
	}
}
