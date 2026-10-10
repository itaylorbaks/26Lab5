import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;


public class GuessWhatIDo {

    public static void main(String args[]) {


        Stack<Integer> stack = new Stack<Integer>();
        Queue<Integer> queue = new LinkedList<Integer>();

        for (int i = 0; i < 10; i++) {
            stack.push(i);
            queue.add(i);
        }

        System.out.println("Stack print 1: " + stack.pop());
        System.out.println("Queue print 1: " + queue.remove());

        System.out.println("Stack print 2: " + stack.peek());
        System.out.println("Queue print 2: " + queue.peek());

        System.out.println("Stack print 3: " + stack.pop());
        System.out.println("Queue print 3: " + queue.remove());

    }


}