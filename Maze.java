import java.io.*;
import java.util.*;
import java.awt.*;

public class Maze {
    private static int MAXSQSIZE = 30;
    private int numRows;
    private int numCols;
    private Square[][] grid;
    private Square startSquare;

    /**
     * Returns the number of rows in the maze.
     *
     * @return the number of rows in the maze
     */
    public int getHeight() {
        return numRows;
    }

    /**
     * Returns the number of columns in the maze.
     *
     * @return the number of columns in the maze
     */
    public int getWidth() {
        return numCols;
    }

    /**
     * Returns the start square of the maze.
     *
     * @return the start square
     */
    public Square getStart() {
        return startSquare;
    }

    /**
     * Returns the square at a given coordinate.
     *
     * @param row the row index of the square
     * @param col the column index of the square
     * @return the square at the given coordinates
     */
    public Square getSquare(int row, int col) {
        return grid[row][col];
    }

    /**
     * Resets the maze by resetting every square in the grid.
     */
    public void reset() {
        for (int r = 0; r < numRows; r++)
            for (int c = 0; c < numCols; c++)
                grid[r][c].reset();
    }

    /**
     * Loads a maze from a specified file.
     *
     * @param fname the path to the maze file
     * @return a new Maze object loaded from the file, or null if that loading fails
     * @throws FileNotFoundException if the maze file cant be found
     */
    public static Maze loadMaze(String fname) throws FileNotFoundException {
        try {

            Maze m = new Maze();

            Scanner s = new Scanner(new File(fname));

            Scanner c = new Scanner(s.nextLine());

            m.numRows = c.nextInt();
            m.numCols = c.nextInt();

            m.grid = new Square[m.numRows][m.numCols];

            for (int row = 0; row < m.numRows; row++) {
                c = new Scanner(s.nextLine());
                for (int col = 0; col < m.numCols; col++) {
                    int type = c.nextInt();
                    Square sq = new Square(type, row, col);
                    m.grid[row][col] = sq;
                    if (type == 2) {
                        m.startSquare = sq;
                    }
                }
            }
            return m;

        } catch (Exception e) {
            return null;
        }
    }

    /**
     * Returns a list of neighboring squares for any given given square.
     *
     * @param sq the square whose neighbors are being retrieved
     * @return a list of neighboring squares, or null if the square itself is null
     */
    public ArrayList<Square> getNeighbors(Square sq) {
        if (sq != null) {
            int row = sq.getRow();
            int col = sq.getColumn();
            ArrayList<Square> neighbors = new ArrayList<Square>();
            if (row > 0)
                neighbors.add(grid[row - 1][col]);
            if (col + 1 < getWidth())
                neighbors.add(grid[row][col + 1]);
            if (row + 1 < getHeight())
                neighbors.add(grid[row + 1][col]);
            if (col > 0)
                neighbors.add(grid[row][col - 1]);
            return neighbors;
        } else
            return null;
    }

    /**
     * Draws the maze on the GUI using the specified graphics context and dimensions.
     *
     * @param g the graphics context used to draw the maze
     * @param d the dimensions of the drawing area
     */
    public void draw(Graphics g, Dimension d) {
        int sqsize = Math.min(Math.min(d.width / numCols, d.height / numRows), MAXSQSIZE);
        int top = (d.height - sqsize * numRows) / 2;
        int left = (d.width - sqsize * numCols) / 2;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                Square sq = grid[i][j];
                Color c = Color.white;
                if (sq.isStart()) {
                    c = Color.green;
                } else if (sq.isExit()) {
                    c = Color.red;
                } else if (sq.isWall()) {
                    c = Color.black;
                } else if (sq.isSpace()) {
                    c = Color.white;

                    if (sq.isOnPath()) {
                        c = Color.yellow;
                    } else if (sq.isMarked()) {
                        c = Color.lightGray;
                    }
                }
                g.setColor(c);
                g.fillRect(left + j * sqsize, top + i * sqsize, sqsize, sqsize);
            }
        }
        g.setColor(Color.black);
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                g.drawRect(left + j * sqsize, top + i * sqsize, sqsize, sqsize);
            }
        }
    }
}