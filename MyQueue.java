import java.util.ArrayList; 
import java.util.AbstractQueue;
import java.util.Iterator;


public class MyQueue<T> extends AbstractQueue<T>{
    ArrayList<T> list = null;

    public MyQueue(ArrayList<T> list){
        this.list = list;
    }

    public boolean offer(T item){
        list.add(item);
        return true;
    }
    public T poll(){
        if (list.get(0) != null){
            T item = list.get(0);
            list.remove(0);
            return item;
        }
        else {
            return null;
        }
    }

    public T peek(){
        if (list.get(0) != null){
            T item = list.get(0);
            return item;
        }
        else {
            return null;
        }
    }

    public boolean isEmpty(){
        return (list.size() == 0);
    }

    public int size() {
        return  list.size();
    }

    public Iterator<T> iterator() {
        return list.iterator();
    }


}