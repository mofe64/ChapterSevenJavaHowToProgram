package turtle;

public class Turtle {
    private Pen pen;
    private CurrentDirection currentDirection;
    private Position currentPosition;

    public Turtle(Pen pen) {
        this.pen = pen;
        this.currentDirection = CurrentDirection.EAST;
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

    public void move(SketchPad sketchPad, int numberOfMoves) {

    }

    public Position getPosition() {
        return currentPosition;
    }

}
