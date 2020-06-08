package Q3_2012;

public class HorseBarn {

	/** 
	 * The spaces in the barn. Each array element holds a reference to
	 * the horse that is currently occupying the space. A null value 
	 * indicates an empty space.
	 */
	private Horse[] spaces;
	
	public HorseBarn(Horse[] spaces) {
		this.spaces = new Horse[spaces.length];
		for (int space = 0; space < spaces.length; space++) {
			this.spaces[space] = spaces[space];
		}
	}
	/**
	 * Returns the index of the space that contains the horse with the
	 * specified name.
	 * Precondition: No two horses in the barn have the same name.
	 * @param name the name of the horse to find.
	 * @return the index of the space containing the horse with the specified
	 *         name; -1 if no horse with the specified name in the barn.
	 */
	public int findHorseSpace(String name) {
		for(int a = 0; a < this.spaces.length; a++){
			
			if(name.equalsIgnoreCase(this.spaces[a].getName()) && this.spaces[a] != null){  
				return a;
			}
		}
		return -1;
		
	}
	
	public void consolidate() {
		for(int size = 0; size < this.spaces.length-1; size++){
			
			if(this.spaces[size] == null){
				
				for(int next = size+1; next < this.spaces.length-1; next++){
					
					if(this.spaces[next] != null){
						
						
						this.spaces[size] = this.spaces[next];
						this.spaces[next] = null;
						break;
					}
				}
			}
			}
	}
	
	public Horse[] getSpaces() {
		return spaces;
	}
}
