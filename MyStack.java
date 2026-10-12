import java.util.ArrayList;


/**
 * A  stack class implementing StackADT.
 *
 * @param <T> the type of elements stored in the stack
 */
public class MyStack<T> implements StackADT<T>{
    ArrayList<T> stack = null;

    /**
     * Creates a stack instance that uses the provided ArrayList as storage.
     *
     * @param list the backing list used to store stack elements
     */
    public MyStack(ArrayList<T> list){
        this.stack = stack;
    }

    /**
     * Adds an item to the top of the stack.
     *
     * @param item the item to add to the stack
     */
    public void push(T item){
        this.stack.add(this.stack.size(), item);
    }

    /**
     * Removes and returns the item at the top of the stack.
     *
     * @return the item at the top of the stack, or null if the stack is empty
     */
    public T pop(){
        if (this.stack.get(this.stack.size()-1 ) != null){
            T saved = this.stack.get(this.stack.size() - 1);
            stack.remove(this.stack.get(this.stack.size() - 1));
            return saved;
        }
        else {
            return null;
        }
    }

    /**
     * Returns the item at the top of the stack without removing it.
     *
     * @return the item at the top of the stack, or null if the stack is empty
     */
    public T peek(){
        if (this.stack.get(this.stack.size()-1 ) != null){
            T saved = this.stack.get(this.stack.size() - 1);
            return saved;
        }
        else {
            return null;
        }

    }

    /**
     * Checks whether the stack contains any items.
     *
     * @return true if the stack is empty, false otherwise
     */
    public boolean isEmpty() {
        return (this.stack.size() == 0);
    }

    /**
     * Returns the number of items in the stack.
     *
     * @return the current stack size
     */
    public int size(){
        return this.stack.size();
    }
}
