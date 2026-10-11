import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Iterator;

import org.junit.jupiter.api.Test;

public class MyQueueTest {
    @Test
    void testIsEmpty() {
        MyQueue<String> queue = new MyQueue<>(new ArrayList<>());
        assertTrue(queue.isEmpty());

        queue.offer("A");
        assertFalse(queue.isEmpty());
    }

    @Test
    void testIterator() {
        MyQueue<String> queue = new MyQueue<>(new ArrayList<>());
        queue.offer("A");
        queue.offer("B");

        Iterator<String> it = queue.iterator();
        assertTrue(it.hasNext());
        assertEquals("A", it.next());
        assertTrue(it.hasNext());
        assertEquals("B", it.next());
        assertFalse(it.hasNext());
    }

    @Test
    void testOffer() {
        MyQueue<Integer> queue = new MyQueue<>(new ArrayList<>());

        assertTrue(queue.offer(1));
        assertEquals(1, queue.size());
        assertEquals(1, queue.peek());
    }

    @Test
    void testPeek() {
        MyQueue<Integer> queue = new MyQueue<>(new ArrayList<>());
        queue.offer(10);
        queue.offer(20);

        assertEquals(10, queue.peek());
        assertEquals(2, queue.size());
    }

    @Test
    void testPoll() {
        MyQueue<Integer> queue = new MyQueue<>(new ArrayList<>());
        queue.offer(10);
        queue.offer(20);

        assertEquals(10, queue.poll());
        assertEquals(20, queue.peek());
        assertEquals(1, queue.size());
    }

    @Test
    void testSize() {
        MyQueue<String> queue = new MyQueue<>(new ArrayList<>());
        assertEquals(0, queue.size());

        queue.offer("A");
        queue.offer("B");
        assertEquals(2, queue.size());

        queue.poll();
        assertEquals(1, queue.size());
    }
}
