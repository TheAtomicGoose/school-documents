import java.lang.Math;

public class Vehicle {

    private int location;

    public Vehicle() {
        this(0);
    }

    public Vehicle(int loc) {
        if (loc >= -20 && loc <= 20) {
            location = loc;
        } else {
            location = 0;
        }
    }

    public void forward() {
        if (location + 1 <= 20) {
            location += 1;
        }
    }

    public void backward() {
        if (location - 1 >= -20) {
            location -= 1;
        }
    }

    public int getLocation() {
        return location;
    }

    public String toString() {
        String spaces;
        spaces = "";
        if (location >= 0) {
            spaces += "                    ";
            for (int i = 1; i <= location; i++) {
                spaces += " ";
            }
        } else {
            for (int i = 1; i <= 20 - Math.abs(location); i++) {
                spaces += " ";
            }
        }

        spaces += "@";
        return spaces;
    }
}
