package Q2_2018;

public class WordPair {

	private String first = "";
	private String second = "";
	/** Constructs a WordPair object. */
	public WordPair(String first, String second) {
		/* implementation not shown */
		this.first = first;
		this.second = second;
	}
	
	/** Returns the first string of this WordPair object . */
	public String getFirst() {
		/* implementation not shown */
		return first;
	}
	
	/** Returns the second string of this WordPair object . */
	public String getSecond() {
		/* implementation not shown */
		return second;
	}
	
	@Override
	public boolean equals(Object other) {
		if (other instanceof WordPair) {
			WordPair otherWP = (WordPair)other;
			return getFirst().equals(otherWP.getFirst()) && getSecond().equals(otherWP.getSecond());
		}
		else
			return false;
	}

}

