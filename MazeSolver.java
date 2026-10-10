import java.util.*;

/**
 * The MazeSolver abstract class defines the shared functionality of all solutions for
 * solving {@link Maze} puzzles.
 * 
 * @author CS Professors
 */
public abstract class MazeSolver {
    /** The {@link Maze} being solved. */
    protected Maze maze;

    /** Whether we have finished running our algorithm. */
    protected boolean finished = false;

    /** Whether we have found a path through the {@link Maze}. */
    protected boolean pathFound = false;

    /** The current path of {@link Square}s from the start of the {@link Maze}. */
    private  List<Square> path;

    /** Constants for indicating what type of solution is used. */
    public static final int STACK = 1, QUEUE = 2;

    /**
     * Creates a new MazeSolver.
     * 
     * @param maze The {@link Maze} being solved
     */
    public MazeSolver(Maze maze) {
        this.maze = maze;          
        this.finished = false;
        this.pathFound = false;
    }

    /**
     * Initializes the solver by adding the starting {@link Square} to our 
     * exploration collection.
     */
    public void initialize() {
        // get the starting square
        Square start = this.maze.getStart();

        // mark it as added to our exploration collection
        start.mark();

        // add it to our exploration collection
        this.add(start);
    }

    /**
     * Checks whether we have finished running our algorithm (either we found a path or proved
     * none exists).
     * 
     * @return true if we have finished our algorithm, else false
     */
    public boolean isFinished() {
        return finished;
    }

    /**
     * Checks whether we have solved the {@link Maze} and found a path to the exit.
     * 
     * @return true if we have solved the {@link Maze} and found a path to the exit, else false
     */
    public boolean pathFound() {
        return pathFound;
    }

    /*
     * Retrieves the list of the {@link Squares} on the current path from the start 
     * {@link Square} of the {@link Maze}.
     * 
     * @return The current path of {@link Square}s
     */
    public List<Square> getPath() {        
        return this.path; 
    }

    /**
     * Clears the exploration collection of possible {@link Square}s that might be 
     * added to the  {@code path}.
     */
    public abstract void makeEmpty();

    /**
     * Determines whether the exploration collection of possible {@link Square}s that 
     * might be added to the {@code path} is currently empty.
     * 
     * @return true if the exploration collection is empty, else false
     */
    public abstract boolean isEmpty();

    /**
     * Adds a {@link Square} to the exploration collection of possible {@link Square}s 
     * that might be added to the {@code path}.
     * 
     * @param sq The {@link Square} to add to our exploration collection
     */
    public abstract void add(Square sq);

    /**
     * Retrieves and removes the next {@link Square} from the exploration collection.
     * 
     * @return The next {@link Square} to consider for {@code path}
     */
    public abstract Square next();
    
    /**
     * Builds the path of {@link Square}s from a given starting {@link Square}.
     * 
     * @param sq The starting {@link Square} in the {@link Maze}
     */
    private void buildPath (Square sq) {
        this.path = new LinkedList<Square>();
        
        /* 
         * TODO: fill in this.path with the Squares from the start to the end.
         * 
         * sq should be the exit square at the end of the path, so it might
         * be easiest to build the path in backwards order (going from the exit
         * to the start), then reverse it once you are done.
         * 
         * Friendly reminder: you can get the square that came before the current
         * square on the path using the Square.getPrevious() method.
         */
    }
    
    /**
     * Performs one step of the maze solving algorithm.
     */
    public void step() {
        // if our exploration collection is empty, no path is possible
        if (this.isEmpty()) {
            // record that we are finished but there is no found path
            this.finished = true;
            return;
        }
        
        // get the next square from our exploration collection
        Square nextSquare = this.next();

        /* 
         * TODO: implement one step of maze exploration algorithm 
         * 
         * Check whether we have found the exit of the Maze.
         *  -- If so, create the path, record that we have a solution,
         *     and end the step.
         *  -- If not, mark and add each unexplored neighbor to the exploration 
         *     collection, and save the connections between Squares.
         */
    }
}
