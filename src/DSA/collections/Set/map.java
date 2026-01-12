package DSA.collections.Set;

import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] args) {
        Map<Integer,String> map= new HashMap<>();
        map.put(1,"Piyush");
        map.put(2,"Aayush");
        map.put(3,"Shital");
        map.put(4,"Sharad");
        System.out.println(map.get(2));
        System.out.println(map.containsKey(2));
        System.out.println(map.keySet());


        //to print map data
        for(int x:map.keySet()){
            System.out.print(x+ " "+ map.get(x));
        }
    }
}
