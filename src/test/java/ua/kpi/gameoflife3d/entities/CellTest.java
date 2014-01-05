package ua.kpi.gameoflife3d.entities;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author harker777
 */
public class CellTest {

    public CellTest() {
    }

    @Test
    public void testDefaultConstructorCreatesDeadCell() {
        Cell cell = new Cell();
        CellState expResult = CellState.DEAD;
        CellState actResult = cell.getCurrentState();
        assertEquals(expResult, actResult);
    }

    @Test
    public void testConstructorWithAliveStatePassedCreatesAliveCell() {
        Cell cell = new Cell(CellState.ALIVE);
        CellState expResult = CellState.ALIVE;
        CellState actResult = cell.getCurrentState();
        assertEquals(expResult, actResult);
    }

    @Test
    public void testDefaultConstructorCreatesCellWithCorrectHistory() {
        Cell cell = new Cell(CellState.ALIVE);
        cell.setState(CellState.DEAD);
        CellState expResult = CellState.DEAD;
        CellState actResult = cell.getCurrentState();
        assertEquals(expResult, actResult);
    }

    @Test
    public void testConstructorCreatesCellWithCorrectHistory() {
        Cell cell = new Cell(CellState.ALIVE);
        CellState[] expResult = {CellState.ALIVE};
        CellState[] actResult = cell.getStates();
        assertArrayEquals(expResult, actResult);
    }

    @Test
    public void testSetStateChangesHistory() {
        Cell cell = new Cell(CellState.ALIVE);
        cell.setState(CellState.DEAD);
        CellState[] expResult = {CellState.ALIVE, CellState.DEAD};
        CellState[] actResult = cell.getStates();
        assertArrayEquals(expResult, actResult);
    }

    @Test
    public void testSetStateChangesCurrentStateHistory() {
        Cell cell = new Cell(CellState.ALIVE);
        cell.setState(CellState.DEAD);
        CellState expResult = CellState.DEAD;
        CellState actResult = cell.getCurrentState();
        assertEquals(expResult, actResult);
    }
}
