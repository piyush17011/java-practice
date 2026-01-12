package DSA.collections.Queue;

import java.util.PriorityQueue;    //uses minheap

public class priority {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(113);
        pq.add(211);
        pq.add(23);
        pq.add(84);
        pq.add(31);
        System.out.println(pq.peek());    //returns lowest
        System.out.println(pq); //random

    }
}
