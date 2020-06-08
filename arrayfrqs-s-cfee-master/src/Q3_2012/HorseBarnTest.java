package Q3_2012;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HorseBarnTest {

	@Test
	void testFindHorseSpace1() {
		Percheron[] team = new Percheron[7];
		team[0] = new Percheron("Trigger", 1340);
		team[2] = new Percheron("Silver", 1210);
		team[3] = new Percheron("Lady", 1575);
		team[5] = new Percheron("Patches", 1350);
		team[6] = new Percheron("Duke", 1410);
		HorseBarn sweetHome = new HorseBarn(team);
		int found = sweetHome.findHorseSpace("Trigger");
		assertEquals(0, found);
	}

	@Test
	void testFindHorseSpace2() {
		Percheron[] team = new Percheron[7];
		team[0] = new Percheron("Trigger", 1340);
		team[2] = new Percheron("Silver", 1210);
		team[3] = new Percheron("Lady", 1575);
		team[5] = new Percheron("Patches", 1350);
		team[6] = new Percheron("Duke", 1410);
		HorseBarn sweetHome = new HorseBarn(team);
		int found = sweetHome.findHorseSpace("Silver");
		assertEquals(2, found);
	}
	@Test
	void testFindHorseSpace3() {
		Percheron[] team = new Percheron[7];
		team[0] = new Percheron("Trigger", 1340);
		team[2] = new Percheron("Silver", 1210);
		team[3] = new Percheron("Lady", 1575);
		team[5] = new Percheron("Patches", 1350);
		team[6] = new Percheron("Duke", 1410);
		HorseBarn sweetHome = new HorseBarn(team);
		int found = sweetHome.findHorseSpace("Coco");
		assertEquals(-1, found);
	}
	@Test
	void testConsolidate() {
		Percheron[] team = new Percheron[7];
		team[0] = new Percheron("Trigger", 1340);
		team[2] = new Percheron("Silver", 1210);
		team[5] = new Percheron("Patches", 1350);
		team[6] = new Percheron("Duke", 1410);
		HorseBarn sweetHome = new HorseBarn(team);

		boolean isConsolidated = true;
		sweetHome.consolidate();
		Horse[] newBarn = sweetHome.getSpaces();
		
		// test to ensure all of the horses have been consolidated.
		if (!newBarn[0].equals(team[0]))
			isConsolidated = false;
		if (!newBarn[1].equals(team[2]))
			isConsolidated = false;
		if (!newBarn[2].equals(team[5]))
			isConsolidated = false;
		if (!newBarn[3].equals(team[6]))
			isConsolidated = false;
		if (newBarn[4] != null)
			isConsolidated = false;
		if (newBarn[5] != null)
			isConsolidated = false;
		if (newBarn[6] != null)
			isConsolidated = false;
		
		assertTrue(isConsolidated);
	}

}
