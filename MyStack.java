import java.util.StackADT;
import java.util.ArrayList;


public class MyStack<T> extends StackADT<T>{
    ArrayList<T> list = null;

    public MyStack(ArrayList<T> list){
        this.list = list;
    }
    
    public void push(T item){
        list.add(list.size(), item);
    }

    public T pop(){
        if (list.get(list.size()-1 ) != null){
            T saved = list.get(list.size() - 1);
            list.remove(list.get(list.size() - 1));
            return saved;
        }
        else {
            return null;
        }
    }
    public T peek(){
        if (list.get(list.size()-1 ) != null){
            T saved = list.get(list.size() - 1);
            return saved;
        }
        else {
            return null;
        }

    }
    public boolean isEmpty() {
        return ()
    }
}
