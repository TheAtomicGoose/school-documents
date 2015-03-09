import java.lang.Math;

public class Coin {

	private int side;

	public Coin() {
		flip();
	}

	public String toString() {
		if (side == 1) {
			return "heads";
		} else {
			return "tails";
		}
	}

	public int getValue() {
		return side;
	}

	public void flip() {
		side = (int)(Math.random() * 2);
	}

	public void setValue(int s) {
		if (s == 1 || s == 0) {
			side = s;
		} else {
			System.out.println("That is not a valid value.");
		}
	}
}