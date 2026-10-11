import java.util.StackADT;
import java.util.ArrayList;


public class MyStack<T> extends StackADT<T>{
    ArrayList<T> stack = null;

    public MyStack(ArrayList<T> list){
        this.stack = stack;
    }
    
    public void push(T item){
        stack.add(stack.size(), item);
    }

    public T pop(){
        if (stack.get(stack.size()-1 ) != null){
            T saved = stack.get(stack.size() - 1);
            stack.remove(stack.get(stack.size() - 1));
            return saved;
        }
        else {
            return null;
        }
    }
    public T peek(){
        if (stack.get(stack.size()-1 ) != null){
            T saved = stack.get(stack.size() - 1);
            return saved;
        }
        else {
            return null;
        }

    }
    public boolean isEmpty() {
        return (stack.size() == 0);
    }

    public int size(){
        return stack.size();
    }
}
