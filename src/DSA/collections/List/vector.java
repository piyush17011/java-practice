package DSA.collections.List;

import java.util.Vector;

public class vector {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(2);
        vector.add(1);
        vector.add(2);
        System.out.println(vector.capacity());
        vector.add(3);
        System.out.println(vector.capacity());
        vector.add(4);
        vector.add(5);
        vector.add(6);
        
    }
}
