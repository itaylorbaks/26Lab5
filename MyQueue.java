import java.util.ArrayList;
import java.util.Iterator;


/**
 * A simple queue implementation backed by an ArrayList.
 *
 * @param <T> the type of elements stored in the queue
 */
public class MyQueue<T> extends AbstractQueue<T>{
    ArrayList<T> queue = null;

    /**
     * Creates a queue using the provided list as its storage.
     *
     * @param list the backing list for the queue
     */
    public MyQueue(ArrayList<T> queue){
        this.queue = queue;
    }

    /**
     * Adds an item to the end of the queue.
     *
     * @param item the item to add
     * @return true because the add always succeeds
     */
    public boolean offer(T item){
        queue.add(item);
        return true;
    }

    /**
     * Removes and returns the first item in the queue.
     *
     * @return the first item, or null if the queue is empty
     */
    public T poll(){
        if (list.get(0) != null){
            T item = queue.get(0);
            queue.remove(0);
            return item;
        }
        else {
            return null;
        }
    }

    /**
     * Looks at the first item in the queue without removing it.
     *
     * @return the first item, or null if the queue is empty
     */
    public T peek(){
        if (queue.get(0) != null){
            T item = queue.get(0);
            return item;
        }
        else {
            return null;
        }
    }

    /**
     * Checks whether the queue has any items in it.
     *
     * @return true if the queue is empty, false otherwise
     */
    public boolean isEmpty(){
        return (queue.size() == 0);
    }

    /**
     * Gets the number of items currently in the queue.
     *
     * @return the queue size
     */
    public int size() {
        return  queue.size();
    }

    /**
     * Returns an iterator over the queue's items.
     *
     * @return an iterator for the queue
     */
    public Iterator<T> iterator() {
        return queue.iterator();
    }


}