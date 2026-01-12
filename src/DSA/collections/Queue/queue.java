package DSA.collections.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
//        queue.poll();  -> removes first element added FIFO
        System.out.println(queue.element()); //returns 1  similar to peek
        System.out.print(queue);
    }
}
