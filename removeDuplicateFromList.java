import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toSet;

public class removeDuplicateFromList {

    public static void main(String Args[]){
        List<Integer> numbers = Arrays.asList(3,4,5,6,6,61,2,7,78,8,8,9,0,1,23);

        List<Integer> distinctNumber = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println("Distinct Numbers are : "+distinctNumber);

        List<Integer> UniqueNumber = numbers.stream()
                .filter(i->numbers.indexOf(i) == numbers.lastIndexOf(i))
                .collect(Collectors.toList());

        System.out.println("Unique Numbers are : "+UniqueNumber);
    }
}
