package Q4_2009;
public class NumberTile
{
	private int left, right, top, bottom;

	public NumberTile(int top, int right, int bottom, int left)
	{
		this.top = top;
		this.right = right;
		this.bottom = bottom;    
		this.left = left;



	}

	/** Rotates the tile 90 degrees clockwise
	 */
	public void rotate()
	{
		int temp = left;
		left = bottom;
		bottom = right;
		right = top;
		top = temp;
	}

	/** @return value at left edge of tile
	 */
	public int getLeft()
	{ return left; }

	/** @return value at right edge of tile
	 */
	public int getRight()
	{ return right; }

	public String toString()
	{
		return "[" + top + ", " + right + ", " + bottom + ", " + left + "]";
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof NumberTile) {
			NumberTile otherTile = (NumberTile) o;
			boolean topEqual = top == otherTile.top;
			boolean rightEqual = right == otherTile.right;
			boolean bottomEqual = bottom == otherTile.bottom;
			boolean leftEqual = left == otherTile.left;
			return topEqual && rightEqual && bottomEqual && leftEqual;
		}
		else
			return false;
	}
}
