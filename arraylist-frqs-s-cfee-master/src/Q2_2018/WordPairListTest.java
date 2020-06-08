package Q2_2018;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WordPairListTest {

	@Test
	void testWordPairListCTor1() {
		String[] wordNums = {"one", "two", "three"};
		WordPairList  exampleOne = new WordPairList(wordNums);
		WordPair[] expected = {new WordPair("one","two"), new WordPair("one","three"), new WordPair("two","three")};
		assertArrayEquals(expected, exampleOne.getWordPairs());

	}

	@Test
	void testWordPairListCTor2() {
		String[] phrase = {"the", "more", "the", "merrier"};
		WordPairList  exampleTwo = new WordPairList(phrase);
		WordPair[] expected = {new WordPair("the","more"), new WordPair("the","the"), new WordPair("the","merrier"), new WordPair("more", "the"), new WordPair("more", "merrier"), new WordPair("the","merrier")};
		assertArrayEquals(expected, exampleTwo.getWordPairs());

	}
	@Test
	void testNumMatches() {
		String[] moreWords = {"the", "red", "fox", "the", "red"};
		WordPairList exampleThree = new WordPairList(moreWords);
		assertEquals(2, exampleThree.numMatches());
	}

}
