package turtle;

public class SketchPad {
    private int[][] floor;

    public SketchPad(int numberOfRows, int numberOfColumns) {
        floor = new int[numberOfRows][numberOfColumns];
    }

    public int[][] getFloor() {
        return floor;
    }
}
