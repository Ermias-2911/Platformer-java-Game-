package platformer.datastructures;

 //// Store the position in the 2D dimension

public class Position {
	public final int x;
	public final int y;

	public Position() {
		this(0, 0);
	}

	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}

	
	@Override
	public Position clone() {
		return new Position(x, y);
	}

	 // Get a new position, relative to this position
	public Position getTranslation(int tx, int ty) {
		return new Position(x + tx, y + ty);
	}

	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}
}
