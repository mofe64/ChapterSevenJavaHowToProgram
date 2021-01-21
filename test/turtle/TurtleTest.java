package turtle;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TurtleTest {
    Turtle turtle;
    Pen pen;

    @BeforeEach
    void setUp() {
        pen = new Pen();
        turtle = new Turtle(pen);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void turtleHasAPen() {
        assertNotNull(turtle.getPen());
    }

    @Test
    void turtlePenBeSetToDown() {
        turtle.getPen().setPenOrientation(PenOrientation.PEN_DOWN);
        assertEquals(PenOrientation.PEN_DOWN, turtle.getPen().getPenOrientation());
    }

    @Test
    void turtlePenCanBeSetToUp() {
        turtle.getPen().setPenOrientation(PenOrientation.PEN_UP);
        assertEquals(PenOrientation.PEN_UP, turtle.getPen().getPenOrientation());
    }
    @Test
    void turtleCanTurnRight(){
        turtle.setCurrentDirection(CurrentDirection.EAST);
        turtle.turnRight();
        assertEquals(CurrentDirection.SOUTH, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(CurrentDirection.WEST, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(CurrentDirection.NORTH, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(CurrentDirection.EAST, turtle.getCurrentDirection());
    }

    @Test
    void turtleCanTurnLeft(){
        turtle.setCurrentDirection(CurrentDirection.EAST);
        turtle.turnLeft();
        assertEquals(CurrentDirection.NORTH, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals(CurrentDirection.WEST, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals(CurrentDirection.SOUTH, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals(CurrentDirection.EAST, turtle.getCurrentDirection());
    }

    @Test
    void turtleCanMoveEastWardOnASketchPad(){
        turtle.setCurrentDirection(CurrentDirection.EAST);
        SketchPad sketchPad = new SketchPad();
        turtle.move(sketchPad, 5);
    }

}