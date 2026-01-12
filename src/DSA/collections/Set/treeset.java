package DSA.collections.Set;

import java.util.TreeSet;

public class treeset {
    public static void main(String[] args) {
        TreeSet<Integer> tset = new TreeSet<>();
        tset.add(11);
        tset.add(2);
        tset.add(132);
        tset.add(42);

        System.out.print(tset);  //sorted

    }
}
