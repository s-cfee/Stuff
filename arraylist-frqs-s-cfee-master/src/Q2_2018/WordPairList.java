package Q2_2018;

import java.util.ArrayList;

public class WordPairList {

	/** The list of word pairs, initialized by the constructor. */
	// Might want to initialize this in the constructor.
	private ArrayList<WordPair> allPairs;
	
	/** Constructs a WordPairList object as described in part (a).
	 * Precondition: words.length >= 2
	 */
	public WordPairList(String[] words) {
		/* to be implemented in part (a) */
		// might want to initialize appPairs.
	}
	
	/** Returns the number of matches as described in part (b).
	 * 
	 */
	public int numMatches() {
		/* to be implemented in part (b) */
		return 0;
	}
	

	/** for testing only **/
	public WordPair[] getWordPairs() {
		WordPair[] pairs = new WordPair[allPairs.size()];
		for (int i = 0; i< pairs.length; i++){
			pairs[i] = allPairs.get(i);
		}
		return pairs;
	}
}
