import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        /*System.out.println("Hello world!");

        String str ="My name is Prachi";

        char[] char1 = str.toCharArray();
        for(int i=char1.length-1; i>=0; i--){
            System.out.print( char1[i]);
        }*/
        System.out.println("*************************String Reverse!*********************************");
        String str = "My name is Prachi";

        String str3 = Stream.of(str).map(x->new StringBuilder(x).reverse()).collect(Collectors.joining());
        System.out.println(str3);

        System.out.println("*************************Vowel!*********************************");

        String demo = "My name is Prachi";
        long s = demo.chars().filter(ch-> ch=='a' || ch =='i').count();
        System.out.println(s);

        System.out.println("*************************WordCount!*********************************");

       String myStr = "My name is Prachi. Prachi is my name";
        myStr = myStr.replaceAll("\\p{Punct}","");
       List<String> list = Arrays.asList(myStr.split(" "));

      Map<String,Long> map =  list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
      System.out.println(map);

    }
}