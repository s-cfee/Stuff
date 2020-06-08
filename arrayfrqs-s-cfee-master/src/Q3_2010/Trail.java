package Q3_2010;

public class Trail {
	/**
	 * Representation of the trail. The number of markers on the trail is
	 * markers.length;
	 */
	private int[] markers;
	
	public Trail (int[] markers) {
		this.markers = new int[markers.length];
		for (int mark = 0; mark < markers.length; mark++) {
			this.markers[mark] = markers[mark];
		}
	}
	
	/**
	 * Determines if a trail segment is level. A trail segment is defined by
	 * a starting marker, an ending marker, and all markers between those 
	 * two markers.
	 * 
	 * A trail segment is level if it has a difference between the maximum
	 * elevation and minimum elevation that is less than or equal to 10 meters.
	 * @param start the index of the starting marker.
	 * @param end the index of the ending marker.
	 *        Precondition: 0 <= start < end <= markers.length -1
	 * @return true if the difference between the maximum and minimum
	 *         elevation on this segment of the trail is less than or 
	 *         equal to 10 meters;
	 *         false otherwise.
	 */
	public boolean isLevelTrailSegment(int start, int end) {
		int hi = this.markers[start];
		int lo  = this.markers[start];
		
		for(int y = start + 1; y <= end; y++){
			
			if(this.markers[y] < lo){
				
				
				lo = this.markers[y];
				
				
				if(Math.abs(hi - lo) > 10){
					return false;
					
				}
			} else if(this.markers[y] > hi){
				
				hi = this.markers[y];
			
				if(Math.abs(hi - lo) > 10){
					return false;
				}
			}
		}
		return ((hi - lo) <= 10);
		
	}
	
	
	/**
	 * Determines if this trail is rated difficult. A trail is rated by counting
	 * the number of changes in elevation that are at least 30 meters (up or down)
	 * between two consecutive markers. A trail with 3 or more such changes is 
	 * rated difficult.
	 * @return true if the trail is rated difficult; false otherwise
	 */
	public boolean isDifficult() {
		int thirty = 0;
		
		
		for(int g = 0; g < this.markers.length-1; g++){
			if(Math.abs(this.markers[g] - this.markers[g+1]) > 30){ //adds variation to a quantity to be checked
				
				
				thirty++;
				if(thirty >= 3){
					return true;  //returns true if larger than 30
				}
			}
		}
		return false;
	}


	public int[] getMarkers() {
		return markers;
	}

}
