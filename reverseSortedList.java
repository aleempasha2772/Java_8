import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.List.of;

public class reverseSortedList {
    public static void main(String Args[]){
        List<Integer> numbers =  of(12, 32, 2, 4, 777, 5, 32, 890, 422, 44, 99, 43);
        System.out.println(numbers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList()));
    }
}
