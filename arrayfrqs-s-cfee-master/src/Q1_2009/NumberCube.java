package Q1_2009;

public class NumberCube {
	/** 
	 * 
	 * @return an integer value between 1 and 6 inclusive.
	 */
	public int toss() {
		return (int)(Math.random() * 6 + 1);
	}
	/**
	 * Returns an array of the values obtained by tossing a number cube 
	 * numTossses times.
	 * @param cube a NumberCube
	 * @param numTosses the number of tosses to be recorded
	 * 		  Precondition: numTosses > 0
	 * @return an array of numTosses values
	 */
	public static int[] getCubeTosses(NumberCube cube, int numTosses) {
		/* to be implemented in part a */
		int[] tries = new int[numTosses];
		
		for(int x = 0; x < numTosses; x++){
			
			tries[x] = cube.toss();
		}
		
	
		return tries;
		
	}
	/**
	 * Returns the starting index of a longest run of two or more
	 * consecutive repeated values in the array of values.
	 * @param values an array of integer values representing a series of
	 *        number cube tosses
	 *        Precondition: values.length > 0
	 * @return the starting index of a maximum size;
	 *         -1 if there is no run.
	 */
	public static int getLongestRun(int[] values) {
		/* to be implemented in part b */
		
		int consecutiveToss = 0;
		int best = 0;
		int start = -1;
		
		
		for(int n = 0; n < values.length - 1; n++){
			if(values[n] == values[n+1]){
				consecutiveToss++;
				
				if(consecutiveToss > best){
					best = consecutiveToss;
					start = n - best + 1;
				}
			}else {
				
			consecutiveToss = 0;
			}
		}
		return start;
	
	}
}
