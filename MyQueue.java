import java.util.ArrayList; 
import java.util.AbstractQueue;


public class MyQueue<T> extends AbstractQueue<T>{
    ArrayList<T> list = null;

    public MyQueue(ArrayList<T> list){
        this.list = list;
    }

    public boolean offer(T item){
        list.add(list.size(), item);

    }


}