/**
 * A class representing a square in a {@link Maze}.
 * 
 * @author CS Professors
 */
public class Square {
    /** The row where the square exists. */
    private int row;

    /** The column where the square exists. */
    private int column;

    /** The type of square (space, wall, start, or exit). */
    private int type;

    /** Whether the square has been marked as added to the exploration collection. */
    private boolean marked;

    /** Whether the square is on the solution path to the exit. */
    private boolean onPath;

    /** The previous square from the start of the solution path. */
    private Square previous;

    /** Constants for the different types of squares. */
    public static final int SPACE = 0, WALL = 1, START = 2, EXIT = 3;

    /**
     * Creates a new Square.
     * 
     * @param type The type of square (space, wall, start, or exit)
     * @param row The row where the square exists
     * @param column The column where the square exists
     */
    public Square(int type, int row, int column) {
        this.type = type;
        this.row = row;
        this.column = column;
        marked = false;
        onPath = false;
        previous = null;
    }

    /**
     * Resets the Square to its initial state before searching for a solution path.
     */
    public void reset() {
        marked = false;
        onPath = false;
        previous = null;
    }

    /**
     * Records that the Square has been added to the exploration collection.
     */
    public void mark() {
        marked = true;
    }

    /**
     * Records that the Square is on the path from the start to the exit.
     */
    public void setOnPath() {
        onPath = true;
    }

    /**
     * Records which Square preceeded this one on the solution path.
     * 
     * @param sq The previous Square toward the start along the solution path
     */
    public void setPrevious(Square sq) {
        previous = sq;
    }

    /**
     * Checks whether this Square has already been marked as added to the exploration 
     * collection.
     * 
     * @return {@code true} if the Square has already been marked as added to the 
     *         exploration collection, else {@code false}.
     */
    public boolean isMarked() {
        return marked;
    }

    /**
     * Checks whether this Square is on the final solution path from the start to the exit.
     * 
     * @return {@code true} this Square is on the final solution path from the start to the 
     *         exit, else {@code false}.
     */
    public boolean isOnPath() {
        return onPath;
    }

    /**
     * Gets the previous Square along the solution path.
     * 
     * @return The previous Square along the solution path.
     */
    public Square getPrevious() {
        return previous;
    }

    /**
     * Gets the row where this Square exists.
     * 
     * @return The row where this Square exists
     */
    public int getRow() {
        return row;
    }

    /**
     * Gets the column where this Square exists.
     * 
     * @return The column where this Square exists
     */
    public int getColumn() {
        return column;
    }

    /**
     * Checks whether this Square is a space of the {@link Maze}.
     * 
     * @return {@code true} if this Square is a space, else {@code false}
     */
    public boolean isSpace() {
        return this.type == SPACE;
    }

    /**
     * Checks whether this Square is a wall of the {@link Maze}.
     * 
     * @return {@code true} if this Square is a wall, else {@code false}
     */
    public boolean isWall() {
        return this.type == WALL;
    }

    /**
     * Checks whether this Square is the starting square of the {@link Maze}.
     * 
     * @return {@code true} if this Square is the starting square, else {@code false}
     */
    public boolean isStart() {
        return this.type == START;
    }

    /**
     * Checks whether this Square is the exit of the {@link Maze}.
     * 
     * @return {@code true} if this Square is the exit, else {@code false}
     */
    public boolean isExit() {
        return this.type == EXIT;
    }

    /**
     * {@inhiertDoc}
     */
    public String toString() {
        return "Location: (" + this.row + "," + this.column + ")";
    }
}
