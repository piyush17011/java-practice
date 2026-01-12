package DSA.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iterator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next() + " ");
        }

    }
}
