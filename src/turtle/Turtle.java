package turtle;

public class Turtle {
    private Pen pen;
    private CurrentDirection currentDirection;
    private Position currentPosition;

    public Turtle(Pen pen) {
        this.pen = pen;
        this.currentDirection = CurrentDirection.EAST;
        currentPosition = new Position(0, 0);
    }

    public Pen getPen() {
        return pen;
    }

    public void setCurrentDirection(CurrentDirection currentDirection) {
        this.currentDirection = currentDirection;
    }

    public CurrentDirection getCurrentDirection() {
        return currentDirection;
    }

    public void turnRight() {
        switch (currentDirection) {
            case EAST -> setCurrentDirection(CurrentDirection.SOUTH);
            case WEST -> setCurrentDirection(CurrentDirection.NORTH);
            case NORTH -> setCurrentDirection(CurrentDirection.EAST);
            case SOUTH -> setCurrentDirection(CurrentDirection.WEST);
        }
    }

    public void turnLeft() {
        switch (currentDirection) {
            case EAST -> setCurrentDirection(CurrentDirection.NORTH);
            case WEST -> setCurrentDirection(CurrentDirection.SOUTH);
            case NORTH -> setCurrentDirection(CurrentDirection.WEST);
            case SOUTH -> setCurrentDirection(CurrentDirection.EAST);
        }
    }

    public void setCurrentPosition(Position position) {
        currentPosition = position;
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }

    public void move(SketchPad sketchPad, int numberOfMoves) {
        numberOfMoves -= 1;
        Position currentPosition = getCurrentPosition();
        int currentColumn = currentPosition.getColumnPosition();
        int currentRow = currentPosition.getRowPosition();
        PenOrientation currentPenOrientation = getPen().getPenOrientation();
        switch (currentPenOrientation) {
            case PEN_UP -> moveWithPenUP(numberOfMoves);
            case PEN_DOWN -> {
                char[][] floor = sketchPad.getFloor();
                switch (currentDirection) {
                    case EAST -> {
                        int positionAfterLoop = currentColumn + numberOfMoves;
                        for (int column = currentColumn; column <= positionAfterLoop; column++) {
                            floor[currentRow][column] = 1;
                        }
                        currentPosition.setColumnPosition(positionAfterLoop);
                    }
                    case WEST -> {
                        int positionAfterLoop = currentColumn - numberOfMoves;
                        for (int column = currentColumn; column >= positionAfterLoop; column--) {
                            floor[currentRow][column] = 1;
                        }
                        currentPosition.setColumnPosition(positionAfterLoop);
                    }
                    case SOUTH -> {
                        int positionAfterLoop = currentRow + numberOfMoves;
                        for (int row = currentRow; row <= positionAfterLoop; row++) {
                            floor[row][currentColumn] = 1;
                        }
                        currentPosition.setRowPosition(positionAfterLoop);
                    }
                    case NORTH -> {
                        int positionAfterLoop = currentRow - numberOfMoves;
                        for (int row = currentRow; row >= positionAfterLoop; row--) {
                            floor[row][currentColumn] = 1;
                        }
                        currentPosition.setRowPosition(positionAfterLoop);
                    }
                }
            }
        }

    }

    private void moveWithPenUP(int numberOfMoves) {
        Position currentPosition = getCurrentPosition();
        int currentColumn = currentPosition.getColumnPosition();
        int currentRow = currentPosition.getRowPosition();
        switch (currentDirection) {
            case EAST -> currentPosition.setColumnPosition(currentColumn + numberOfMoves);
            case SOUTH -> currentPosition.setRowPosition(currentRow + numberOfMoves);
            case WEST -> currentPosition.setColumnPosition(currentColumn - numberOfMoves);
            case NORTH -> currentPosition.setRowPosition(currentRow - numberOfMoves);
        }
    }

    public void displayFloor(SketchPad sketchPad) {
        sketchPad.displayFloor();
    }
}
