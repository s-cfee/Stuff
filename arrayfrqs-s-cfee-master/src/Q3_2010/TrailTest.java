package Q3_2010;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TrailTest {

	@Test
	void testIsLevelTrailSegment1() {
		 // min is 70; max is 80. Is level because max - min <= 10.
		 //                0    1    2   3    4   5   6   7   8   9   10  11  12
		 int[] markers = {100, 150, 105, 120, 90, 80, 50, 75, 75, 70, 80, 90, 100};
		 Trail littleSi = new Trail(markers);
		 boolean isLevel = littleSi.isLevelTrailSegment(7, 10);
		 assertTrue(isLevel);
	}
	@Test
	void testIsLevelTrailSegment2() {
		 // min is 50; max is 120. Is NOT level because max - min > 10.
		 //                0    1    2   3    4   5   6   7   8   9   10  11  12
		 int[] markers = {100, 150, 105, 120, 90, 80, 50, 75, 75, 70, 80, 90, 100};
		 Trail littleSi = new Trail(markers);
		 boolean isLevel = littleSi.isLevelTrailSegment(2, 12);
		 assertFalse(isLevel);
	}

	@Test
	void testIsDifficult1() {
		 // Has 3 segments that are difficult (between 0 and 1, between 3 and 4
		 // and between 5 and 6)
		 int[] markers = {100, 150, 105, 120, 90, 80, 50, 75, 75, 70, 80, 90, 100};
		 Trail littleSi = new Trail(markers);
		 boolean isDifficult = littleSi.isDifficult();
		 assertTrue(isDifficult);
	}
	@Test
	void testIsDifficult2() {
		 // Only has 2 segments >= 30, so it is not difficult.
		 int[] markers = {100, 150, 105, 120};
		 Trail littleSi = new Trail(markers);
		 boolean isDifficult = littleSi.isDifficult();
		 assertFalse(isDifficult);
	}
}
