import java.util.Arrays;
import java.util.List;

public class NumberStartingWithOne {
    public static void main(String Args[]){
        List<Integer> list  = Arrays.asList(10,20,30,40,100,120);
        list.stream()
                .map(n->n+"")
                .filter(n->n.startsWith("1"))
                .forEach(System.out::println);
    }

}
