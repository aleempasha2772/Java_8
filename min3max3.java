import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class min3max3 {
    public static void main(String Args[]){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

        System.out.println("Sorted with first 3 values : "+numbers.stream()
                .sorted()
                .limit(3)
                .collect(Collectors.toList()));
        System.out.println("Sorted with Last 3 values : "+numbers.stream()
                .sorted((a,b)->b.compareTo(a))
                .limit(3)
                .collect(Collectors.toList()));

    }
}
