package DSA.collections.List;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.size());
        list.remove(1);
        System.out.println(list);

        for (int i = 0; i <list.size() ; i++) {
            System.out.print(list.get(i)+" ");
        }
        for(int x:list){
            System.out.print(x + " for each ");
        }
    }
}
