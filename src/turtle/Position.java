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
        System.out.println("class is " + obj.getClass());
        if (obj.getClass() == this.getClass()) {
            Position objectToCompareAgainst = (Position) obj;
            boolean isSameCoordinate = objectToCompareAgainst.getColumnPosition() == this.columnPosition
                    && objectToCompareAgainst.getRowPosition() == this.rowPosition;
            if (isSameCoordinate) {
                isEqual = true;
            }
        }
        return isEqual;
    }

    public void setColumnPosition(int columnPosition) {
        this.columnPosition = columnPosition;
    }

    public void setRowPosition(int rowPosition) {
        this.rowPosition = rowPosition;
    }
}
