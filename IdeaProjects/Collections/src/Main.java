import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<Integer> intL= new ArrayList<Integer>();
        intL.addAll(Arrays.asList(75,1,50,7,10));

        //Collections.sort(intL,Collections.reverseOrder());
        //System.out.println(intL);
        Collections.reverse(intL);
        Iterator itr = intL.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        intL = Collections.unmodifiableList(intL);
        intL = Collections.synchronizedList(intL);
    }
}