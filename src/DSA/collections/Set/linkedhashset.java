package DSA.collections.Set;

import java.util.LinkedHashSet;

public class linkedhashset {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs =  new LinkedHashSet<>();
        lhs.add(1);
        lhs.add(22);
        lhs.add(3);
        lhs.add(41);
        System.out.println(lhs);  //returns in the order we added
    }
}
