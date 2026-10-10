import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;


public class GuessWhatIDo2 {

    public static void main(String args[]) {


        Stack<Integer> stack = new Stack<Integer>();
        Queue<Integer> queue = new LinkedList<Integer>();

         for (int i = 0; i < 10; i++) {
            stack.push(i);
        }

        for (int i = 0; i < 10; i++) {
            queue.add(stack.pop());
        }

        int counter = 0;
        while (!stack.isEmpty()) {
            System.out.println("Item " + counter + " in the stack is " + stack.pop());
            counter++;
        }

        counter = 0;
        while (!queue.isEmpty()) {
            System.out.println("Item " + counter + " in the queue is " + queue.remove());
            counter++;
        }
    }
}