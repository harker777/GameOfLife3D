package ua.kpi.gameoflife3d.entities;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author harker777
 */
public class GameOfLifeTest {

    public GameOfLifeTest() {
    }

    @Test
    public void testDefaultConstructorCreatesOneByOneByOneGameWithDefaultCells() {
        GameOfLife game = new GameOfLife();
        Cell[][][] expResult = {{{new Cell()}}};
        Cell[][][] actResult = game.getState();
        assertArrayEquals(expResult, actResult);
    }

    @Test
    public void testConstructorWithDimensionsCreatesCorrectSizeGameWithDefaultCells() {
        GameOfLife game = new GameOfLife(2, 2, 2);
        Cell[][][] expResult = {
            {{new Cell(), new Cell()}, {new Cell(), new Cell()}},
            {{new Cell(), new Cell()}, {new Cell(), new Cell()}}
        };
        Cell[][][] actResult = game.getState();
        assertArrayEquals(expResult, actResult);
    }

    @Test
    public void testConstructorWithStateCreatesGameWithThatState() {
        Cell[][][] expResult = {
            {{new Cell(), new Cell()}, {new Cell(), new Cell()}},
            {{new Cell(), new Cell()}, {new Cell(), new Cell()}}
        };

        GameOfLife game = new GameOfLife(expResult);
        Cell[][][] actResult = game.getState();
        assertArrayEquals(expResult, actResult);
    }
}
