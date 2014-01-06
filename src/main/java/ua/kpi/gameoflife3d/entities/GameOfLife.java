package ua.kpi.gameoflife3d.entities;

/**
 *
 * @author harker777
 */
public class GameOfLife {

    private Cell[][][] currentState;

    public GameOfLife(int width, int height, int depth) {
        currentState = new Cell[width][height][depth];

        for (int i = 0; i < currentState.length; i++) {
            Cell[][] cellsMatrix = currentState[i];
            for (int j = 0; j < cellsMatrix.length; j++) {
                Cell[] cells = cellsMatrix[j];
                for (int k = 0; k < cells.length; k++) {
                    currentState[i][j][k] = new Cell();
                }
            }
        }
    }

    public GameOfLife(Cell[][][] defaultState) {
        currentState = defaultState;
    }

    public GameOfLife() {
        this(1, 1, 1);
    }

    public Cell[][][] getState() {
        return currentState;
    }
}
