package turtle;

public class Position {
    private int rowPosition;
    private int columnPosition;

    public Position(int rowPosition, int columnPosition) {
        this.rowPosition = rowPosition;
        this.columnPosition = columnPosition;
    }

    public int getRowPosition() {
        return rowPosition;
    }

    public int getColumnPosition() {
        return columnPosition;
    }


    @Override
    public boolean equals(Object obj) {
        boolean isEqual = false;
        if (obj.getClass() == this.getClass()) {
            Position objectToCompareAgainst = (Position) obj;
            if (objectToCompareAgainst.getColumnPosition() == this.columnPosition
                    && objectToCompareAgainst.getRowPosition() == this.rowPosition) {
                isEqual = true;
            }
        }
        return isEqual;
    }
}
