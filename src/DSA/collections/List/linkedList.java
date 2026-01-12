package DSA.collections.List;

import java.util.LinkedList;

public class linkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.removeFirst());
        System.out.println(list);
    }
}
