/**
 * An interface that describes a stack abstract data type
 *
 * @author CS Professors
 */
public interface StackADT<T> {
    /**
     * Adds an item onto the top of the stack
     * 
     * @param item The data item to add to the top of the stack
     */
    public void push(T item);

    /**
     * Retrieves and removes the top item from the stack.
     * 
     * @return The top item in the stack
     */
    public T pop();

    /**
     * Retrieves the top item from the stack without removing it.
     * 
     * @return The top item in the stack
     */
    public T peek();
    
    /**
     * Determines if the stack is empty.
     * 
     * @return true if the stack holds no items, false otherwise
     */
    public boolean isEmpty();

    /**
     * Determines the size of the stack.
     * 
     * @return The number of elements in the stack
     */
    public int size();
}
