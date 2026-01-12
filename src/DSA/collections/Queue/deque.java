package DSA.collections.Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class deque {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();
//        Deque<Integer> dq = new LinkedList<>();
        dq.add(11);
        dq.add(22);
        dq.add(113);
        dq.add(14);
        dq.addFirst(1);
        System.out.println(dq);


    }
}
