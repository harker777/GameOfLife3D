package ua.kpi.gameoflife3d.entities;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author harker777
 */
public class Cell {

    private List<CellState> history;

    public Cell() {
        this(CellState.DEAD);
    }

    public Cell(CellState cellState) {
        history = new LinkedList<CellState>();
        history.add(cellState);
    }

    public CellState getCurrentState() {
        return history.get(history.size() - 1);
    }

    public void setState(CellState cellState) {
        history.add(cellState);
    }

    public CellState[] getStates() {
        return history.toArray(new CellState[]{});
    }

    public CellState getOldState(int stepsToGoBack) {
        if (stepsToGoBack < 0 || stepsToGoBack >= history.size()) {
            throw new IllegalArgumentException();
        } else {
            return history.get(history.size() - stepsToGoBack - 1);
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + (this.history != null ? this.history.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cell other = (Cell) obj;
        if (this.history != other.history && (this.history == null || !this.history.equals(other.history))) {
            return false;
        }
        return true;
    }
}
