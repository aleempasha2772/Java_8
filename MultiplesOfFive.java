import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MultiplesOfFive {
    public static void main(String args[]){
        List<Integer> numbers = Arrays.asList(1,5,7,25,90,65,44,77,88,22,35);
        System.out.println(numbers.stream()
                .filter(i->i%5==0)
                .collect(Collectors.toList()));

    }
}
