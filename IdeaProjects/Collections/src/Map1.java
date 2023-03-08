import java.util.*;
import java.util.Iterator;
import java.util.Set;

public class Map1 {
    public static void main(String args[]){
        Map<Integer,String> map = new HashMap<>();

        map.put(10,"Prachi");
        map.put(1,"Abhi");
        map.put(30,"Tom");
        map.put(46,"XYZ");
        map.put(2,"Abc");

        /*Set set = map.keySet();
        System.out.println(set);

        Set enSet = map.entrySet();

        Iterator itr = enSet.iterator();

        while (itr.hasNext()){
            Map.Entry entry = (Map.Entry)itr.next();
            System.out.println("Key: " +entry.getKey() + "Value:" + entry.getValue());
        }

        for(Map.Entry ent : map.entrySet()){
            System.out.println("Key: " +ent.getKey() + "Value:" + ent.getValue());
        }
*/
        map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
    }

}
